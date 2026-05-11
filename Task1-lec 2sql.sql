--create table Doctor contain

--id, name , salary , address
----------------------------------
--please insert 10 row with Data as you like 
-----------------------------------------
--update record number 3 with salary 20000
----------------------------------

CREATE TABLE Doctor(
id number(5),
name varchar2(20),
salary number(10),
Address varchar(20)
);

INSERT into Doctor (id,name,salary,Address) values(1,'Ahmed',7000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(2,'Omar',100000,'Cairo');
INSERT INTO doctor(id,name,salary,Address) values(3,'Hassan',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(4,'Mohamed',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(5,'Ali',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(6,'Tom',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(7,'bom',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(8,'fom',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(9,'dom',100000,'Alex');
INSERT INTO doctor(id,name,salary,Address) values(10,'Jerry',100000,'Alex');

UPDATE doctor SET salary=20000 WHERE id =3;


SELECT * FROM doctor;
-------------------------------------------------------

--delete record number 9
-----------------------------------------
-- please Concatenation all name with salary  of all rows
----------------------------------
--display all record with salary * 2
-----------------------------------------

DELETE from doctor WHERE id=9;
SELECT * FROM doctor;
SELECT name || ' '||salary AS name_salary FROM doctor;
SELECT id ,name,salary, salary*2 AS Total_salary,Address FROM doctor;

-------------------------------------------------------------
--select all data with salary  1000 , 2000 , 3000 
----------------------------------
--rename table Doctor to PRD_DOCTOR
-----------------------------------------
UPDATE  doctor  set salary=1000 WHERE id=5;
UPDATE  doctor  set salary=2000 WHERE id=6;
UPDATE  doctor  set salary=3000 WHERE id=7;

SELECT *FROM doctor;

SELECT * FROM doctor WHERE salary IN (1000,2000,3000);

ALTER TABLE doctor RENAME TO PRD_DOCTOR;

SELECT * FROM PRD_DOCTOR;









