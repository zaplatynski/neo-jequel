package de.jexp.jequel.jdbctest;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 08:12:07 (c) 2007 jexp.de
 */
public class TestDataSource implements DataSource {
	private static final PrintWriter PRINT_WRITER = new PrintWriter(System.err);
	private ResultSet resultSet;
	private int changeCount;

	public TestDataSource(final ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public TestDataSource(final int changeCount) {
		this.changeCount = changeCount;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return createConnection();
	}

	protected TestConnection createConnection() {
		return new TestConnection(resultSet, changeCount);
	}

	@Override
	public Connection getConnection(final String s, final String s1) throws SQLException {
		return createConnection();
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return PRINT_WRITER;
	}

	@Override
	public void setLogWriter(final PrintWriter printWriter) throws SQLException {
	}

	@Override
	public void setLoginTimeout(final int i) throws SQLException {
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
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
}
