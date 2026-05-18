--create table Manger contain

--id, name , age , birth_date , address

---------------------------------------
CREATE TABLE Manger(
Id number(3),
Name varchar2(50) NOT null,
Age number(5) NOT null,
Birth_date DATE ,

Address char(20)
)
----------------------------------
--alter table manger drop address column
--alter table manger add column (city_address, street) 

ALTER TABLE Manger DROP column Address;
SELECT *FROM Manger;

ALTER TABLE Manger add (city_address varchar2(20) , street varchar2(20));
----------------------------------------------
--modify column name to full_name
ALTER TABLE Manger RENAME COLUMN  Name TO Full_Name;
--------------------------------------
--make this table just for read
create view Manger_readonly AS SELECT * from Manger WITH READ only;
-- SELECT WITH READ only beacuse prevent any query like INSERT or UPDATE or DELETE
SELECT * FROM Manger_readonly;

----------------------------------
--create table same as  Manger with name Owner
--just has colum id, name, birth_date 

CREATE TABLE Owner AS SELECT Id, Full_name AS Name, Birth_Date FROM Manger;
SELECT *FROM Owner;
-----------------------------
--rename manger table name to Master

ALTER TABLE manger RENAME  TO Master_table;

SELECT * FROM Master_table;

----------------------------











