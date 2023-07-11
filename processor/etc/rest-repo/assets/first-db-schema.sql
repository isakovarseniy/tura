-- 
--   Tura - Application generation solution
--
--   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

    drop table HR.ARIA if exists;

    drop table HR.B1 if exists;

    drop table HR.B2 if exists;

    drop table HR.BUTTON if exists;

    drop table HR.C1 if exists;

    drop table HR.CANVAS if exists;

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

    drop table HR.INPUTTEXT if exists;

    drop table HR.JPAOBJECT1 if exists;

    drop table HR.JPAOBJECT11 if exists;

    drop table HR.JPAOBJECT12 if exists;

    drop table HR.JPAOBJECT13 if exists;

    drop table HR.JPAOBJECT2 if exists;

    drop table HR.JPAOBJECT3 if exists;

    drop table HR.JPAOBJECT4 if exists;

    drop table HR.JPAOBJECT5 if exists;

    drop table HR.JPAOBJECT6 if exists;

    drop table HR.JPAOBJECT7 if exists;

    drop table HR.JPAOBJECT8 if exists;

    drop table HR.L1 if exists;

    drop table HR.L2 if exists;

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

    drop table HR.OUTPUTTEXT if exists;

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

    drop table HR.STYLE if exists;

    drop table HR.T1 if exists;

    drop table HR.T1T2 if exists;

    drop table HR.T_ORDER if exists;

    drop table HR.TABCANVAS if exists;

    drop table HR.TRIGGER if exists;

    drop table HR.UIELEMENT if exists;

    drop table HR.UOBJECT if exists;

    drop table HR.VEHICLE if exists;

    drop table HR.WARIA if exists;

    drop table HR.WINDOW if exists;

    drop sequence if exists HR.hibernate_sequence;
