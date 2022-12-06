CREATE TABLE Person (
        id int NOT NULL AUTO_INCREMENT,
        last_name varchar(255),
        first_name varchar(255),
        address varchar(255),
        city varchar(255),
        PRIMARY KEY (id)
);
/
insert into Person(last_name, first_name, address, city) values ('LastName1', 'FirstName1', 'address1', 'city1');
insert into Person(last_name, first_name, address, city) values ('LastName2', 'FirstName2', 'address2', 'city2');
insert into Person(last_name, first_name, address, city) values ('LastName3', 'FirstName3', 'address3', 'city3');
commit;
/
select * from person;
/