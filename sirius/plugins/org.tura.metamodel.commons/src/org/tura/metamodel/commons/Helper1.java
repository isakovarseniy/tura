/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import form.DataControl;
import form.FormFactory;
import form.FormPackage;
import form.RelationMapper;
import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperFactory;
import objectmapper.ObjectmapperPackage;
import objectmapper.OmRelation;
import type.Assosiation;
import type.Attribute;
import type.AttributePointer;
import type.Type;
import type.TypeElement;
import type.TypeFactory;

public class Helper1 {

	public void populateObjectMapper(DataControl datacontrol, EObject model) {
		Type type = (Type) datacontrol.getBaseType().getTypeRef();

		Map<String, TypeElement> relatedObjects = new HashMap<String, TypeElement>();
		HashMap<String, Assosiation> hash = new HashMap<String, Assosiation>();

		new Helper().getRelatedAssosiations(relatedObjects, hash, type);

		ArrayList<RelationMapper> relations = new ArrayList<RelationMapper>();
		for (String key : relatedObjects.keySet()) {
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

	public void populateObjectMapper(ObjectMapper objectMapper, EObject model) {
		Type type = (Type) objectMapper.getBaseType().getTypeRef();

		Map<String, TypeElement> relatedObjects = new HashMap<String, TypeElement>();
		HashMap<String, Assosiation> hash = new HashMap<String, Assosiation>();

		new Helper().getRelatedAssosiations(relatedObjects, hash, type);

		List<String> existingAssosiation = new ArrayList<>();
		List<String> existingAttributes = new ArrayList<>();
		
		List<OmRelation> deleteOmRelList = new ArrayList<>();
		List<AttributePointer> deleteAttributePointerList = new ArrayList<>();
		for (OmRelation omRel : objectMapper.getRelations()) {
			if (omRel.getTypeRef() != null && omRel.getAssosiationRef() != null) {
				String key = omRel.getTypeRef().getUid() + "-" + omRel.getAssosiationRef().getUid();
				existingAssosiation.add(key);
			}else {
				deleteOmRelList.add(omRel);
			}
		}

		for (AttributePointer pointer : objectMapper.getAttributes()) {
			if (pointer.getAttributeRef() != null) {
				String key = pointer.getAttributeRef().getUid();
				existingAttributes.add(key);
			}else {
				deleteAttributePointerList.add(pointer);
			}
		}

		ArrayList<OmRelation> relations = new ArrayList<OmRelation>();
		for (String key : relatedObjects.keySet()) {
			String k = relatedObjects.get(key).getUid() + "-" + hash.get(key).getUid();
			if (!existingAssosiation.contains(k)) {
				OmRelation relationMapper = ObjectmapperFactory.eINSTANCE.createOmRelation();
				relationMapper.setUid(UUID.randomUUID().toString());
				relationMapper.setTypeRef(relatedObjects.get(key));
				relationMapper.setAssosiationRef(hash.get(key));
				relations.add(relationMapper);
			}
		}
		List<Attribute> attributes = new QueryHelper().getAttributesForType(type);
		List<AttributePointer> pointers = new ArrayList<>();
		for (Attribute attr : attributes) {
			String k = attr.getUid();
			if (!existingAttributes.contains(k)) {
				AttributePointer pointer = TypeFactory.eINSTANCE.createAttributePointer();
				pointer.setAttributeRef(attr);
				pointer.setUid(UUID.randomUUID().toString());
				pointers.add(pointer);
			}
		}

		Session session = SessionManager.INSTANCE.getSession(model);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		EStructuralFeature feature = ObjectmapperPackage.eINSTANCE.getObjectMapper_Relations();
		Command setCommand = AddCommand.create(editingDomain, model, feature, relations);
		editingDomain.getCommandStack().execute(setCommand);

		feature = ObjectmapperPackage.eINSTANCE.getObjectMapper_Attributes();
		setCommand = AddCommand.create(editingDomain, model, feature, pointers);
		editingDomain.getCommandStack().execute(setCommand);

		if (deleteOmRelList.size() !=0) {
			feature = ObjectmapperPackage.eINSTANCE.getObjectMapper_Relations();
			Command detCommand = RemoveCommand.create(editingDomain, model, feature, deleteOmRelList);
			editingDomain.getCommandStack().execute(detCommand);
		}
		
		if (deleteAttributePointerList.size() !=0) {
			feature = ObjectmapperPackage.eINSTANCE.getObjectMapper_Attributes();
			Command detCommand = RemoveCommand.create(editingDomain, model, feature, deleteAttributePointerList);
			editingDomain.getCommandStack().execute(detCommand);
		}
		
	}

}
