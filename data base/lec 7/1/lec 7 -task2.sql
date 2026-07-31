-- ==========================================================
-- Question 1
-- Display employee names and department names using USING(department_id)
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

INSERT INTO EMPLOYEES VALUES (101,'Ahmed',10);
INSERT INTO EMPLOYEES VALUES (102,'Sara',20);

SELECT EMPLOYEE_NAME,
       DEPARTMENT_NAME
FROM EMPLOYEES
JOIN DEPARTMENTS
USING (DEPARTMENT_ID);


-- ==========================================================
-- Question 2
-- List all orders and customer names using USING(customer_id)
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

INSERT INTO ORDERS VALUES (101,1);
INSERT INTO ORDERS VALUES (102,2);

SELECT ORDER_ID,
       CUSTOMER_NAME
FROM ORDERS
JOIN CUSTOMERS
USING (CUSTOMER_ID);


-- ==========================================================
-- Question 3
-- Retrieve product names and supplier names using USING(supplier_id)
-- ==========================================================

CREATE TABLE SUPPLIERS (
    SUPPLIER_ID NUMBER PRIMARY KEY,
    SUPPLIER_NAME VARCHAR2(50)
);

CREATE TABLE PRODUCTS (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50),
    SUPPLIER_ID NUMBER
);

INSERT INTO SUPPLIERS VALUES (1,'Dell');
INSERT INTO SUPPLIERS VALUES (2,'HP');

INSERT INTO PRODUCTS VALUES (101,'Laptop',1);
INSERT INTO PRODUCTS VALUES (102,'Printer',2);

SELECT PRODUCT_NAME,
       SUPPLIER_NAME
FROM PRODUCTS
JOIN SUPPLIERS
USING (SUPPLIER_ID);


-- ==========================================================
-- Question 4
-- Show student names and course titles using USING(student_id)
-- ==========================================================

CREATE TABLE STUDENTS (
    STUDENT_ID NUMBER PRIMARY KEY,
    STUDENT_NAME VARCHAR2(50)
);

CREATE TABLE ENROLLMENTS (
    COURSE_TITLE VARCHAR2(50),
    STUDENT_ID NUMBER
);

INSERT INTO STUDENTS VALUES (1,'Ali');
INSERT INTO STUDENTS VALUES (2,'Mona');

INSERT INTO ENROLLMENTS VALUES ('Java',1);
INSERT INTO ENROLLMENTS VALUES ('Oracle',2);

SELECT STUDENT_NAME,
       COURSE_TITLE
FROM STUDENTS
JOIN ENROLLMENTS
USING (STUDENT_ID);


-- ==========================================================
-- Question 5
-- Display invoice numbers and product names using USING(product_id)
-- ==========================================================

CREATE TABLE PRODUCTS2 (
    PRODUCT_ID NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50)
);

CREATE TABLE INVOICES (
    INVOICE_NO NUMBER PRIMARY KEY,
    PRODUCT_ID NUMBER
);

INSERT INTO PRODUCTS2 VALUES (1,'Mouse');
INSERT INTO PRODUCTS2 VALUES (2,'Keyboard');

INSERT INTO INVOICES VALUES (1001,1);
INSERT INTO INVOICES VALUES (1002,2);

SELECT INVOICE_NO,
       PRODUCT_NAME
FROM INVOICES
JOIN PRODUCTS2
USING (PRODUCT_ID);


-- ==========================================================
-- Question 6
-- List project names and employee names using USING(project_id)
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

INSERT INTO EMPLOYEES2 VALUES (101,'Ahmed',1);
INSERT INTO EMPLOYEES2 VALUES (102,'Sara',2);

SELECT PROJECT_NAME,
       EMPLOYEE_NAME
FROM EMPLOYEES2
JOIN PROJECTS
USING (PROJECT_ID);


-- ==========================================================
-- Question 7
-- Retrieve author names and book titles using USING(author_id)
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

INSERT INTO BOOKS VALUES (101,'Palace Walk',1);
INSERT INTO BOOKS VALUES (102,'The Days',2);

SELECT AUTHOR_NAME,
       BOOK_TITLE
FROM AUTHORS
JOIN BOOKS
USING (AUTHOR_ID);


-- ==========================================================
-- Question 8
-- Show sales order details with employee names using USING(employee_id)
-- ==========================================================

CREATE TABLE EMPLOYEES3 (
    EMPLOYEE_ID NUMBER PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR2(50)
);

CREATE TABLE SALES_ORDERS (
    ORDER_ID NUMBER PRIMARY KEY,
    EMPLOYEE_ID NUMBER,
    ORDER_AMOUNT NUMBER
);

INSERT INTO EMPLOYEES3 VALUES (1,'Ahmed');
INSERT INTO EMPLOYEES3 VALUES (2,'Sara');

INSERT INTO SALES_ORDERS VALUES (101,1,5000);
INSERT INTO SALES_ORDERS VALUES (102,2,7000);

SELECT ORDER_ID,
       ORDER_AMOUNT,
       EMPLOYEE_NAME
FROM SALES_ORDERS
JOIN EMPLOYEES3
USING (EMPLOYEE_ID);


-- ==========================================================
-- Question 9
-- Display course schedules and instructor names using USING(instructor_id)
-- ==========================================================

CREATE TABLE INSTRUCTORS (
    INSTRUCTOR_ID NUMBER PRIMARY KEY,
    INSTRUCTOR_NAME VARCHAR2(50)
);

CREATE TABLE COURSE_SCHEDULE (
    COURSE_NAME VARCHAR2(50),
    INSTRUCTOR_ID NUMBER
);

INSERT INTO INSTRUCTORS VALUES (1,'Mohamed');
INSERT INTO INSTRUCTORS VALUES (2,'Ali');

INSERT INTO COURSE_SCHEDULE VALUES ('Java',1);
INSERT INTO COURSE_SCHEDULE VALUES ('Oracle',2);

SELECT COURSE_NAME,
       INSTRUCTOR_NAME
FROM COURSE_SCHEDULE
JOIN INSTRUCTORS
USING (INSTRUCTOR_ID);


-- ==========================================================
-- Question 10
-- List transactions with account holder names using USING(account_id)
-- ==========================================================

CREATE TABLE ACCOUNTS (
    ACCOUNT_ID NUMBER PRIMARY KEY,
    ACCOUNT_HOLDER VARCHAR2(50)
);

CREATE TABLE TRANSACTIONS (
    TRANSACTION_ID NUMBER PRIMARY KEY,
    ACCOUNT_ID NUMBER,
    AMOUNT NUMBER
);

INSERT INTO ACCOUNTS VALUES (1,'Ahmed');
INSERT INTO ACCOUNTS VALUES (2,'Sara');

INSERT INTO TRANSACTIONS VALUES (1001,1,500);
INSERT INTO TRANSACTIONS VALUES (1002,2,800);

SELECT TRANSACTION_ID,
       AMOUNT,
       ACCOUNT_HOLDER
FROM TRANSACTIONS
JOIN ACCOUNTS
USING (ACCOUNT_ID);