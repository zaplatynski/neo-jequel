package de.jexp.jequel.jdbctest;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

/**
 * @author mh14 @ jexp.de
 * @since 03.11.2007 14:21:04 (c) 2007 jexp.de
 */
public class ResultSetStub extends TestResultSet implements ResultSet {
	public ResultSetStub(final ResultSetData resultSetData) {
		super(resultSetData);
	}

	public ResultSetStub(final Object[] data, final String... columnNames) {
		this(new ArrayResultSetData(data, columnNames));
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public boolean wasNull() throws SQLException {
		return false;
	}

	@Override
	public String getString(final int i) throws SQLException {
		return get(String.class, i);
	}

	@Override
	public boolean getBoolean(final int i) throws SQLException {
		return get(Boolean.class, i);
	}

	@Override
	public byte getByte(final int i) throws SQLException {
		return get(Byte.class, i);
	}

	@Override
	public short getShort(final int i) throws SQLException {
		return get(Short.class, i);
	}

	@Override
	public int getInt(final int i) throws SQLException {
		return get(Integer.class, i);
	}

	@Override
	public long getLong(final int i) throws SQLException {
		return get(Long.class, i);
	}

	@Override
	public float getFloat(final int i) throws SQLException {
		return get(Float.class, i);
	}

	@Override
	public double getDouble(final int i) throws SQLException {
		return get(Double.class, i);
	}

	@Override
	@Deprecated
	public BigDecimal getBigDecimal(final int i, final int i1) throws SQLException {
		return get(BigDecimal.class, i);
	}

	@Override
	public byte[] getBytes(final int i) throws SQLException {
		return get(byte[].class, i);
	}

	@Override
	public Date getDate(final int i) throws SQLException {
		return get(Date.class, i);
	}

	@Override
	public Time getTime(final int i) throws SQLException {
		return get(Time.class, i);
	}

	@Override
	public Timestamp getTimestamp(final int i) throws SQLException {
		return get(Timestamp.class, i);
	}

	@Override
	public InputStream getAsciiStream(final int i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	@Deprecated
	public InputStream getUnicodeStream(final int i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	public InputStream getBinaryStream(final int i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	public String getString(final String i) throws SQLException {
		return get(String.class, i);
	}

	@Override
	public boolean getBoolean(final String i) throws SQLException {
		return get(Boolean.class, i);
	}

	@Override
	public byte getByte(final String i) throws SQLException {
		return get(Byte.class, i);
	}

	@Override
	public short getShort(final String i) throws SQLException {
		return get(Short.class, i);
	}

	@Override
	public int getInt(final String i) throws SQLException {
		return get(Integer.class, i);
	}

	@Override
	public long getLong(final String i) throws SQLException {
		return get(Long.class, i);
	}

	@Override
	public float getFloat(final String i) throws SQLException {
		return get(Float.class, i);
	}

	@Override
	public double getDouble(final String i) throws SQLException {
		return get(Double.class, i);
	}

	@Override
	@Deprecated
	public BigDecimal getBigDecimal(final String i, final int i1) throws SQLException {
		return get(BigDecimal.class, i);
	}

	@Override
	public byte[] getBytes(final String i) throws SQLException {
		return get(byte[].class, i);
	}

	@Override
	public Date getDate(final String i) throws SQLException {
		return get(Date.class, i);
	}

	@Override
	public Time getTime(final String i) throws SQLException {
		return get(Time.class, i);
	}

	@Override
	public Timestamp getTimestamp(final String i) throws SQLException {
		return get(Timestamp.class, i);
	}

	@Override
	public InputStream getAsciiStream(final String i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	@Deprecated
	public InputStream getUnicodeStream(final String i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	public InputStream getBinaryStream(final String i) throws SQLException {
		return get(InputStream.class, i);
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
	}

	@Override
	public String getCursorName() throws SQLException {
		return null;
	}

	@Override
	public Object getObject(final int i) throws SQLException {
		return get(Object.class, i);
	}

	@Override
	public Object getObject(final String s) throws SQLException {
		return get(Object.class, s);
	}

	@Override
	public int findColumn(final String s) throws SQLException {
		return 0; // TODO
	}

	@Override
	public Reader getCharacterStream(final int i) throws SQLException {
		return get(Reader.class, i);
	}

	@Override
	public Reader getCharacterStream(final String s) throws SQLException {
		return get(Reader.class, s);
	}

	@Override
	public BigDecimal getBigDecimal(final int i) throws SQLException {
		return get(BigDecimal.class, i);
	}

	@Override
	public BigDecimal getBigDecimal(final String s) throws SQLException {
		return get(BigDecimal.class, s);
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		return false;
	}

	@Override
	public boolean isAfterLast() throws SQLException {
		return false;
	}

	@Override
	public boolean isFirst() throws SQLException {
		return false;
	}

	@Override
	public boolean isLast() throws SQLException {
		return false;
	}

	@Override
	public void beforeFirst() throws SQLException {

	}

	@Override
	public void afterLast() throws SQLException {

	}

	@Override
	public boolean first() throws SQLException {
		return false;
	}

	@Override
	public boolean last() throws SQLException {
		return false;
	}

	@Override
	public int getRow() throws SQLException {
		return 0;
	}

	@Override
	public boolean absolute(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean relative(final int i) throws SQLException {
		return false;
	}

	@Override
	public boolean previous() throws SQLException {
		return false;
	}

	@Override
	public void setFetchDirection(final int i) throws SQLException {
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return 0;
	}

	@Override
	public void setFetchSize(final int i) throws SQLException {
	}

	@Override
	public int getFetchSize() throws SQLException {
		return 0;
	}

	@Override
	public int getType() throws SQLException {
		return 0;
	}

	@Override
	public int getConcurrency() throws SQLException {
		return 0;
	}

	@Override
	public boolean rowUpdated() throws SQLException {
		return false;
	}

	@Override
	public boolean rowInserted() throws SQLException {
		return false;
	}

	@Override
	public boolean rowDeleted() throws SQLException {
		return false;
	}

	@Override
	public void updateNull(final int i) throws SQLException {
	}

	@Override
	public void updateBoolean(final int i, final boolean b) throws SQLException {
	}

	@Override
	public void updateByte(final int i, final byte b) throws SQLException {
	}

	@Override
	public void updateShort(final int i, final short i1) throws SQLException {
	}

	@Override
	public void updateInt(final int i, final int i1) throws SQLException {
	}

	@Override
	public void updateLong(final int i, final long l) throws SQLException {
	}

	@Override
	public void updateFloat(final int i, final float v) throws SQLException {
	}

	@Override
	public void updateDouble(final int i, final double v) throws SQLException {
	}

	@Override
	public void updateBigDecimal(final int i, final BigDecimal bigDecimal) throws SQLException {
	}

	@Override
	public void updateString(final int i, final String s) throws SQLException {
	}

	@Override
	public void updateBytes(final int i, final byte[] bytes) throws SQLException {
	}

	@Override
	public void updateDate(final int i, final Date date) throws SQLException {
	}

	@Override
	public void updateTime(final int i, final Time time) throws SQLException {
	}

	@Override
	public void updateTimestamp(final int i, final Timestamp timestamp) throws SQLException {
	}

	@Override
	public void updateAsciiStream(final int i, final InputStream inputStream, final int i1) throws SQLException {
	}

	@Override
	public void updateBinaryStream(final int i, final InputStream inputStream, final int i1) throws SQLException {
	}

	@Override
	public void updateCharacterStream(final int i, final Reader reader, final int i1) throws SQLException {
	}

	@Override
	public void updateObject(final int i, final Object o, final int i1) throws SQLException {
	}

	@Override
	public void updateObject(final int i, final Object o) throws SQLException {
	}

	@Override
	public void updateNull(final String s) throws SQLException {
	}

	@Override
	public void updateBoolean(final String s, final boolean b) throws SQLException {
	}

	@Override
	public void updateByte(final String s, final byte b) throws SQLException {
	}

	@Override
	public void updateShort(final String s, final short i) throws SQLException {
	}

	@Override
	public void updateInt(final String s, final int i) throws SQLException {
	}

	@Override
	public void updateLong(final String s, final long l) throws SQLException {
	}

	@Override
	public void updateFloat(final String s, final float v) throws SQLException {
	}

	@Override
	public void updateDouble(final String s, final double v) throws SQLException {
	}

	@Override
	public void updateBigDecimal(final String s, final BigDecimal bigDecimal) throws SQLException {
	}

	@Override
	public void updateString(final String s, final String s1) throws SQLException {
	}

	@Override
	public void updateBytes(final String s, final byte[] bytes) throws SQLException {
	}

	@Override
	public void updateDate(final String s, final Date date) throws SQLException {
	}

	@Override
	public void updateTime(final String s, final Time time) throws SQLException {
	}

	@Override
	public void updateTimestamp(final String s, final Timestamp timestamp) throws SQLException {
	}

	@Override
	public void updateAsciiStream(final String s, final InputStream inputStream, final int i) throws SQLException {
	}

	@Override
	public void updateBinaryStream(final String s, final InputStream inputStream, final int i) throws SQLException {
	}

	@Override
	public void updateCharacterStream(final String s, final Reader reader, final int i) throws SQLException {
	}

	@Override
	public void updateObject(final String s, final Object o, final int i) throws SQLException {
	}

	@Override
	public void updateObject(final String s, final Object o) throws SQLException {
	}

	@Override
	public void insertRow() throws SQLException {
	}

	@Override
	public void updateRow() throws SQLException {
	}

	@Override
	public void deleteRow() throws SQLException {
	}

	@Override
	public void refreshRow() throws SQLException {
	}

	@Override
	public void cancelRowUpdates() throws SQLException {
	}

	@Override
	public void moveToInsertRow() throws SQLException {
	}

	@Override
	public void moveToCurrentRow() throws SQLException {
	}

	@Override
	public Statement getStatement() throws SQLException {
		return null; // TODO
	}

	@Override
	public Object getObject(final int i, final Map<String, Class<?>> stringClassMap) throws SQLException {
		return get(Object.class, i); // TODO
	}

	@Override
	public Ref getRef(final int i) throws SQLException {
		return get(Ref.class, i);
	}

	@Override
	public Blob getBlob(final int i) throws SQLException {
		return get(Blob.class, i);
	}

	@Override
	public Clob getClob(final int i) throws SQLException {
		return get(Clob.class, i);
	}

	@Override
	public Array getArray(final int i) throws SQLException {
		return get(Array.class, i);
	}

	@Override
	public Object getObject(final String s, final Map<String, Class<?>> stringClassMap) throws SQLException {
		return get(Object.class, s); // TODO
	}

	@Override
	public Ref getRef(final String s) throws SQLException {
		return get(Ref.class, s);
	}

	@Override
	public Blob getBlob(final String s) throws SQLException {
		return get(Blob.class, s);
	}

	@Override
	public Clob getClob(final String s) throws SQLException {
		return get(Clob.class, s);
	}

	@Override
	public Array getArray(final String s) throws SQLException {
		return get(Array.class, s);
	}

	@Override
	public Date getDate(final int i, final Calendar calendar) throws SQLException {
		return getDate(i);
	}

	@Override
	public Date getDate(final String s, final Calendar calendar) throws SQLException {
		return getDate(s);
	}

	@Override
	public Time getTime(final int i, final Calendar calendar) throws SQLException {
		return getTime(i);
	}

	@Override
	public Time getTime(final String s, final Calendar calendar) throws SQLException {
		return getTime(s);
	}

	@Override
	public Timestamp getTimestamp(final int i, final Calendar calendar) throws SQLException {
		return getTimestamp(i);
	}

	@Override
	public Timestamp getTimestamp(final String s, final Calendar calendar) throws SQLException {
		return getTimestamp(s);
	}

	@Override
	public URL getURL(final int i) throws SQLException {
		return get(URL.class, i);
	}

	@Override
	public URL getURL(final String s) throws SQLException {
		return get(URL.class, s);
	}

	@Override
	public void updateRef(final int i, final Ref ref) throws SQLException {
	}

	@Override
	public void updateRef(final String s, final Ref ref) throws SQLException {
	}

	@Override
	public void updateBlob(final int i, final Blob blob) throws SQLException {
	}

	@Override
	public void updateBlob(final String s, final Blob blob) throws SQLException {
	}

	@Override
	public void updateClob(final int i, final Clob clob) throws SQLException {
	}

	@Override
	public void updateClob(final String s, final Clob clob) throws SQLException {
	}

	@Override
	public void updateArray(final int i, final Array array) throws SQLException {
	}

	@Override
	public void updateArray(final String s, final Array array) throws SQLException {
	}

	@Override
	public <T> T unwrap(final Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(final Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowId getRowId(final int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RowId getRowId(final String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRowId(final int columnIndex, final RowId x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRowId(final String columnLabel, final RowId x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateNString(final int columnIndex, final String nString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNString(final String columnLabel, final String nString) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public NClob getNClob(final int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob getNClob(final String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML getSQLXML(final int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML getSQLXML(final String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNString(final int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNString(final String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reader getNCharacterStream(final int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reader getNCharacterStream(final String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNCharacterStream(final String columnLabel, final Reader reader, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAsciiStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAsciiStream(final String columnLabel, final InputStream x, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBinaryStream(final String columnLabel, final InputStream x, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCharacterStream(final String columnLabel, final Reader reader, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBlob(final int columnIndex, final InputStream inputStream, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBlob(final String columnLabel, final InputStream inputStream, final long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAsciiStream(final int columnIndex, final InputStream x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAsciiStream(final String columnLabel, final InputStream x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClob(final int columnIndex, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClob(final String columnLabel, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T getObject(final int columnIndex, final Class<T> type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getObject(final String columnLabel, final Class<T> type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
