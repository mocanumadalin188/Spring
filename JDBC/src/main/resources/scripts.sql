CREATE TABLE Person (
        id int NOT NULL AUTO_INCREMENT,
        LastName varchar(255),
        FirstName varchar(255),
        Address varchar(255),
        City varchar(255),
        PRIMARY KEY (id)
);
/
insert into Person(LastName, FirstName, Address, City) values ('LastName1', 'FirstName1', 'address1', 'city1');
insert into Person(LastName, FirstName, Address, City) values ('LastName2', 'FirstName2', 'address2', 'city2');
insert into Person(LastName, FirstName, Address, City) values ('LastName3', 'FirstName3', 'address3', 'city3');
commit;
/
select * from Person;
/