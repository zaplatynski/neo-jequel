package de.jexp.jequel.jdbc.valuehandler;

/**
 * @author mh14 @ jexp.de
 * @since 02.11.2007 20:30:51 (c) 2007 jexp.de
 *        implement a method O mapValue(int oid, String name, BigDecimal price)
 */
public interface ValueRowHandler extends ValueRowProcessor {
    String HANDLE_VALUE_METHOD = "handleValue";
}