package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import form.DataControl;
import form.FormFactory;
import form.FormPackage;
import form.RelationMapper;
import type.Assosiation;
import type.Type;
import type.TypeElement;

public class Helper1 {

	public void populateObjectMapper( DataControl datacontrol , EObject model   ){
		Type type = (Type) datacontrol.getBaseType().getTypeRef();
		
		Map <String,TypeElement> relatedObjects = new HashMap<String,TypeElement>();
		HashMap<String,Assosiation > hash = new HashMap<String, Assosiation>();
		
		new Helper().getRelatedAssosiations(relatedObjects,hash,type);

		ArrayList< RelationMapper> relations = new ArrayList<RelationMapper>();
		for (String key : relatedObjects.keySet()){
			RelationMapper relationMapper = FormFactory.eINSTANCE.createRelationMapper();
			relationMapper.setUid(UUID.randomUUID().toString());
			relationMapper.setTypeRef(relatedObjects.get(key));
			relationMapper.setAssosiationRef(hash.get(key));
			
			relations.add(relationMapper);
		}
		
		
		Session session = SessionManager.INSTANCE.getSession(model);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		EStructuralFeature feature = FormPackage.eINSTANCE.getDataControl_RelationMappers();
		Command setCommand = SetCommand.create(editingDomain, model, feature, relations);
		editingDomain.getCommandStack().execute(setCommand);

	}

	
}
