truncate table hr.companydao;
truncate table hr.countrydao;
truncate table hr.statedao;
truncate table hr.citydao;
truncate table hr.streetdao;
truncate table hr.departmentsdao;

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


insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1,1,'Department 1', 100000);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(2,1,'Department 2', 100001);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(3,2,'Department 3', 100003);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(4,2,'Department 4', 100004);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(5,3,'Department 5', 100005);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(6,3,'Department 6', 100006);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(7,4,'Department 7', 100007);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(8,5,'Department 8', 100008);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(9,5,'Department 9', 100009);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(10,6,'Department 10', 100010);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(11,6,'Department 11', 100011);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(12,7,'Department 12', 100012);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(13,7,'Department 13', 100013);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(14,8,'Department 14', 100014);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(15,8,'Department 15', 100015);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(16,9,'Department 16', 100016);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(17,9,'Department 17', 100017);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(18,12,'Department 18', 100018);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(19,12,'Department 19', 100019);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(20,13,'Department 20', 100020);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(21,13,'Department 21', 100021);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(22,14,'Department 22', 100022);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(23,14,'Department 23', 100023);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(24,15,'Department 24', 100024);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(25,15,'Department 25', 100025);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(26,16,'Department 26', 100026);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(27,16,'Department 27', 100027);


update hr.companydao set version=0;
update hr.countrydao set version=0;
update hr.statedao set version=0;
update hr.citydao set version=0;
update hr.streetdao set version=0;
update hr.departmentsdao set version=0;
