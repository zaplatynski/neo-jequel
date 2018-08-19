package de.jexp.jequel.execute;

import java.util.Map;

import javax.sql.DataSource;

/**
 * @author mh14 @ jexp.de
 * @since 02.11.2007 19:39:02 (c) 2007 jexp.de
 */
public interface ExecutableStatement {
	int getValue();

	<T> T getValue(Class<T> type);

	DataSource getDataSource();

	ExecutableStatement withParams(ExecutableParams params);

	ExecutableStatement withParams(Object... params);

	ExecutableStatement withParams(Map<String, Object> params);
}
