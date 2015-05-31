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
