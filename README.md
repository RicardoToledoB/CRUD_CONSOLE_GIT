# CRUD_CONSOLE_GIT
CRUD CONSOLE CON CONECTARO JDBC
CREAR BDD:

mysql> create database CRUD_CONSOLE_GIT;

Query OK, 1 row affected (0.17 sec)

mysql> use CRUD_CONSOLE_GIT;
Database changed
mysql> create table Personas(
    -> id_persona int(10) primary key not null auto_increment,
    -> nombre varchar(250),
    -> apepat varchar(250),
    -> apemat varchar(250));
Query OK, 0 rows affected (0.34 sec)

mysql> 
