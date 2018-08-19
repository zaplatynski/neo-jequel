package de.jexp.jequel.jdbctest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 08:12:38 (c) 2007 jexp.de
 */
public class TestStatement implements Statement {
	private Connection connection;
	private ResultSet resultSet;
	private int changeCount;

	public TestStatement(final Connection connection, final ResultSet resultSet, final int changeCount) {
		this.connection = connection;
		this.resultSet = resultSet;
		this.changeCount = changeCount;
	}

	@Override
	public ResultSet executeQuery(final String s) throws SQLException {
		return resultSet;
	}

	@Override
	public int executeUpdate(final String s) throws SQLException {
		return changeCount;
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		return 0;
	}

	@Override
	public void setMaxFieldSize(final int i) throws SQLException {
	}

	@Override
	public int getMaxRows() throws SQLException {
		return 0;
	}

	@Override
	public void setMaxRows(final int i) throws SQLException {
	}

	@Override
	public void setEscapeProcessing(final boolean b) throws SQLException {
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		return 0;
	}

	@Override
	public void setQueryTimeout(final int i) throws SQLException {
	}

	@Override
	public void cancel() throws SQLException {
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
	}

	@Override
	public void setCursorName(final String s) throws SQLException {
	}

	@Override
	public boolean execute(final String s) throws SQLException {
		return false;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		return resultSet;
	}

	@Override
	public int getUpdateCount() throws SQLException {
		return changeCount;
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		return false;
	}

	@Override
	public void setFetchDirection(final int i) throws SQLException {
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return 0;
	}

	@Override
	public void setFetchSize(final int i) throws SQLException {
	}

	@Override
	public int getFetchSize() throws SQLException {
		return 0;
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		return 0;
	}

	@Override
	public int getResultSetType() throws SQLException {
		return 0;
	}

	@Override
	public void addBatch(final String s) throws SQLException {
	}

	@Override
	public void clearBatch() throws SQLException {
	}

	@Override
	public int[] executeBatch() throws SQLException {
		return new int[0];
	}

	@Override
	public Connection getConnection() throws SQLException {
		return connection;
	}

	@Override
	public boolean getMoreResults(final int i) throws SQLException {
		return false;
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return null;
	}

	@Override
	public int executeUpdate(final String s, final int i) throws SQLException {
		return changeCount;
	}

	@Override
	public int executeUpdate(final String s, final int[] ints) throws SQLException {
		return changeCount;
	}

	@Override
	public int executeUpdate(final String s, final String[] strings) throws SQLException {
		return changeCount;
	}

	@Override
	public boolean execute(final String s, final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean execute(final String s, final int[] ints) throws SQLException {
		return false;
	}

	@Override
	public boolean execute(final String s, final String[] strings) throws SQLException {
		return false;
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return 0;
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

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPoolable(final boolean poolable) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPoolable() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
