--如果存在user表，那么先删除后创建
drop table if exists user;

create table user
(id int auto_increment,
user_name varchar(20) not null unique,
user_tel varchar(20) default '110',
primary key(id));

insert into user(user_name,user_tel) values('fu','110');
insert into user(user_name,user_tel) values('fu',default);
insert into user(user_name,user_tel) values('fneg','130');
insert into user(user_name,user_tel) values('hao','140');
insert into user(user_name,user_tel) values('xin','150');

select * from user;
