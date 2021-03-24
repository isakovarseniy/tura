/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
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

import mapper.JavaPackageMapper;
import mapper.MappingLayer;
import mapper.PackageMapper;
import type.TypeGroup;

public class PackageMapperWrapper implements PackageMapper {

	PackageMapper mapper;

	public PackageMapperWrapper(PackageMapper mapper) {
		this.mapper = mapper;
	}

	public String getVersion() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			if (javaMapper.getVersionRef() != null) {
				return javaMapper.getVersionRef().getVersion();
			}
		}

		return "NA";
	}

	@Override
	public EList<MappingLayer> getLayers() {
		return mapper.getLayers();
	}

	@Override
	public EClass eClass() {
		return mapper.eClass();
	}

	@Override
	public Resource eResource() {
		return mapper.eResource();
	}

	@Override
	public EObject eContainer() {
		return mapper.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return mapper.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return mapper.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return mapper.eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return mapper.eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		return mapper.eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return mapper.eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return mapper.eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return mapper.eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		mapper.eSet(feature, newValue);
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return mapper.eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		mapper.eUnset(feature);

	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return mapper.eInvoke(operation, arguments);
	}

	@Override
	public EList<Adapter> eAdapters() {
		return mapper.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return mapper.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		mapper.eSetDeliver(deliver);

	}

	@Override
	public void eNotify(Notification notification) {
		mapper.eNotify(notification);
	}

	@Override
	public TypeGroup getPackageRef() {
		return mapper.getPackageRef();
	}

	@Override
	public void setPackageRef(TypeGroup value) {
		mapper.setPackageRef(value);

	}

}
