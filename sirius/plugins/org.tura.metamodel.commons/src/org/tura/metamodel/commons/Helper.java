package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
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
import type.Attribute;
import type.Generalization;
import type.Operation;
import type.Parameter;
import type.Type;
import type.TypeElement;
import type.TypeReference;

public class Helper {


	
	public void addOperations(Map<String, Operation> operations, Map<String, Attribute> attributes,TypeElement typeElement) {

		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}

		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;

			for (Operation operation : type.getOperations()) {
				String key = getOperationKey(operation);
				if (operations.get(key) == null)
					operations.put(key, operation);
			}

			for (Attribute attribute : type.getAttributes()) {
				String key = getAttributeKey(attribute);
				if (attributes.get(key) == null)
					attributes.put(key, attribute);
			}

			for (Generalization ext :  new QueryHelper().getTypeExtension(type)) {
				addOperations(operations, attributes, ext.getTarget());
			}
		}

	}
	
	public void getRelatedObjects(Map<String, TypeElement> relatedObjects,TypeElement typeElement){
		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}
		
		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;
			
			Collection<Assosiation> [] result =  new QueryHelper().getAssosiation(type);
			
			for (Assosiation rel :  result[0]  ) {
				if (rel.getTarget() != null){
				   relatedObjects.put(rel.getTarget().getName(), rel.getTarget());
				}
			}

			for (Assosiation rel :  result[1]  ) {
				if (rel.getSource() != null){
				   relatedObjects.put(rel.getSource().getName(), rel.getSource());
				}
			}
		}
	}
	

	public void getRelatedAssosiations(Map<String, TypeElement> relatedObjects, HashMap<String,Assosiation > hash,TypeElement typeElement){
		if (typeElement instanceof TypeReference) {
			typeElement = ((TypeReference) typeElement).getTypeRef();
		}
		if (typeElement instanceof Type) {
			Type type = (Type) typeElement;
			
			Collection<Assosiation> [] result =  new QueryHelper().getAssosiation(type);
			
			for (Assosiation rel :  result[0]  ) {
				if (rel.getTarget() != null){
				   relatedObjects.put(rel.getTarget().getUid(), rel.getTarget());
				   hash .put(rel.getTarget().getUid(), rel);
				}
			}

			for (Assosiation rel :  result[1]  ) {
				if (rel.getSource() != null){
				   relatedObjects.put(rel.getSource().getUid(), rel.getSource());
				   hash .put(rel.getSource().getUid(), rel);
				}
			}
		}

	}
	
	private String getOperationKey(Operation operation) {

		String key = "";

		for (Parameter param : operation.getParameters()) {
			if (param.getTypeRef() != null)
				key = key + param.getTypeRef().getUid();
		}
		if (operation.getReturnValue() != null
				&& operation.getReturnValue().getTypeRef() != null)
			key = operation.getReturnValue().getTypeRef().getUid() + key;

		key = operation.getName() + key;

		return key;
	}

	private String getAttributeKey(Attribute attribute) {
		String key = "";

		if (attribute.getTypeRef() != null)
			key = attribute.getTypeRef().getUid();

		return attribute.getName() + key;
	}

	
	public void populateObjectMapper( DataControl datacontrol , EObject model   ){
		Type type = (Type) datacontrol.getBaseType().getTypeRef();
		
		Map <String,TypeElement> relatedObjects = new HashMap<String,TypeElement>();
		HashMap<String,Assosiation > hash = new HashMap<String, Assosiation>();
		
		getRelatedAssosiations(relatedObjects,hash,type);

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
