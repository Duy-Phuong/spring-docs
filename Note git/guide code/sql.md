- [MySQL Create Database](#mysql-create-database)
  - [Database](#database)
    - [MySQL create database](#mysql-create-database-1)
    - [Setting the default database](#setting-the-default-database)
    - [MySQL show database](#mysql-show-database)
    - [MySQL select database](#mysql-select-database)
    - [MySQL DROP all TABLES or MySQL DROP DATABASE](#mysql-drop-all-tables-or-mysql-drop-database)
    - [MySQL CREATE TABLE when not EXISTS](#mysql-create-table-when-not-exists)
    - [MySQL CREATE with LIKE or copy table structure](#mysql-create-with-like-or-copy-table-structure)
    - [MySQL CREATE TABLE with SELECT or copy a table](#mysql-create-table-with-select-or-copy-a-table)
    - [MySQL loading data into a table with insert statement](#mysql-loading-data-into-a-table-with-insert-statement)
    - [MySQL CONSTRAINTs are :](#mysql-constraints-are)
    - [PROC](#proc)
  - [case select](#case-select)
  - [MySQL GROUP_CONCAT() function](#mysql-groupconcat-function)
    - [Update query not working in mysql workbench](#update-query-not-working-in-mysql-workbench)
  - [end](#end)

---

https://www.w3resource.com/mysql/mysql-functions-and-operators.php

## Cấu trúc và syntac

https://www.w3resource.com/mysql/mysql-language-structure.php

### Kiểu dữ liệu

#### Number

Floating-point numbers sử dụng dấu . làm kí tự phân cách

**Valid integers :**

- 0
- 1254
- -256

**Valid floating-point numbers :**

- 132.45
- 12.00
- -21032.6309e+10

Sử dụng toán tử +, - bình thường

#### String

Có thể sử dụng dấu nhay đơn hoặc kép

Here are some examples :

- 'MySQL Tutorial'
- "SQL Tutorial"

Note : If ANSI_QUOTES SQL mode is enabled, you cannot use double quotation marks to quote literal strings, because it is interpreted as an identifier.

**Special Character Escape Sequences**

```
MySQL> SELECT 'w3r', '"w3r"', "'w3r'", '""w3r""', 'w3''resource', '\'w3r', '\"w3r';
```

#### Date and Time

You can specify a date and time values in several formates, such as numbers or as quoted strings,

MySQL interprets '2017-08-22', '20170822', and 20170822 as a date.

MySQL recognizes [DATE](https://www.w3resource.com/mysql/mysql-data-types.php) values in these formats :

- As a string in either 'YYYY-MM-DD' or 'YY-MM-DD' format. You can use any punctuation character as the delimiter between date parts. For example, '2014-10-30', '2014/10/30', '2014^10^30, and '2014@10@30' are equivalent.
- As a string with no delimiters in either 'YYYYMMDD' or 'YYMMDD' format, provided that the string maintains valid date format. For example, '20080623' and '080623' are interpreted as '2008-06-23', but '071432' is illegal (it has invalid month and day parts) and becomes '0000-00-00'.
- As a number in either YYYYMMDD or YYMMDD format provided that the number makes sense as a date. For example, 19841105 and 841105 are interpreted as '1984-11-05'.

MySQL recognizes [TIME](https://www.w3resource.com/mysql/mysql-data-types.php) values in these formats :

- As a string in 'D HH:MM:SS' format. You can also use one of the following "relaxed" syntaxes: 'HH:MM:SS', 'HH:MM', 'D HH:MM', 'D HH', or 'SS'. Here D represents days and can have a value from 0 to 34.
- As a string with no delimiters in 'HHMMSS' format, provided that it makes sense at a time. For example, '101112' is understood as '10:11:12', but '109712' is illegal (it has an invalid minute part) and becomes '00:00:00'.
- As a number in HHMMSS format provided that it makes sense at a time. For example, 101112 is understood as '10:11:12'. The following alternative formats are also understood: SS, MMSS, or HHMMSS.

#### Boolean Literals

The constants TRUE and FALSE evaluate to 1 and 0, respectively. The constant names can be written both upper and lower case letters. See the following examples :

```sql
SELECT TRUE, true;
|    1 |    1 |
```

MySQL has **Numeric** Types, the **DATETIME**, **DATE**, and **TIMESTAMP** Types and **String** Types

**Identifier Qualifiers**: phân tách qua dấu . và có thể có khoảng cách ở giữa vẫn hiểu

_db_name.tbl_name.col_name_

### Data type

#### Integer types

SQL standard integer types INTEGER (or INT) and SMALLINT are supported by MySQL. As an extension to the standard, MySQL also supports the integer types TINYINT, MEDIUMINT, and BIGINT. Following table shows the required storage and range (maximum and minimum value for signed and unsigned integer) for each integer type.

| Type      | Length in Bytes | Minimum Value (Signed) | Maximum Value (Signed) | Minimum Value (Unsigned) | Maximum Value (Unsigned) |
| :-------- | :-------------- | :--------------------- | :--------------------- | :----------------------- | :----------------------- |
| TINYINT   | 1               | -128                   | 127                    | 0                        | 255                      |
| SMALLINT  | 2               | -32768                 | 32767                  | 0                        | 65535                    |
| MEDIUMINT | 3               | -8388608               | 8388607 to             | 0                        | 16777215                 |
| INT       | 4               | -2147483648            | 2147483647             | 0                        | 4294967295               |
| BIGINT    | 8               | -9223372036854775808   | 92233720368 54775807   | 0                        | 184467440737 09551615    |

**Floating-Point Types**

The FLOAT and DOUBLE types represent approximate numeric data values. MySQL uses four bytes for single-precision values and eight bytes for double-precision values.

| Types  | Description                                                                        |
| :----- | :--------------------------------------------------------------------------------- |
| FLOAT  | A precision from 0 to 23 results in a four-byte single-precision FLOAT column      |
| DOUBLE | A precision from 24 to 53 results in an eight-byte double-precision DOUBLE column. |

MySQL allows a nonstandard syntax: FLOAT(M,D) or REAL(M,D) or DOUBLE PRECISION(M,D). Here values can be stored up to M digits in total where D represents the decimal point. For example, a column defined as FLOAT(8,5) will look like -999.99999. MySQL performs rounding when storing values, so if you insert 999.00009 into a FLOAT(7,4) column, the approximate result is 999.0001.

#### MySQL Date and Time Types

The date and time types represent DATE, TIME, DATETIME, TIMESTAMP, and YEAR. Each type has a range of valid values, as well as a “zero” value.

**DATETIME, DATE, and TIMESTAMP Types**

| Types     | Description                                                                                                                               | Display Format      | Range                                                  |
| :-------- | :---------------------------------------------------------------------------------------------------------------------------------------- | :------------------ | :----------------------------------------------------- |
| DATETIME  | Use when you need values containing both date and time information.                                                                       | YYYY-MM-DD HH:MM:SS | '1000-01-01 00:00:00' to '9999-12-31 23:59:59'.        |
| DATE      | Use when you need only date information.                                                                                                  | YYYY-MM-DD          | '1000-01-01' to '9999-12-31'.                          |
| TIMESTAMP | Values are converted from the current time zone to UTC while storing and converted back from UTC to the current time zone when retrieved. | YYYY-MM-DD HH:MM:SS | '1970-01-01 00:00:01' UTC to '2038-01-19 03:14:07' UTC |

#### String Types

The string types are CHAR, VARCHAR, BINARY, VARBINARY, BLOB, TEXT, ENUM, and SET.

**CHAR and VARCHAR Types**

The CHAR and VARCHAR types are similar but differ in the way they are stored and retrieved. They also differ in maximum length and in whether trailing spaces are retained.

| Types   | Description                                                                                                                                                 | Display Format               | Range in characters                                                                    |
| :------ | :---------------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------- | :------------------------------------------------------------------------------------- |
| CHAR    | Contains non-binary strings. Length is fixed as you declare while creating a table. When stored, they are right-padded with spaces to the specified length. | Trailing spaces are removed. | The length can be any value from 0 to 255.                                             |
| VARCHAR | Contains non-binary strings. Columns are variable-length strings.                                                                                           | As stored.                   | A value from 0 to 255 before MySQL 5.0.3, and 0 to 65,535 in 5.0.3 and later versions. |

#### **BLOB and TEXT Types**

A BLOB is a binary large object that can hold a variable amount of data. There are four types of BLOB, TINYBLOB, BLOB, MEDIUMBLOB, and LONGBLOB. These differ only in the maximum length of the values they can hold.
The four TEXT types are TINYTEXT, TEXT, MEDIUMTEXT, and LONGTEXT. These correspond to the four BLOB types and have the same maximum lengths and storage requirements.

| Types      | Description                                                                                                                                                   | Categories | Range                             |
| :--------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------ | :--------- | :-------------------------------- |
| BLOB       | Large binary object that containing a variable amount of data. Values are treated as binary strings.You don't need to specify length while creating a column. | TINYBLOB   | Maximum length of 255 characters. |
| MEDIUMBLOB | Maximum length of 16777215 characters.                                                                                                                        |            |                                   |
| LONGBLOB   | Maximum length of 4294967295 characters                                                                                                                       |            |                                   |
| TEXT       | Values are treated as character strings having a character set.                                                                                               | TINYBLOB   | Maximum length of 255 characters. |
| MEDIUMBLOB | Maximum length of 16777215 characters.                                                                                                                        |            |                                   |
| LONGBLOB   | Maximum length of 4294967295 characters                                                                                                                       |            |                                   |

**ENUM Types**

A string object whose value is chosen from a list of values given at the time of table creation. For example -

```sql
CREATE TABLE length (     length ENUM('small', 'medium', 'large') );
```

Copy

**SET Types**

A string object having zero or more comma separated values (maximum 64). Values are chosen from a list of values given at the time of table creation.

**Difference between MySQL Datetime and Timestamp data Types**

The DATETIME type is used when you need values containing both date and time information. MySQL retrieves and displays DATETIME values in ‘YYYY-MM-DD HH:MM:SS’ format. The supported range is 1000-01-01 00:00:00' to '9999-12-31 23:59:59'.

The TIMESTAMP data type is also used when you need values containing both date and time information. TIMESTAMP has a range of '1970-01-01 00:00:01' UTC to '2038-01-19 03:14:07' UTC

The major difference between DATETIME and TIMESTAMP is that TIMESTAMP values are converted from the current time zone to UTC while storing, and converted back from UTC to the current time zone when retrieved. The datetime data type value is unchanged.

## MySQL: User-Defined Variables

**Syntax :** @var*name
var_name consists of alphanumeric characters, ".", "*", and "\$". A user variable name can contain other characters if you quote it as a string or identifier (for example, @'my-var', @"my-var", or @`my-var`).
Note : User variable names are not case sensitive in MySQL 5.0 and up.

One way to set a user-defined variable is by issuing a SET statement :

```sql
SET @var_name = expr [, @var_name = expr] ...
```

```sql
SET @x = 10;
SET @y = 20;
SET @z = 30;

SELECT @x, @y, @z;
+------+------+------+
| @x   | @y   | @z   |
+------+------+------+
|   10 |   20 |   30 |
```

**Toán tử**

**MySQL Comment Syntax**

MySQL supports three comment styles :

- "#" character to the end of the line.
- "--" sequence to the end of the line.

# MySQL Create Database

## Database

### MySQL create database

```sql
CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] database_name
Ex: CREATE DATABASE bookinfo;
```

### Setting the default database

MySQL **use** statement is used to change the database from default to the given database.

**Syntax:**

use [database_name];

### MySQL show database

SHOW statement displays a list of currently existing databases on the server.

**Syntax:**

SHOW [expression];

**Example:**

The following MySQL statement will show the current database.

```sql
SHOW databases;

MySQL> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| bookinfo           |
| MySQL              |
| test               |
+--------------------+
4 rows in set (0.01 sec)
```

### MySQL select database

The following MySQL statement will show the current database.

```sql
SELECT DATABASE();
```

MySQL show tables statement
MySQL SHOW CREATE DATABASE
Find MySQL database size
Find all the tables in a MySQL database with specific column names in them

### MySQL DROP all TABLES or MySQL DROP DATABASE

```sql
DROP {DATABASE | SCHEMA} [IF EXISTS] db_name
DROP DATABASE tempdatabase;

-- DROP TABLE
DROP TABLE table2,table4,table5;

-- MySQL DROP column
ALTER TABLE  newcate DROP cate_descrip;

-- If you want to remove the column col1, col11 and col12 from the table table1, the following sql statement can be used.

ALTER TABLE table1 drop col1, drop col11, drop col12;
```

### MySQL CREATE TABLE when not EXISTS

The keywords IF NOT EXISTS is used to prevent an error from occurring if the table exists. The keywords IF NOT EXISTS will not verify whether the existing table is of the same structure indicated by the CREATE TABLE statement. The following statement creates a table newauthor if the table 'newauthor' does not exist with the following column name, type, length and default value -

```sql
CREATE TABLE IF NOT EXISTS newauthor
(aut_id        	varchar(8),
aut_name      	varchar(50),
country       	varchar(25),
home_city     	varchar(25) NULL);
```

Copy

### MySQL CREATE with LIKE or copy table structure

MySQL allows you to create a table identical to another by using LIKE. The following MySQL statement will create a table 'author_copy' whose structure is identical to the table 'author'.

Sample table: author

<iframe src="https://www.w3resource.com/mysql/author.php" height="175" class="span12" style="vertical-align: middle; display: block; width: 1068.75px; border: 3px solid silver !important;"></iframe>

```sql
CREATE TABLE author_copy LIKE author;
```

Copy

### MySQL CREATE TABLE with SELECT or copy a table

MySQL AS SELECT allows you to copy the data (either selective or total) or table structure to a new table. The following MySQL statement will create a new table 'author_copy' with the same structure and data of 'author' table .

```sql
CREATE TABLE author_copy
AS SELECT *
FROM  author;
```

### MySQL loading data into a table with insert statement

To insert new records into a table INSERT statement can be used. The values will be supplied by the user in the same order as columns are listed in the table. String and date values are needed to be specified within quoted string.

**Syntax**

```
INSERT INTO  <table_name> values(value1,value2,....);
```

Code:

```sql
INSERT INTO  publisher
values(‘P010’,’ Novel Publisher Ltd.’,’
mumbai’,’ India’,’ hydrabad’);
```

### MySQL CONSTRAINTs are :

- NOT NULL
- UNIQUE
- PRIMARY KEY
- FOREIGN KEY
- CHECK
- DEFAULT
- AUTO_INCREMENT

https://www.w3resource.com/mysql/creating-table-advance/constraint.php

Here is the statement below.

```sql
CREATE TABLE IF NOT EXISTS newpublisher
(pub_id varchar(8) NOT NULL UNIQUE DEFAULT '' ,
pub_name varchar(50) NOT NULL  DEFAULT '' ,
pub_city varchar(25) NOT NULL  DEFAULT '' ,
country varchar(25) NOT NULL DEFAULT 'India',
country_office varchar(25) ,
no_of_branch int(3),
estd date
CHECK ((country='India' AND pub_city='Mumbai')
OR (country='India' AND pub_city='New Delhi')) ,
PRIMARY KEY (pub_id));
```

### PROC

```sql
DELIMITER $$
CREATE PROCEDURE countAbc()

   BEGIN
      DECLARE a INT Default 0 ;
      simple_loop: LOOP
         SET a=a+1;
         select a;
         IF a=5 THEN
            LEAVE simple_loop;
         END IF;
   END LOOP simple_loop;
END $$

call countAbc();
```

---

https://stackoverflow.com/questions/5125096/for-loop-example-in-mysql

```sql
DROP PROCEDURE IF EXISTS CONTROL_SHEET_DEV_PHUONG.test;
DELIMITER $$
CREATE PROCEDURE CONTROL_SHEET_DEV_PHUONG.test()
   BEGIN
	  declare id VARCHAR(255) default 'I00000000000000';
      declare str VARCHAR(255) default '';
	  declare x INT default 0;
      declare idx INT default 0;
	  SET idx = 27099;

	  WHILE x <= 300 DO

		SET str = CONCAT(id,idx,'');
        update CONTROL_SHEET_DEV_PHUONG.TBL_DISCLOSURE_ITEM set SHEET_ID='S0000000000000000482' where DISCLOSURE_ID = str and SHEET_ID='S0000000000000000481';
		SET idx = idx + 1;
        SET x = x + 1;

        -- select x;
	  END WHILE;
	-- select str;

END $$

call test();

----------------------
DELIMITER $$
CREATE PROCEDURE whileBlock()

wholeblock:BEGIN
  declare str VARCHAR(255) default '';
  declare x INT default 0;
  SET x = 1;

  WHILE x <= 5 DO
    SET str = CONCAT(str,x,',');
    SET x = x + 1;
  END WHILE;

  select str;
END $$

call whileBlock();

-- 1,2,3,4,5,

DROP PROCEDURE IF EXISTS CONTROL_SHEET_DEV_PHUONG.test;
DELIMITER $$
CREATE PROCEDURE CONTROL_SHEET_DEV_PHUONG.test()
   wholeblock:BEGIN
  DECLARE x INT;
  DECLARE str VARCHAR(255);
  SET x = -5;
  SET str = '';

  loop_label: LOOP
    IF x > 0 THEN
      LEAVE loop_label;
    END IF;
    SET str = CONCAT(str,x,',');
    SET x = x + 1;
    ITERATE loop_label;
  END LOOP;

  SELECT str;

END $$

call test();

-- -5,-4,-3,-2,-1,0,

Bien
DROP PROCEDURE IF EXISTS ABC;
DELIMITER $$
CREATE PROCEDURE ABC()

   BEGIN
      SET @a = 0;
      simple_loop: LOOP
         SET @a=@a+1;
         select @a;
         IF @a=5 THEN
            LEAVE simple_loop;
         END IF;
   END LOOP simple_loop;
END $$
```

---

TEXT mysql: 65535
select co moi orderby ngan gon dk

---

## case select

```sql
select
    TCS.CONTROL_SHEET_ID
    , case
        when TA.TYPE = 1
            then concat(TA.TARGET_YEAR, '年', TA.TARGET_MONTH, '月期第１四半期')
        when TA.TYPE = 2
            then concat(TA.TARGET_YEAR, '年', TA.TARGET_MONTH, '月期第２四半期')
        when TA.TYPE = 3
            then concat(TA.TARGET_YEAR, '年', TA.TARGET_MONTH, '月期第３四半期')
        else concat(TA.TARGET_YEAR, '年', TA.TARGET_MONTH, '月期期末')
    end as PERIOD_NAME
```

## MySQL GROUP_CONCAT() function

https://www.w3resource.com/mysql/aggregate-functions-and-grouping/aggregate-functions-and-grouping-group_concat.php

### Update query not working in mysql workbench

Edit > Preferences > Sql Editor > uncheck the "Safe Updates"
https://stackoverflow.com/questions/33971357/update-query-not-working-in-mysql-workbench

## end

http://www.mysqltutorial.org/mysql-group_concat/
GROUP_CONCAT(split(thing, " "), '----') AS thing_name,

http://www.microshell.com/database/mysql/emulating-nextval-function-to-get-sequence-in-mysql/
https://www.convert-in.com/docs/mysql/sequence.htm
https://w3resource.com/mysql/date-and-time-functions/mysql-current_timestamp-function.php
SELECT
NEXTVAL(
/_sequenceName_/'SEQUENCE_CLIENT' -- シーケンス名
)
;

select
`TCS`.CONTROL_SHEET_ID,
`TCS`.TYPE,
`TCS`.NAME,
`TCS`.UPDATE_DTTM,
`USR`.USER_NAME,
group_concat(if(`CS`.TYPE = '1', `CS`.SHEET_ID, '') separator '') AS `BASIC_DOCUMENT_ID`,
group_concat(if(`CS`.TYPE = '2', `CS`.SHEET_ID, '') separator '') AS `DISCLOSURE_SUMMARY_ID`,
group_concat(if(`CS`.TYPE = '3', `CS`.SHEET_ID, '') separator '') AS `DISCLOSURE_REPORT_ID`,
group_concat(if(`CS`.TYPE = '4', `CS`.SHEET_ID, '') separator '') AS `DISCLOSURE_FINANCIAL_ID`
from
TBL_CONTROL_SHEET as `TCS`
inner join TBL_SHEET as `CS`
on `TCS`.CONTROL_SHEET_ID = `CS`.CONTROL_SHEET_ID
and `CS`.DELETE_FLAG = false
left join TBL_USER as `USR`
on `USR`.USER_ID = `TCS`.UPDATE_USER
and `USR`.DELETE_FLAG = false

where
`TCS`.DELETE*FLAG = false
and `TCS`.TEMPLATE_FLAG = true
/*%if name != null && name.length() > 0 _/
and `TCS`.NAME like /_ @infix(name) _/'name'
/_%end _/
group by
`TCS`.CONTROL_SHEET_ID
/_# orderBy \_/

---

SELECT EVENT*ID FROM TABLE WHERE EVENT_START_DATE > NOW() ORDER BY ABS(DATEDIFF(EVENT_START_DATE, NOW())) ASC LIMIT 3
SELECT *, (datediff(now(), TB.CREATE*DTTM)) AS NUM FROM CONTROL_SHEET_DEV_2.TBL_CONTROL_SHEET AS TB order by (datediff(now(), TB.CREATE_DTTM)) asc;
SELECT *, CONCAT(2019,'-',LPAD(10,2,'00'),'-',LPAD(15,2,'00')) AS NUM FROM CONTROL_SHEET_DEV_2.TBL_CONTROL_SHEET AS TB order by (datediff(CONCAT(2019,'-',LPAD(10,2,'00'),'-',LPAD(15,2,'00')), TB.CREATE_DTTM)) asc;

---

select
TCS.CONTROL_SHEET_ID,
TCL.CLIENT_ID,
TCL.NAME,
TA.PERIOD_ID,
concat(TA.TARGET_YEAR, '年', TA.TARGET_MONTH, '月') as PERIOD_NAME,
TA.TYPE,
TA.WORK_DTTM_FROM,
TA.WORK_DTTM_TO,
TCS.STATUS,
TCS.UPDATE_DTTM,
USR.USER_NAME,
group_concat(if(TS.TYPE = '1', TS.SHEET_ID, '') separator '') AS BASIC_DOCUMENT_ID,
group_concat(if(TS.TYPE = '2', TS.SHEET_ID, '') separator '') AS DISCLOSURE_SUMMARY_ID,
group_concat(if(TS.TYPE = '3', TS.SHEET_ID, '') separator '') AS DISCLOSURE_REPORT_ID,
group_concat(if(TS.TYPE = '4', TS.SHEET_ID, '') separator '') AS DISCLOSURE_FINANCIAL_ID
from
TBL_CONTROL_SHEET as TCS
inner join TBL_SHEET as TS
on TCS.CONTROL_SHEET_ID = TS.CONTROL_SHEET_ID
and TS.DELETE_FLAG = false
inner join TBL_ACCOUNTING_PERIOD as TA
on TA.CONTROL_SHEET_ID = TCS.CONTROL_SHEET_ID
and TA.DELETE_FLAG = false
and TA.CLIENT_ID = 'K0000000000000000047'
left join TBL_CLIENT as TCL
on TCL.CLIENT_ID = TA.CLIENT_ID
and TCL.DELETE_FLAG = false
left join TBL_USER as USR
on USR.USER_ID = TCS.UPDATE_USER
and USR.DELETE_FLAG = false
where
TCS.DELETE_FLAG = false
and TCS.TEMPLATE_FLAG = true
group by
TCS.CONTROL_SHEET_ID, TCL.CLIENT_ID, TA.PERIOD_ID, TA.TARGET_YEAR, TA.TARGET_MONTH, TA.TYPE, TA.WORK_DTTM_FROM, TA.WORK_DTTM_TO
order by (datediff(CONCAT(2019,'-',LPAD(10, 2,'00'),'-',LPAD(15,2,'00')), TCS.UPDATE_DTTM)) asc LIMIT 1

**\*\*\*\***\*\*\*\***\*\*\*\***\*\*\*\***\*\*\*\***\*\*\*\***\*\*\*\*** GET DATE LASTEST **\*\*\*\***\*\***\*\*\*\***\*\*\*\***\*\*\*\***\*\***\*\*\*\***
select
TCS.CONTROL*SHEET_ID ,
TA.TARGET_YEAR AS PERIOD_TARGET_YEAR,
TA.TARGET_MONTH AS PERIOD_TARGET_MONTH
from
TBL_CONTROL_SHEET as TCS
inner join TBL_ACCOUNTING_PERIOD as TA
on TA.CONTROL_SHEET_ID = TCS.CONTROL_SHEET_ID
and TA.DELETE_FLAG = false
and TA.CLIENT_ID = /* clientId _/'C001'
where
TCS.DELETE_FLAG = false
and TCS.STATUS = /_ status _/3
and TCS.TYPE = /_ controlSheetType _/'1'
and DATEDIFF(
/_ periodTargetTime _/'2019-9-1'
, CONCAT(TA.TARGET_YEAR,'-',LPAD(TA.TARGET_MONTH,2,'00'),'-',LPAD(1,2,'00'))) >= 0 => CONCAT(TA.TARGET_YEAR,'-',TA.TARGET_MONTH,'-',1))
order by
DATEDIFF(
/_ periodTargetTime \_/'2019-9-1'
, CONCAT(TA.TARGET_YEAR,'-',LPAD(TA.TARGET_MONTH,2,'00'),'-',LPAD(1,2,'00'))) asc => chuyển thành TA.TARGET_YEAR desc ,TA.TARGET_MONTH desc
LIMIT 1
-- TARGET_YEAR. TARGET_MONTH là int
Thứ tự thực hiện sql: https://viblo.asia/p/thu-tu-thuc-hien-cho-cau-lenh-sql-XL6lA8ogZek
Tool format sql online: https://www.freeformatter.com/sql-formatter.html

tìm tên giống: like %abc%
Hàm @prefix trong doma giữ nguyên đầu + %: 'VN%'
Hàm @suffix trong doma % + giữ nguyên cuối: '%VN'

https://marcin-chwedczuk.github.io/spring-transactional-cheat-sheet
https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/testing.html#testing-tx
http://redino.net/blog/2018/08/spring-disable-transaction-for-method-in-transactional-class/
https://viblo.asia/p/dong-bo-hoa-da-luong-trong-java-ZjlvalBxkqJ
https://viblo.asia/p/java-synchronized-blocks-jlA7GK04vKZQ
http://tutorials.jenkov.com/java-concurrency/synchronized.html
https://www.javatpoint.com/synchronization-in-java
@Transactional(propagation=Propagation.REQUIRES_NEW, noRollbackFor = Exception.class)
=> đi cùng nhau k nhận sysn: @Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation=Propagation.REQUIRES_NEW, noRollbackFor = Exception.class)
https://stackoverflow.com/questions/41767860/spring-transactional-with-synchronized-keyword-doesnt-work
https://stackoverflow.com/questions/8490852/spring-transactional-isolation-propagation
https://dzone.com/articles/bountyspring-transactional-management
https://docs.oracle.com/javase/tutorial/jdbc/basics/transactions.html

---
