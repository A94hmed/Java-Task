--Write a query to display the names of employees and their department names using a natural join.

--Write a query to list all orders with their corresponding customer names using a natural join.

--Write a query to show student names and the courses they are enrolled in using a natural join.

SELECT * FROM EMPLOYEES   

-- Question 1
SELECT FIRST_NAME AS emp,
       DEPARTMENT_NAME
FROM EMPLOYEES
NATURAL JOIN DEPARTMENTS;


-- Create Tables
CREATE TABLE CUSTOMERS (
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTOMER_NAME VARCHAR2(50)
);

SELECT * FROM CUSTOMERS;

CREATE TABLE ORDERS (
    ORDER_ID NUMBER PRIMARY KEY,
    CUSTOMER_ID NUMBER
);

SELECT * FROM orders;


-- Insert Data
INSERT INTO CUSTOMERS VALUES (1,'Ahmed');
INSERT INTO CUSTOMERS VALUES (3,'Sss');

INSERT INTO ORDERS VALUES (101,1);
INSERT INTO ORDERS VALUES (102,2);


-- Question 2
SELECT ORDER_ID,
       CUSTOMER_NAME
FROM ORDERS
NATURAL JOIN CUSTOMERS;

-- Question 3


CREATE TABLE STUDENTS (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50)
);

CREATE TABLE COURSES (
    STUDENT_ID NUMBER,
    COURSE_NAME VARCHAR2(50)
);

INSERT INTO STUDENTS VALUES (1,'Ali');
INSERT INTO STUDENTS VALUES (2,'Sara');

INSERT INTO COURSES VALUES (1,'Java');
INSERT INTO COURSES VALUES (2,'Oracle');

SELECT STUDENT_NAME,
       COURSE_NAME
FROM STUDENTS
NATURAL JOIN COURSES;

CREATE TABLE students (
    student_id NUMBER PRIMARY KEY,
    student_name VARCHAR2(50)
);

CREATE TABLE courses (
    course_id NUMBER PRIMARY KEY,
    course_name VARCHAR2(50)
);

CREATE TABLE enrollments (
    student_id NUMBER,
    course_id NUMBER
);

INSERT INTO students VALUES (1,'Mohamed');
INSERT INTO students VALUES (2,'Noor');

INSERT INTO courses VALUES (101,'Java');
INSERT INTO courses VALUES (102,'Oracle');

INSERT INTO enrollments VALUES (1,101);
INSERT INTO enrollments VALUES (2,102);

SELECT student_name, course_name
FROM students
NATURAL JOIN enrollments
NATURAL JOIN courses;

--Write a query to display project names and the employees working on them using a natural join.

--Write a query to retrieve invoice details along with product names using a natural join.

--Write a query to find all books with their respective author names using a natural join.

--Write a query to list all class schedules along with their instructors’ names using a natural join.

--Write a query to show supplier names and the products they supply using a natural join.

--Write a query to display customer orders along with shipping details using a natural join.

--Write a query to list employees along with their job titles using a natural join.



-- Question 4: Display project names and the employees working on them
SELECT project_name,
       employee_name
FROM projects
NATURAL JOIN employees;

------------------------------------------------------------

-- Question 5: Retrieve invoice details along with product names
SELECT invoice_id,
       invoice_date,
       product_name
FROM invoices
NATURAL JOIN products;

------------------------------------------------------------

-- Question 6: Find all books with their respective author names
SELECT book_title,
       author_name
FROM books
NATURAL JOIN authors;

------------------------------------------------------------

-- Question 7: List all class schedules along with their instructors’ names
SELECT class_name,
       schedule_date,
       instructor_name
FROM classes
NATURAL JOIN instructors;

------------------------------------------------------------

-- Question 8: Show supplier names and the products they supply
SELECT supplier_name,
       product_name
FROM suppliers
NATURAL JOIN products;

------------------------------------------------------------

-- Question 9: Display customer orders along with shipping details
SELECT order_id,
       customer_name,
       shipping_address,
       shipping_date
FROM orders
NATURAL JOIN shipping;

------------------------------------------------------------

-- Question 10: List employees along with their job titles
SELECT employee_name,
       job_title
FROM employees
NATURAL JOIN jobs;






