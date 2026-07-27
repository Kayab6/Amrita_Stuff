# code
- to create table
  
create table students(student_id int,student_name varchar(50),department varchar(30), age int,cgpa decimal(3,2),email varchar(100));

DESCRIBE students;
- to alter column
  
alter table students add (phone_number varchar(15));


ALTER TABLE STUDENTS MODIFY(STUDENT_NAME VARCHAR(100));


ALTER TABLE STUDENTS RENAME COLUMN STUDENT_NAME TO FULL_NAME;
