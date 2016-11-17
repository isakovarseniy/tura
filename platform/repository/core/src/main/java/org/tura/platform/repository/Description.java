package org.tura.platform.repository;

import java.util.List;

public interface Description {
	
	Object getObject();
	
   String  getDataControlExpression();
   
   List<CopyRule> getCopyRules();
   
   List <ObjectRelation> getObjectRelations();

}
