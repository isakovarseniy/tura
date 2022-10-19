-- 
--   Tura - Application generation solution
--
--   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
--
--
--   This project includes software developed by Arseniy Isakov
--   https://github.com/isakovarseniy/tura
--   All rights reserved. This program and the accompanying materials
--   are made available under the terms of the Eclipse Public License v2.0
--   which accompanies this distribution, and is available at
--   http://www.eclipse.org/legal/epl-v20.html
-- 
CREATE SCHEMA hr
  AUTHORIZATION postgres;

GRANT ALL ON SCHEMA hr TO postgres;


CREATE SEQUENCE hr.obj_id_gen
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 865
  CACHE 1;
ALTER TABLE hr.obj_id_gen
  OWNER TO postgres;

  
  CREATE SEQUENCE hr.hibernate_sequence
  INCREMENT 1
  MINVALUE 5000
  MAXVALUE 9223372036854775807
  START 5000
  CACHE 1;
ALTER TABLE hr.hibernate_sequence
  OWNER TO postgres;


-- Table: hr.company

-- DROP TABLE hr.company;

CREATE TABLE hr.company
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  company_name character varying(255),
  country_id bigint,
  description character varying(255),
  parent_id bigint,
  CONSTRAINT company_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.company
  OWNER TO postgres;


-- Table: hr.country

-- DROP TABLE hr.country;

