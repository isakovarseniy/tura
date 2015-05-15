package org.tura.example.ui.tree2tree.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.elsoft.platform.hr.objects.CityDAO;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.ICityArtifitialFields;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;


@Alternative
@Priority(10)
@Selector("hrmanager.tree2tree")
@PostQuery("city")
public class CityPostQueryTrigger implements PostQueryTrigger{

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		CityDAO city = (CityDAO) obj;
		ICityArtifitialFields af = (ICityArtifitialFields) obj;
		af.setNameArtf(city.getName());
		
	}

}
