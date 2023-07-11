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

    drop table HR.JPAOBJECTSECONDDB if exists;

    drop sequence if exists HR.hibernate_sequence;
create sequence HR.hibernate_sequence start with 1 increment by 1;

    create table HR.JPAOBJECTSECONDDB (
       OBJ_ID bigint not null,
        NAME varchar(255),
        primary key (OBJ_ID)
    );

    drop table HR.JPAOBJECTSECONDDB if exists;

    drop sequence if exists HR.hibernate_sequence;
create sequence HR.hibernate_sequence start with 1 increment by 1;

    create table HR.JPAOBJECTSECONDDB (
       OBJ_ID bigint not null,
        NAME varchar(255),
        V_JPAOBJECTSECONDDB integer,
        primary key (OBJ_ID)
    );
