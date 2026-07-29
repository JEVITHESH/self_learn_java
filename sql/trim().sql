show databases;
use ksrct;
show tables;
select * from  marks ;
SET SQL_SAFE_UPDATES = 0;
update marks set names = '   shivani     ' where student_id = 5 ;
update marks set names = trim(names);
