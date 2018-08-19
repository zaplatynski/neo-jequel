package de.jexp.jequel.expression;

import java.util.Collection;

import de.jexp.jequel.literals.SqlKeyword;

/**
 * @author mh14 @ jexp.de
 * @since 07.11.2007 08:34:55 (c) 2007 jexp.de
 */
public interface CompoundExpression {
    Collection<? extends Expression> getExpressions();

    boolean hasValues();

    SqlKeyword getDelimeter();
}
