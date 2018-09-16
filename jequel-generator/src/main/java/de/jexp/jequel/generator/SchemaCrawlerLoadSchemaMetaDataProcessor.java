package de.jexp.jequel.generator;

import java.sql.SQLException;
import java.util.Objects;

import javax.sql.DataSource;

import de.jexp.jequel.generator.data.SchemaMetaData;
import de.jexp.jequel.generator.data.SchemaMetaDataProcessor;
import de.jexp.jequel.generator.data.TableMetaData;
import de.jexp.jequel.generator.data.TableMetaDataColumn;
import schemacrawler.crawl.SchemaCrawler;
import schemacrawler.schema.Column;
import schemacrawler.schema.ColumnDataType;
import schemacrawler.schema.NamedObject;
import schemacrawler.schema.Schema;
import schemacrawler.schema.Table;
import schemacrawler.schemacrawler.InclusionRule;
import schemacrawler.schemacrawler.SchemaCrawlerException;
import schemacrawler.schemacrawler.SchemaCrawlerOptions;
import schemacrawler.schemacrawler.SchemaInfoLevel;

/**
 * @author mh14 @ jexp.de
 * @copyright (c) 2007 jexp.de
 * @since 19.10.2007 02:21:33
 */
public class SchemaCrawlerLoadSchemaMetaDataProcessor extends SchemaMetaDataProcessor {
	private DataSource dataSource;
	private boolean handleForeignKeys;
	private String includeTablesPattern = "^[A-Z_]+$";
	private String excludesTablesPattern = "^(_|SYS|EX|PM|TMP|(CDI|MGMT|DBA|USER|CI|SDD|ALL|RM|TMP|TEST|DWH|SAV|SAVE)_).+$";

	public SchemaCrawlerLoadSchemaMetaDataProcessor() {
		this((String) null);
	}

	public SchemaCrawlerLoadSchemaMetaDataProcessor(final String schema) {
		super(new SchemaMetaData(schema));
	}

	public SchemaCrawlerLoadSchemaMetaDataProcessor(final SchemaMetaData schemaMetaData) {
		super(schemaMetaData);
	}

	public void loadMetaData() throws SQLException {
		processMetaData();
	}

	@Override
	public void processMetaData() throws SQLException {
		final Schema schema = retrieveSchema(dataSource);
		loadSchemaMetaData(schema);
		if (isHandleForeignKeys()) {
			assignForeignKeys(schema);
		}
	}

	protected Schema retrieveSchema(final DataSource dataSource) throws SQLException {
		try {
			final SchemaCrawlerOptions schemaCrawlerOptions = new SchemaCrawlerOptions();
			// schemaCrawlerOptions.setSchemaPattern(getSchemaMetaData().getName());
			schemaCrawlerOptions.setTableInclusionRule(new InclusionRule(includeTablesPattern, excludesTablesPattern));
			final SchemaInfoLevel schemaInfoLevel = new SchemaInfoLevel();
			if (isHandleForeignKeys()) {
				schemaInfoLevel.setRetrieveForeignKeys(true);
			}
			SchemaCrawler schemaCrawler = new SchemaCrawler(dataSource.getConnection());
			return schemaCrawler.crawl(schemaCrawlerOptions).getSchema(getSchemaMetaData().getName());
		} catch (SchemaCrawlerException e) {
			throw new RuntimeException("Error retrieving schema information", e);
		}
	}

	protected Schema loadSchemaMetaData(final Schema schema) {
		Objects.requireNonNull(schema, "Schema is null!");
		schemaMetaData.setRemark(schema.getName() + schema.getRemarks());
		for (final Table table : schema.getTables()) {
			final TableMetaData tableMetaData = new TableMetaData(table.getName(), schemaMetaData);
			tableMetaData.setRemark(table.getRemarks());
			schemaMetaData.addTable(tableMetaData);
			for (final Column column : table.getColumns()) {
				final ColumnDataType columnDataType = column.getType();
				final TableMetaDataColumn metaDataColumn = tableMetaData.addColumn(column.getName(),
						columnDataType.getType());
				final String typeClassName = column.getType().getTypeClassName();
				if (typeClassName != null) {
					metaDataColumn.setJavaClass(typeClassName);
				}
				metaDataColumn.setRemark(column.getRemarks());
				if (column.isPartOfPrimaryKey()) {
					metaDataColumn.setPrimaryKey();
				}
				metaDataColumn.setJavaType(columnDataType.getTypeClassName());
			}
		}
		return schema;
	}

	protected void assignForeignKeys(final Schema schema) {
		for (final Table table : schema.getTables()) {
			for (final Column column : table.getColumns()) {
				if (column.isPartOfForeignKey()) {
					final Column primaryKeyColumn = column.getReferencedColumn();
					final NamedObject primaryKeyTable = primaryKeyColumn.getParent();
					final TableMetaData primaryKeyTableMetaData = schemaMetaData.getTable(primaryKeyTable.getName());
					final TableMetaDataColumn primaryKeyColumnMetaData = primaryKeyTableMetaData
							.getColumn(primaryKeyColumn.getName());
					final TableMetaData foreignKeyTableMetaData = schemaMetaData.getTable(table.getName());
					final TableMetaDataColumn foreignKeyColumnMetaData = foreignKeyTableMetaData
							.getColumn(column.getName());
					foreignKeyColumnMetaData.setReferencedColumn(primaryKeyColumnMetaData);
					primaryKeyTableMetaData.addReference(foreignKeyColumnMetaData);
				}
			}
		}
	}

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public boolean isHandleForeignKeys() {
		return handleForeignKeys;
	}

	public void setHandleForeignKeys(final boolean handleForeignKeys) {
		this.handleForeignKeys = handleForeignKeys;
	}

	public String getIncludeTablesPattern() {
		return includeTablesPattern;
	}

	public void setIncludeTablesPattern(final String includeTablesPattern) {
		this.includeTablesPattern = includeTablesPattern;
	}

	public String getExcludesTablesPattern() {
		return excludesTablesPattern;
	}

	public void setExcludesTablesPattern(final String excludesTablesPattern) {
		this.excludesTablesPattern = excludesTablesPattern;
	}
}