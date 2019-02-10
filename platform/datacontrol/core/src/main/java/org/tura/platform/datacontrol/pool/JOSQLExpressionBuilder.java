/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol.pool;

import com.octo.java.sql.exp.Constant;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;
import com.octo.java.sql.query.visitor.DefaultQueryBuilder;

public class JOSQLExpressionBuilder extends DefaultQueryBuilder{

	@Override
	  public void visit(final SelectQuery query) throws QueryException {
		   final boolean innerQuery = addBracketToNextSelectQuery;
		    if (!innerQuery){
		    	query.as("");
		    	query.setColumns(Constant.STAR.getValue());
		    }
		    super.visit(query);
	  }	
	
}
