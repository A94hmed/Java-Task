-- ==========================================================
-- 1. CHECK Constraint
-- ==========================================================

-- Question 1
CREATE TABLE Employees (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    age NUMBER CHECK (age >= 18)
);

-- Question 2
CREATE TABLE Staff (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    salary NUMBER CHECK (salary BETWEEN 3000 AND 10000)
);

-- Question 3
ALTER TABLE Products
ADD CONSTRAINT chk_price
CHECK (price > 0);

-- Question 4
CREATE TABLE Students (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    grade CHAR(1)
    CHECK (grade IN ('A','B','C','D','E','F'))
);



-- ==========================================================
-- 2. ALTER TABLE - ADD CONSTRAINT
-- ==========================================================

-- Question 1
ALTER TABLE Customers
MODIFY email NOT NULL;

-- Question 2
ALTER TABLE Users
ADD CONSTRAINT uk_username
UNIQUE (username);

-- Question 3
ALTER TABLE Orders
ADD CONSTRAINT fk_order_customer
FOREIGN KEY (customer_id)
REFERENCES Customers(id);

-- Question 4
ALTER TABLE Accounts
ADD CONSTRAINT chk_balance
CHECK (balance >= 0);

-- Question 5
ALTER TABLE Departments
ADD CONSTRAINT pk_departments
PRIMARY KEY (dept_id);



-- ==========================================================
-- 3. DROP CONSTRAINT
-- ==========================================================

-- Question 1
ALTER TABLE Employees
DROP CONSTRAINT chk_salary;

-- Question 2
ALTER TABLE Users
DROP CONSTRAINT uk_email;

-- Question 3
ALTER TABLE Products
DROP PRIMARY KEY;

-- Question 4
ALTER TABLE Orders
DROP CONSTRAINT fk_order_customer;

-- Question 5
ALTER TABLE Contacts
MODIFY phone NULL;



-- ==========================================================
-- 4. RENAME CONSTRAINT
-- ==========================================================

-- Question 1
ALTER TABLE Students
RENAME CONSTRAINT chk_age TO check_min_age;

-- Question 2
ALTER TABLE Employees
RENAME CONSTRAINT fk_emp_dept
TO fk_employee_department;

-- Question 3
ALTER TABLE Users
RENAME CONSTRAINT pk_users
TO pk_users_id;

-- Question 4
ALTER TABLE Users
RENAME CONSTRAINT uk_username
TO uk_user_name;



-- ==========================================================
-- 5. DISABLE CONSTRAINT
-- ==========================================================

-- Question 1
ALTER TABLE Orders
DISABLE CONSTRAINT fk_customer_order;

-- Question 2
ALTER TABLE Products
DISABLE CONSTRAINT pk_products;

ALTER TABLE Products
DISABLE CONSTRAINT chk_price;

-- Question 3
ALTER TABLE Accounts
DISABLE CONSTRAINT chk_balance;

-- Question 4
ALTER TABLE Departments
DISABLE PRIMARY KEY;

-- Question 5
ALTER TABLE table_name
DISABLE CONSTRAINT constraint_name;



-- ==========================================================
-- 6. ENABLE CONSTRAINT
-- ==========================================================

-- Question 1
ALTER TABLE Orders
ENABLE CONSTRAINT fk_customer_order;

-- Question 2
ALTER TABLE Products
ENABLE CONSTRAINT pk_products;

ALTER TABLE Products
ENABLE CONSTRAINT chk_price;

-- Question 3
ALTER TABLE Staff
ENABLE CONSTRAINT chk_salary;

-- Question 4
ALTER TABLE Departments
ENABLE PRIMARY KEY;

-- Question 5
ALTER TABLE table_name
ENABLE CONSTRAINT constraint_name;