package de.jexp.jequel.jdbctest;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 10:21:52 (c) 2007 jexp.de
 */
public class TestResultSetMetaData implements ResultSetMetaData {
	private final ResultSetData resultSetData;

	public TestResultSetMetaData(final ResultSetData resultSetData) {
		this.resultSetData = resultSetData;
	}

	@Override
	public int getColumnCount() throws SQLException {
		return resultSetData.getColumnCount();
	}

	@Override
	public boolean isAutoIncrement(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean isCaseSensitive(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean isSearchable(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean isCurrency(final int i) throws SQLException {
		return false;
	}

	@Override
	public int isNullable(final int i) throws SQLException {
		return 0;
	}

	@Override
	public boolean isSigned(final int i) throws SQLException {
		return false;
	}

	@Override
	public int getColumnDisplaySize(final int i) throws SQLException {
		return getColumnName(i).length();
	}

	@Override
	public String getColumnLabel(final int i) throws SQLException {
		return getColumnName(i);
	}

	@Override
	public String getColumnName(final int i) throws SQLException {
		return resultSetData.getColumnName(i);
	}

	@Override
	public String getSchemaName(final int i) throws SQLException {
		return null;
	}

	@Override
	public int getPrecision(final int i) throws SQLException {
		return 0;
	}

	@Override
	public int getScale(final int i) throws SQLException {
		return 0;
	}

	@Override
	public String getTableName(final int i) throws SQLException {
		return null;
	}

	@Override
	public String getCatalogName(final int i) throws SQLException {
		return null;
	}

	@Override
	public int getColumnType(final int i) throws SQLException {
		return resultSetData.getColumnType(i);
	}

	@Override
	public String getColumnTypeName(final int i) throws SQLException {
		return TypeNames.getTypeName(getColumnType(i));
	}

	@Override
	public boolean isReadOnly(final int i) throws SQLException {
		return true;
	}

	@Override
	public boolean isWritable(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean isDefinitelyWritable(final int i) throws SQLException {
		return false;
	}

	@Override
	public String getColumnClassName(final int i) throws SQLException {
		return resultSetData.getColumnClass(i).getName();
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
