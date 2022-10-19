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
CREATE SCHEMA IF NOT EXISTS HR;

    drop table HR.B1 if exists;

    drop table HR.B2 if exists;

    drop table HR.C1 if exists;

    drop table HR.CLIENT if exists;

    drop table HR.CUSTOMER if exists;

    drop table HR.DD1 if exists;

    drop table HR.DEPARTMENT1 if exists;

    drop table HR.DEPARTMENT2 if exists;

    drop table HR.EMPLOYEE1 if exists;

    drop table HR.EMPLOYEE2 if exists;

    drop table HR.FILE if exists;

    drop table HR.INDEPOBJECT1 if exists;

    drop table HR.INDEPOBJECT2 if exists;

    drop table HR.JPAOBJECT1 if exists;

    drop table HR.JPAOBJECT11 if exists;

    drop table HR.JPAOBJECT2 if exists;

    drop table HR.JPAOBJECT3 if exists;

    drop table HR.JPAOBJECT4 if exists;

    drop table HR.JPAOBJECT5 if exists;

    drop table HR.JPAOBJECT6 if exists;

    drop table HR.JPAOBJECT7 if exists;

    drop table HR.JPAOBJECT8 if exists;

    drop table HR.LOCATION if exists;

    drop table HR.MAILADDRESS if exists;

    drop table HR.MANY2MANY1A if exists;

    drop table HR.MANY2MANY1B if exists;

    drop table HR.MANY2MANY2A if exists;

    drop table HR.MANY2MANY2B if exists;

    drop table HR.ONE2MANY1A if exists;

    drop table HR.ONE2MANY1B if exists;

    drop table HR.ONE2MANY2A if exists;

    drop table HR.ONE2MANY2B if exists;

    drop table HR.ONE2MANY3A if exists;

    drop table HR.ONE2MANY3B if exists;

    drop table HR.ONE2ONE1A if exists;

    drop table HR.ONE2ONE1B if exists;

    drop table HR.ONE2ONE2A if exists;

    drop table HR.ONE2ONE2B if exists;

    drop table HR.ONE2ONE3A if exists;

    drop table HR.ONE2ONE3B if exists;

    drop table HR.ONE2ONE4A if exists;

    drop table HR.ONE2ONE4B if exists;

    drop table HR.P1 if exists;

    drop table HR.PERSON if exists;

    drop table HR.PHONE if exists;

    drop table HR.Q1 if exists;

    drop table HR.Q2 if exists;

    drop table HR.Q3 if exists;

    drop table HR.Q4 if exists;

    drop table HR.RL_CUSTOMER_LOCATION if exists;

    drop table HR.RL_MAILADDRESS_PERSON if exists;

    drop table HR.RL_MANY2MANY1B_MANY2MANY1A if exists;

    drop table HR.RL_MANY2MANY2A_MANY2MANY2B if exists;

    drop table HR.T1 if exists;

    drop table HR.T1T2 if exists;

    drop table HR.T_ORDER if exists;

    drop table HR.VEHICLE if exists;

    drop sequence if exists HR.hibernate_sequence;
