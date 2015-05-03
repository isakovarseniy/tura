package org.tura.example.ui.hrcontroller.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.elsoft.platform.hr.objects.CityDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;

@Alternative
@Priority(10)
@Selector("hrmanager.hrcontroller")
@ViewPortTrigger("details")
public class ViewPortDetailsTrigger extends ViewPortCommand {
	 
	@Inject
	ELResolver elResolver;

	@Override
	public Object execute() {
		
		Object obj = elResolver.getValue("#{beanFactoryHrManagerHRController.treeRootCountry.currentObject}");
		if (obj instanceof CountryDAO)
			return "/hrmanager/hrcontroller/CountryDetails.xhtml";
		
		if (obj instanceof StateDAO)
			return "/hrmanager/hrcontroller/StateDetails.xhtml";

		if (obj instanceof CityDAO)
			return "/hrmanager/hrcontroller/CityDetails.xhtml";
		
		if (obj instanceof StreetDAO)
			return "/hrmanager/hrcontroller/DepartmentsDetails.xhtml";

		return this.port;
	}

}
