--create Doctor with 
--id name salary

--Q1
DROP TABLE Patient;

CREATE TABLE Doctor(

id NUMBER PRIMARY key,
Name varchar2(50),
salary number
);
-----------------
--create Patient with
--id name age

--Q2

CREATE TABLE Patient(

id NUMBER PRIMARY key,
Name varchar2(50),
Age number
);
CREATE TABLE DOCTOR_PATIENT (
    DOCTOR_ID NUMBER,
    PATIENT_ID NUMBER,

    CONSTRAINT DOCTOR_PATIENT_PK PRIMARY KEY (DOCTOR_ID, PATIENT_ID),

    CONSTRAINT DOCTOR_PATIENT_DOCTOR_FK
        FOREIGN KEY (DOCTOR_ID)
        REFERENCES DOCTOR(ID),

    CONSTRAINT DOCTOR_PATIENT_PATIENT_FK
        FOREIGN KEY (PATIENT_ID)
        REFERENCES PATIENT(ID)
);



