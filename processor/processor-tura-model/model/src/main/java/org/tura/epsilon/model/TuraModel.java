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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.common.util.StringUtil;
import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolEnumerationValueNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotAnEnumerationValueException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.introspection.IReflectivePropertySetter;
import org.eclipse.epsilon.eol.execute.operations.declarative.IAbstractOperationContributor;
import org.eclipse.epsilon.eol.execute.operations.declarative.IAbstractOperationContributorProvider;
import org.eclipse.epsilon.eol.models.IReflectiveModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.models.transactions.IModelTransactionSupport;
import org.eclipse.epsilon.eol.types.EolMap;
import org.tura.epsilon.model.TuraPropertySetter.PostponedOperation;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.repository.proxy.access.TopLazyList;

public class TuraModel extends Model implements IAbstractOperationContributorProvider, IReflectiveModel {

	private boolean readOnly = false;
	private CpaRepository repository;
	private TypeResolver typeResolver;
	private IAbstractOperationContributor operationContributor = new LazyListOperationContributor();
	private TuraPropertySetter propertySetter = new TuraPropertySetter() {
		public boolean conforms(Object target, String property, Object value, IEolContext context)
				throws EolIllegalPropertyException {
			ObjectControl oc = (ObjectControl) target;
			return getClassProperties(oc.getProxyClazz()).contains(property);
		}

		@Override
		public void storeInConveyor(PostponedOperation sf) {
			conveyor.add(sf);
		}
	};

	private List<ObjectControl> toInsert = new ArrayList<>();
	private List<PostponedOperation> conveyor = new ArrayList<>();

	public TuraModel() {

	}

	public String convertFromMetaclassToRepositoryObject(String type) {
		MetaModelTypeName m = MetaModelTypeName.parse(type);
		return typeResolver.convertFromMetaclassToRepositoryObject(m.getFullName());
	}

	public String convertFromRepositoryObjectTosMetaclass(String type) {
		return typeResolver.convertFromRepositoryObjectTosMetaclass(type);
	}

	@Override
	public void load(StringProperties properties, IRelativePathResolver resolver) throws EolModelLoadingException {
		super.load(properties, resolver);
		this.readOnly = properties.getBooleanProperty(PROPERTY_READONLY, this.readOnly);
		load();
	}

	@Override
	public Object createInstance(String type)
			throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {

		System.out.println("Create  instance " + type);

		return createInstance(type, Collections.emptyList());
	}

