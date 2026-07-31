-- ==========================================================
-- Question 1
-- Find the names of employees who earn more than the average salary.
-- ==========================================================

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    SALARY NUMBER
);

INSERT INTO EMPLOYEES VALUES (1,'Ahmed',5000);
INSERT INTO EMPLOYEES VALUES (2,'Sara',7000);
INSERT INTO EMPLOYEES VALUES (3,'Ali',6000);

SELECT EMPLOYEE_NAME,
       SALARY
FROM EMPLOYEES
WHERE SALARY >
(
    SELECT AVG(SALARY)
    FROM EMPLOYEES
);


-- ==========================================================
-- Question 2
-- List the customers who placed the highest number of orders.
-- ==========================================================

CREATE TABLE CUSTOMERS (
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTOMER_NAME VARCHAR2(50)
);

CREATE TABLE ORDERS (
    ORDER_ID NUMBER PRIMARY KEY,
    CUSTOMER_ID NUMBER
);

INSERT INTO CUSTOMERS VALUES (1,'Ahmed');
INSERT INTO CUSTOMERS VALUES (2,'Sara');
INSERT INTO CUSTOMERS VALUES (3,'Ali');

INSERT INTO ORDERS VALUES (101,1);
INSERT INTO ORDERS VALUES (102,1);
INSERT INTO ORDERS VALUES (103,2);

SELECT CUSTOMER_NAME
FROM CUSTOMERS
WHERE CUSTOMER_ID IN
(
    SELECT CUSTOMER_ID
    FROM ORDERS
    GROUP BY CUSTOMER_ID
    HAVING COUNT(*) =
    (
        SELECT MAX(COUNT(*))
        FROM ORDERS
        GROUP BY CUSTOMER_ID
    )
);


-- ==========================================================
-- Question 3
-- Retrieve all products whose price is higher than any product
-- in the Accessories category.
-- ==========================================================

CREATE TABLE PRODUCTS (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50),
    CATEGORY VARCHAR2(50),
    PRICE NUMBER
);

INSERT INTO PRODUCTS VALUES (1,'Mouse','Accessories',200);
INSERT INTO PRODUCTS VALUES (2,'Keyboard','Accessories',300);
INSERT INTO PRODUCTS VALUES (3,'Laptop','Electronics',5000);

SELECT PRODUCT_NAME,
       PRICE
FROM PRODUCTS
WHERE PRICE > ANY
(
    SELECT PRICE
    FROM PRODUCTS
    WHERE CATEGORY='Accessories'
);


-- ==========================================================
-- Question 4
-- Display employees who work in the same department as John Smith.
-- ==========================================================

CREATE TABLE EMPLOYEES2 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    DEPARTMENT_ID NUMBER
);

INSERT INTO EMPLOYEES2 VALUES (1,'John Smith',10);
INSERT INTO EMPLOYEES2 VALUES (2,'Ahmed',10);
INSERT INTO EMPLOYEES2 VALUES (3,'Sara',20);

SELECT EMPLOYEE_NAME
FROM EMPLOYEES2
WHERE DEPARTMENT_ID =
(
    SELECT DEPARTMENT_ID
    FROM EMPLOYEES2
    WHERE EMPLOYEE_NAME='John Smith'
);


-- ==========================================================
-- Question 5
-- Get all orders placed by customers from New York.
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

INSERT INTO CUSTOMERS2 VALUES (1,'Ahmed','New York');
INSERT INTO CUSTOMERS2 VALUES (2,'Sara','Chicago');

INSERT INTO ORDERS2 VALUES (101,1);
INSERT INTO ORDERS2 VALUES (102,2);

SELECT *
FROM ORDERS2
WHERE CUSTOMER_ID IN
(
    SELECT CUSTOMER_ID
    FROM CUSTOMERS2
    WHERE CITY='New York'
);


-- ==========================================================
-- Question 6
-- Find departments that have no employees.
-- ==========================================================

CREATE TABLE DEPARTMENTS (
    DEPARTMENT_ID NUMBER PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR2(50)
);

CREATE TABLE EMPLOYEES3 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    DEPARTMENT_ID NUMBER
);

