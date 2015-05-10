package org.tura.example.ui.tree2tree.triggers;

import java.lang.reflect.InvocationTargetException;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;


@Alternative
@Priority(10)
@Selector("hrmanager.tree2tree")
@PostQuery("department")
public class DepartmentPostQueryTrigger implements PostQueryTrigger{

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		DepartmentsDAO department = (DepartmentsDAO) obj;
		try {
			Reflection.call(obj, "setNameArt", department.getDepartmentName());
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			throw new TuraException(e);
		}
		
	}

}