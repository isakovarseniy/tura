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

package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationMapper;
import mapper.JavaMapper;
import mapper.JavaPackageMapper;
import mapper.Mapper;

public class MapperProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return o;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Mapper p = (Mapper) o;
		ApplicationMapper appMapper =  (ApplicationMapper) p.eContainer().eContainer();
		
		if ( p instanceof  JavaMapper ){
			JavaMapper javaMapper = (JavaMapper) p;
			String version = "NA";
			if ( javaMapper.getVersionRef() != null){
				version = javaMapper.getVersionRef().getVersion();
			}
			return appMapper.getName() + " - " + javaMapper.getGroupId() + " :: " + javaMapper.getArtifactId() + " :: " +version;
		}
		if (  p instanceof  JavaPackageMapper){
			JavaPackageMapper packageMapper = (JavaPackageMapper) p;
			String version = "NA";
			if ( packageMapper.getVersionRef() != null){
				version = packageMapper.getVersionRef().getVersion();
			}
			return appMapper.getName() + " - " + packageMapper.getGroupId() + " :: " + packageMapper.getArtifactId() + " :: " +version;
		}
		
		return appMapper.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}



}
