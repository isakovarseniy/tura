package org.tura.example.ui.tree2tree.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.IDepartmentArtifitialFields;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
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
		IDepartmentArtifitialFields af = (IDepartmentArtifitialFields) obj;
		af.setNameArtf(department.getDepartmentName());
		
	}

}