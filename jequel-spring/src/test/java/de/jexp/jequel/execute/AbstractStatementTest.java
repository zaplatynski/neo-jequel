package de.jexp.jequel.execute;

import static de.jexp.jequel.tables.TEST_TABLES.ARTICLE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import de.jexp.jequel.execute.spring.ExecutableStatementSpring;
import de.jexp.jequel.expression.Expressions;
import de.jexp.jequel.jdbc.beanprocessor.BeanRowMapper;
import de.jexp.jequel.jdbc.valuehandler.ValueRowHandler;
import de.jexp.jequel.jdbc.valuehandler.ValueRowMapper;
import de.jexp.jequel.sql.Sql;
import de.jexp.jequel.sql.SqlWrapper;
import junit.framework.TestCase;

public abstract class AbstractStatementTest extends TestCase {
	protected SqlWrapper articleSql = Sql.Select(ARTICLE.OID).from(ARTICLE).where(ARTICLE.OID.is_not(Expressions.NULL));
	protected DataSource dataSource;
	protected ExecutableStatementSpring executableStatement;

	public SqlWrapper getArticleSql() {
		return articleSql;
	}

	public void testSql() {
		assertEquals(getExpectedSql(), executableStatement.toString());
	}

	protected String getExpectedSql() {
		return "select ARTICLE.OID from ARTICLE where ARTICLE.OID is not NULL";
	}

	public void testGetValue() {
		assertEquals(10, executableStatement.getValue());
	}

	public void testMapRows() {
		assertEquals(Arrays.asList(10), executableStatement.mapRows(new IntegerRowMapper()));
	}

	public void testHandleRows() {
		final IntegerRowCallbackHandler integerRowCallbackHandler = new IntegerRowCallbackHandler();
		executableStatement.processRows(integerRowCallbackHandler);
		assertEquals(10, integerRowCallbackHandler.getResult());
	}

//	public void testMapBeansSimple() {
//		final Collection<Double> doubles = executableStatement.mapBeans(oidBean -> oidBean.getOid().doubleValue());
//		assertEquals(1, doubles.size());
//		assertEquals(10d, doubles.iterator().next());
//	}

//	public void testMapBeansToBean() {
//		final Collection<DoubleBean> doubleBeans = executableStatement.mapBeans(new OidBeanRowMapper());
//		assertEquals(1, doubleBeans.size());
//		assertEquals(10d, doubleBeans.iterator().next().getSomeValue());
//	}

	public void testMapValuesSimple() {
		final Collection<Double> doubleBeans = executableStatement.mapValues(new ValueRowMapper<Double>() {
			public Double mapValue(final int oid) {
				return (double) oid;
			}
		});
		assertEquals(10d, doubleBeans.iterator().next());
	}

//	public void testHandleBeansSimple() {
//		final Collection<Double> results = new ArrayList<Double>();
//		executableStatement.handleBeans(oidBean -> results.add(oidBean.getOid().doubleValue()));
//		assertEquals(1, results.size());
//		assertEquals(10d, results.iterator().next());
//	}

	public void testHandleValuesSimple() {
		final Collection<Double> results = new ArrayList<Double>();
		executableStatement.handleValues(new ValueRowHandler() {
			public void handleValue(final int oid) {
				results.add((double) oid);
			}
		});
		assertEquals(1, results.size());
		assertEquals(10d, results.iterator().next());
	}

	protected static class IntegerRowMapper implements RowMapper {
		@Override
		public Integer mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			return rs.getInt("OID");
		}
	}

	protected static class IntegerRowCallbackHandler implements RowCallbackHandler {
		public Integer result;

		@Override
		public void processRow(final ResultSet rs) throws SQLException {
			result = rs.getInt("OID");
		}

		public int getResult() {
			return result;
		}
	}

	private static class OidBeanRowMapper implements BeanRowMapper<OidBean, DoubleBean> {
		@Override
		public DoubleBean mapBean(final OidBean oidBean) {
			final double oidValue = oidBean.getOid().doubleValue();
			return () -> oidValue;
		}
	}

	public interface OidBean {
		Number getOid();
	}

	public interface DoubleBean {
		Double getSomeValue();
	}
}