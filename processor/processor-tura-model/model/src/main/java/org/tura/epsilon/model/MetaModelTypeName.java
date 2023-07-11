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

package org.tura.epsilon.model;

public class MetaModelTypeName {
	private String modelName;
	private String packageName;
	private String metaodelClassName;

	private MetaModelTypeName(String modelName, String packageName, String metaodelClassName) {
		this.modelName = modelName;
		this.packageName = packageName;
		this.metaodelClassName = metaodelClassName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getMetaodelClassName() {
		return metaodelClassName;
	}

	public void setMetaodelClassName(String metaodelClassName) {
		this.metaodelClassName = metaodelClassName;
	}
	
	public String getFullName() {
		
		if ( packageName == null || "".equals(packageName)) {
			return metaodelClassName;
		}else {
			return  packageName+"::"+ metaodelClassName;
		}
		
	}
	
	

	public static MetaModelTypeName parse(String metaClass) {
		String _modelName = null;
		String _packageName = null;
		String _metaodelClassName = null;
		String _metaClass = metaClass;

		int i = _metaClass.indexOf("!");
		if (i != -1) {
			_modelName = _metaClass.substring(0, i);
			i = i + 1;
			if (i == _metaClass.length()) {
				throw new IllegalArgumentException("Wrong name of metaclass " + metaClass);
			}
			_metaClass = _metaClass.substring(i);
		}
		i = _metaClass.lastIndexOf("::");
		if (i != -1) {
			_packageName = _metaClass.substring(0, i);
			i = i + 2;
			if (i == _metaClass.length()) {
				throw new IllegalArgumentException("Wrong name of metaclass " + metaClass);
			}
			_metaClass = _metaClass.substring(i);
		}
		_metaodelClassName = _metaClass;

		if (_metaodelClassName == null || "".equals(_metaodelClassName)) {
			throw new IllegalArgumentException("Wrong name of metaclass " + metaClass);
		}

		return new MetaModelTypeName(_modelName, _packageName, _metaodelClassName);

	}

}