create sequence HR.hibernate_sequence start with 1 increment by 1;

    create table HR.ARIA (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_ARIA integer,
        REF_PARENT varchar(255),
        primary key (SUID)
    );

    create table HR.B1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_B1 integer,
        primary key (OBJ_ID)
    );

    create table HR.B2 (
       OBJ_ID bigint not null,
        V_B2 integer,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.BUTTON (
       UID varchar(255) not null,
        V_BUTTON integer,
        ref_suid_style varchar(255),
        ref_suid_uiElement varchar(255),
        primary key (UID)
    );

    create table HR.C1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_C1 integer,
        primary key (OBJ_ID)
    );

    create table HR.CANVAS (
       SUID varchar(255) not null,
        CANVAS_NAME varchar(255),
        INH_SWITCH varchar(255),
        V_CANVAS integer,
        primary key (SUID)
    );

    create table HR.CLIENT (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        NAME varchar(255),
        OBJECT_TYPE varchar(255),
        V_CLIENT integer,
        primary key (OBJ_ID)
    );

    create table HR.CUSTOMER (
       CUSTOMER_ID bigint not null,
        CUSTOMER_NAME varchar(255),
        V_CUSTOMER integer,
        primary key (CUSTOMER_ID)
    );

    create table HR.DD1 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_DD1 integer,
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
        V_DEPARTMENT1 integer,
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
        V_DEPARTMENT2 integer,
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
        V_EMPLOYEE1 integer,
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
        V_EMPLOYEE2 integer,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.FILE (
       OBJ_ID bigint not null,
        FILE_NAME varchar(255),
        V_FILE integer,
        PARENT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.INDEPOBJECT1 (
       OBJ_ID bigint not null,
        V_INDEPOBJECT1 integer,
        primary key (OBJ_ID)
    );

    create table HR.INDEPOBJECT2 (
       OBJ_ID bigint not null,
        V_INDEPOBJECT2 integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.INPUTTEXT (
       UID varchar(255) not null,
        V_INPUTTEXT integer,
        ref_suid_style varchar(255),
        ref_suid_uiElement varchar(255),
        primary key (UID)
    );

    create table HR.JPAOBJECT1 (
       JPA_OBJ1 bigint not null,
        V_JPAOBJECT1 integer,
        primary key (JPA_OBJ1)
    );

    create table HR.JPAOBJECT11 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_JPAOBJECT11 integer,
        primary key (OBJ_ID)
    );

    create table HR.JPAOBJECT12 (
       OBJ_ID bigint not null,
        V_JPAOBJECT12 integer,
        primary key (OBJ_ID)
    );

    create table HR.JPAOBJECT13 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_JPAOBJECT13 integer,
        primary key (OBJ_ID)
    );

    create table HR.JPAOBJECT2 (
       JPA_OBJ2 bigint not null,
        V_JPAOBJECT2 integer,
        primary key (JPA_OBJ2)
    );

    create table HR.JPAOBJECT3 (
       JPA_OBJ3 bigint not null,
        JPA_PARENT3 bigint,
        V_JPAOBJECT3 integer,
        primary key (JPA_OBJ3)
    );

    create table HR.JPAOBJECT4 (
       JPA_OBJ4 bigint not null,
        JPA_PARENT4 bigint,
        V_JPAOBJECT4 integer,
        primary key (JPA_OBJ4)
    );

    create table HR.JPAOBJECT5 (
       JPA_OBJ5 bigint not null,
        UK_OBJ5 bigint,
        V_JPAOBJECT5 integer,
        primary key (JPA_OBJ5)
    );

    create table HR.JPAOBJECT6 (
       JPA_OBJ6 bigint not null,
        V_JPAOBJECT6 integer,
        PARENT_OBJ6 bigint,
        primary key (JPA_OBJ6)
    );

    create table HR.JPAOBJECT7 (
       JPA_OBJ7 bigint not null,
        UK_OBJ7 bigint,
        V_JPAOBJECT7 integer,
        primary key (JPA_OBJ7)
    );

    create table HR.JPAOBJECT8 (
       JPA_OBJ8 bigint not null,
        PARENT_OBJ8 bigint,
        V_JPAOBJECT8 integer,
        primary key (JPA_OBJ8)
    );

    create table HR.L1 (
       OBJ_ID bigint not null,
        V_L1 integer,
        primary key (OBJ_ID)
    );

    create table HR.L2 (
       OBJ_ID bigint not null,
        DESC varchar(255),
        PARENT_ID bigint,
        V_L2 integer,
        primary key (OBJ_ID)
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
        V_MAILADDRESS integer,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY1A (
       OBJ_ID bigint not null,
        V_MANY2MANY1A integer,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY1B (
       OBJ_ID bigint not null,
        V_MANY2MANY1B integer,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY2A (
       OBJ_ID bigint not null,
        V_MANY2MANY2A integer,
        primary key (OBJ_ID)
    );

    create table HR.MANY2MANY2B (
       OBJ_ID bigint not null,
        V_MANY2MANY2B integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY1A (
       OBJ_ID bigint not null,
        V_ONE2MANY1A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY1B (
       OBJ_ID bigint not null,
        V_ONE2MANY1B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY2A (
       OBJ_ID bigint not null,
        V_ONE2MANY2A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY2B (
       OBJ_ID bigint not null,
        V_ONE2MANY2B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY3A (
       OBJ_ID bigint not null,
        V_ONE2MANY3A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2MANY3B (
       OBJ_ID bigint not null,
        V_ONE2MANY3B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE1A (
       OBJ_ID bigint not null,
        ENUM1 varchar(255),
        V_ONE2ONE1A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE1B (
       OBJ_ID bigint not null,
        V_ONE2ONE1B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE2A (
       OBJ_ID bigint not null,
        V_ONE2ONE2A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE2B (
       OBJ_ID bigint not null,
        V_ONE2ONE2B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE3A (
       OBJ_ID bigint not null,
        V_ONE2ONE3A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE3B (
       OBJ_ID bigint not null,
        V_ONE2ONE3B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE4A (
       OBJ_ID bigint not null,
        V_ONE2ONE4A integer,
        primary key (OBJ_ID)
    );

    create table HR.ONE2ONE4B (
       OBJ_ID bigint not null,
        V_ONE2ONE4B integer,
        REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.OUTPUTTEXT (
       UID varchar(255) not null,
        V_OUTPUTTEXT integer,
        ref_suid_style varchar(255),
        ref_suid_uiElement varchar(255),
        primary key (UID)
    );

    create table HR.P1 (
       OBJ_ID bigint not null,
        V_P1 integer,
        primary key (OBJ_ID)
    );

    create table HR.PERSON (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        GENDER varchar(255),
        NAME varchar(255),
        OBJECT_TYPE varchar(255),
        V_PERSON integer,
        CLIENT_ID bigint,
        ROOT_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.PHONE (
       OBJ_ID bigint not null,
        CREATE_DATE timestamp,
        OBJECT_TYPE varchar(255),
        PHONE varchar(255),
        V_PHONE integer,
        PERSON_ID bigint,
        primary key (OBJ_ID)
    );

    create table HR.Q1 (
       OBJ_ID bigint not null,
        V_Q1 integer,
        primary key (OBJ_ID)
    );

    create table HR.Q2 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_Q2 integer,
        primary key (OBJ_ID)
    );

    create table HR.Q3 (
       OBJ_ID bigint not null,
        PARENT_ID bigint,
        V_Q3 integer,
        primary key (OBJ_ID)
    );

    create table HR.Q4 (
       OBJ_ID bigint not null,
        V_Q4 integer,
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

    create table HR.STYLE (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        STYLE_NAME varchar(255),
        V_STYLE integer,
        primary key (SUID)
    );

    create table HR.T1 (
       OBJ_ID bigint not null,
        V_T1 integer,
        primary key (OBJ_ID)
    );

    create table HR.T1T2 (
       OBJ_ID bigint not null,
        T2_REF bigint,
        V_T1T2 integer,
        T1_REF bigint,
        primary key (OBJ_ID)
    );

    create table HR.T_ORDER (
       ORDER_ID bigint not null,
        V_ORDER integer,
        CUSTOMER bigint,
        MODEL varchar(255),
        VEHICLE_ID bigint,
        primary key (ORDER_ID)
    );

    create table HR.TABCANVAS (
       UID varchar(255) not null,
        NAME varchar(255),
        V_TABCANVAS integer,
        ref_suid_canvas varchar(255),
        ref_suid_uObject varchar(255),
        primary key (UID)
    );

    create table HR.TRIGGER (
       UID varchar(255) not null,
        OPERATION varchar(255),
        V_TRIGGER integer,
        REF_PARENT_ACTION varchar(255),
        REF_PARENT_ON_CLICK varchar(255),
        primary key (UID)
    );

    create table HR.UIELEMENT (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        UI_EL_NAME varchar(255),
        V_UIELEMENT integer,
        REF_PARENT varchar(255),
        primary key (SUID)
    );

    create table HR.UOBJECT (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        OBJ_NAME varchar(255),
        V_UOBJECT integer,
        primary key (SUID)
    );

    create table HR.VEHICLE (
       MODEL varchar(255) not null,
        OBJ_ID bigint not null,
        PLATE varchar(255),
        V_VEHICLE integer,
        primary key (MODEL, OBJ_ID)
    );

    create table HR.WARIA (
       UID varchar(255) not null,
        ARIA_NAME varchar(255),
        V_WARIA integer,
        ref_suid_aria varchar(255),
        primary key (UID)
    );

    create table HR.WINDOW (
       UID varchar(255) not null,
        NAME varchar(255),
        V_WINDOW integer,
        ref_suid_canvas varchar(255),
        ref_suid_uObject varchar(255),
        primary key (UID)
    );

    alter table HR.JPAOBJECT5 
       add constraint UK_1r5luxi8bk4pdpfg9x1wi89w5 unique (UK_OBJ5);

    alter table HR.ARIA 
       add constraint FKcad3st4ifbssf4h5o9fm1p37 
       foreign key (REF_PARENT) 
       references HR.CANVAS;

    alter table HR.B2 
       add constraint FKsgylcakyg3fb23afkpv4li26n 
       foreign key (PARENT_ID) 
       references HR.B1;

    alter table HR.BUTTON 
       add constraint FKgmqrrpqb5dvfjlojx23n527r0 
       foreign key (ref_suid_style) 
       references HR.STYLE;

    alter table HR.BUTTON 
       add constraint FKr2k9uhiv0brm1xfqjfwtkpin8 
       foreign key (ref_suid_uiElement) 
       references HR.UIELEMENT;

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

    alter table HR.INPUTTEXT 
       add constraint FKkrq51lwaf7u6ol6cdldf8x6gi 
       foreign key (ref_suid_style) 
       references HR.STYLE;

    alter table HR.INPUTTEXT 
       add constraint FKo9p8mqf2er9mdavvsewgp1pwj 
       foreign key (ref_suid_uiElement) 
       references HR.UIELEMENT;

    alter table HR.JPAOBJECT6 
       add constraint FKober6lgwx5q68u9dkhib8v1tj 
       foreign key (PARENT_OBJ6) 
       references HR.JPAOBJECT5 (UK_OBJ5);

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

    alter table HR.OUTPUTTEXT 
       add constraint FKctumy18d7ed1ewo4exapom6gm 
       foreign key (ref_suid_style) 
       references HR.STYLE;

    alter table HR.OUTPUTTEXT 
       add constraint FKibe6g4xpoyrq5lg3ara8vpoe9 
       foreign key (ref_suid_uiElement) 
       references HR.UIELEMENT;

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
       foreign key (MODEL, VEHICLE_ID) 
       references HR.VEHICLE;

    alter table HR.TABCANVAS 
       add constraint FKsmv7ibqky1s0m09cdtsvjnxda 
       foreign key (ref_suid_canvas) 
       references HR.CANVAS;

    alter table HR.TABCANVAS 
       add constraint FKeuihe553s9nkwoclik5h13m5y 
       foreign key (ref_suid_uObject) 
       references HR.UOBJECT;

    alter table HR.TRIGGER 
       add constraint FKd819x2iuu0p6pgm3m7sepurer 
       foreign key (REF_PARENT_ACTION) 
       references HR.BUTTON;

    alter table HR.TRIGGER 
       add constraint FK5i3eyw8eif7mh6wl60e76ahf7 
       foreign key (REF_PARENT_ON_CLICK) 
       references HR.BUTTON;

    alter table HR.UIELEMENT 
       add constraint FK8t5vlrcrhb1j8pmvo3miqbqf3 
       foreign key (REF_PARENT) 
       references HR.CANVAS;

    alter table HR.WARIA 
       add constraint FK7brpof39qg5yb344coubelhu4 
       foreign key (ref_suid_aria) 
       references HR.ARIA;

    alter table HR.WINDOW 
       add constraint FKjnx401u3r30ko7j77a40jil89 
       foreign key (ref_suid_canvas) 
       references HR.CANVAS;

    alter table HR.WINDOW 
       add constraint FKeyiumwkh2h1c8f1xnnqt55p5m 
       foreign key (ref_suid_uObject) 
       references HR.UOBJECT;
