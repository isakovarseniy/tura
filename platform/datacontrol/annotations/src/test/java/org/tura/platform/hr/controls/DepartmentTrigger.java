package org.tura.platform.hr.controls;

import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
public class DepartmentTrigger implements PreQueryTrigger{
	public DepartmentTrigger(){
		System.out.println("asdas");
	}

	@Override
	public void execute(DataControl<?> datacontrol) throws TuraException {
		// TODO Auto-generated method stub
		
	}

}
