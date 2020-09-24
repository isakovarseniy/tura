-- 
-- Tura - Application generation solution
--
-- Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
--   http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
-- 

    drop table HR.JPAOBJECTSECONDDB if exists;

    drop sequence if exists HR.hibernate_sequence;
create sequence HR.hibernate_sequence start with 1 increment by 1;

    create table HR.JPAOBJECTSECONDDB (
       OBJ_ID bigint not null,
        NAME varchar(255),
        primary key (OBJ_ID)
    );
