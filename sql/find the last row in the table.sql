show databases;
use ksrct;
show tables;
select * from  em;
create table em (id int primary key,name varchar(50) , email varchar(50));
insert into em (id,name,email) value (1,'jevi','jev0760@gmail.com'),
 (2,'shivani','shivami@gmail.com'), (3,'hari','jev0760@gmail.com');
 select * from em order by id desc limit 1;

3	hari	jev0760@gmail.com
