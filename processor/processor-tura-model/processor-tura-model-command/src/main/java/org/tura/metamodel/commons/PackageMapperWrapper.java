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

import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.Mappers;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.PackageMapper;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.type.TypeGroup;

public class PackageMapperWrapper implements PackageMapper {

	PackageMapper mapper;

	public PackageMapperWrapper(PackageMapper mapper) {
		mapper.getClass().toString();
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

	public String getArtifactId() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getArtifactId();
		}
		return "NA";
	}

	public String getGroupId() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getGroupId();
		}
		return "NA";
	}	
	
	public String getLibraryName() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getLibraryName();
		}
		return "NA";
	}		
	
	public String getArtifactType() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getArtifactType().toString();
		}
		return "NA";
	}			
	
	
	public String getScope() {
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getScope().toString();
		}
		return null;
	}

	@Override
	public List<MappingLayer> getLayers() {
		return mapper.getLayers();
	}

	@Override
	public TypeGroup getPackageRef() {
		return mapper.getPackageRef();
	}

	@Override
	public void setPackageRef(TypeGroup value) {
		mapper.setPackageRef(value);

	}

	public String getMappedToPackageName() {
		if (mapper instanceof MetamodelPackageMapper) {
			MetamodelPackageMapper metaMapper = (MetamodelPackageMapper) mapper;
			return metaMapper.getMappedToPackageName();
		}
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			return javaMapper.getMappedToPackageName();
		}
		
		return "NA";
	}

	public void setMappedToPackageName(String mappedToPackageName) {
		if (mapper instanceof MetamodelPackageMapper) {
			MetamodelPackageMapper metaMapper = (MetamodelPackageMapper) mapper;
			metaMapper.setMappedToPackageName(mappedToPackageName);
		}
		if (mapper instanceof JavaPackageMapper) {
			JavaPackageMapper javaMapper = (JavaPackageMapper) mapper;
			javaMapper.setMappedToPackageName(mappedToPackageName);
		}
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
	public String getSuidPackagePointer() {
		return null;
	}

	@Override
	public void setSuidPackagePointer(String suidPackagePointer) {

	}

	@Override
	public String getTransientrefOpPackageRefPackagePointerTypeGroup() {
		return null;
	}

	@Override
	public void setTransientrefOpPackageRefPackagePointerTypeGroup(
			String transientrefOpPackageRefPackagePointerTypeGroup) {

	}

	@Override
	public Boolean getAttached() {
		return null;
	}

	@Override
	public void setAttached(Boolean value) {

	}

	@Override
	public String getSuidPackageMapper() {
		return null;
	}

	@Override
	public void setSuidPackageMapper(String suidPackageMapper) {

	}

}