INSERT INTO DEPARTMENTS VALUES (10,'HR');
INSERT INTO DEPARTMENTS VALUES (20,'IT');
INSERT INTO DEPARTMENTS VALUES (30,'Finance');

INSERT INTO EMPLOYEES3 VALUES (1,'Ahmed',10);
INSERT INTO EMPLOYEES3 VALUES (2,'Sara',20);

SELECT DEPARTMENT_NAME
FROM DEPARTMENTS D
WHERE NOT EXISTS
(
    SELECT *
    FROM EMPLOYEES3 E
    WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
);


-- ==========================================================
-- Question 7
-- List students who are not enrolled in any course.
-- ==========================================================

CREATE TABLE STUDENTS (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50)
);

CREATE TABLE ENROLLMENTS (
    STUDENT_ID NUMBER,
    COURSE_NAME VARCHAR2(50)
);

INSERT INTO STUDENTS VALUES (1,'Ali');
INSERT INTO STUDENTS VALUES (2,'Omar');
INSERT INTO STUDENTS VALUES (3,'Mona');

INSERT INTO ENROLLMENTS VALUES (1,'Java');
INSERT INTO ENROLLMENTS VALUES (2,'Oracle');

SELECT STUDENT_NAME
FROM STUDENTS
WHERE STUDENT_ID NOT IN
(
    SELECT STUDENT_ID
    FROM ENROLLMENTS
);


-- ==========================================================
-- Question 8
-- Retrieve the second highest salary.
-- ==========================================================

CREATE TABLE EMPLOYEES4 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    SALARY NUMBER
);

INSERT INTO EMPLOYEES4 VALUES (1,'Ahmed',5000);
INSERT INTO EMPLOYEES4 VALUES (2,'Sara',7000);
INSERT INTO EMPLOYEES4 VALUES (3,'Ali',6000);

SELECT MAX(SALARY) AS SECOND_HIGHEST_SALARY
FROM EMPLOYEES4
WHERE SALARY <
(
    SELECT MAX(SALARY)
    FROM EMPLOYEES4
);


-- ==========================================================
-- Question 9
-- Display products with price greater than average price.
-- ==========================================================

CREATE TABLE PRODUCTS2 (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50),
    PRICE NUMBER
);

INSERT INTO PRODUCTS2 VALUES (1,'Mouse',200);
INSERT INTO PRODUCTS2 VALUES (2,'Keyboard',300);
INSERT INTO PRODUCTS2 VALUES (3,'Laptop',5000);

SELECT PRODUCT_NAME,
       PRICE
FROM PRODUCTS2
WHERE PRICE >
(
    SELECT AVG(PRICE)
    FROM PRODUCTS2
);


-- ==========================================================
-- Question 10
-- Find customers who ordered all products in category A.
-- ==========================================================

CREATE TABLE CUSTOMERS3 (
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTOMER_NAME VARCHAR2(50)
);

CREATE TABLE PRODUCTS3 (
    PRODUCT_ID NUMBER PRIMARY KEY,
    CATEGORY VARCHAR2(10)
);

CREATE TABLE ORDERS3 (
    CUSTOMER_ID NUMBER,
    PRODUCT_ID NUMBER
);

INSERT INTO CUSTOMERS3 VALUES (1,'Ahmed');
INSERT INTO CUSTOMERS3 VALUES (2,'Sara');

INSERT INTO PRODUCTS3 VALUES (101,'A');
INSERT INTO PRODUCTS3 VALUES (102,'A');
INSERT INTO PRODUCTS3 VALUES (103,'B');

INSERT INTO ORDERS3 VALUES (1,101);
INSERT INTO ORDERS3 VALUES (1,102);
INSERT INTO ORDERS3 VALUES (2,101);

SELECT CUSTOMER_NAME
FROM CUSTOMERS3 C
WHERE NOT EXISTS
(
    SELECT PRODUCT_ID
    FROM PRODUCTS3 P
    WHERE CATEGORY='A'
    AND NOT EXISTS
    (
        SELECT *
        FROM ORDERS3 O
        WHERE O.CUSTOMER_ID = C.CUSTOMER_ID
        AND O.PRODUCT_ID = P.PRODUCT_ID
    )
);