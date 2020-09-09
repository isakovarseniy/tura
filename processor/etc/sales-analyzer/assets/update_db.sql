-- 
--   Tura - Application generation solution
--
--   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
--
--
--   This project includes software developed by Arseniy Isakov
--   http://sourceforge.net/p/tura/wiki/Home/
--   All rights reserved. This program and the accompanying materials
--   are made available under the terms of the Eclipse Public License v2.0
--   which accompanies this distribution, and is available at
--   http://www.eclipse.org/legal/epl-v20.html
-- 
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (1, 'AA', 'Assign analist');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (2, 'AR', 'Assign reviewer');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (3, 'SCR', 'Submit case for review');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (4, 'AC', 'Approve case');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (5, 'CC', 'Close case');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (6, 'CAC', 'Close all cases');
INSERT INTO sales_analyzer.permission(obj_id, name, description)VALUES (7, 'LSDIC', 'Load Sales Drop Investigation Case');