create sequence HR.hibernate_sequence start with 1 increment by 1;

    create table HR.B1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.B2 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.C1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.CLIENT (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        NAME varchar(255),
        OBJECT_TYPE varchar(255),
        primary key (OBJ_ID)
    );

    create table HR.CUSTOMER (
       CUSTOMER_ID bigint not null,
        CUSTOMER_NAME varchar(255),
        primary key (CUSTOMER_ID)
    );

    create table HR.DD1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.DEPARTMENT1 (
       OBJ_ID bigint not null,
        ACTIVE_DATE timestamp,
        CREATE_DATE timestamp,
        DEPARTMENT_ID bigint,
        DEPARTMENT_NAME varchar(255),
        DESCRIPTION varchar(255),
        EXPIRED_DATE timestamp,
        LOCATION_ID bigint,
        MANAGER_ID bigint,
        OBJ_STATUS varchar(255),
        OBJ_TYPE varchar(255),
        PARENT_ID bigint,
        UPDATE_DATE timestamp,
        primary key (OBJ_ID)
    );

    create table HR.DEPARTMENT2 (
       OBJ_ID bigint not null,
        ACTIVE_DATE timestamp,
        CREATE_DATE timestamp,
        DEPARTMENT_ID bigint,
        DEPARTMENT_NAME varchar(255),
        DESCRIPTION varchar(255),
        EXPIRED_DATE timestamp,
        LOCATION_ID bigint,
        MANAGER_ID bigint,
        OBJ_STATUS varchar(255),
        OBJ_TYPE varchar(255),
        PARENT_ID bigint,
        UPDATE_DATE timestamp,
        primary key (OBJ_ID)
    );

    create table HR.EMPLOYEE1 (
       OBJ_ID bigint not null,
        ACTIVE_DATE timestamp,
        COMMISSION_PCT float,
        CREATE_DATE timestamp,
        DEPARTMENT_ID bigint,
        EMAIL varchar(255),
        EMPLOYEE_ID bigint,
        EXPIRED_DATE timestamp,
        FIRST_NAME varchar(255),
        HIRE_DATE timestamp,
        LAST_NAME varchar(255),
        MANAGER_ID bigint,
        OBJ_STATUS varchar(255),
        OBJ_TYPE varchar(255),
        PARENT_ID bigint,
        PHONE_NUMBER varchar(255),
        SALARY float,
        UPDATE_DATE timestamp,
        primary key (OBJ_ID)
    );

    create table HR.EMPLOYEE2 (
       OBJ_ID bigint not null,
        ACTIVE_DATE timestamp,
        COMMISSION_PCT float,
        CREATE_DATE timestamp,
        DEPARTMENT_ID bigint,
        EMAIL varchar(255),
        EMPLOYEE_ID bigint,
        EXPIRED_DATE timestamp,
        FIRST_NAME varchar(255),
        HIRE_DATE timestamp,
        LAST_NAME varchar(255),
        MANAGER_ID bigint,
        OBJ_STATUS varchar(255),
        OBJ_TYPE varchar(255),
        PHONE_NUMBER varchar(255),
        SALARY float,
        UPDATE_DATE timestamp,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.FILE (
       OBJ_ID bigint not null,
        FILE_NAME varchar(255),
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.INDEPOBJECT1 (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.INDEPOBJECT2 (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.JPAOBJECT1 (
       JPA_OBJ1 bigint not null,
        primary key (JPA_OBJ1)
    );

    create table HR.JPAOBJECT11 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.JPAOBJECT2 (
       JPA_OBJ2 bigint not null,
        primary key (JPA_OBJ2)
    );

    create table HR.JPAOBJECT3 (
       JPA_OBJ3 bigint not null,
        JPA_PARENT3 bigint,
        primary key (JPA_OBJ3)
    );

    create table HR.JPAOBJECT4 (
       JPA_OBJ4 bigint not null,
        JPA_PARENT4 bigint,
        primary key (JPA_OBJ4)
    );

    create table HR.JPAOBJECT5 (
       JPA_OBJ5 bigint not null,
        UK_OBJ5 bigint,
        primary key (JPA_OBJ5)
    );

    create table HR.JPAOBJECT6 (
       JPA_OBJ6 bigint not null,
        PARENT_OBJ6 bigint,
        primary key (JPA_OBJ6)
    );

    create table HR.JPAOBJECT7 (
       JPA_OBJ7 bigint not null,
        UK_OBJ7 bigint,
        primary key (JPA_OBJ7)
    );

    create table HR.JPAOBJECT8 (
       JPA_OBJ8 bigint not null,
        PARENT_OBJ8 bigint,
        primary key (JPA_OBJ8)
    );

    create table HR.LOCATION (
       OBJ_ID bigint not null,
        ACTIVE_DATE timestamp,
        CREATE_DATE timestamp,
        EXP_DATE timestamp,
        OBJ_STATUS varchar(255),
        OBJ_TYPE varchar(255),
        UPDATE_DATE timestamp,
        OPTLOCK integer,
        CITY varchar(255),
        STREET varchar(255),
        primary key (OBJ_ID)
    );

    create table HR.MAILADDRESS (
       OBJ_ID bigint not null,
        ADDRESS varchar(255),
        CREATE_DATE timestamp,
        OBJECT_TYPE varchar(255),
        PHONE_TYPE varchar(255),
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY1A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY1B (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY2A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY2B (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY1A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY1B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY2A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY2B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY3A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY3B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE1A (
       OBJ_ID bigint not null,
        ENUM1 varchar(255),
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE1B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE2A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE2B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE3A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE3B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE4A (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE4B (
       OBJ_ID bigint not null,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.P1 (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.PERSON (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        GENDER varchar(255),
        NAME varchar(255),
        OBJECT_TYPE varchar(255),
        CLIENT_ID bigint,
        ROOT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.PHONE (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        OBJECT_TYPE varchar(255),
        PHONE varchar(255),
        PERSON_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.Q1 (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.Q2 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.Q3 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.Q4 (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.RL_CUSTOMER_LOCATION (
       customer_objid bigint not null,
        location_customerid bigint not null
    );

    create table HR.RL_MAILADDRESS_PERSON (
       mailaddress_objid bigint not null,
        person_objid bigint not null
    );

    create table HR.RL_MANY2MANY1B_MANY2MANY1A (
       many2many1b_objid bigint not null,
        many2many1a_objid bigint not null
    );

    create table HR.RL_MANY2MANY2A_MANY2MANY2B (
       many2many2a_objid bigint not null,
        many2many2b_objid bigint not null
    );

    create table HR.T1 (
       OBJ_ID bigint not null,
        primary key (OBJ_ID)
    );

    create table HR.T1T2 (
       OBJ_ID bigint not null,
        T2_REF bigint,
        T1_REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.T_ORDER (
       ORDER_ID bigint not null,
        CUSTOMER bigint,
        VEHICLE_ID varchar(255),
        MODEL bigint,
        primary key (ORDER_ID)
    );

    create table HR.VEHICLE (
       MODEL varchar(255) not null,
        OBJ_ID bigint not null,
        PLATE varchar(255),
        primary key (MODEL, OBJ_ID)
    );

    alter table HR.B2 
       add constraint FKsgylcakyg3fb23afkpv4li26n 
       foreign key (PARENT_ID) 
       references HR.B1;

    alter table HR.EMPLOYEE2 
       add constraint FK25vhmddfobdvmxqfk6mx2xqm5 
       foreign key (PARENT_ID) 
       references HR.DEPARTMENT2;

    alter table HR.FILE 
       add constraint FK5j12xr9u3s9udbbl7dddvogug 
       foreign key (PARENT_ID) 
       references HR.FILE;

    alter table HR.INDEPOBJECT2 
       add constraint FKkslv8rij1rmuyjdbas3isc46w 
       foreign key (REF) 
       references HR.INDEPOBJECT1;

    alter table HR.JPAOBJECT6 
       add constraint FKober6lgwx5q68u9dkhib8v1tj 
       foreign key (PARENT_OBJ6) 
       references HR.JPAOBJECT5;

    alter table HR.ONE2MANY1B 
       add constraint FKc6tiny43w5asaxlhempeluj1j 
       foreign key (REF) 
       references HR.ONE2MANY1A;

    alter table HR.ONE2MANY2B 
       add constraint FKlkkx2en6vo48k8pldmvdwrmia 
       foreign key (REF) 
       references HR.ONE2MANY2A;

    alter table HR.ONE2MANY3B 
       add constraint FKn9ngotmu4jakh3tjv6pd2tkq3 
       foreign key (REF) 
       references HR.ONE2MANY3A;

    alter table HR.ONE2ONE1B 
       add constraint FK1eqlfykc9iqgnycsskuc4ybku 
       foreign key (REF) 
       references HR.ONE2ONE1A;

    alter table HR.ONE2ONE2B 
       add constraint FK4xan5qongj9rhdutst394j58c 
       foreign key (REF) 
       references HR.ONE2ONE2A;

    alter table HR.ONE2ONE3B 
       add constraint FKq8kls98pjo3xuifanbn9t8o8b 
       foreign key (REF) 
       references HR.ONE2ONE3A;

    alter table HR.ONE2ONE4B 
       add constraint FKowc9dsaif4cpmkqqv3qwnxteh 
       foreign key (REF) 
       references HR.ONE2ONE4A;

    alter table HR.PERSON 
       add constraint FKb7l2vscr7mxqjkvp0itippvap 
       foreign key (CLIENT_ID) 
       references HR.CLIENT;

    alter table HR.PERSON 
       add constraint FKdpv404wb3kmn7tk5fv2kic60p 
       foreign key (ROOT_ID) 
       references HR.FILE;

    alter table HR.PHONE 
       add constraint FKi2iir6uugnjvj0je0ow9xvmw6 
       foreign key (PERSON_ID) 
       references HR.PERSON;

    alter table HR.RL_CUSTOMER_LOCATION 
       add constraint FKjq3lw3m8yqkthe0236b38461c 
       foreign key (location_customerid) 
       references HR.LOCATION;

    alter table HR.RL_CUSTOMER_LOCATION 
       add constraint FKadbg3e9c4ewqduki4ffawympb 
       foreign key (customer_objid) 
       references HR.CUSTOMER;

    alter table HR.RL_MAILADDRESS_PERSON 
       add constraint FK87uh4rs62b4ckm71roubp0iou 
       foreign key (person_objid) 
       references HR.PERSON;

    alter table HR.RL_MAILADDRESS_PERSON 
       add constraint FKp6kuwm6s7042fwo4c2iayqki6 
       foreign key (mailaddress_objid) 
       references HR.MAILADDRESS;

    alter table HR.RL_MANY2MANY1B_MANY2MANY1A 
       add constraint FK6vqqspva7cduh3oetv2n7fbfc 
       foreign key (many2many1a_objid) 
       references HR.MANY2MANY1A;

    alter table HR.RL_MANY2MANY1B_MANY2MANY1A 
       add constraint FK5nvytmbl0gb2fwar2a4l622y2 
       foreign key (many2many1b_objid) 
       references HR.MANY2MANY1B;

    alter table HR.RL_MANY2MANY2A_MANY2MANY2B 
       add constraint FK2ldxnkgqt94xijas1sxn13f1 
       foreign key (many2many2b_objid) 
       references HR.MANY2MANY2B;

    alter table HR.RL_MANY2MANY2A_MANY2MANY2B 
       add constraint FKr26o6hti6eiuveh6xkg44ybwg 
       foreign key (many2many2a_objid) 
       references HR.MANY2MANY2A;

    alter table HR.T1T2 
       add constraint FKshalrpd7pawv8ccsuufe3gnyh 
       foreign key (T1_REF) 
       references HR.T1;

    alter table HR.T_ORDER 
       add constraint FKathrtadl5s68obq2njp7fk9fc 
       foreign key (CUSTOMER) 
       references HR.CUSTOMER;

    alter table HR.T_ORDER 
       add constraint FKh101vpci6hmmm5kitl1l59bdu 
       foreign key (VEHICLE_ID, MODEL) 
       references HR.VEHICLE;
