-- Table: hr.citydao

-- DROP TABLE hr.citydao;

CREATE TABLE hr.citydao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  CONSTRAINT citydao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.companydao

-- DROP TABLE hr.companydao;

CREATE TABLE hr.companydao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  companyname character varying(255),
  countryid bigint,
  description character varying(255),
  CONSTRAINT companydao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.countrydao

-- DROP TABLE hr.countrydao;

CREATE TABLE hr.countrydao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  CONSTRAINT countrydao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.departmentsdao

-- DROP TABLE hr.departmentsdao;

CREATE TABLE hr.departmentsdao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  departmentid bigint,
  departmentname character varying(255),
  description character varying(255),
  locationid bigint,
  managerid bigint,
  CONSTRAINT departmentsdao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);

-- Table: hr.employeesdao

-- DROP TABLE hr.employeesdao;

CREATE TABLE hr.employeesdao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  commissionpct real,
  departmentid bigint,
  email character varying(255),
  employeeid bigint,
  firstname character varying(255),
  hiredate timestamp without time zone,
  lastname character varying(255),
  managerid bigint,
  phonenumber character varying(255),
  salary real,
  CONSTRAINT employeesdao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.filedao

-- DROP TABLE hr.filedao;

CREATE TABLE hr.filedao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  directory boolean,
  filename character varying(255),
  size integer,
  CONSTRAINT filedao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);

-- Table: hr.objectsid

-- DROP TABLE hr.objectsid;

CREATE TABLE hr.objectsid
(
  obj_id bigint NOT NULL,
  CONSTRAINT objectsid_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);

-- Table: hr.statedao

-- DROP TABLE hr.statedao;

CREATE TABLE hr.statedao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  CONSTRAINT statedao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.streetdao

-- DROP TABLE hr.streetdao;

CREATE TABLE hr.streetdao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  CONSTRAINT streetdao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);



-- Table: hr.vehicledao

-- DROP TABLE hr.vehicledao;

CREATE TABLE hr.vehicledao
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  parent_id bigint,
  update_date timestamp without time zone,
  optlock integer,
  platenumber character varying(255),
  vehiclemaker character varying(255),
  CONSTRAINT vehicledao_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Sequence: hr.obj_id_gen

-- DROP SEQUENCE hr.obj_id_gen;

CREATE SEQUENCE hr.obj_id_gen
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 223
  CACHE 1;






