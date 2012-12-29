package org.elsoft.platform.form.triggers;

import javax.faces.context.FacesContext;

import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.extender.Handler;

public class TestFormTriggers {
	
	@SuppressWarnings("rawtypes")
	public void onDropTrigger(Object obj){
		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{DrugDropFormbinding}", Object.class);
         Reflection.call(obj, "setLinkType", "installedFeature");  
         Handler avfeat = (Handler) Reflection.call(bindFactory,"getCurrentAvailableFeature");
         avfeat.getMode().getControl().setRefresh(true);
         Handler insfeat = (Handler) Reflection.call(bindFactory,"getCurrentInstalledFeature");
         insfeat.getMode().getControl().setRefresh(true);
         
		
	}

}
