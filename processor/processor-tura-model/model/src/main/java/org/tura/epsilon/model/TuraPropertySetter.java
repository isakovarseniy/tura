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

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.eclipse.epsilon.common.util.CollectionUtil;
import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyAssignmentException;
import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.introspection.AbstractPropertySetter;
import org.eclipse.epsilon.eol.execute.introspection.IReflectivePropertySetter;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.annotation.Association;

public abstract class TuraPropertySetter extends AbstractPropertySetter implements IReflectivePropertySetter {
	private boolean conveyorMode  =  true;
	
	public boolean isConveyorMode() {
		return conveyorMode;
	}

	public void setConveyorMode(boolean conveyorMode) {
		this.conveyorMode = conveyorMode;
	}

	public  abstract void storeInConveyor(PostponedOperation po ) ;
	
	@Override
	public Object coerce(Object target, String property, Object value, IEolContext context)
			throws EolIllegalPropertyException {

		TuraStructuralFeature sf = getEStructuralFeature(target, property, value, context);
		if (sf.isMany() && !(value instanceof Collection)) {
			return CollectionUtil.asList(value);
		}
		return value;
	}

	@Override
	public boolean conforms(Object target, String property, Object value, IEolContext context)
			throws EolIllegalPropertyException {
		return true;
	}

	@Override
	public void invoke(Object target, String property, Object value, IEolContext context) throws EolRuntimeException {
		try {

			TuraStructuralFeature sf = getEStructuralFeature(target, property, value, context);
			if ( sf.isRelation() && isConveyorMode()) {
				storeInConveyor(new PostponedOperation(target, property, value, sf.isContainment()));
				return;
			}
			
			if (sf.isMany()) {
				if (value != null) {
					if (value instanceof Collection) {
						copyCollectionValues(((Collection<?>) value), sf, target);
					} else {
						throw new EolIllegalPropertyAssignmentException(property, context);
					}
				}
			} else {
				sf.setMethod.invoke(target, value);
			}
		} catch (Exception e) {
			throw new EolRuntimeException(e);
		}
	}

	


	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void copyCollectionValues(Collection<?> source, TuraStructuralFeature sf, Object target)
			throws Exception {
		Collection c = (Collection) sf.getMethod.invoke(target);
		c.addAll(source);
	}

	private TuraStructuralFeature getEStructuralFeature(Object object, String property, Object value,
			IEolContext context) throws EolIllegalPropertyException {

		ObjectControl oc = (ObjectControl) object;
		Class<?> clazz = oc.getProxyClazz();
		String masterMethodName = "get" + WordUtils.capitalize(property);
		Method getMethod = null;
		;
		try {
			getMethod = clazz.getMethod(masterMethodName);
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}

		boolean sListResult = false;
		Type returnType = getMethod.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())) {
				sListResult = true;
				returnType = type.getActualTypeArguments()[0];
			}
		}
		Method setMethod = null;
		if (!sListResult) {
			String setMethodName = "set" + WordUtils.capitalize(property);
			try {
				setMethod = clazz.getMethod(setMethodName, (Class<?>) returnType);
			} catch (NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}

		}
		boolean isRelatioin = false;
		boolean containment = false;
		Association assosiation = getMethod.getAnnotation(Association.class);
		if (assosiation != null) {
			isRelatioin = true;
			containment = assosiation.containment();
		}

		return new TuraStructuralFeature(sListResult, getMethod, setMethod, returnType,isRelatioin, containment);
	}

	public class TuraStructuralFeature {
		boolean many;
		Method setMethod;
		Method getMethod;
		Type type;
		boolean relation;
		boolean containment;

		public TuraStructuralFeature(boolean many, Method getMethod, Method setMethod, Type type,boolean relation, boolean containment) {
			this.many = many;
			this.setMethod = setMethod;
			this.getMethod = getMethod;
			this.type = type;
			this.relation = relation;
			this.containment = containment;
		}

		public boolean isContainment() {
			return containment;
		}


		public void setContainment(boolean containment) {
			this.containment = containment;
		}


		public boolean isMany() {
			return many;
		}

		public void setMany(boolean many) {
			this.many = many;
		}

		public Method getSetMethod() {
			return setMethod;
		}

		public void setSetMethod(Method setMethod) {
			this.setMethod = setMethod;
		}

		public Method getGetMethod() {
			return getMethod;
		}

		public void setGetMethod(Method getMethod) {
			this.getMethod = getMethod;
		}

		public Type getType() {
			return type;
		}

		public void setType(Type type) {
			this.type = type;
		}

		public boolean isRelation() {
			return relation;
		}

		public void setRelation(boolean relation) {
			this.relation = relation;
		}
		
	}

	
	public class PostponedOperation {
		Object target;
		String property;
		Object value;
		boolean containment;
		
		
		public PostponedOperation(Object target, String property, Object value, boolean containment) {
			this.target = target;
			this.property =  property;
			this.value = value;
			this.containment  = containment;
		}


		public boolean isContainment() {
			return containment;
		}


		public void setContainment(boolean containment) {
			this.containment = containment;
		}


		public Object getTarget() {
			return target;
		}


		public void setTarget(Object target) {
			this.target = target;
		}


		public String getProperty() {
			return property;
		}


		public void setProperty(String property) {
			this.property = property;
		}


		public Object getValue() {
			return value;
		}


		public void setValue(Object value) {
			this.value = value;
		}
		
		
	}
	
}
