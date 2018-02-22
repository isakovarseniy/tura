DROP SCHEMA sales_analyzer;

CREATE SCHEMA sales_analyzer ;
create SCHEMA KIESERVER;

CREATE TABLE sales_analyzer.country
(
  obj_id bigint NOT NULL,
  active_date timestamp,
  create_date timestamp,
  exp_date timestamp,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp,
  optlock integer,
  name character varying(255),
  CONSTRAINT country_pkey PRIMARY KEY (obj_id)
);


CREATE TABLE sales_analyzer.state
(
  obj_id bigint NOT NULL,
  active_date timestamp,
  create_date timestamp,
  exp_date timestamp,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT state_pkey PRIMARY KEY (obj_id),
  FOREIGN KEY (parent_id) REFERENCES sales_analyzer.country (obj_id)
);


CREATE TABLE sales_analyzer.city
(
  obj_id bigint NOT NULL,
  active_date timestamp,
  create_date timestamp,
  exp_date timestamp,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT city_pkey PRIMARY KEY (obj_id),
  FOREIGN KEY (parent_id) REFERENCES sales_analyzer.state (obj_id)
  
);

CREATE TABLE sales_analyzer.product_group_history(
  obj_id UUID PRIMARY KEY,
  active_date timestamp,
  create_date timestamp,
  exp_date timestamp,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp,
  optlock integer,
  country_id bigint NOT NULL,
  country_name character varying(255),
  state_id bigint NOT NULL,
  state_name character varying(255),
  city_id bigint NOT NULL,
  city_name character varying(255),
  product  character varying(255),
  amount NUMERIC (20, 5),
  history_date  date,
  FOREIGN KEY (country_id) REFERENCES sales_analyzer.country (obj_id),
  FOREIGN KEY (state_id) REFERENCES sales_analyzer.state (obj_id),
  FOREIGN KEY (city_id) REFERENCES sales_analyzer.city (obj_id)
);


CREATE TABLE sales_analyzer.product_history(
  obj_id UUID PRIMARY KEY,
  active_date timestamp,
  create_date timestamp,
  exp_date timestamp,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp,
  optlock integer,
  country_id bigint NOT NULL,
  country_name character varying(255),
  state_id bigint NOT NULL,
  state_name character varying(255),
  city_id bigint NOT NULL,
  city_name character varying(255),
  product  character varying(255),
  amount NUMERIC (20, 5),
  history_date  date,
  FOREIGN KEY (country_id) REFERENCES sales_analyzer.country (obj_id),
  FOREIGN KEY (state_id) REFERENCES sales_analyzer.state (obj_id),
  FOREIGN KEY (city_id) REFERENCES sales_analyzer.city (obj_id)
);


