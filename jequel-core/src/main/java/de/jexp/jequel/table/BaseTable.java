package de.jexp.jequel.table;

/**
 * @author mh14 @ jexp.de
 *  (c) 2007 jexp.de
 * @since 17.10.2007 23:31:14
 */
public abstract class BaseTable<T extends BaseTable> extends AbstractTable {

	private final String tableName = getClass().getSimpleName().toUpperCase();
	String alias;

	BaseTable aliasedTable;

	protected BaseTable() {
	}

	@Override
	public String toString() {
		return accept(TABLE_FORMAT);
	}

	@Override
	public <R> R accept(final TableVisitor<R> tableVisitor) {
		return tableVisitor.visit(this);
	}

	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public String getName() {
		return tableName;
	}

	@Override
	public <K> Field<K> field(final Class<K> type) {
		return new TableField<K>(this);
	}

	protected <T> Field<T> foreignKey(final Field<T> reference) {
		return new ForeignKey<T>(this, reference);
	}

	protected <T> Field<T> foreignKey(final Class<? extends BaseTable<?>> tableClass, final String field) {
		return new ForeignKey<T>(this, new FieldReference<T>(tableClass, field));
	}

	protected <T> Field<T> foreignKey(final Class<?> schemaClass, final Class<? extends BaseTable<?>> tableClass,
			final String field) {
		return new ForeignKey<T>(this, new FieldReference<T>(schemaClass, tableClass, field));
	}

	public T as2(final String alias) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public T AS(final String alias) {
		return as(alias.toUpperCase());
	}

	@Override
	public T as(final String alias) {
		try {
			// noinspection unchecked
			final Class<T> type = (Class<T>) getClass();
			final T table = type.newInstance();
			table.alias = alias;
			table.aliasedTable = this;
			return table;
		} catch (InstantiationException e) {
			throw new RuntimeException(String.format("Error creating table %s with Alias %s", getClass(), alias), e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(String.format("Error creating table %s with Alias %s", getClass(), alias), e);
		}
	}

	@Override
	public String getTableName() {
		return alias != null ? alias : tableName;
	}

	public Field getForeignKey(final BaseTable<? extends BaseTable> other) {
		return getForeignKey(other.getOid());
	}

	private Field getForeignKey(Field pkField) {
		pkField = pkField.resolve();
		for (final Field field : getFields().values()) {
			if (field instanceof ForeignKey && ((ForeignKey) field).references(pkField)) {
				return field;
			}
		}
		return null;
	}

	public JoinTable join(final BaseTable<? extends BaseTable> second) {
		return new JoinTable(this, second);
	}

	@Override
	public BaseTable resolve() {
		if (alias == null) {
			return this;
		}
		return aliasedTable;
	}

}