CREATE TABLE hr.country
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT country_pkey PRIMARY KEY (obj_id),
  CONSTRAINT fktl0tnjdba8q4ggsjw0iak8k3u FOREIGN KEY (parent_id)
      REFERENCES hr.company (obj_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.country
  OWNER TO postgres;


-- Table: hr.department

-- DROP TABLE hr.department;

CREATE TABLE hr.department
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  department_id bigint,
  department_name character varying(255),
  description character varying(255),
  location_id bigint,
  manager_id bigint,
  parent_id bigint,
  CONSTRAINT department_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.department
  OWNER TO postgres;


-- Table: hr.dept2emp

-- DROP TABLE hr.dept2emp;

CREATE TABLE hr.dept2emp
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  bool_val boolean,
  department_ref bigint,
  entity_ref bigint,
  image character varying(255),
  parent_id bigint,
  CONSTRAINT dept2emp_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.dept2emp
  OWNER TO postgres;




-- Table: hr.employee

-- DROP TABLE hr.employee;

CREATE TABLE hr.employee
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  commission_pct real,
  department_id bigint,
  email character varying(255),
  employee_id bigint,
  first_name character varying(255),
  hire_date timestamp without time zone,
  last_name character varying(255),
  manager_id bigint,
  parent_id bigint,
  phone_number character varying(255),
  salary real,
  root_id bigint,
  CONSTRAINT employee_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.employee
  OWNER TO postgres;



-- Table: hr.file

-- DROP TABLE hr.file;

CREATE TABLE hr.file
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  directory boolean,
  file_name character varying(255),
  parent_id bigint,
  size integer,
  employee_id bigint,
  CONSTRAINT file_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.file
  OWNER TO postgres;

-- Table: hr.holderobject

-- DROP TABLE hr.holderobject;

CREATE TABLE hr.holderobject
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  CONSTRAINT holderobject_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.holderobject
  OWNER TO postgres;

-- Table: hr.state

-- DROP TABLE hr.state;

CREATE TABLE hr.state
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT state_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.state
  OWNER TO postgres;



--  Table: hr.city

-- DROP TABLE hr.city;

CREATE TABLE hr.city
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT city_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.city
  OWNER TO postgres;

-- Table: hr.street

-- DROP TABLE hr.street;

CREATE TABLE hr.street
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT street_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.street
  OWNER TO postgres;


-- Table: hr."user"

-- DROP TABLE hr."user";

CREATE TABLE hr."user"
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  parent_id bigint,
  password character varying(255),
  user_name character varying(255),
  CONSTRAINT user_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr."user"
  OWNER TO postgres;

-- Table: hr.vehicle

-- DROP TABLE hr.vehicle;

CREATE TABLE hr.vehicle
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  parent_id bigint,
  plate_number character varying(255),
  vehicle_maker character varying(255),
  CONSTRAINT vehicle_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hr.vehicle
  OWNER TO postgres;



CREATE TABLE hr.timeline (
	obj_id int8 NOT NULL,
	status varchar(255),
	action_date timestamp,
	icon varchar(255),
	color varchar(255),
	CONSTRAINT timeline_pkey PRIMARY KEY (obj_id)
)WITH (
  OIDS=FALSE
);

ALTER TABLE hr.timeline
  OWNER TO postgres;



insert into hr.company (obj_id,company_name, country_id) values (1101, 'Company A', 1);
insert into hr.company (obj_id,company_name, country_id) values (1102, 'Company B', 2);


insert into hr.country (obj_id,parent_id, name) values (1201, 1101 , 'Country 1');
insert into hr.country (obj_id,parent_id, name) values (1202, 1102 , 'Country 2');

insert into hr.state (obj_id,parent_id, name) values (1301, 1201 , 'State 1');
insert into hr.state (obj_id,parent_id, name) values (1302, 1201 , 'State 2');

insert into hr.state (obj_id,parent_id, name) values (1303, 1202 , 'State 3');
insert into hr.state (obj_id,parent_id, name) values (1304, 1202 , 'State 4');


insert into hr.city (obj_id,parent_id, name) values (1401, 1301 , 'City 1');
insert into hr.city (obj_id,parent_id, name) values (1402, 1301 , 'City 2');

insert into hr.city (obj_id,parent_id, name) values (1403, 1302 , 'City 3');
insert into hr.city (obj_id,parent_id, name) values (1404, 1302 , 'City 4');


insert into hr.city (obj_id,parent_id, name) values (1405, 1303 , 'City 5');
insert into hr.city (obj_id,parent_id, name) values (1406, 1303 , 'City 6');

insert into hr.city (obj_id,parent_id, name) values (1407, 1304 , 'City 7');
insert into hr.city (obj_id,parent_id, name) values (1408, 1304 , 'City 8');

insert into hr.street (obj_id,parent_id, name) values (1501, 1401 , 'Street 1');
insert into hr.street (obj_id,parent_id, name) values (1502, 1401 , 'Street 2');

insert into hr.street (obj_id,parent_id, name) values (1503, 1402 , 'Street 3');
insert into hr.street (obj_id,parent_id, name) values (1504, 1402 , 'Street 4');

insert into hr.street (obj_id,parent_id, name) values (1505, 1403 , 'Street 5');
insert into hr.street (obj_id,parent_id, name) values (1506, 1403 , 'Street 6');

insert into hr.street (obj_id,parent_id, name) values (1507, 1404 , 'Street 7');
insert into hr.street (obj_id,parent_id, name) values (1508, 1404 , 'Street 8');

insert into hr.street (obj_id,parent_id, name) values (1509, 1405 , 'Street 9');
insert into hr.street (obj_id,parent_id, name) values (1510, 1405 , 'Street 10');

insert into hr.street (obj_id,parent_id, name) values (1511, 1406 , 'Street 11');
insert into hr.street (obj_id,parent_id, name) values (1512, 1406 , 'Street 12');

insert into hr.street (obj_id,parent_id, name) values (1513, 1407 , 'Street 13');
insert into hr.street (obj_id,parent_id, name) values (1514, 1407 , 'Street 14');

insert into hr.street (obj_id,parent_id, name) values (1515, 1408 , 'Street 15');
insert into hr.street (obj_id,parent_id, name) values (1516, 1408 , 'Street 16');


insert into hr.department(obj_id,parent_id, department_name,department_id) values(1601,1501,'Department 1', 100000);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1602,1501,'Department 2', 100001);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1603,1502,'Department 3', 100003);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1604,1502,'Department 4', 100004);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1605,1503,'Department 5', 100005);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1606,1503,'Department 6', 100006);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1607,1504,'Department 7', 100007);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1608,1505,'Department 8', 100008);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1609,1505,'Department 9', 100009);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1610,1506,'Department 10', 100010);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1611,1506,'Department 11', 100011);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1612,1507,'Department 12', 100012);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1613,1507,'Department 13', 100013);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1614,1508,'Department 14', 100014);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1615,1508,'Department 15', 100015);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1616,1509,'Department 16', 100016);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1617,1509,'Department 17', 100017);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1618,1512,'Department 18', 100018);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1619,1512,'Department 19', 100019);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1620,1513,'Department 20', 100020);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1621,1513,'Department 21', 100021);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1622,1514,'Department 22', 100022);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1623,1514,'Department 23', 100023);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1624,1515,'Department 24', 100024);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1625,1515,'Department 25', 100025);

