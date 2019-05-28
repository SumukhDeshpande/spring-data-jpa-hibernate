DROP TABLE IF EXISTS PERSON;
DROP TABLE IF EXISTS passport;
DROP TABLE IF EXISTS student;

create table PERSON
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

create table passport (
       id bigint not null,
        number varchar(255) not null,
        primary key (id)
    );
    
    create table student (
       id bigint not null,
        city varchar(255),
        line1 varchar(255),
        line2 varchar(255),
        name varchar(255) not null,
        passport_id bigint,
        primary key (id)
    );

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ramesh', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());


insert into passport(id,number)
values(40001,'E123456');
insert into passport(id,number)
values(40002,'N123457');
insert into passport(id,number)
values(40003,'L123890');

insert into student(id,name,passport_id)
values(20001,'Ranga',40001);
insert into student(id,name,passport_id)
values(20002,'Adam',40002);
insert into student(id,name,passport_id)
values(20003,'Jane',40003);
