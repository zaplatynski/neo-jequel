package de.jexp.jequel.generator.tables.multi;

import de.jexp.jequel.table.BaseTable;
import de.jexp.jequel.table.Field;

/**
 * @author de.jexp.jequel.generator.JavaFileGenerationProcessor
 * @since Mo Nov 19 01:04:14 CET 2007
 * ARTICLE_TEST 
 */

public final class ARTICLE extends BaseTable<ARTICLE> {
/** PK: ARTICLE; ARTICLE_TEST */
    public final Field OID = numeric().primaryKey();
    public final Field NAME = string();
/** @deprecated */
    public final Field ACTIVE = date();
    public final Field ARTICLE_NO = integer();
    { initFields(); }
}
