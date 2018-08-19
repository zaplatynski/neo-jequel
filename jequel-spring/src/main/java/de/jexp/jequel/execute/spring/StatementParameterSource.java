package de.jexp.jequel.execute.spring;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import de.jexp.jequel.execute.core.DefaultExecutableParams;
import de.jexp.jequel.sql.Sql;

/**
 * @author mh14 @ jexp.de
 * @since 05.11.2007 03:25:55 (c) 2007 jexp.de supplies named parameters from
 *        the statement as paramsource
 */
public class StatementParameterSource implements SqlParameterSource {
	private final MapSqlParameterSource mapSqlParameterSource;

	public StatementParameterSource(final Sql sql) {
		final DefaultExecutableParams executableParams = DefaultExecutableParams.extractParams(sql);
		mapSqlParameterSource = new MapSqlParameterSource(executableParams.getNamedParams());
	}

	@Override
	public boolean hasValue(final String paramName) {
		return mapSqlParameterSource.hasValue(paramName);
	}

	@Override
	public Object getValue(final String paramName) throws IllegalArgumentException {
		return mapSqlParameterSource.getValue(paramName);
	}

	@Override
	public int getSqlType(final String paramName) {
		return mapSqlParameterSource.getSqlType(paramName);
	}

	@Override
	public String getTypeName(final String paramName) {
		// TODO Auto-generated method stub
		return null;
	}
}
