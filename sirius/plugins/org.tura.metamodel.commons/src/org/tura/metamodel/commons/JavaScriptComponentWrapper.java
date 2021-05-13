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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import mapper.JavaScriptMapper;
import mapper.Mapper;
import mapper.Version;
import recipe.JavaScriptComponent;
import recipe.ModelMapper;
import recipe.RecipePackage;

public class JavaScriptComponentWrapper implements JavaScriptComponent{

	private JavaScriptComponent component;
	
	public JavaScriptComponentWrapper(JavaScriptComponent component ){
		this.component = component;
	}
	
	@Override
	public String getUid() {
		return component.getUid();
	}

	@Override
	public void setUid(String value) {
		component.setUid(value);
	}

	@Override
	public String getName() {
		return component.getName();
	}

	@Override
	public void setName(String value) {
		component.setName(value);
	}

	@Override
	public boolean isSkip() {
		return component.isSkip();
	}

	@Override
	public void setSkip(boolean value) {
		component.setSkip(value);
	}

	@Override
	public EList<ModelMapper> getMappers() {
		return component.getMappers();
	}

	@Override
	public String getComponentRoot() {
		return component.getComponentRoot();
	}

	@Override
	public void setComponentRoot(String value) {
		component.setComponentRoot(value);
	}

	@Override
	public int getColumns() {
		return component.getColumns();
	}

	@Override
	public void setColumns(int value) {
		component.setColumns(value);
	}

	@Override
	public EClass eClass() {
		return component.eClass();
	}

	@Override
	public Resource eResource() {
		return component.eResource();
	}

	@Override
	public EObject eContainer() {
		return component.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return component.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return component.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return component.eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return component.eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		return component.eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return component.eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		if ( RecipePackage.eINSTANCE.getJavaScriptComponent_PackageName().equals(feature)){
			return getPackageName();
		}
		
		return component.eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return component.eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		component.eSet(feature, newValue);
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return component.eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		component.eUnset(feature);
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return component.eInvoke(operation, arguments);
	}

	@Override
	public EList<Adapter> eAdapters() {
		return component.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return component.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		component.eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		component.eNotify(notification);
	}

	@Override
	public int getOrder() {
		return component.getOrder();
	}

	@Override
	public void setOrder(int value) {
		component.setOrder(value);
	}

	@Override
	public Version getVersionRef() {
		return null;
	}

	@Override
	public void setVersionRef(Version value) {
	}

	@Override
	public String getPackageName() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaScriptMapper){
				JavaScriptMapper mapper =  (JavaScriptMapper) component.getMapperRef();
				return mapper.getJsPackageName();
			}
		}
		return component.getPackageName();
	}

	@Override
	public void setPackageName(String value) {
	}


	public String getVersion() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaScriptMapper){
				JavaScriptMapper mapper =  (JavaScriptMapper) component.getMapperRef();
				return   new TypeMapperWrapper( mapper).getVersion();
			}
		}else{
			if (component .getVersionRef() != null){
				return component.getVersionRef().getVersion();
			}
		}
		return "na";
	}


	@Override
	public Mapper getMapperRef() {
		return null;
	}

	@Override
	public void setMapperRef(Mapper value) {
	}
	
	
	
}