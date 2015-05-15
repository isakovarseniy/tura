package org.tura.example.ui.hrcontroller.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.faces.context.FacesContext;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("hrmanager.hrcontroller")
public class PreFormTrigger implements FactoryInitializeTrigger {

	@Override
	public void execute(Object obj) throws TuraException {
		try {
			String param1 = FacesContext.getCurrentInstance()
					.getExternalContext().getRequestParameterMap()
					.get("param1");
			
			IBeanFactory bf = (IBeanFactory) obj;
			bf.setVar1(param1);
		} catch (Exception e) {
            throw new TuraException(e);
		}
	}

}
