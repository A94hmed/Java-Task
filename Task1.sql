--PLS create Player table with
--id name age
--- make id not null
--- make id unique
--- make name unique

--Q1
CREATE TABLE PLAYER (
    ID   NUMBER NOT NULL,
    NAME VARCHAR2(50),
    AGE  NUMBER,
    
    CONSTRAINT player_ID  UNIQUE (ID),
    CONSTRAINT player_name UNIQUE (Name)
    
    );
  -----------------------  
    
-- pls create Manger with
--id name salary
---id must be not null
---id and name must be unique together
   
    --Q2
    
    CREATE TABLE Manger(
     ID NUMBER NOT null,
    Name varchar2(50),
    
    CONSTRAINT Manger_id_name UNIQUE (ID,name)
    
    
    )
    ------------------------
--pls create Manger with
--id name age

--make id not null and unique (Primary Key)
    
    --Q3
    
    
    CREATE TABLE Mangers(
     ID NUMBER NOT null,
    Name varchar2(50),
    age NUMBER,
    
    CONSTRAINT Manger_id_pk PRIMARY key (ID)
    
    )
    
    
    
    
    
    