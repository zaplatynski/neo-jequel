package de.jexp.jequel.execute.spring;

import java.util.Collection;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import de.jexp.jequel.execute.ExecutableStatement;
import de.jexp.jequel.jdbc.beanprocessor.BeanRowHandler;
import de.jexp.jequel.jdbc.beanprocessor.BeanRowMapper;
import de.jexp.jequel.jdbc.valuehandler.ValueRowHandler;
import de.jexp.jequel.jdbc.valuehandler.ValueRowMapper;

public interface ExecutableStatementSpring extends ExecutableStatement {

	<T> Collection<T> mapRows(RowMapper rowMapper);

	void processRows(RowCallbackHandler rowHandler);

	<I, O> Collection<O> mapBeans(final BeanRowMapper<I, O> beanRowMapper);

	<O> Collection<O> mapValues(final ValueRowMapper<O> valueRowMapper);

	<I> void handleBeans(final BeanRowHandler<I> beanRowHandler);

	void handleValues(final ValueRowHandler valueRowHandler);

}
