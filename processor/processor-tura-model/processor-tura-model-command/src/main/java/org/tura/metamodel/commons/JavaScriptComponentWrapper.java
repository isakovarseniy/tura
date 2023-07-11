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

import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;



public class JavaScriptComponentWrapper extends JavaScriptComponent{

	private static final long serialVersionUID = 2745884433464302337L;
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