	@Override
	public Object createInstance(String type, Collection<Object> parameters)
			throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {

		String className = this.convertFromMetaclassToRepositoryObject(type);
		if (className == null) {
			throw new EolModelElementTypeNotFoundException(this.name, type);
		}

		try {
			Class<?> clazz = Class.forName(className);
			ObjectControl obj = (ObjectControl) repository.create(clazz);

			if (parameters.iterator().hasNext()) {
				EolMap<?, ?> values = (EolMap<?, ?>) parameters.iterator().next();
				for (Object key : values.keySet()) {
					String methodName = "set" + WordUtils.capitalize((String) key);
					Object value = values.get(key);
					if (value != null) {
						Reflection.callTyped(obj, methodName, value.getClass(), value);
					}
				}
			}

			if (repository.getTopObjects().contains(className)) {
				toInsert.add(obj);
			}

			return obj;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void load() throws EolModelLoadingException {
	}

	public boolean isLoaded() {
		return repository != null;
	}

	@Override
	public boolean hasType(String type) {
		String className = this.convertFromMetaclassToRepositoryObject(type);
		if (className == null) {
			return false;
		}
		return true;
	}

	@Override
	public Collection<?> getAllOfType(String type) throws EolModelElementTypeNotFoundException {
		String className = this.convertFromMetaclassToRepositoryObject(type);
		if (className == null) {
			throw new EolModelElementTypeNotFoundException(this.name, type);
		}
		try {
			Class<?> clazz = Class.forName(className);
			TopLazyList<?> list = new TopLazyList<>(clazz, repository);
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object getEnumerationValue(String enumeration, String label) throws EolEnumerationValueNotFoundException {
		String className = this.convertFromMetaclassToRepositoryObject(enumeration);
		try {
			Class<? extends Enum> enumClass = (Class<? extends Enum>) Class.forName(className);
			return Enum.valueOf(enumClass, label);
			
		}catch( Exception e) {
			throw new EolEnumerationValueNotFoundException(enumeration, label, this.name);
		}

	}

	
	@Override
	public Collection<?> allContents() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isOfType(Object instance, String metaClass) throws EolModelElementTypeNotFoundException {
		ObjectControl oc = (ObjectControl) instance;
		String className = this.convertFromMetaclassToRepositoryObject(metaClass);

		return className.equals(oc.getProxyClazz().getName());
	}

	@Override
	public boolean isOfKind(Object instance, String metaClass) throws EolModelElementTypeNotFoundException {
		ObjectControl oc = (ObjectControl) instance;
		String className = this.convertFromMetaclassToRepositoryObject(metaClass);
        try {
			Class<?> subClass = Class.forName(className);
			return subClass.isAssignableFrom(oc.getProxyClazz());
		} catch (ClassNotFoundException e) {
			throw new EolModelElementTypeNotFoundException( this.name, metaClass);
		}
	}

	@Override
	public String getTypeNameOf(Object instance) {
		ObjectControl oc = (ObjectControl) instance;
		Class<?> instanceClass = oc.getProxyClazz();
		return this.convertFromRepositoryObjectTosMetaclass(instanceClass.getName());
	}

	@Override
	public Object getElementById(String id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getElementId(Object instance) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<?> getAllOfKind(String type) throws EolModelElementTypeNotFoundException {
		return getAllOfType(type);
	}

	@Override
	public boolean owns(Object instance) {
		if (instance instanceof ObjectControl) {
			String className = ((ObjectControl) instance).getProxyClazz().getName();
			return repository.getInstantiable().contains(className);
		} 
		if ( instance instanceof  LazyList) {
			return true;
		}
		return false;
	}

	@Override
	public IModelTransactionSupport getTransactionSupport() {
		return new IModelTransactionSupport() {

			@Override
			public void startTransaction() {
			}

			@Override
			public void commitTransaction() {
				try {
					repository.getStackProvider().get().commit();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
			}

			@Override
			public void rollbackTransaction() {
				try {
					repository.getStackProvider().get().rallbackCommand();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
			}

		};
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void setElementId(Object instance, String newId) {
	}

	@Override
	public void deleteElement(Object instance) throws EolRuntimeException {

	}

	@Override
	public boolean isInstantiable(String type) {
		String className = this.convertFromMetaclassToRepositoryObject(type);
		return (repository.getInstantiable().contains(className)) && (!this.readOnly);
	}

	@Override
	public boolean store(String location) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean store() {
		if (!readOnly) {
			try {
				for (ObjectControl oc : toInsert) {
					repository.insert(oc, oc.getProxyClazz());
				}
				this.propertySetter.setConveyorMode(false);
				for (PostponedOperation po : conveyor) {
					if (po.containment) {
						this.propertySetter.invoke(po.getTarget(), po.getProperty(), po.getValue(), null);
					}
				}
				for (PostponedOperation po : conveyor) {
					if (!po.containment) {
						this.propertySetter.invoke(po.getTarget(), po.getProperty(), po.getValue(), null);
					}
				}				
				repository.getStackProvider().get().commit();
				
				return true;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return false;
	}

	public CpaRepository getRepository() {
		return repository;
	}

	public void setRepository(CpaRepository repository) {
		this.repository = repository;
	}

	public TypeResolver getTypeResolver() {
		return typeResolver;
	}

	public void setTypeResolver(TypeResolver typeResolver) {
		this.typeResolver = typeResolver;
	}

	@Override
	public IAbstractOperationContributor getAbstractOperationContributor(Object target) {
		if (target instanceof LazyList) {
			return this.operationContributor;
		}
		return null;
	}

	@Override
	public boolean preventLoadingOfExternalModelElements() {
		return false;
	}

	@Override
	public Object getContainerOf(Object object) {
		try {
			return Reflection.call(object, "eContainer");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Collection<String> getPropertiesOf(String type) throws EolModelElementTypeNotFoundException {
		String className = convertFromMetaclassToRepositoryObject(type);
		Class<?> clazz;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new EolModelElementTypeNotFoundException(this.name, type);
		}

		if (clazz == null)
			throw new EolModelElementTypeNotFoundException(this.name, type);

		return getClassProperties(clazz);

	}

	private Collection<String> getClassProperties(Class<?> clazz) {
		final Collection<String> properties = new LinkedList<>();

		for (Method method : clazz.getMethods()) {
			if (method.getName().startsWith("set")) {
				properties.add(StringUtil.firstToLower(method.getName().substring(3)));

			} else if (method.getName().startsWith("is")) {
				properties.add(StringUtil.firstToLower(method.getName().substring(2)));

			} else if (method.getName().startsWith("get")
					&& method.getReturnType().isAssignableFrom(Collection.class)) {
				properties.add(StringUtil.firstToLower(method.getName().substring(3)));
			}
		}

		return properties;
	}

	@Override
	public IReflectivePropertySetter getPropertySetter() {
		return propertySetter;
	}

	@Override
	public boolean hasProperty(String type, String property) throws EolModelElementTypeNotFoundException {
		return getPropertiesOf(type).contains(property);
	}

	@Override
	public boolean isEnumerationValue(Object object) {
		return false;
	}

	@Override
	public String getEnumerationTypeOf(Object literal) throws EolNotAnEnumerationValueException {
		String metaClass = literal.getClass().getName().replace(".", "::");
		return metaClass;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String getEnumerationLabelOf(Object literal) throws EolNotAnEnumerationValueException {
		String value = ((Enum)literal).toString();
		return value;
	}

	@Override
	public boolean hasPackage(String packageName) {
		return false;
	}

}
