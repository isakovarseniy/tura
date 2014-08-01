package org.tura.platform.hr.controls;

import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative 
@PreQuery("department") 
@PostCreate("department")
public class DepartmentTrigger implements PreQueryTrigger,PostCreateTrigger{
	public DepartmentTrigger(){
		System.out.println("asdas");
	}

	@Override
	public void execute(DataControl<?> datacontrol) throws TuraException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		// TODO Auto-generated method stub
		
	}

}
