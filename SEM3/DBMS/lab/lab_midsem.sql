
select * from  student;

select Stu_name,gender,cgpa from student;




SELECT s.*
FROM STUDENT s
JOIN DEPARTMENT d
ON s.Dept_Id = d.Dept_Id
WHERE d.Dept_Name = 'Computer Science';


select * from student where cgpa>8.0;


select * from student where cgpa>=7.0 and cgpa<=9 ;


select * from student where city='Bangalore';

select * from student where gender='M';

select * from  student where gender='F' and semester=5;


select * from  student where cgpa=9;

select * from  student where semester!=1;


select * from department;

select dept_name,location from department;


select coursename,credits from course;

select * from course where credits=4;



select * from faculty where salary>50000;


select * from student where cgpa>8 and semester=3;

select * from student where city='Bangalore' or city='chennai';

select * from student where city<>'Bangalore';


select * from student where cgpa>=7 and cgpa<=9;

select * from faculty where salary>=50000 and salary<=80000;

select * from student where semester=3 or semester=5;

select * from student where cgpa>8.5 and city='bangalore';

select * from course where credits>2 and credits<5;

select * from faculty where dept_id=101 and salary>60000;

select * from student where semester<>2 and semester<>4;

select * from student where semester in(1,3,5);

select * from student where city in('bangalore','chennai','mysore');


select * from faculty where salary between 40000 and 70000;


select * from student where cgpa between 7.5 and 9.5;

select stu_name from student where stu_name like 'A%';


select stu_name from student where stu_name like '%A';



select stu_name from student where stu_name like '%ar%';

select stu_name from student where stu_name like '_a%';

select stu_name from student where stu_name like '_____';


select stu_name from student where stu_name like 'S%' and stu_name like '%a';


select * from faculty where designation like '%Professor%';

SELECT * from student where city is null;


SELECT * from student where city is not null;


select * from faculty where designation is null;


select * from course where coursename like 'D%';

SELECT * FROM STUDENT ORDER BY CGPA ASC;


SELECT * FROM STUDENT ORDER BY CGPA DESC;

SELECT * FROM STUDENT ORDER BY STU_NAME ASC;


SELECT * FROM STUDENT ORDER BY SEMESTER DESC;

SELECT DISTINCT CITY FROM STUDENT;

SELECT * FROM STUDENT;
SELECT DISTINCT DEPT_ID FROM STUDENT;




SELECT * FROM FACULTY ORDER BY SALARY DESC;

SELECT * FROM COURSE ORDER BY COURSENAME ASC;
SELECT * FROM STUDENT;
SELECT * FROM STUDENT ORDER BY CITY ASC AND ORDER BY STU_NAME ASC;


DID TILLL 50 








select * from student;


SELECT COUNT(*) FROM STUDENT;

select max(cgpa) from student;

select min(cgpa) from student;


select avg(cgpa) from student;

select sum(salary) from faculty;

select max(salary) from faculty;

select min(salary) from faculty;

select avg(salary) from faculty;

select count(*) from course; 



SELECT AVG(Marks) FROM ENROLLMENT;

select max(Marks) from enrollment;

select min(Marks) from enrollment;

select count(*) from student where city='Bangalore';

select count(*) from student where gender='F';

select * from course;

select avg(credits) from course;

-----------



Level 6






77
 
select Dept_id,count(*) from student group by dept_id;


select semester,count(*) from student group by semester;

select dept_id ,avg(cgpa) from student group by dept_id;

/* comment */
select dept_id ,max(cgpa) from student group by dept_id;

select semester ,min(cgpa) from student group by semester;


select city , count(*) from student group by city;

select dept_id,avg(salary) from faculty group by dept_id;

select dept_id ,max(salary) from faculty group by dept_id;

select dept_id , count(*) from  course group by dept_id;

select * from enrollment;

select courseid ,avg(marks) from enrollment group by courseid;


select courseid ,max(marks) from enrollment group by courseid;

select courseid,count(*) from enrollment group by courseid;


select designation ,count(*) from faculty group by designation;

select grade ,count(*) from enrollment group by grade;

select dept_id ,count(*) from student group by dept_id having count(*)>2;






select courseid ,avg(marks) from enrollment group by courseid having avg(marks)>80;









select dept_id, sum(salary) from faculty group by dept_id having sum(salary)>100000;

select designation,count(facultyid) from faculty group by designation having count(facultyid)>1;


























92 nd question 





93 also check


98 also check u need 2 joins






99

select * from student;

select city ,avg(cgpa) from student group by city having avg(cgpa)>8;


select semester , min(cgpa) from student group by semester having min(cgpa)<7;


select student.stu_name,department.dept_name from student join department on student.dept_id=department.dept_id;

select * from student;

select * from course;

select * from enrollment;

select * from department;

select * from faculty;

select student.stu_name,course.coursename from student join enrollment on studentt.stu_id=enrollment.stu_id join course on enrollment.courseid;



select student.stu_name, department.dept_name,student.cgpa from student join department on student.dept_id=department.dept_id;


select faculty.facultyname ,department.dept_name from faculty join department on faculty.dept_id=department.dept_id;

select course.coursename, department.dept_name from course join department on course.dept_id=department.dept_id;

select student.stu_name,enrollment.marks from student join enrollment on student.stu_id=enrollment.stu_id;



select student.stu_name,course.coursename,enrollment.marks from student join enrollment on student.stu_id=enrollment.stu_id join course on enrollment.courseid=course.courseid;




Display faculty names along with the courses they teach.

SELECT FACULTY.FacultyName, COURSE.CourseName
FROM FACULTY
JOIN TEACHES
    ON FACULTY.FacultyID = TEACHES.FacultyID
JOIN COURSE
    ON TEACHES.CourseId = COURSE.CourseId;
















Join code debug 2 marks
Fill in the blakck 
Mcq 


3 tables primary foreigh null inseting values - 9 marks 

6 marks sql - 6 


select * from student;

select city ,avg(cgpa) from student group by city having avg(cgpa)>8;


select semester , min(cgpa) from student group by semester having min(cgpa)<7;


select student.stu_name,department.dept_name from student join department on student.dept_id=department.dept_id;

select * from student;

select * from course;

select * from enrollment;

select * from department;

select * from faculty;

select student.stu_name,course.coursename from student join enrollment on studentt.stu_id=enrollment.stu_id join course on enrollment.courseid;



select student.stu_name, department.dept_name,student.cgpa from student join department on student.dept_id=department.dept_id;


select faculty.facultyname ,department.dept_name from faculty join department on faculty.dept_id=department.dept_id;

select course.coursename, department.dept_name from course join department on course.dept_id=department.dept_id;

select student.stu_name,enrollment.marks from student join enrollment on student.stu_id=enrollment.stu_id;



select student.stu_name,course.coursename,enrollment.marks from student join enrollment on student.stu_id=enrollment.stu_id join course on enrollment.courseid=course.courseid;




Display faculty names along with the courses they teach.

SELECT FACULTY.FacultyName, COURSE.CourseName
FROM FACULTY
JOIN TEACHES
    ON FACULTY.FacultyID = TEACHES.FacultyID
JOIN COURSE
    ON TEACHES.CourseId = COURSE.CourseId;





select * from faculty;
alter table faculty add managerid int;

update faculty set managerid=null where  facultyid=301;

update faculty set managerid=301 where facultyid in(302,303,305);

update faculty set managerid=302 where facultyid in (304,306);

select f1.facultyname as faculty , f2.facultyname as manager from faculty f1 join faculty f2 on f1.managerid=f2.managerid;








