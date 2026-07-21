Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.45 MySQL Community Server - GPL

Copyright (c) 2000, 2026, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE SMS
    -> ^C
mysql> CREATE DATABASE SMS;
Query OK, 1 row affected (0.04 sec)

mysql> SHOW DATABASES
    -> ^C
mysql> SHOW DATABASES;
+--------------------------+
| Database                 |
+--------------------------+
| employeemanagement       |
| employeemanagementsystem |
| information_schema       |
| mysql                    |
| performance_schema       |
| sms                      |
| sys                      |
+--------------------------+
7 rows in set (0.03 sec)

mysql> USE DATABASE SMS
ERROR 1049 (42000): Unknown database 'database'
mysql> USE DATABASE SMS;
ERROR 1049 (42000): Unknown database 'database'
mysql> USE SMS;
Database changed
mysql> CREATE TABLE ROLLNO
    -> ^C
mysql> CREATE TABLE ROLLNO;
ERROR 4028 (HY000): A table must have at least one visible column.
mysql> CREATE TABLE STUDENTINFO(STD_NAME VARCHAR(20) ,STUD_ROLLNO INTEGER,AGE INT );
Query OK, 0 rows affected (0.05 sec)

mysql> SHOW TABLES
    -> ^C
mysql> SHOW TABLES;
+---------------+
| Tables_in_sms |
+---------------+
| studentinfo   |
+---------------+
1 row in set (0.01 sec)

mysql> INSERT INTO TABLE STUDENTINFO VALUES(^C
mysql> SHOW STUDENTINFO
    -> SHOW STUDENTINFO^C
mysql> SHOW STUDENTINFO;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'STUDENTINFO' at line 1
mysql> SELECT * FROM STUDENTINFO
    -> SELECT * FROM STUDENTINF^C
mysql> SELECT * FROM STUDENTINFO;
Empty set (0.01 sec)

mysql> DESC STUDENTINFO;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| STD_NAME    | varchar(20) | YES  |     | NULL    |       |
| STUD_ROLLNO | int         | YES  |     | NULL    |       |
| AGE         | int         | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
3 rows in set (0.02 sec)

mysql> INSERT INTO TABLE STUDENTINFO VALUES("SAANVI",14,20);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'TABLE STUDENTINFO VALUES("SAANVI",14,20)' at line 1
mysql> INSERT INTO STUDENTINFO VALUES("SAANVI",14,20);
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO STUDENTINFO VALUES("KAVYA",19,19);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO STUDENTINFO VALUES("HARI",16,19);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO STUDENTINFO VALUES("KESHAV",17,19);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO STUDENTINFO VALUES("KENISHA",21,19);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO STUDENTINFO VALUES("GARGI",6,18);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO STUDENTINFO VALUES("AAYUSHI",1,21);
Query OK, 1 row affected (0.01 sec)
       ^C
mysql> ^C
mysql> SELECT * FROM STUDENTINFO
    -> ^C
mysql> SELECT * FROM STUDENTINFO;
+----------+-------------+------+
| STD_NAME | STUD_ROLLNO | AGE  |
+----------+-------------+------+
| SAANVI   |          14 |   20 |
| KAVYA    |          19 |   19 |
| HARI     |          16 |   19 |
| KESHAV   |          17 |   19 |
| KENISHA  |          21 |   19 |
| GARGI    |           6 |   18 |
| AAYUSHI  |           1 |   21 |
+----------+-------------+------+
7 rows in set (0.00 sec)

mysql> DELETE FROM STUDENTINFO WHERE STD_ROLLNO=16;
ERROR 1054 (42S22): Unknown column 'STD_ROLLNO' in 'where clause'
mysql> DELETE FROM STUDENTINFO WHERE STUD_ROLLNO=16;
Query OK, 1 row affected (0.00 sec)

mysql> SELECT * FROM STUDENTINFO;
+----------+-------------+------+
| STD_NAME | STUD_ROLLNO | AGE  |
+----------+-------------+------+
| SAANVI   |          14 |   20 |
| KAVYA    |          19 |   19 |
| KESHAV   |          17 |   19 |
| KENISHA  |          21 |   19 |
| GARGI    |           6 |   18 |
| AAYUSHI  |           1 |   21 |
+----------+-------------+------+
6 rows in set (0.00 sec)

mysql> UPDATE COOKIE FROM STUDENTINFO WHERE STUD_ROLLNO=21;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'FROM STUDENTINFO WHERE STUD_ROLLNO=21' at line 1
mysql> UPDATE MODIFY COOKIE FROM STUDENTINFO WHERE STUD_ROLLNO=21;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'FROM STUDENTINFO WHERE STUD_ROLLNO=21' at line 1
mysql> UPDATE STUDENTINFO
    -> SET STUD_NAME = 'Kavya'
    -> SET STUD_NAME = 'Kavya'^Z^Z^Z^C
mysql> UPDATE STUDENTINFO
    -> SET STUD_NAME = 'Kavya'
    -> WHERE STUD_ROLLNO = 21;
ERROR 1054 (42S22): Unknown column 'STUD_NAME' in 'field list'
mysql> UPDATE STUDENTINFO SET STD_NAME="KENISHA" WHERE STUD_ROLLNO=21;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 1  Changed: 0  Warnings: 0

mysql> SELECT * FROM STUDENTINFO;
+----------+-------------+------+
| STD_NAME | STUD_ROLLNO | AGE  |
+----------+-------------+------+
| SAANVI   |          14 |   20 |
| KAVYA    |          19 |   19 |
| KESHAV   |          17 |   19 |
| KENISHA  |          21 |   19 |
| GARGI    |           6 |   18 |
| AAYUSHI  |           1 |   21 |
+----------+-------------+------+
6 rows in set (0.00 sec)

mysql> UPDATE STUDENTINFO SET STD_NAME="COOKIE" WHERE STUD_ROLLNO=21;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM STUDENTINFO;
+----------+-------------+------+
| STD_NAME | STUD_ROLLNO | AGE  |
+----------+-------------+------+
| SAANVI   |          14 |   20 |
| KAVYA    |          19 |   19 |
| KESHAV   |          17 |   19 |
| COOKIE   |          21 |   19 |
| GARGI    |           6 |   18 |
| AAYUSHI  |           1 |   21 |
+----------+-------------+------+
6 rows in set (0.00 sec)

mysql> DROP STUDENTINFO;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'STUDENTINFO' at line 1
mysql> DROP TABLE STUDENTINFO;
Query OK, 0 rows affected (0.02 sec)

mysql> SELECT * FROM STUDENTINFO;
ERROR 1146 (42S02): Table 'sms.studentinfo' doesn't exist
mysql> DROP SMS;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'SMS' at line 1
mysql> DROP DATABASE SMS;
Query OK, 0 rows affected (0.02 sec)

mysql> SHOW DATABASE
    -> ^C
mysql> SHOW DATABASE;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DATABASE' at line 1
mysql>
