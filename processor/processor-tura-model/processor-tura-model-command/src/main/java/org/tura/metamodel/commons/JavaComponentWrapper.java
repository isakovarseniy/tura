/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.util.List;


import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.mapper.Version;


public class JavaComponentWrapper extends JavaComponent{

	private static final long serialVersionUID = -2733550746507813470L;
	private JavaComponent component;
	
	public JavaComponentWrapper(JavaComponent component ){
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

	public boolean isSkip() {
		return component.getSkip();
	}

	public void setSkip(boolean value) {
		component.setSkip(value);
	}

	@Override
	public List<ModelMapper> getMappers() {
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
	public Integer getColumns() {
		return component.getColumns();
	}

	@Override
	public void setColumns(Integer value) {
		component.setColumns(value);
	}


	@Override
	public Integer getOrder() {
		return component.getOrder();
	}

	@Override
	public void setOrder(Integer value) {
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
	public String getArtifactId() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaMapper){
				JavaMapper mapper =  (JavaMapper) component.getMapperRef();
				return mapper.getArtifactId();
			}
			if ( component.getMapperRef() instanceof JavaPackageMapper){
				JavaPackageMapper mapper =  (JavaPackageMapper) component.getMapperRef();
				return mapper.getArtifactId();
			}
			if ( component.getMapperRef() instanceof JavaScriptMapper){
				JavaScriptMapper mapper =  (JavaScriptMapper) component.getMapperRef();
				return mapper.getArtifactId();
			}
		}
		return component.getArtifactId();
	}

	@Override
	public void setArtifactId(String value) {
	}

	@Override
	public String getGroupId() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaMapper){
				JavaMapper mapper =  (JavaMapper) component.getMapperRef();
				return mapper.getGroupId();
			}
			if ( component.getMapperRef() instanceof JavaPackageMapper){
				JavaPackageMapper mapper =  (JavaPackageMapper) component.getMapperRef();
				return mapper.getGroupId();
			}
			if ( component.getMapperRef() instanceof JavaScriptMapper){
				JavaScriptMapper mapper =  (JavaScriptMapper) component.getMapperRef();
				return mapper.getGroupId();
			}
		}
		
		return component.getGroupId();
	}

	@Override
	public void setGroupId(String value) {
	}

	public String getVersion() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaMapper){
				JavaMapper mapper =  (JavaMapper) component.getMapperRef();
				return   new TypeMapperWrapper( mapper).getVersion();
			}
			if ( component.getMapperRef() instanceof JavaPackageMapper){
				JavaPackageMapper mapper =  (JavaPackageMapper) component.getMapperRef();
				return   new PackageMapperWrapper( mapper).getVersion();
			}
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
	public String getBasePackage() {
		if ( component.getMapperRef() != null){
			if ( component.getMapperRef() instanceof JavaMapper){
				JavaMapper mapper =  (JavaMapper) component.getMapperRef();
				return mapper.getMappedToPackageName();
			}
			if ( component.getMapperRef() instanceof JavaPackageMapper){
				JavaPackageMapper mapper =  (JavaPackageMapper) component.getMapperRef();
				return mapper.getMappedToPackageName();
			}
		}
		
		return component.getBasePackage();
	}

	@Override
	public void setBasePackage(String value) {
	}

	@Override
	public Mapper getMapperRef() {
		return null;
	}

	@Override
	public void setMapperRef(Mapper value) {
	}

}