insert into hr.department(obj_id,parent_id, department_name,department_id) values(1626,1516,'Department 26', 100026);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1627,1516,'Department 27', 100027);



insert into hr.department(obj_id,parent_id, department_name,department_id) values(1628,1501,'Department 1-1', 100011);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1629,1501,'Department 2-2', 100022);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1630,1501,'Department 1-3', 100013);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1631,1501,'Department 2-4', 100024);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1632,1501,'Department 1-5', 100015);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1633,1501,'Department 2-6', 100026);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1634,1501,'Department 1-7', 100017);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1635,1501,'Department 2-8', 100028);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1636,1501,'Department 1-9', 100019);
insert into hr.department(obj_id,parent_id, department_name,department_id) values(1637,1501,'Department 2-10', 100210);


insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1701,1601,'First Name 1', 'Last Name 1', 1001, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1702,1601,'First Name 2', 'Last Name 2', 1002, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1703,1602,'First Name 3', 'Last Name 3', 1003, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1704,1602,'First Name 4', 'Last Name 4', 1004, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1705,1603,'First Name 5', 'Last Name 5', 1005, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1706,1603,'First Name 6', 'Last Name 6', 1006, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1707,1604,'First Name 7', 'Last Name 7', 1007, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1708,1604,'First Name 8', 'Last Name 8', 1008, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1709,1605,'First Name 9', 'Last Name 9', 1009, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1710,1605,'First Name 10', 'Last Name 10', 1010, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1711,1605,'First Name 11', 'Last Name 11', 1011, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1712,1605,'First Name 12', 'Last Name 12', 1012, 1,'2000-01-01');

insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1713,1605,'First Name 13', 'Last Name 13', 1013, 1,'2000-01-01');
insert into hr.employee(obj_id,parent_id,first_name,last_name,salary,manager_id,hire_date) values(1714,1605,'First Name 14', 'Last Name 14', 1014, 1,'2000-01-01');


insert into hr.vehicle(obj_id,parent_id,plate_number,vehicle_maker) values(1801,1601,'111111','Honda');
insert into hr.vehicle(obj_id,parent_id,plate_number,vehicle_maker) values(1802,1601,'222222','Toyota');

insert into hr.vehicle(obj_id,parent_id,plate_number,vehicle_maker) values(1803,1602,'333333','Ford');
insert into hr.vehicle(obj_id,parent_id,plate_number,vehicle_maker) values(1804,1602,'444444','Reno');


insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1901,1701,'Dir1', true, 0);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1902,1901,'file1', false, 100);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1903,1901,'file2', false, 100);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1904,1901,'file3', false, 100);

insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1905,1702,'Dir2', true, 0);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1906,1905,'file4', false, 100);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1907,1905,'file5', false, 100);
insert into hr.file(obj_id,parent_id,file_name,directory,size) values(1908,1905,'file6', false, 100);

insert into hr.dept2emp(obj_id,department_ref,entity_ref,image) values(3000,-1,-1,'48x48/shield01.png');


INSERT INTO hr.timeline (obj_id, status, action_date, icon, color) VALUES(0, 'Ordered', TO_TIMESTAMP('15/10/2020 10:30','DD/MM/YYYY HH24:MI'), 'pi pi-shopping-cart', '#9C27B0');
INSERT INTO hr.timeline (obj_id, status, action_date, icon, color) VALUES(1, 'Processing', TO_TIMESTAMP('15/10/2020 14:00','DD/MM/YYYY HH24:MI'), 'pi pi-cog', '#673AB7');
INSERT INTO hr.timeline (obj_id, status, action_date, icon, color) VALUES(2, 'Shipped', TO_TIMESTAMP('15/10/2020 16:15','DD/MM/YYYY HH24:MI'), 'pi pi-shopping-cart', '#FF9800');
INSERT INTO hr.timeline (obj_id, status, action_date, icon, color) VALUES(3, 'Delivered', TO_TIMESTAMP('16/10/2020 10:00','DD/MM/YYYY HH24:MI'), 'pi pi-check', '#607D8B');




update hr.company set optlock=0;
update hr.country set optlock=0;
update hr.state set optlock=0;
update hr.city set optlock=0;
update hr.street set optlock=0;
update hr.department set optlock=0;
update hr.employee set optlock=0;
update hr.vehicle set optlock=0;
update hr.file set optlock=0;
update hr.dept2emp set optlock=0;


