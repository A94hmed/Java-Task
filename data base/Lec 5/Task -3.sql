--create Teacher with 
--id name salary


CREATE TABLE Language(

ID NUMBER PRIMARY KEY,
Name varchar2(50)


);




CREATE TABLE teacher(

ID NUMBER PRIMARY key,
Name varchar2(50),
Salary NUMBER,
Language_ID NUMBER,
CONSTRAINT teacher_Language
        FOREIGN KEY (Language_ID)
        REFERENCES Language(ID)
)

