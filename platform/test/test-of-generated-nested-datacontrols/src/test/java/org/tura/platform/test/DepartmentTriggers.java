package org.tura.platform.test;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.hr.objects.jpa.Department;
import org.tura.platform.repository.cdi.RepositoryTriggers;
import org.tura.platform.repository.core.Triggers;

@RepositoryTriggers
public class DepartmentTriggers extends Triggers{

	@Override
	public String getCalssName() {
		return Department.class.getName();
	}

	@Override
	public String getQueryName() {
		return "default";
	}

	@Override
	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria){
		for (SearchCriteria sc : searchCriteria){
			if (sc.getName().equals("parentId") ){
				sc.setName("PARENT_ID");
			}
			
		}
		
	}
	
	
}
