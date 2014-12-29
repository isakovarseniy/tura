truncate table hr.companydao;
truncate table hr.countrydao;
truncate table hr.statedao;
truncate table hr.citydao;
truncate table hr.streetdao;

insert into hr.companydao (obj_id,companyname, countryid) values (1, 'Company A', 1);
insert into hr.companydao (obj_id,companyname, countryid) values (2, 'Company B', 2);


insert into hr.countrydao (obj_id,parent_id, name) values (1, 1 , 'Country 1');
insert into hr.countrydao (obj_id,parent_id, name) values (2, 2 , 'Country 2');

insert into hr.statedao (obj_id,parent_id, name) values (1, 1 , 'State 1');
insert into hr.statedao (obj_id,parent_id, name) values (2, 1 , 'State 2');

insert into hr.statedao (obj_id,parent_id, name) values (3, 2 , 'State 3');
insert into hr.statedao (obj_id,parent_id, name) values (4, 2 , 'State 4');


insert into hr.citydao (obj_id,parent_id, name) values (1, 1 , 'City 1');
insert into hr.citydao (obj_id,parent_id, name) values (2, 1 , 'City 2');

insert into hr.citydao (obj_id,parent_id, name) values (3, 2 , 'City 3');
insert into hr.citydao (obj_id,parent_id, name) values (4, 2 , 'City 4');


insert into hr.citydao (obj_id,parent_id, name) values (5, 3 , 'City 5');
insert into hr.citydao (obj_id,parent_id, name) values (6, 3 , 'City 6');

insert into hr.citydao (obj_id,parent_id, name) values (7, 4 , 'City 7');
insert into hr.citydao (obj_id,parent_id, name) values (8, 4 , 'City 8');

insert into hr.streetdao (obj_id,parent_id, name) values (1, 1 , 'Street 1');
insert into hr.streetdao (obj_id,parent_id, name) values (2, 1 , 'Street 1');

insert into hr.streetdao (obj_id,parent_id, name) values (3, 2 , 'Street 3');
insert into hr.streetdao (obj_id,parent_id, name) values (4, 2 , 'Street 4');

insert into hr.streetdao (obj_id,parent_id, name) values (5, 3 , 'Street 5');
insert into hr.streetdao (obj_id,parent_id, name) values (6, 3 , 'Street 6');

insert into hr.streetdao (obj_id,parent_id, name) values (7, 4 , 'Street 7');
insert into hr.streetdao (obj_id,parent_id, name) values (8, 4 , 'Street 8');

insert into hr.streetdao (obj_id,parent_id, name) values (9, 5 , 'Street 9');
insert into hr.streetdao (obj_id,parent_id, name) values (10, 5 , 'Street 10');

insert into hr.streetdao (obj_id,parent_id, name) values (11, 6 , 'Street 11');
insert into hr.streetdao (obj_id,parent_id, name) values (12, 6 , 'Street 12');

insert into hr.streetdao (obj_id,parent_id, name) values (13, 7 , 'Street 13');
insert into hr.streetdao (obj_id,parent_id, name) values (14, 7 , 'Street 14');

insert into hr.streetdao (obj_id,parent_id, name) values (15, 8 , 'Street 15');
insert into hr.streetdao (obj_id,parent_id, name) values (16, 8 , 'Street 16');






