-- ==========================================================
-- Question 1
-- Find all employees who earn more than at least one employee
-- in department 10.
-- ==========================================================

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    SALARY NUMBER,
    DEPARTMENT_ID NUMBER
);

INSERT INTO EMPLOYEES VALUES (101,'Ahmed',5000,10);
INSERT INTO EMPLOYEES VALUES (102,'Sara',7000,20);
INSERT INTO EMPLOYEES VALUES (103,'Ali',6000,10);
INSERT INTO EMPLOYEES VALUES (104,'Omar',8000,30);

SELECT EMPLOYEE_NAME,
       SALARY
FROM EMPLOYEES
WHERE SALARY > ANY
(
    SELECT SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = 10
);


-- ==========================================================
-- Question 2
-- List employees who earn less than all employees
-- in department 20.
-- ==========================================================

SELECT EMPLOYEE_NAME,
       SALARY
FROM EMPLOYEES
WHERE SALARY < ALL
(
    SELECT SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = 20
);


-- ==========================================================
-- Question 3
-- Display products with price equal to any product
-- in Electronics category.
-- ==========================================================

CREATE TABLE PRODUCTS (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50),
    CATEGORY VARCHAR2(50),
    PRICE NUMBER
);

INSERT INTO PRODUCTS VALUES (1,'Laptop','Electronics',5000);
INSERT INTO PRODUCTS VALUES (2,'Phone','Electronics',3000);
INSERT INTO PRODUCTS VALUES (3,'Desk','Furniture',3000);

SELECT PRODUCT_NAME,
       PRICE
FROM PRODUCTS
WHERE PRICE IN
(
    SELECT PRICE
    FROM PRODUCTS
    WHERE CATEGORY='Electronics'
);


-- ==========================================================
-- Question 4
-- Retrieve customers who ordered products
-- costing more than 1000.
-- ==========================================================

CREATE TABLE CUSTOMERS (
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTOMER_NAME VARCHAR2(50)
);

CREATE TABLE ORDERS (
    ORDER_ID NUMBER PRIMARY KEY,
    CUSTOMER_ID NUMBER,
    PRODUCT_ID NUMBER
);

INSERT INTO CUSTOMERS VALUES (1,'Ahmed');
INSERT INTO CUSTOMERS VALUES (2,'Sara');

INSERT INTO ORDERS VALUES (101,1,1);
INSERT INTO ORDERS VALUES (102,2,3);

SELECT CUSTOMER_NAME
FROM CUSTOMERS
WHERE CUSTOMER_ID IN
(
    SELECT CUSTOMER_ID
    FROM ORDERS
    WHERE PRODUCT_ID IN
    (
        SELECT PRODUCT_ID
        FROM PRODUCTS
        WHERE PRICE > 1000
    )
);


-- ==========================================================
-- Question 5
-- Employees who have the same job title
-- as at least one other employee.
-- ==========================================================

CREATE TABLE EMPLOYEES2 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    JOB_TITLE VARCHAR2(50)
);

INSERT INTO EMPLOYEES2 VALUES (1,'Ahmed','Developer');
INSERT INTO EMPLOYEES2 VALUES (2,'Sara','Developer');
INSERT INTO EMPLOYEES2 VALUES (3,'Ali','Manager');

SELECT EMPLOYEE_NAME,
       JOB_TITLE
FROM EMPLOYEES2
WHERE JOB_TITLE IN
(
    SELECT JOB_TITLE
    FROM EMPLOYEES2
    GROUP BY JOB_TITLE
    HAVING COUNT(*) > 1
);


-- ==========================================================
-- Question 6
-- Departments having more than one employee.
-- ==========================================================

SELECT DEPARTMENT_ID
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING COUNT(*) > 1;


-- ==========================================================
-- Question 7
-- Orders placed by customers from cities
-- where other customers also placed orders.
-- ==========================================================

CREATE TABLE CUSTOMERS2 (
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTOMER_NAME VARCHAR2(50),
    CITY VARCHAR2(50)
);

CREATE TABLE ORDERS2 (
    ORDER_ID NUMBER PRIMARY KEY,
    CUSTOMER_ID NUMBER
);

INSERT INTO CUSTOMERS2 VALUES (1,'Ahmed','Cairo');
INSERT INTO CUSTOMERS2 VALUES (2,'Sara','Cairo');
INSERT INTO CUSTOMERS2 VALUES (3,'Ali','Alex');

INSERT INTO ORDERS2 VALUES (101,1);
INSERT INTO ORDERS2 VALUES (102,2);
INSERT INTO ORDERS2 VALUES (103,3);

SELECT *
FROM ORDERS2
WHERE CUSTOMER_ID IN
(
    SELECT CUSTOMER_ID
    FROM CUSTOMERS2
    WHERE CITY IN
    (
        SELECT CITY
        FROM CUSTOMERS2
        GROUP BY CITY
        HAVING COUNT(*) > 1
    )
);


-- ==========================================================
-- Question 8
-- Books written by authors with more than one book.
-- ==========================================================

CREATE TABLE AUTHORS (
    AUTHOR_ID NUMBER PRIMARY KEY,
    AUTHOR_NAME VARCHAR2(50)
);

CREATE TABLE BOOKS (
    BOOK_ID NUMBER PRIMARY KEY,
    BOOK_TITLE VARCHAR2(50),
    AUTHOR_ID NUMBER
);

INSERT INTO AUTHORS VALUES (1,'Naguib');
INSERT INTO AUTHORS VALUES (2,'Taha');

INSERT INTO BOOKS VALUES (101,'Book A',1);
INSERT INTO BOOKS VALUES (102,'Book B',1);
INSERT INTO BOOKS VALUES (103,'Book C',2);

SELECT BOOK_TITLE
FROM BOOKS
WHERE AUTHOR_ID IN
(
    SELECT AUTHOR_ID
    FROM BOOKS
    GROUP BY AUTHOR_ID
    HAVING COUNT(*) > 1
);


-- ==========================================================
-- Question 9
-- Students enrolled in courses taught by Dr. Smith.
-- ==========================================================

CREATE TABLE COURSES (
    COURSE_ID NUMBER PRIMARY KEY,
    COURSE_NAME VARCHAR2(50),
    PROFESSOR VARCHAR2(50)
);

CREATE TABLE STUDENTS (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50),
    COURSE_ID NUMBER
);

INSERT INTO COURSES VALUES (1,'Java','Dr. Smith');
INSERT INTO COURSES VALUES (2,'Oracle','Dr. Ali');

INSERT INTO STUDENTS VALUES (101,'Ahmed',1);
INSERT INTO STUDENTS VALUES (102,'Sara',2);

SELECT STUDENT_NAME
FROM STUDENTS
WHERE COURSE_ID IN
(
    SELECT COURSE_ID
    FROM COURSES
    WHERE PROFESSOR='Dr. Smith'
);


-- ==========================================================
-- Question 10
-- Employees whose salary matches any salary
-- in department 30.
-- ==========================================================

SELECT EMPLOYEE_NAME,
       SALARY
FROM EMPLOYEES
WHERE SALARY IN
(
    SELECT SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = 30
);