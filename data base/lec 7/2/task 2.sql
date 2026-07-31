-- ==========================================================
-- Question 1
-- List all departments and the employees working in them.
-- Use RIGHT OUTER JOIN to ensure all departments are shown.
-- ==========================================================

CREATE TABLE DEPARTMENTS (
    DEPARTMENT_ID NUMBER PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR2(50)
);

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    DEPARTMENT_ID NUMBER
);

INSERT INTO DEPARTMENTS VALUES (10,'HR');
INSERT INTO DEPARTMENTS VALUES (20,'IT');
INSERT INTO DEPARTMENTS VALUES (30,'Finance');

INSERT INTO EMPLOYEES VALUES (101,'Ahmed',10);
INSERT INTO EMPLOYEES VALUES (102,'Sara',20);

SELECT EMPLOYEE_NAME,
       DEPARTMENT_NAME
FROM EMPLOYEES
RIGHT OUTER JOIN DEPARTMENTS
ON EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID;


-- ==========================================================
-- Question 2
-- Retrieve all orders and their corresponding customers.
-- Use RIGHT JOIN to include all customers.
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
INSERT INTO ORDERS VALUES (102,2);

SELECT ORDER_ID,
       CUSTOMER_NAME
FROM ORDERS
RIGHT OUTER JOIN CUSTOMERS
ON ORDERS.CUSTOMER_ID = CUSTOMERS.CUSTOMER_ID;


-- ==========================================================
-- Question 3
-- Show all courses and enrolled students.
-- Use RIGHT JOIN to return all courses.
-- ==========================================================

CREATE TABLE COURSES (
    COURSE_ID NUMBER PRIMARY KEY,
    COURSE_NAME VARCHAR2(50)
);

CREATE TABLE STUDENTS (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50),
    COURSE_ID NUMBER
);

INSERT INTO COURSES VALUES (1,'Java');
INSERT INTO COURSES VALUES (2,'Oracle');
INSERT INTO COURSES VALUES (3,'Spring Boot');

INSERT INTO STUDENTS VALUES (101,'Omar',1);
INSERT INTO STUDENTS VALUES (102,'Mona',2);

SELECT STUDENT_NAME,
       COURSE_NAME
FROM STUDENTS
RIGHT OUTER JOIN COURSES
ON STUDENTS.COURSE_ID = COURSES.COURSE_ID;


-- ==========================================================
-- Question 4
-- Display all projects and the employees assigned to them.
-- Use RIGHT OUTER JOIN to include all projects.
-- ==========================================================

CREATE TABLE PROJECTS (
    PROJECT_ID NUMBER PRIMARY KEY,
    PROJECT_NAME VARCHAR2(50)
);

CREATE TABLE EMPLOYEES2 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50),
    PROJECT_ID NUMBER
);

INSERT INTO PROJECTS VALUES (1,'Bank System');
INSERT INTO PROJECTS VALUES (2,'Hospital System');
INSERT INTO PROJECTS VALUES (3,'School System');

INSERT INTO EMPLOYEES2 VALUES (101,'Ahmed',1);
INSERT INTO EMPLOYEES2 VALUES (102,'Sara',2);

SELECT EMPLOYEE_NAME,
       PROJECT_NAME
FROM EMPLOYEES2
RIGHT OUTER JOIN PROJECTS
ON EMPLOYEES2.PROJECT_ID = PROJECTS.PROJECT_ID;


-- ==========================================================
-- Question 5
-- Show all payment methods and their related transactions.
-- Use RIGHT JOIN to include payment methods with no transactions.
-- ==========================================================

CREATE TABLE PAYMENT_METHODS (
    METHOD_ID NUMBER PRIMARY KEY,
    METHOD_NAME VARCHAR2(50)
);

CREATE TABLE TRANSACTIONS (
    TRANSACTION_ID NUMBER PRIMARY KEY,
    METHOD_ID NUMBER,
    AMOUNT NUMBER
);

INSERT INTO PAYMENT_METHODS VALUES (1,'Cash');
INSERT INTO PAYMENT_METHODS VALUES (2,'Visa');
INSERT INTO PAYMENT_METHODS VALUES (3,'PayPal');

INSERT INTO TRANSACTIONS VALUES (101,1,500);
INSERT INTO TRANSACTIONS VALUES (102,2,1000);

SELECT METHOD_NAME,
       TRANSACTION_ID,
       AMOUNT
FROM TRANSACTIONS
RIGHT OUTER JOIN PAYMENT_METHODS
ON TRANSACTIONS.METHOD_ID = PAYMENT_METHODS.METHOD_ID;


-- ==========================================================
-- Question 6
-- Find all authors and their books.
-- Use RIGHT OUTER JOIN to list all authors.
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

INSERT INTO AUTHORS VALUES (1,'Naguib Mahfouz');
INSERT INTO AUTHORS VALUES (2,'Taha Hussein');
INSERT INTO AUTHORS VALUES (3,'Ahmed Khaled Tawfik');

INSERT INTO BOOKS VALUES (101,'Palace Walk',1);
INSERT INTO BOOKS VALUES (102,'The Days',2);

SELECT BOOK_TITLE,
       AUTHOR_NAME
FROM BOOKS
RIGHT OUTER JOIN AUTHORS
ON BOOKS.AUTHOR_ID = AUTHORS.AUTHOR_ID;


-- ==========================================================
-- Question 7
-- List all categories and the products under them.
-- Use RIGHT JOIN to ensure all categories are shown.
-- ==========================================================

CREATE TABLE CATEGORIES (
    CATEGORY_ID NUMBER PRIMARY KEY,
    CATEGORY_NAME VARCHAR2(50)
);

CREATE TABLE PRODUCTS (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50),
    CATEGORY_ID NUMBER
);

INSERT INTO CATEGORIES VALUES (1,'Electronics');
INSERT INTO CATEGORIES VALUES (2,'Furniture');
INSERT INTO CATEGORIES VALUES (3,'Clothes');

INSERT INTO PRODUCTS VALUES (101,'Laptop',1);
INSERT INTO PRODUCTS VALUES (102,'Chair',2);

SELECT PRODUCT_NAME,
       CATEGORY_NAME
FROM PRODUCTS
RIGHT OUTER JOIN CATEGORIES
ON PRODUCTS.CATEGORY_ID = CATEGORIES.CATEGORY_ID;


-- ==========================================================
-- Question 8
-- Retrieve all students and their assigned dorm rooms.
-- Use RIGHT OUTER JOIN to include dorm rooms even if they are unassigned.
-- ==========================================================

CREATE TABLE DORM_ROOMS (
    ROOM_ID NUMBER PRIMARY KEY,
    ROOM_NUMBER VARCHAR2(20)
);

CREATE TABLE STUDENTS2 (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50),
    ROOM_ID NUMBER
);

INSERT INTO DORM_ROOMS VALUES (1,'A101');
INSERT INTO DORM_ROOMS VALUES (2,'A102');
INSERT INTO DORM_ROOMS VALUES (3,'B201');

INSERT INTO STUDENTS2 VALUES (101,'Ahmed',1);
INSERT INTO STUDENTS2 VALUES (102,'Sara',2);

SELECT STUDENT_NAME,
       ROOM_NUMBER
FROM STUDENTS2
RIGHT OUTER JOIN DORM_ROOMS
ON STUDENTS2.ROOM_ID = DORM_ROOMS.ROOM_ID;