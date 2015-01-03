truncate table hr.companydao;
truncate table hr.countrydao;
truncate table hr.statedao;
truncate table hr.citydao;
truncate table hr.streetdao;
truncate table hr.departmentsdao;

insert into hr.companydao (obj_id,companyname, countryid) values (1101, 'Company A', 1);
insert into hr.companydao (obj_id,companyname, countryid) values (1102, 'Company B', 2);


insert into hr.countrydao (obj_id,parent_id, name) values (1201, 1101 , 'Country 1');
insert into hr.countrydao (obj_id,parent_id, name) values (1202, 1102 , 'Country 2');

insert into hr.statedao (obj_id,parent_id, name) values (1301, 1201 , 'State 1');
insert into hr.statedao (obj_id,parent_id, name) values (1302, 1201 , 'State 2');

insert into hr.statedao (obj_id,parent_id, name) values (1303, 1202 , 'State 3');
insert into hr.statedao (obj_id,parent_id, name) values (1304, 1202 , 'State 4');


insert into hr.citydao (obj_id,parent_id, name) values (1401, 1301 , 'City 1');
insert into hr.citydao (obj_id,parent_id, name) values (1402, 1301 , 'City 2');

insert into hr.citydao (obj_id,parent_id, name) values (1403, 1302 , 'City 3');
insert into hr.citydao (obj_id,parent_id, name) values (1404, 1302 , 'City 4');


insert into hr.citydao (obj_id,parent_id, name) values (1405, 1303 , 'City 5');
insert into hr.citydao (obj_id,parent_id, name) values (1406, 1303 , 'City 6');

insert into hr.citydao (obj_id,parent_id, name) values (1407, 1304 , 'City 7');
insert into hr.citydao (obj_id,parent_id, name) values (1408, 1304 , 'City 8');

insert into hr.streetdao (obj_id,parent_id, name) values (1501, 1401 , 'Street 1');
insert into hr.streetdao (obj_id,parent_id, name) values (1502, 1401 , 'Street 1');

insert into hr.streetdao (obj_id,parent_id, name) values (1503, 1402 , 'Street 3');
insert into hr.streetdao (obj_id,parent_id, name) values (1504, 1402 , 'Street 4');

insert into hr.streetdao (obj_id,parent_id, name) values (1505, 1403 , 'Street 5');
insert into hr.streetdao (obj_id,parent_id, name) values (1506, 1403 , 'Street 6');

insert into hr.streetdao (obj_id,parent_id, name) values (1507, 1404 , 'Street 7');
insert into hr.streetdao (obj_id,parent_id, name) values (1508, 1404 , 'Street 8');

insert into hr.streetdao (obj_id,parent_id, name) values (1509, 1405 , 'Street 9');
insert into hr.streetdao (obj_id,parent_id, name) values (1510, 1405 , 'Street 10');

insert into hr.streetdao (obj_id,parent_id, name) values (1511, 1406 , 'Street 11');
insert into hr.streetdao (obj_id,parent_id, name) values (1512, 1406 , 'Street 12');

insert into hr.streetdao (obj_id,parent_id, name) values (1513, 1407 , 'Street 13');
insert into hr.streetdao (obj_id,parent_id, name) values (1514, 1407 , 'Street 14');

insert into hr.streetdao (obj_id,parent_id, name) values (1515, 1408 , 'Street 15');
insert into hr.streetdao (obj_id,parent_id, name) values (1516, 1408 , 'Street 16');


insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1601,1501,'Department 1', 100000);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1602,1501,'Department 2', 100001);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1603,1502,'Department 3', 100003);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1604,1502,'Department 4', 100004);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1605,1503,'Department 5', 100005);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1606,1503,'Department 6', 100006);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1607,1504,'Department 7', 100007);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1608,1505,'Department 8', 100008);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1609,1505,'Department 9', 100009);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1610,1506,'Department 10', 100010);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1611,1506,'Department 11', 100011);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1612,1507,'Department 12', 100012);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1613,1507,'Department 13', 100013);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1614,1508,'Department 14', 100014);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1615,1508,'Department 15', 100015);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1616,1509,'Department 16', 100016);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1617,1509,'Department 17', 100017);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1618,1512,'Department 18', 100018);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1619,1512,'Department 19', 100019);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1620,1513,'Department 20', 100020);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1621,1513,'Department 21', 100021);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1622,1514,'Department 22', 100022);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1623,1514,'Department 23', 100023);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1624,1515,'Department 24', 100024);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1625,1515,'Department 25', 100025);

insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1626,1516,'Department 26', 100026);
insert into hr.departmentsdao(obj_id,parent_id, departmentname,departmentid) values(1627,1516,'Department 27', 100027);


update hr.companydao set optlock=0;
update hr.countrydao set optlock=0;
update hr.statedao set optlock=0;
update hr.citydao set optlock=0;
update hr.streetdao set optlock=0;
update hr.departmentsdao set optlock=0;
