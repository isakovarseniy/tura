-- SELECT count(*) FROM pg_stat_activity;
-- Table: hr.dept2empjpa

-- DROP TABLE hr.dept2empjpa;

CREATE TABLE hr.dept2empjpa
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
  boolval boolean,
  departmentref bigint,
  entityref bigint,
  image character varying(255),
  CONSTRAINT dept2empjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);

-- Table: hr.cityjpa

-- DROP TABLE hr.cityjpa;

CREATE TABLE hr.cityjpa
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
  CONSTRAINT cityjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.companyjpa

-- DROP TABLE hr.companyjpa;

CREATE TABLE hr.companyjpa
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
  CONSTRAINT companyjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.countryjpa

-- DROP TABLE hr.countryjpa;

CREATE TABLE hr.countryjpa
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
  CONSTRAINT countryjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.departmentjpa

-- DROP TABLE hr.departmentjpa;

CREATE TABLE hr.departmentjpa
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
  CONSTRAINT departmentsjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);

-- Table: hr.employeejpa

-- DROP TABLE hr.employeejpa;

CREATE TABLE hr.employeejpa
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
  CONSTRAINT employeesjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.filejpa

-- DROP TABLE hr.filejpa;

CREATE TABLE hr.filejpa
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
  CONSTRAINT filejpa_pkey PRIMARY KEY (obj_id)
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

-- Table: hr.statejpa

-- DROP TABLE hr.statejpa;

CREATE TABLE hr.statejpa
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
  CONSTRAINT statejpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.streetjpa

-- DROP TABLE hr.streetjpa;

CREATE TABLE hr.streetjpa
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
  CONSTRAINT streetjpa_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);



-- Table: hr.vehiclejpa

-- DROP TABLE hr.vehiclejpa;

CREATE TABLE hr.vehiclejpa
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
  CONSTRAINT vehiclejpa_pkey PRIMARY KEY (obj_id)
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






