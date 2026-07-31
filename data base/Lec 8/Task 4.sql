-- ==========================================================
-- Step 1 : Create User
-- ==========================================================

CREATE USER AHMED_ELNAGAR
IDENTIFIED BY Ahmed123;

-- ==========================================================
-- Step 2 : Grant Privileges
-- ==========================================================

GRANT CREATE SESSION TO AHMED_ELNAGAR;

GRANT CREATE TABLE TO AHMED_ELNAGAR;

GRANT CREATE SEQUENCE TO AHMED_ELNAGAR;

GRANT INSERT ANY TABLE TO AHMED_ELNAGAR;

GRANT SELECT ANY TABLE TO AHMED_ELNAGAR;

GRANT UPDATE ANY TABLE TO AHMED_ELNAGAR;

GRANT DELETE ANY TABLE TO AHMED_ELNAGAR;