# Neo JEQUEL [![Build Status](https://travis-ci.org/zaplatynski/neo-jequel.svg?branch=master)](https://travis-ci.org/zaplatynski/neo-jequel)

## Java Embedded QUEry Language

Originally by [Michael Hunger](https://github.com/jexp). Maintained and reviewed with Maven as build tool by Marian Zaplatynski.

### A Domain Specific Language for the Structured Query Language (SQL) embedded in Java

#### How it all began

After dealing with DSL theoretically for a while, this is my second experiment with implementing an embedded DSL in Java.

When looking at the code after a big refactoring at work I could still see lots of SQL contained in Java Strings. Although already using Spring NamedParameterJdbcTemplate and so getting very readable prepared statements, containing them in String form is very stupid.

You won't get IDE support in writing it, you have no code completion, error reporting or refactoring. There is no documentation to quickly look up while writing it. It is not possible to catch syntax errors until the code is executed against the database (hopefully in an unit test).

The SQL statements are just dumb, meaningless Java Strings waiting to be executed to get a live.

I couldn't bear it any longer. So after discussing the idea with my co-workers when leaving I used the spare spare time during my day of this week (after my family went to bed) to start writing an embedded DSL in Java to support the creation of sql query expression tree objects which can be rendered (e.g.) to SQL. The next day I got enthusiastic and excited support and was urged to publish it. So, here it is. (Oct. 2007).

Simple Example:

```java
public void testSimpleSql() {
     final SqlString sql =
             select(ARTICLE.OID)
                  .from(ARTICLE, ARTICLE_COLOR)
                  .where(ARTICLE.OID.eq(ARTICLE_COLOR.ARTICLE_OID)
                         .and(ARTICLE.ARTICLE_NO.is_not(NULL)));

     assertEquals("select ARTICLE.OID" +
                  " from ARTICLE, ARTICLE_COLOR" +
                  " where ARTICLE.OID = ARTICLE_COLOR.ARTICLE_OID" +
                  " and ARTICLE.ARTICLE_NO is not NULL", sql.toString());
}
```
### Feature


#### Writing SQL

* Syntax highlighting
* Code completion for tables, fields and keywords and operations
* Spell and error checking for tables, fields and keywords
* Refactoring participation of tables and fields, through the whole codebase (single source)
* On the fly spell checking and error highlighting
* easy navigation to tables and fields
* directly visible foreign key relations
* deprecate tables and columns 

#### Keywords by now

* select, from, where, group by, having, order by
* numeric, boolean, list expressions
* Value, Prepared Statement, NamedParameterJdbcTemplate parameters
* raw sql possible
* min, max, avg, count
* not, and, or
* !=,=,<,<=,>,>=, like, between
* is null, is not null
* subselect, in, exists
* +,-,*,/
* aliases (table,field,expressions) 

#### Use - Execution

* Support for Prepared Statements, Springs NamedParameterJdbcTemplate
* supply default parameters typesafe within statement
* fluent language for statement execution
* additional POJO or Method param based RowHandlers/Mappers SpringExtensions
* Rendering to SQL 92 (TODO: Formatters for different target languages) 

#### Build Process

* Generate Java source file for schema meta data (tables, fields, relations,comments) from target database schema
* Enhance Schema Metadata with Documentation from resourcebundles, glossaries, database comment columns, analyse table relationships
* Code that does not comply with the generated Java code will not compile (database changes will appear as build errors)
* Ant task for generation and enhancement
* Single and Multi-File Schema generation 

#### Reuse

* keep often used sql fragments (whole selects or combinations of from, where, ...) in named and documented java classes
* extract variable, method or constant refactorings for reused sql parts 

#### Testing

* write unit tests for SQL fragments
* provide test parameters and expected results for fragments 

#### Documentation

* Quick documentation lookup for alle tables and fields when writing statements (^Q in IDEA)
* Generate Javadoc from Schema Meta Data File(s)
* Find (all) usages of tables and fields within the codebase using your IDE (shift+ctrl+g in eclipse and alt-f7 in idea)
* deprecate tables and columns
* use descriptive table and column names that are mapped to (inflexible?) existing database schema 

