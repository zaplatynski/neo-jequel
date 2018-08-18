package de.jexp.jequel.execute;

import java.sql.ResultSet;

import de.jexp.jequel.jdbctest.ResultSetStub;
import de.jexp.jequel.jdbctest.TestDataSource;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 14:39:47 (c) 2007 jexp.de
 */
public class StubbedStatementTest extends AbstractStatementTest {
	@Override
	protected void setUp() throws Exception {
		final ResultSet rs = new ResultSetStub(new Object[] { 10 }, "OID");
		dataSource = new TestDataSource(rs);
		executableStatement = articleSql.executeOn(dataSource);
	}

	@Override
	protected void tearDown() throws Exception {
	}
}