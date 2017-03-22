package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.commons.Helper;

import form.DataControl;
import form.FormPackage;

public class DataControlBaseTypePropertySelection  extends BaseClassTypeNamepropertySelection{
	
	public void afterUpdate(){

		DRepresentationElement element = (DRepresentationElement) getEObject();
		DataControl datacontrol =  (DataControl) element.getTarget();
		
		
		if (datacontrol.getBaseType() != null && datacontrol.getBaseType().getTypeRef() != null ){
			Session session = SessionManager.INSTANCE.getSession(datacontrol);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
	
			EStructuralFeature feature = FormPackage.eINSTANCE.getDataControl_Name();
			Command setCommand = SetCommand.create(editingDomain, datacontrol, feature, datacontrol.getBaseType().getTypeRef().getName());
			editingDomain.getCommandStack().execute(setCommand);
			
			new Helper().populateObjectMapper(datacontrol, datacontrol);
		}	
	}
	
	
}
