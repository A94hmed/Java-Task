---------------------
--Find all employee where the emp_id is within a certain range  100  and  105.
-- Find all employee that belong to a specific set of emp_id  151 , 152, 153, 154 , 155.
-- Retrieve all employee where the employee first_name starts with the letter 'P' OR 'p'
-- Retrieve all employee where the employee first_name end with the letter 'A' OR 'a'
-- Retrieve all employee where the employee first_name with the letter 'A' OR 'a'
--Q1
SELECT * FROM EMPLOYEES 
WHERE EMPLOYEE_ID BETWEEN 100  and  105;

---------------------------
--Q2
SELECT * FROM EMPLOYEES 
WHERE employee_id In(151 , 152, 153, 154 , 155);

-------------------
--Q3
-- Retrieve all employee where the employee first_name starts with the letter 'P' OR 'p'

SELECT employee_id,
       first_name  ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
 WHERE FIRST_NAME  LIKE 'P%'OR FIRST_NAME like'p%';
----------
--Q4
-- Retrieve all employee where the employee first_name end with the letter 'A' OR 'a'

SELECT employee_id,
       first_name  ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
 WHERE FIRST_NAME LIKE '%A' OR FIRST_NAME LIKE '%a';

-------
--Q5
-- Retrieve all employee where the employee first_name with the letter 'A' OR 'a'

SELECT employee_id,
       first_name  ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
 WHERE FIRST_NAME LIKE '%A%' OR FIRST_NAME LIKE '%a%';
---------------------------
-- Retrieve all employee where the employee first_name  third char with the letter 'e' OR 'E'
-- Retrieve all employees who don't have a manager assigned (i.e., manager_id is NULL).
-- Find all employees who have a manager assigned.
-- Insert a new employee without assigning a manager (NULL value for manager_id).
-- Find all employees who work either in the 'AD_VP' JOB_ID or the 'IT_PROG' JOB_ID.

--Q6
-- Retrieve all employee where the employee first_name  third char with the letter 'e' OR 'E'

SELECT employee_id,
       first_name  ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
WHERE FIRST_NAME LIKE '__e%' OR FIRST_NAME LIKE '__E%';
----------------------
--Q7
-- Retrieve all employees who don't have a manager assigned (i.e., manager_id is NULL).

SELECT employee_id,
       first_name  ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
WHERE manager_id IS NULL;

---------------
--Q8
-- Find all employees who have a manager assigned.
SELECT * FROM EMPLOYEES 
WHERE manager_id IS NOT NULL;
---------
--Q9
--Insert a new employee without assigning a manager (NULL value for manager_id).

SELECT * FROM EMPLOYEES 

INSERT INTO EMPLOYEES(EMPLOYEE_ID,
    FIRST_NAME,
    LAST_NAME,
    EMAIL,
    PHONE_NUMBER,
    HIRE_DATE,
    JOB_ID,
    SALARY,
    COMMISSION_PCT,
    MANAGER_ID)
    values(300,'Ahmed','fathy','aaa','01030004833',TO_DATE('2026/06/07','YYYY/MM/DD'),'IT_PROG',9000,0.25,null);
-----------
--Q10
-- Find all employees who work either in the 'AD_VP' JOB_ID or the 'IT_PROG' JOB_ID.

SELECT * FROM EMPLOYEES 
WHERE JOB_ID IN ('AD_VP','IT_PROG');
----------------
-- Retrieve all employees sorted by their last_name in ascending order.
-- Retrieve all employees sorted by their hire_date in descending order.
-- Sort employees first by department in ascending order and then by salary in descending order within each department_id.
-- Retrieve all employees with their last_name in lowercase
-- Retrieve all employees with their first_name in uppercase.
-- Retrieve all employees with their first_name and last_name in title case (first letter capitalized).
-- Find employees whose last_name is 'smith', regardless of the case.
--Q11

SELECT employee_id,
       first_name,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
 ORDER BY LAST_NAME ASC;


-------------
--Q12

SELECT employee_id,
       first_name,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees
 ORDER BY HIRE_DATE desc;



-------------
--Q13
SELECT *FROM EMPLOYEES
ORDER BY DEPARTMENT_ID ASC , salary  ASC;
---------
--Q14

SELECT employee_id,
       first_name,
        lower(LAST_NAME) AS LAST_NAME  ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees;

-----------
--Q15

SELECT employee_id,
       upper(first_name) AS FIRST_NAME ,
        LAST_NAME ,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees;

------------------
--Q16

 SELECT employee_id,
       initcap(first_name) AS first_name,
        initcap(LAST_NAME) AS last_name,
        Email,
        PHONE_NUMBER,
        HIRE_DATE,
        JOB_ID, 
       salary,
       COMMISSION_PCT,
       MANAGER_ID,
       DEPARTMENT_ID 
 FROM employees;
-----------
 --Q17

SELECT *
 FROM EMPLOYEES 
WHERE lower(last_name)='smith';

 SELECT *
 FROM EMPLOYEES 
WHERE upper(last_name)='smith';












