package de.jexp.jequel.jdbctest;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 08:11:19 (c) 2007 jexp.de
 */
public class TestConnection implements Connection {
	private ResultSet resultSet;
	private int changeCount;

	public TestConnection(final ResultSet resultSet, final int changeCount) {
		this.resultSet = resultSet;
		this.changeCount = changeCount;
	}

	@Override
	public Statement createStatement() throws SQLException {
		return new TestStatement(this, resultSet, changeCount);
	}

	@Override
	public PreparedStatement prepareStatement(final String s) throws SQLException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(final String s) throws SQLException {
		return null;
	}

	@Override
	public String nativeSQL(final String s) throws SQLException {
		return null;
	}

	@Override
	public void setAutoCommit(final boolean b) throws SQLException {
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return true;
	}

	@Override
	public void commit() throws SQLException {
	}

	@Override
	public void rollback() throws SQLException {
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return null;
	}

	@Override
	public void setReadOnly(final boolean b) throws SQLException {
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return false;
	}

	@Override
	public void setCatalog(final String s) throws SQLException {
	}

	@Override
	public String getCatalog() throws SQLException {
		return null;
	}

	@Override
	public void setTransactionIsolation(final int i) throws SQLException {
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
	}

	@Override
	public Statement createStatement(final int i, final int i1) throws SQLException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(final String s, final int i, final int i1) throws SQLException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(final String s, final int i, final int i1) throws SQLException {
		return null;
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return null;
	}

	@Override
	public void setTypeMap(final Map<String, Class<?>> stringClassMap) throws SQLException {
	}

	@Override
	public void setHoldability(final int i) throws SQLException {
	}

	@Override
	public int getHoldability() throws SQLException {
		return 0;
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return null;
	}

	@Override
	public Savepoint setSavepoint(final String s) throws SQLException {
		return null;
	}

	@Override
	public void rollback(final Savepoint savepoint) throws SQLException {
	}

	@Override
	public void releaseSavepoint(final Savepoint savepoint) throws SQLException {
	}

	@Override
	public Statement createStatement(final int i, final int i1, final int i2) throws SQLException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(final String s, final int i, final int i1, final int i2)
			throws SQLException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(final String s, final int i, final int i1, final int i2) throws SQLException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(final String s, final int i) throws SQLException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(final String s, final int[] ints) throws SQLException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(final String s, final String[] strings) throws SQLException {
		return null;
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
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(final int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClientInfo(final String name, final String value) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setClientInfo(final Properties properties) throws SQLClientInfoException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClientInfo(final String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array createArrayOf(final String typeName, final Object[] elements) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Struct createStruct(final String typeName, final Object[] attributes) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSchema(final String schema) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort(final Executor executor) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNetworkTimeout(final Executor executor, final int milliseconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
