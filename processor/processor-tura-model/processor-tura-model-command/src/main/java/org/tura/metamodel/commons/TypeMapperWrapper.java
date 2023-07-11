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
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.Mappers;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.TypeMapper;
import org.tura.model.designer.repository.serialized.mapper.VersionRef;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import org.tura.model.designer.repository.serialized.type.TypeElement;


public class TypeMapperWrapper implements TypeMapper{
	

	TypeMapper mapper;

	
	public  TypeMapperWrapper(TypeMapper mapper){
		this.mapper = mapper;
	}
	
	public String getVersion(){
		 if (mapper instanceof  JavaMapper  || mapper instanceof  JavaScriptMapper){
			 VersionRef versionRef = (VersionRef) mapper;
			 if (  versionRef.getVersionRef() != null ){
				 return versionRef.getVersionRef().getVersion();
			 }
		 }
		
		return "NA";
	}
	
	public String getMappedToClassName(){
		 if (mapper instanceof  JavaMapper  ){
			 JavaMapper javaMapper = (JavaMapper) mapper;
			 if (  javaMapper.getMappedToClassName() != null ){
				 return javaMapper.getMappedToClassName();
			 }
		 }
		 if (mapper instanceof  JavaScriptMapper  ){
			 JavaScriptMapper jsMapper = (JavaScriptMapper) mapper;
			 if (  jsMapper.getMappedToClassName() != null ){
				 return jsMapper.getMappedToClassName();
			 }
		 }		 
		return "NA";
	}
	
	public String getMappedToPackageName(){
		 if (mapper instanceof  JavaMapper  ){
			 JavaMapper javaMapper = (JavaMapper) mapper;
			 if (  javaMapper.getMappedToPackageName() != null ){
				 return javaMapper.getMappedToPackageName();
			 }else {
				 return "";
			 }
		 }
		return "NA";
	}	
	
	
	public String getArtifactId() {
		if (mapper instanceof JavaMapper) {
			JavaMapper javaMapper = (JavaMapper) mapper;
			return javaMapper.getArtifactId();
		}
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getArtifactId();
		}
		return "NA";
	}
	
	public String getGroupId() {
		if (mapper instanceof JavaMapper) {
			JavaMapper javaMapper = (JavaMapper) mapper;
			return javaMapper.getGroupId();
		}
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getGroupId();
		}
		return "NA";
	}	

	
	public String getJsPackageName() {
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getJsPackageName();
		}
		return "NA";
	}		

	public String getLibraryUrl() {
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getLibraryUrl();
		}
		return "NA";
	}		
	
	public String getLibraryName() {
		if (mapper instanceof JavaMapper) {
			JavaMapper javaMapper = (JavaMapper) mapper;
			return javaMapper.getLibraryName();
		}
		return "NA";
	}		
	
	
	public String getMappedToInternalLocation() {
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getMappedToInternalLocation();
		}
		return "NA";
	}		
	
	
	public Boolean getLocal() {
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getLocal();
		}
		return null;
	}		

	
	
	
	
	public String getArtifactType() {
		if (mapper instanceof JavaMapper) {
			JavaMapper javaMapper = (JavaMapper) mapper;
			return javaMapper.getArtifactType().toString();
		}
		if (mapper instanceof JavaScriptMapper) {
			JavaScriptMapper javaScriptMapper = (JavaScriptMapper) mapper;
			return javaScriptMapper.getArtifactType().toString();
		}
		
		return "NA";
	}			
	
	
	public String getScope() {
		if (mapper instanceof JavaMapper) {
			JavaMapper javaMapper = (JavaMapper) mapper;
			return javaMapper.getScope().toString();
		}
		return null;
	}
	
	
	
	@Override
	public List<MappingLayer> getLayers() {
		return mapper.getLayers();
	}


	@Override
	public TypeElement getTypeRef() {
		return mapper.getTypeRef();
	}

	@Override
	public void setTypeRef(TypeElement value) {
		mapper.setTypeRef(value);
	}

	@Override
	public String getSuidMapper() {
		return null;
	}

	@Override
	public void setSuidMapper(String suidMapper) {
		
	}

	@Override
	public String getTransientrefMappersMappers() {
		return null;
	}

	@Override
	public void setTransientrefMappersMappers(String transientrefMappersMappers) {
		
	}

	@Override
	public List<JavaComponent> getOpMapperRefJavaComponent() {
		return null;
	}

	@Override
	public void setOpMapperRefJavaComponent(List<JavaComponent> opMapperRefJavaComponent) {
		
	}

	@Override
	public List<JavaScriptComponent> getOpMapperRefJavaScriptComponent() {
		return null;
	}

	@Override
	public void setOpMapperRefJavaScriptComponent(List<JavaScriptComponent> opMapperRefJavaScriptComponent) {
		
	}

	@Override
	public void setLayers(List<MappingLayer> layers) {
		
	}

	@Override
	public Mappers getOpMappersMappers() {
		return null;
	}

	@Override
	public void setOpMappersMappers(Mappers opMappersMappers) {
		
	}

	@Override
	public String getSuidTypePointer() {
		return null;
	}

	@Override
	public void setSuidTypePointer(String suidTypePointer) {
		
	}

	@Override
	public String getTransientrefOpTypeRefTypePointerTypeElement() {
		return null;
	}

	@Override
	public void setTransientrefOpTypeRefTypePointerTypeElement(String transientrefOpTypeRefTypePointerTypeElement) {
		
	}

	@Override
	public String getTransientrefMany2manyHelperAssosiation() {
		return null;
	}

	@Override
	public void setTransientrefMany2manyHelperAssosiation(String transientrefMany2manyHelperAssosiation) {
		
	}


	@Override
	public Assosiation getOpMany2manyHelperAssosiation() {
		return null;
	}

	@Override
	public void setOpMany2manyHelperAssosiation(Assosiation opMany2manyHelperAssosiation) {
		
	}

	@Override
	public Boolean getAttached() {
		return null;
	}

	@Override
	public void setAttached(Boolean value) {
		
	}

	@Override
	public String getSuidTypeMapper() {
		return null;
	}

	@Override
	public void setSuidTypeMapper(String suidTypeMapper) {
	}

}
