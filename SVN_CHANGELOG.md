# Former Subversion change log
```
------------------------------------------------------------------------
r120 | mh14 | 2007-11-10 06:35:09 +0100 (Sat, 10 Nov 2007) | 1 line

License
------------------------------------------------------------------------
r119 | mh14 | 2007-11-10 05:11:09 +0100 (Sat, 10 Nov 2007) | 2 lines

formatter is now an visitor
further checks for group by
------------------------------------------------------------------------
r118 | mh14 | 2007-11-09 17:39:16 +0100 (Fri, 09 Nov 2007) | 1 line

schema name stuff
------------------------------------------------------------------------
r117 | mh14 | 2007-11-08 23:33:18 +0100 (Thu, 08 Nov 2007) | 1 line

moved tests runtests target
------------------------------------------------------------------------
r116 | jequel | 2007-11-08 22:58:16 +0100 (Thu, 08 Nov 2007) | 1 line

new spring2.5 libs, new schemacrawler lib
------------------------------------------------------------------------
r115 | mh14 | 2007-11-08 22:27:20 +0100 (Thu, 08 Nov 2007) | 1 line

repaired runtest target
------------------------------------------------------------------------
r114 | mh14 | 2007-11-08 22:22:44 +0100 (Thu, 08 Nov 2007) | 1 line

new schemacrawler lib
------------------------------------------------------------------------
r113 | jequel | 2007-11-08 22:21:23 +0100 (Thu, 08 Nov 2007) | 1 line

new version
------------------------------------------------------------------------
r112 | mh14 | 2007-11-08 22:13:00 +0100 (Thu, 08 Nov 2007) | 6 lines

foreign Key Handling
table inclusion rules
start of check / rule based check
introduced compound expression and isAtomic
started DefaultFormats and handling by instanceof typecheck instead of double dispatch (package dependencies)
sql append returns itself
------------------------------------------------------------------------
r111 | mh14 | 2007-11-06 17:25:48 +0100 (Tue, 06 Nov 2007) | 1 line

schema name stuff
------------------------------------------------------------------------
r110 | mh14 | 2007-11-06 02:24:16 +0100 (Tue, 06 Nov 2007) | 2 lines

used new schema feature of schemacrawler
cleanup ExpressionFormat
------------------------------------------------------------------------
r109 | mh14 | 2007-11-05 03:29:10 +0100 (Mon, 05 Nov 2007) | 1 line

sql parameter source from statement
------------------------------------------------------------------------
r108 | mh14 | 2007-11-05 03:24:19 +0100 (Mon, 05 Nov 2007) | 2 lines

added varargs support for named/param
move of format package
------------------------------------------------------------------------
r107 | mh14 | 2007-11-05 02:52:31 +0100 (Mon, 05 Nov 2007) | 1 line

closing oi-stream
------------------------------------------------------------------------
r106 | mh14 | 2007-11-05 02:45:03 +0100 (Mon, 05 Nov 2007) | 1 line

cleaned up
------------------------------------------------------------------------
r105 | jequel | 2007-11-05 02:33:51 +0100 (Mon, 05 Nov 2007) | 1 line

moved to sql package 
------------------------------------------------------------------------
r104 | jequel | 2007-11-05 02:33:08 +0100 (Mon, 05 Nov 2007) | 1 line

removed formats package
------------------------------------------------------------------------
r103 | mh14 | 2007-11-05 02:29:02 +0100 (Mon, 05 Nov 2007) | 4 lines

splitted formatters according to types/packages
default formatters in base interfaces, changeable
removed cyclic dependencies
checking group by
------------------------------------------------------------------------
r102 | mh14 | 2007-11-04 23:57:28 +0100 (Sun, 04 Nov 2007) | 1 line

remove moved tests
------------------------------------------------------------------------
r101 | mh14 | 2007-11-04 23:57:10 +0100 (Sun, 04 Nov 2007) | 1 line

remove moved tests
------------------------------------------------------------------------
r100 | mh14 | 2007-11-04 23:52:03 +0100 (Sun, 04 Nov 2007) | 1 line

Sql92Format moved back
------------------------------------------------------------------------
r99 | mh14 | 2007-11-04 23:46:38 +0100 (Sun, 04 Nov 2007) | 3 lines

aliasing changed
sql checker
package movement
------------------------------------------------------------------------
r98 | jequel | 2007-11-04 23:44:50 +0100 (Sun, 04 Nov 2007) | 1 line

formats
------------------------------------------------------------------------
r97 | jequel | 2007-11-04 23:41:40 +0100 (Sun, 04 Nov 2007) | 1 line

updated libs
------------------------------------------------------------------------
r96 | jequel | 2007-11-04 23:41:15 +0100 (Sun, 04 Nov 2007) | 1 line

spring 2.5 libs
------------------------------------------------------------------------
r95 | mh14 | 2007-11-04 10:17:14 +0100 (Sun, 04 Nov 2007) | 2 lines

moved all creation to ExecutableStatementFactory
adapted createParams(sql) slightly to use distinct parameter lists
------------------------------------------------------------------------
r94 | mh14 | 2007-11-04 04:08:34 +0100 (Sun, 04 Nov 2007) | 4 lines

incremental setting of parameters
overwriting of query-ps-params
clear of parameters
springjdbc javadoc
------------------------------------------------------------------------
r93 | mh14 | 2007-11-04 00:00:51 +0100 (Sun, 04 Nov 2007) | 2 lines

ant file for springjdbc
Jdbc Test Utils
------------------------------------------------------------------------
r92 | mh14 | 2007-11-03 23:20:52 +0100 (Sat, 03 Nov 2007) | 3 lines

demo test
test resultset utils
moved tests back to src
------------------------------------------------------------------------
r91 | mh14 | 2007-11-03 22:57:36 +0100 (Sat, 03 Nov 2007) | 4 lines

created separate project for slow tests
added testjdbc Classes for datasources, connections, statements, resultsets (proxied and stubbed) and resultsetmetadata
execution of Jequel statements, with PreparedStatement parameters and NamedTemplate Paramters
using the spring extensions
------------------------------------------------------------------------
r90 | mh14 | 2007-11-03 22:45:58 +0100 (Sat, 03 Nov 2007) | 1 line

Spring Extensions
------------------------------------------------------------------------
r89 | mh14 | 2007-11-01 08:50:42 +0100 (Thu, 01 Nov 2007) | 2 lines

prepared statement param format for Iterable values (multiple ?)
Removed Spring dependencies for main jequel package
------------------------------------------------------------------------
r88 | mh14 | 2007-10-31 22:31:41 +0100 (Wed, 31 Oct 2007) | 1 line

Removed old Loader
------------------------------------------------------------------------
r87 | mh14 | 2007-10-31 20:58:18 +0100 (Wed, 31 Oct 2007) | 1 line

Test Tables
------------------------------------------------------------------------
r86 | mh14 | 2007-10-31 20:57:01 +0100 (Wed, 31 Oct 2007) | 2 lines

Integrated SchemaCrawler
Assortment Schema
------------------------------------------------------------------------
r85 | mh14 | 2007-10-31 04:29:04 +0100 (Wed, 31 Oct 2007) | 1 line

oved to expression
------------------------------------------------------------------------
r84 | jequel | 2007-10-31 04:20:27 +0100 (Wed, 31 Oct 2007) | 1 line

schemacrawler library added
------------------------------------------------------------------------
r83 | mh14 | 2007-10-31 04:18:20 +0100 (Wed, 31 Oct 2007) | 6 lines

included SchemaCrawler in Loader
jpetstore example
generalized alias
generation of primaryKey/foreignKey switched and allowance for primaryKeys that are foreignKeys
Sql constructor protected for Subclassing
extended Interfaces of Table and Field
------------------------------------------------------------------------
r82 | mh14 | 2007-10-31 04:14:26 +0100 (Wed, 31 Oct 2007) | 1 line

dynamic SQL for Assortment
------------------------------------------------------------------------
r81 | mh14 | 2007-10-31 04:13:43 +0100 (Wed, 31 Oct 2007) | 1 line

moved unit tests
------------------------------------------------------------------------
r80 | jequel | 2007-10-30 09:08:56 +0100 (Tue, 30 Oct 2007) | 1 line

interfaced
------------------------------------------------------------------------
r79 | mh14 | 2007-10-30 09:04:21 +0100 (Tue, 30 Oct 2007) | 2 lines

aliases and interfaces
tests for generation
------------------------------------------------------------------------
r78 | mh14 | 2007-10-29 08:22:32 +0100 (Mon, 29 Oct 2007) | 1 line

Interfaces for Expressions
------------------------------------------------------------------------
r77 | mh14 | 2007-10-29 07:54:34 +0100 (Mon, 29 Oct 2007) | 1 line

removed Type and getType
------------------------------------------------------------------------
r76 | mh14 | 2007-10-29 01:36:25 +0100 (Mon, 29 Oct 2007) | 1 line

AliasField (not satisfying) (decorator or object adaptor or interface based approach all not suitable)
------------------------------------------------------------------------
r75 | jequel | 2007-10-29 01:36:02 +0100 (Mon, 29 Oct 2007) | 1 line

removed
------------------------------------------------------------------------
r74 | mh14 | 2007-10-28 22:19:30 +0100 (Sun, 28 Oct 2007) | 1 line

format for AliasExpression
------------------------------------------------------------------------
r73 | mh14 | 2007-10-28 22:13:56 +0100 (Sun, 28 Oct 2007) | 3 lines

Value moved to Valueable interface
Beginnings of explicit AliasedExpression
ChangeLog
------------------------------------------------------------------------
r72 | mh14 | 2007-10-28 09:51:45 +0100 (Sun, 28 Oct 2007) | 1 line

moved common test data to test helper
------------------------------------------------------------------------
r71 | mh14 | 2007-10-28 02:08:04 +0200 (Sun, 28 Oct 2007) | 1 line

differentiated generated table tests
------------------------------------------------------------------------
r70 | jequel | 2007-10-28 01:54:55 +0200 (Sun, 28 Oct 2007) | 1 line

idea project files
------------------------------------------------------------------------
r69 | jequel | 2007-10-28 01:50:19 +0200 (Sun, 28 Oct 2007) | 1 line

missing
------------------------------------------------------------------------
r68 | mh14 | 2007-10-28 01:47:58 +0200 (Sun, 28 Oct 2007) | 3 lines

multi-file generator unified, 
ant tasks location,
primary key handling on meta data load
------------------------------------------------------------------------
r67 | mh14 | 2007-10-27 01:18:33 +0200 (Sat, 27 Oct 2007) | 1 line

multi-file generator, cosmetics
------------------------------------------------------------------------
r66 | mh14 | 2007-10-26 18:21:16 +0200 (Fri, 26 Oct 2007) | 1 line

schema name stuff
------------------------------------------------------------------------
r65 | mh14 | 2007-10-26 04:59:36 +0200 (Fri, 26 Oct 2007) | 1 line

src generierung und altes gel?\195?\182scht
------------------------------------------------------------------------
r64 | mh14 | 2007-10-26 04:40:50 +0200 (Fri, 26 Oct 2007) | 3 lines

metadaten Superklasse
Anpassungen Generator
Foreign-Key ber?\195?\188cksichtigt
------------------------------------------------------------------------
r63 | mh14 | 2007-10-26 03:06:43 +0200 (Fri, 26 Oct 2007) | 5 lines

introduced binaryExpression base class
repaired format afterwards
set formats by classname
repaired expression processor
moved classes for cyclic dependency
------------------------------------------------------------------------
r62 | mh14 | 2007-10-25 18:39:10 +0200 (Thu, 25 Oct 2007) | 2 lines

binary expression
removed formatting processors
------------------------------------------------------------------------
r61 | mh14 | 2007-10-25 08:57:31 +0200 (Thu, 25 Oct 2007) | 1 line

moved
------------------------------------------------------------------------
r60 | mh14 | 2007-10-25 08:57:14 +0200 (Thu, 25 Oct 2007) | 1 line

ant xml
------------------------------------------------------------------------
r59 | jequel | 2007-10-25 08:12:12 +0200 (Thu, 25 Oct 2007) | 1 line

new pk() method
------------------------------------------------------------------------
r58 | jequel | 2007-10-25 08:11:19 +0200 (Thu, 25 Oct 2007) | 1 line

added
------------------------------------------------------------------------
r57 | jequel | 2007-10-25 08:10:33 +0200 (Thu, 25 Oct 2007) | 1 line

added
------------------------------------------------------------------------
r56 | mh14 | 2007-10-25 08:09:11 +0200 (Thu, 25 Oct 2007) | 1 line

moved packaged for cyclic dependencies, not successful
------------------------------------------------------------------------
r55 | mh14 | 2007-10-25 04:21:25 +0200 (Thu, 25 Oct 2007) | 1 line

moved packaged for cyclic dependencies, not successful
------------------------------------------------------------------------
r54 | mh14 | 2007-10-25 04:20:31 +0200 (Thu, 25 Oct 2007) | 1 line

moved packaged for cyclic dependencies, not successful
------------------------------------------------------------------------
r53 | mh14 | 2007-10-25 03:45:02 +0200 (Thu, 25 Oct 2007) | 1 line

Formatter for table and fields
------------------------------------------------------------------------
r52 | mh14 | 2007-10-25 03:21:47 +0200 (Thu, 25 Oct 2007) | 3 lines

ExpressionProcessor
Formatter
SelectParts
------------------------------------------------------------------------
r51 | mh14 | 2007-10-24 08:54:03 +0200 (Wed, 24 Oct 2007) | 1 line

final
------------------------------------------------------------------------
r50 | mh14 | 2007-10-24 08:53:35 +0200 (Wed, 24 Oct 2007) | 3 lines

TableRelationshiprocessor (foreignKey, primaryKey)
Hierarchy of MetaData
ExpressionProcessor, Start of ExpressionFormat
------------------------------------------------------------------------
r49 | mh14 | 2007-10-24 08:51:46 +0200 (Wed, 24 Oct 2007) | 3 lines

TableRelationshiprocessor (foreignKey, primaryKey)
Hierarchy of MetaData
ExpressionProcessor, Start of ExpressionFormat
------------------------------------------------------------------------
r48 | mh14 | 2007-10-23 22:14:53 +0200 (Tue, 23 Oct 2007) | 1 line

appendFragment in Sql
------------------------------------------------------------------------
r47 | mh14 | 2007-10-23 22:13:35 +0200 (Tue, 23 Oct 2007) | 2 lines

renamed group_by and order_by
appendFragment in Sql
------------------------------------------------------------------------
r46 | mh14 | 2007-10-23 21:38:13 +0200 (Tue, 23 Oct 2007) | 1 line

ProcessorClassNames where Missing, default for Locale
------------------------------------------------------------------------
r45 | mh14 | 2007-10-23 21:12:54 +0200 (Tue, 23 Oct 2007) | 3 lines

Ant Task (very bad hacks to distribute datasource information to subtasks)
class loader problems, both spring DriverManagerDataSource (ClassUtils.forName()) and Ants JDBCTask
both don't honor the classpath of the task currently in execution (classpath that was used when creating the task)
------------------------------------------------------------------------
r44 | mh14 | 2007-10-23 16:51:47 +0200 (Tue, 23 Oct 2007) | 1 line

removed debug output
------------------------------------------------------------------------
r43 | mh14 | 2007-10-23 16:51:14 +0200 (Tue, 23 Oct 2007) | 1 line

renamed static select method to "Select" with uppercase S
------------------------------------------------------------------------
r42 | mh14 | 2007-10-23 16:47:20 +0200 (Tue, 23 Oct 2007) | 1 line

Changed Path
------------------------------------------------------------------------
r41 | jequel | 2007-10-23 08:51:17 +0200 (Tue, 23 Oct 2007) | 1 line

ant jar
------------------------------------------------------------------------
r40 | mh14 | 2007-10-23 08:44:39 +0200 (Tue, 23 Oct 2007) | 1 line

Ant Task
------------------------------------------------------------------------
r39 | mh14 | 2007-10-23 08:43:48 +0200 (Tue, 23 Oct 2007) | 1 line

Final
------------------------------------------------------------------------
r38 | mh14 | 2007-10-22 14:55:23 +0200 (Mon, 22 Oct 2007) | 1 line

extensible SQL for dynamic queries (see alexa QueryBuilder)
------------------------------------------------------------------------
r37 | mh14 | 2007-10-22 14:54:34 +0200 (Mon, 22 Oct 2007) | 1 line

ResourceBundles uses locale as Prefix for Remarks
------------------------------------------------------------------------
r36 | mh14 | 2007-10-22 13:07:53 +0200 (Mon, 22 Oct 2007) | 1 line

Generierung mit beiden ResourceBundles
------------------------------------------------------------------------
r35 | mh14 | 2007-10-22 13:05:17 +0200 (Mon, 22 Oct 2007) | 6 lines

Aliases mit as
weiterer SubselectTest
sql() Keyword f?\195?\188r literalen SQL-Code
ConstantExpression unterscheidet jetzt zwischen Value und ggf. Literal
param() Keyword f?\195?\188r NamedParameterTemplate
ARTICLE_EAN in TestTables
------------------------------------------------------------------------
r34 | mh14 | 2007-10-22 04:00:27 +0200 (Mon, 22 Oct 2007) | 1 line

Umstellung/Vereinfachung von Sql f?\195?\188r QueryBuilderSyntax
------------------------------------------------------------------------
r33 | jequel | 2007-10-22 02:59:10 +0200 (Mon, 22 Oct 2007) | 1 line

removed
------------------------------------------------------------------------
r32 | mh14 | 2007-10-22 02:57:13 +0200 (Mon, 22 Oct 2007) | 1 line

Read File corrected
------------------------------------------------------------------------
r31 | mh14 | 2007-10-22 02:48:16 +0200 (Mon, 22 Oct 2007) | 2 lines

FindBugs (no bug found, fixed laments)
JDepend, moved SqlString to main package, no cycles
------------------------------------------------------------------------
r30 | mh14 | 2007-10-22 02:03:23 +0200 (Mon, 22 Oct 2007) | 2 lines

runtest.module.test target
runtest.module.alexa target
------------------------------------------------------------------------
r29 | mh14 | 2007-10-22 01:52:41 +0200 (Mon, 22 Oct 2007) | 1 line

runtest.module.test target
------------------------------------------------------------------------
r28 | mh14 | 2007-10-22 01:40:51 +0200 (Mon, 22 Oct 2007) | 1 line

TestData for build
------------------------------------------------------------------------
r27 | mh14 | 2007-10-22 01:38:40 +0200 (Mon, 22 Oct 2007) | 1 line

see r.24
------------------------------------------------------------------------
r26 | mh14 | 2007-10-22 01:32:32 +0200 (Mon, 22 Oct 2007) | 1 line

see r.24
------------------------------------------------------------------------
r25 | mh14 | 2007-10-22 01:25:11 +0200 (Mon, 22 Oct 2007) | 1 line

SchemaMetaDataProcessor
------------------------------------------------------------------------
r24 | jequel | 2007-10-22 01:18:06 +0200 (Mon, 22 Oct 2007) | 1 line

unneccessary
------------------------------------------------------------------------
r23 | mh14 | 2007-10-22 01:11:13 +0200 (Mon, 22 Oct 2007) | 10 lines

ColumnTupleExpression, RowTupleExpression as Subclasses of TupleExpression
Fields is now AbstractTable and Subclass of RowTupleExpression
so Table is Subclass of RowTupleExpression

Sql is RowTupleExpression, rendering is delegated to RowTupleExpression
The Parts of Sql are represented by own Types (small Subtypes of ColumnTupleExpression and MutableBooleanExpression)
MutableBooleanExpression holds changing instances of BooleanExpression and delegates all calls to its contained expression
Sql now allows access to its parts to extend them in a later stage (sql is mutable)
rendering of subselect and in simplified through RowTupleExpression
cleanup & cosmetics
------------------------------------------------------------------------
r22 | mh14 | 2007-10-21 21:28:53 +0200 (Sun, 21 Oct 2007) | 1 line

SchemaMetaDataProcessor
------------------------------------------------------------------------
r21 | jequel | 2007-10-21 21:28:14 +0200 (Sun, 21 Oct 2007) | 1 line

renamed package enhancer
------------------------------------------------------------------------
r20 | mh14 | 2007-10-21 21:13:51 +0200 (Sun, 21 Oct 2007) | 1 line

SchemaMetaDataProcessor
------------------------------------------------------------------------
r19 | mh14 | 2007-10-21 11:10:20 +0200 (Sun, 21 Oct 2007) | 1 line

SchemaMetaData
------------------------------------------------------------------------
r18 | mh14 | 2007-10-21 01:07:53 +0200 (Sun, 21 Oct 2007) | 1 line

cosmetics
------------------------------------------------------------------------
r17 | mh14 | 2007-10-21 00:54:43 +0200 (Sun, 21 Oct 2007) | 1 line

restructure rename table model loader tests
------------------------------------------------------------------------
r16 | mh14 | 2007-10-21 00:54:15 +0200 (Sun, 21 Oct 2007) | 1 line

english comment
------------------------------------------------------------------------
r15 | mh14 | 2007-10-21 00:53:54 +0200 (Sun, 21 Oct 2007) | 1 line

cosmetics
------------------------------------------------------------------------
r14 | mh14 | 2007-10-21 00:53:03 +0200 (Sun, 21 Oct 2007) | 1 line

clarify varargs call
------------------------------------------------------------------------
r13 | mh14 | 2007-10-21 00:52:07 +0200 (Sun, 21 Oct 2007) | 1 line

kosmetik
------------------------------------------------------------------------
r12 | jequel | 2007-10-21 00:10:33 +0200 (Sun, 21 Oct 2007) | 1 line

current jar
------------------------------------------------------------------------
r11 | mh14 | 2007-10-20 23:59:32 +0200 (Sat, 20 Oct 2007) | 1 line

javadoc target
------------------------------------------------------------------------
r10 | mh14 | 2007-10-20 23:34:34 +0200 (Sat, 20 Oct 2007) | 1 line

javadoc target
------------------------------------------------------------------------
r9 | mh14 | 2007-10-20 23:32:42 +0200 (Sat, 20 Oct 2007) | 1 line

generic f?\195?\188r field() ganz gemacht, von foobar
------------------------------------------------------------------------
r8 | mh14 | 2007-10-20 23:29:20 +0200 (Sat, 20 Oct 2007) | 8 lines

Umstrukturierung UnaryExpression
in Operator
Tests f?\195?\188r e() Typkonvertierung
implode angeglichen (parameter)
TupelExpression ganz gemacht
CompoundExpression weg
getValue in Expression eingef?\195?\188hrt und in Subklassen implementiert
TODO Wert von Field und Sql ?
------------------------------------------------------------------------
r7 | mh14 | 2007-10-20 22:01:18 +0200 (Sat, 20 Oct 2007) | 1 line

sub select
------------------------------------------------------------------------
r6 | mh14 | 2007-10-20 22:00:52 +0200 (Sat, 20 Oct 2007) | 2 lines

abstract Table
remove Constructor visibility for table and fields
------------------------------------------------------------------------
r5 | jequel | 2007-10-20 21:20:35 +0200 (Sat, 20 Oct 2007) | 1 line

remove project files
------------------------------------------------------------------------
r4 | mh14 | 2007-10-20 21:15:50 +0200 (Sat, 20 Oct 2007) | 1 line

Alexa Resoucebundletest
------------------------------------------------------------------------
r3 | mh14 | 2007-10-20 21:15:16 +0200 (Sat, 20 Oct 2007) | 1 line

Internal Iterator for metadata
------------------------------------------------------------------------
r2 | jequel | 2007-10-20 19:35:43 +0200 (Sat, 20 Oct 2007) | 1 line

kein javadoc
------------------------------------------------------------------------
r1 | jequel | 2007-10-20 15:51:06 +0200 (Sat, 20 Oct 2007) | 1 line

Initial Version
------------------------------------------------------------------------
```