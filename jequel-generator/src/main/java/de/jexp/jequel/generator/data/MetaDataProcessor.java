package de.jexp.jequel.generator.data;

import java.sql.SQLException;

/**
 * @author mh14 @ jexp.de
 * @since 21.10.2007 20:35:39 (c) 2007 jexp.de
 */
public interface MetaDataProcessor {
	void processMetaData() throws SQLException;
}
