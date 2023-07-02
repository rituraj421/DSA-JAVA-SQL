-- create database 
CREATE DATABASE codecamp;

-- show available databases
SHOW DATABASES;

-- SWITCH DATABASE
USE codecamp;

-- now create a table
CREATE TABLE student;

-- Now we willl create our first table in database <codecamp>

-- WE WILL CREATE A TABLE 'STUDENT' WITH ENTITIES , `STUDENT_ID` `NAME` AND `MAJOR`

CREATE TABLE codecamp.student (
    student_id INT PRIMARY KEY,
    name VARCHAR(15),
    major VARCHAR(15)
);

USE codecamp;
SHOW TABLE;

DESCRIBE codecamp.student;

ALTER TABLE student ADD gpa DECIMAL;

ALTER TABLE student DROP COLUMN gpa;

INSERT INTO codecamp.student VALUES (1, 'rituraj', 'construction');
INSERT INTO codecamp.student VALUES (2, 'rahul', 'chemical');
INSERT INTO codecamp.student VALUES (3, 'adesh', 'aaram');
INSERT INTO codecamp.student VALUES (4, 'shivam', 'mazdoor');
INSERT INTO codecamp.student VALUES (5, 'amod', 'station');

SELECT * FROM codecamp.student;