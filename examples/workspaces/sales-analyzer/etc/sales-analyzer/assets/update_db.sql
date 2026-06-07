-- 
-- Tura - Application generation solution
--
-- Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (1, 'AA', 'Assign analist');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (2, 'AR', 'Assign reviewer');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (3, 'SCR', 'Submit case for review');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (4, 'AC', 'Approve case');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (5, 'CC', 'Close case');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (6, 'CAC', 'Close all cases');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (7, 'LSDIC', 'Load Sales Drop Investigation Case');


  CREATE SEQUENCE sales_analyzer.hibernate_sequence
  INCREMENT 1
  MINVALUE 5000
  MAXVALUE 9223372036854775807
  START 5000
  CACHE 1;
ALTER TABLE sales_analyzer.hibernate_sequence
  OWNER TO postgres;