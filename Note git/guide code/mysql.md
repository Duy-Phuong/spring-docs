### Primary Keys - Changing the Starting Index

```sql
ALERT TABLE hb.student AUTO_INCREMENT=200
Cách reset
Truncate hn.student

```

### Create user

```sql
CREATE USER 'hbstudent'@'localhost' IDENTIFIED BY 'hbstudent';

GRANT ALL PRIVILEGES ON * . * TO 'hbstudent'@'localhost';

#
# Starting with MySQL 8.0.4, the MySQL team changed the
# default authentication plugin for MySQL server
# from mysql_native_password to caching_sha2_password.
#
# The command below will make the appropriate updates for your user account.
#
# See the MySQL Reference Manual for details:
# https://dev.mysql.com/doc/refman/8.0/en/caching-sha2-pluggable-authentication.html
#
ALTER USER 'hbstudent'@'localhost' IDENTIFIED WITH mysql_native_password BY 'hbstudent';


```

### Watch diagram

3. @OneToMany - Bi-Directional - Database Prep Work

- Database/ Revert engineer/ Click button Continue and choose db
- Check 2 checkbox/ Execute
