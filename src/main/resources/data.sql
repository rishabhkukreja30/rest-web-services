insert into user_details(id,name,date_of_birth) values(1001, 'Rishabh', current_date());
insert into user_details(id,name,date_of_birth)  values(1002, 'Tom', current_date());
insert into user_details(id,name,date_of_birth)  values(1003, 'Green', current_date());

insert into post(id,description,user_id) values(2001, 'Learn Spring Boot', 1001);
insert into post(id,description,user_id) values(2002, 'Learn Docker', 1001);
insert into post(id,description,user_id) values(2003, 'Learn AWS', 1002);
insert into post(id,description,user_id) values(2004, 'Learn Spring Security', 1003);
