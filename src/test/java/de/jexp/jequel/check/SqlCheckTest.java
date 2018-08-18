package de.jexp.jequel.check;

import static de.jexp.jequel.expression.Expressions.NULL;
import static de.jexp.jequel.expression.Expressions.min;
import static de.jexp.jequel.sql.Sql.Select;
import static de.jexp.jequel.sql.Sql.sub_select;
import static de.jexp.jequel.tables.TEST_TABLES.ARTICLE;
import static de.jexp.jequel.tables.TEST_TABLES.ARTICLE_COLOR;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import de.jexp.jequel.sql.Sql;
import de.jexp.jequel.tables.TEST_TABLES.ARTICLE_COLOR;
import de.jexp.jequel.test.Assert;

public class SqlCheckTest {

	@Test
	public void testFromSymbols() {
		final Sql sql = Select().from(ARTICLE).where(ARTICLE.OID.is(NULL)).toSql();
		final Collection<String> fromSymbols = new SqlChecker(sql).getFromSymbols();
		org.junit.Assert.assertEquals(Arrays.asList(ARTICLE.getName()), fromSymbols);
	}

	@Test
	public void testFromSymbolsAlias() {
		final ARTICLE_COLOR ARTICLE_COLOR2 = ARTICLE_COLOR.as("article_color_alias");
		final Sql sql = Select().from(ARTICLE, ARTICLE_COLOR2).where(ARTICLE.OID.is(NULL)).toSql();
		final Collection<String> fromSymbols = new SqlChecker(sql).getFromSymbols();
		org.junit.Assert.assertEquals(Arrays.asList(ARTICLE.getName(), "article_color_alias"), fromSymbols);
	}

	@Test
	public void testFromSymbolsExpression() {
		final Sql sql = Select().from(ARTICLE, sub_select(ARTICLE.OID).toSql().as("sql_alias"))
				.where(ARTICLE.OID.is(NULL)).toSql();
		org.junit.Assert.assertEquals("from ARTICLE, (select ARTICLE.OID) as sql_alias where ARTICLE.OID is NULL",
				sql.toString());
		final Collection<String> fromSymbols = new SqlChecker(sql).getFromSymbols();
		org.junit.Assert.assertEquals(Arrays.asList(ARTICLE.getName(), "sql_alias"), fromSymbols);
	}

	@Test
	public void testUsedTables() {
		final Sql sql = Select(ARTICLE.OID, ARTICLE_COLOR.ARTICLE_OID)
				.from(ARTICLE, sub_select(ARTICLE.OID).toSql().as("sql_alias")).where(ARTICLE.OID.is(NULL)).toSql();
		final Collection<String> usedTables = new SqlChecker(sql).getUsedTables();
		final List<String> expected = Arrays.asList(ARTICLE.getName(), ARTICLE_COLOR.getName());
		org.junit.Assert.assertEquals(expected.size(), usedTables.size());
		org.junit.Assert.assertTrue(expected.containsAll(usedTables));
	}

	@Test
	public void testCheckUsedTables() {
		final Sql sql = Select(ARTICLE.OID, ARTICLE_COLOR.ARTICLE_OID)
				.from(ARTICLE, sub_select(ARTICLE.OID).toSql().as("sql_alias")).where(ARTICLE.OID.is(NULL)).toSql();
		final SqlChecker checker = new SqlChecker(sql);
		final TableUsageCheckResult checkResult = checker.checkUsedTables();
		org.junit.Assert.assertFalse(checkResult.isValid());
		Assert.assertEquals("unused tables", Arrays.asList("sql_alias"), checkResult.getUnusedTables());
		Assert.assertEquals("missing tables", Arrays.asList(ARTICLE_COLOR.getName()), checkResult.getMissingTables());
		final List<String> expected = Arrays.asList(ARTICLE.getName());
		Assert.assertEquals("used tables", expected, checkResult.getUsedTables());
	}

	@Test
	public void testCheckGroupBy() {
		final Sql sql = Select(ARTICLE.OID, ARTICLE_COLOR.ARTICLE_OID).from().group_by(ARTICLE.OID).toSql();
		final SqlChecker checker = new SqlChecker(sql);
		Assert.assertEquals("group by expressions", Arrays.asList(ARTICLE.OID.toString()),
				checker.getGroupByExpressions());
		final Collection<String> wrongSelectColumns = checker.checkGroupBy();
		Assert.assertEquals("wrong group by select", Arrays.asList(ARTICLE_COLOR.ARTICLE_OID.toString()),
				wrongSelectColumns);
	}

	@Test
	public void testCheckGroupBySelectMin() {
		final Sql sql = Select(ARTICLE.OID, min(ARTICLE_COLOR.ARTICLE_OID)).from().group_by(ARTICLE.OID).toSql();
		final SqlChecker checker = new SqlChecker(sql);
		Assert.assertEquals("group by expressions", Arrays.asList(ARTICLE.OID.toString()),
				checker.getGroupByExpressions());
		final Collection<String> wrongSelectColumns = checker.checkGroupBy();
		Assert.assertEquals("wrong group by select ", Collections.emptyList(), wrongSelectColumns);
	}

	@Test
	public void testCheckGroupByMin() {
		final Sql sql = Select(min(ARTICLE.OID), ARTICLE_COLOR.ARTICLE_OID).from().group_by(min(ARTICLE.OID)).toSql();
		final SqlChecker checker = new SqlChecker(sql);
		Assert.assertEquals("group by expressions", Arrays.asList(min(ARTICLE.OID).toString()),
				checker.getGroupByExpressions());
		final Collection<String> wrongSelectColumns = checker.checkGroupBy();
		Assert.assertEquals("wrong group by select ", Arrays.asList(ARTICLE_COLOR.ARTICLE_OID.toString()),
				wrongSelectColumns);
	}

	@Test
	public void testCheckGroupByMin2() {
		final Sql sql = Select(min(ARTICLE.OID), min(ARTICLE_COLOR.ARTICLE_OID)).from().group_by(min(ARTICLE.OID))
				.toSql();
		final SqlChecker checker = new SqlChecker(sql);
		Assert.assertEquals("group by expressions", Arrays.asList(min(ARTICLE.OID).toString()),
				checker.getGroupByExpressions());
		final Collection<String> wrongSelectColumns = checker.checkGroupBy();
		Assert.assertEquals("wrong group by select ", Collections.emptyList(), wrongSelectColumns);
	}
}
