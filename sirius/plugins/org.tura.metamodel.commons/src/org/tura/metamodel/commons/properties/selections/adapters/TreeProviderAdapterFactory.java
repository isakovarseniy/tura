/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.properties.selections.adapters;



import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.MappersRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationHashesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationVariablesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DomainArtifactsHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;
import org.tura.metamodel.commons.properties.selections.adapters.helper.GenerationHintsHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

import application.Application;
import application.ApplicationGroup;
import application.ApplicationMapper;
import application.ApplicationMessageLibrary;
import application.ApplicationRealm;
import application.ApplicationRealms;
import application.ApplicationStyle;
import application.ApplicationStyleLibraries;
import application.ApplicationUIPackage;
import artifact.Artifact;
import artifact.ArtifactGroup;
import artifact.ConfigHash;
import artifact.ConfigVariable;
import artifact.GenerationHint;
import artifact.TechLeaf;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.DomainTypesRepository;
import form.ArtificialField;
import form.DataControl;
import form.Form;
import form.FormVariable;
import form.Root;
import form.Window;
import mapper.Mapper;
import message.Message;
import message.MessageLibrary;
import permission.Group;
import permission.Role;
import permission.Roles;
import style.StyleLibrary;
import style.StyleSet;
import type.Attribute;
import type.Operation;
import type.PrimitivesGroup;
import type.TypeElement;
import type.TypeGroup;

public class TreeProviderAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] TYPES = { IWorkbenchAdapter.class,
			IReturnTypeProvider.class };

	private ArtificialFieldProvider artificialFieldProvider;
	private TreeRootProvider treeRootProvider;
	private DataControlHolderProvider dataControlHolderProvider;
	private TreeRootDataControlHolderProvider treeRootDataControlHolder;
	private DataControlProvider dataControlProvider;
	private TriggerProvider triggerProvider;
	private TypeElementProvider typeElementProvider;
	private AttributeProvider attributeProvider;
	private OperationProvider operationProvider;
	private GroupProvider groupProvider;
	private RoleProvider roleProvider;
	private MessageLibraryProvider messageLibraryProvider;
	private MessageProvider messageProvider;
	private DomainArtifactsProvider domainArtifactsProvider;
	private DomainArtifactProvider domainArtifactProvider;
	private ArtifactProvider artifactProvider;
	private GeneratioinHintProvider generatioinHintProvider;
	private DataControlFakeAttributeProvider dataControlFakeAttributeProvider;
	private DataControlFakeMethodProvider dataControlFakeMethodProvider;
	private TreeDataControlProvider treeDataControlProvider;
	private ExtendedTypeProvider extendedTypeProvider;
	private RolesProvider rolesProvider;
	private ApplicationStyleProvider applicationStyleProvider;
	private StyleLibraryProvider styleLibraryProvider;
	private StyleSetProvider styleSetProvider;
	private FormVariableProvider formVariableProvider;
	private FormVariablesProvider formVariablesProvider;
	private DomainApplicationsProvider domainApplicationsProvider;
	private DomainApplicationProvider domainApplicationProvider;
	private ApplicationUIPackageProvider applicationUIPackageProvider;
	private FormProvider formProvider;
	private WindowProvider windowProvider;
	private TechLeafProvider techLeafProvider;
	private ConfigurationHashesHolderProvider configurationHashesHolderProvider;
	private ConfigurationVariablesHolderProvider configurationVariablesHolderProvider;
	private GenerationHintsHolderProvider generationHintsHolderProvider;
	private ConfigurationVariableProvider configVariableProvider;
	private ConfigurationHashProvider configHashProvider;
	private DomainArtifactsHolderProvider domainArtifactsHolderProvider;
	private ArtifactGroupProvider artifactGroupProvider;
	private PrimitivesGroupProvider primitivesGroupProvider;
	private DomainTypesProvider domainTypesProvider;
	private TypeGroupProvider typeGroupProvider;
	private DomainTypesRepositoryProvider domainTypesRepositoryProvider;
	private ApplicationGroupProvider applicationGroupProvider;
	private ApplicationProvider applicationProvider;
	private ApplicationRealmProvider applicationRealmProvider;
	private ApplicationRealmsProvider applicationRealmsProvider;
	private ApplicationStyleLibrariesProvider applicationStyleLibrariesProvider;
	private ApplicationMessageLibraryProvider applicationMessageLibraryProvider;
	private ApplicationMapperProvider applicationMapperProvider;
	private MapperProvider mapperProvider;
	private MapperRootProvider mapperRootProvider;

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Class[] getAdapterList() {
		return TYPES;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class
				|| adapterType == IReturnTypeProvider.class) {
			if (adaptableObject instanceof TreeRoot)
				return getTreeRootProvider();
			if (adaptableObject instanceof DataControlHolder)
				return getDataControlHolderProvider();
			if (adaptableObject instanceof TreeRootDataControlHolder)
				return getTreeRootDataControlHolderProvider();
			if (adaptableObject instanceof DataControl)
				return getDataControlProvider();
			if (adaptableObject instanceof TriggerHolder)
				return getTriggerProvider();
			if (adaptableObject instanceof TypeElement)
				return getTypeElementProvider();
			if (adaptableObject instanceof Attribute)
				return getAttributeProvider();
			if (adaptableObject instanceof Operation)
				return getOperationProvider();
			if (adaptableObject instanceof Group)
				return getGroupProvider();
			if (adaptableObject instanceof Role)
				return getRoleProvider();
			if (adaptableObject instanceof Message)
				return getMessageProvider();
			if (adaptableObject instanceof MessageLibrary)
				return getMessageLibraryProvider();
			if (adaptableObject instanceof DomainArtifacts)
				return getDomainArtifactsProvider();
			if (adaptableObject instanceof DomainArtifact)
				return getDomainArtifactProvider();
			if (adaptableObject instanceof Artifact)
				return getArtifactProvider();
			if (adaptableObject instanceof GenerationHint)
				return getGeneratioinHintProvider();
			if (adaptableObject instanceof DataControlFakeAttribute)
				return getDataControlFakeAttributeProvider();
			if (adaptableObject instanceof DataControlFakeMethod)
				return getDataControlFakeMethodProvider();
			if (adaptableObject instanceof TreeDataControl)
				return getTreeDataControlProvider();
			if (adaptableObject instanceof ExtendedType)
				return getExtendedTypeProvider();
			if (adaptableObject instanceof ArtificialField)
				return getArtificialFieldProvider();
			if (adaptableObject instanceof Roles)
				return getRolesProvider();
			if (adaptableObject instanceof ApplicationStyle)
				return getApplicationStyleProvider();
			if (adaptableObject instanceof StyleLibrary)
				return getStyleLibraryProvider();
			if (adaptableObject instanceof StyleSet)
				return getStyleSetProvider();
			if (adaptableObject instanceof Root)
				return getFormVariablesProvider();
			if (adaptableObject instanceof FormVariable)
				return getFormVariableProvider();
			if (adaptableObject instanceof DomainApplications)
				return getDomainApplicationsProvider();
			if (adaptableObject instanceof DomainApplication)
				return getDomainApplicationProvider();
			if (adaptableObject instanceof Form)
				return getFormProvider();
			if (adaptableObject instanceof ApplicationUIPackage)
				return getApplicationUIPackageProvider();
			if (adaptableObject instanceof Window)
				return getWindowProvider();
			if (adaptableObject instanceof TechLeaf)
				return getTechLeafProvider();
			if (adaptableObject instanceof ConfigurationHashesHolder)
				return getConfigurationHashesHolderProvider();
			if (adaptableObject instanceof ConfigurationVariablesHolder)
				return getConfigurationVariablesHolderProvider();
			if (adaptableObject instanceof GenerationHintsHolder)
				return getGenerationHintsHolderProvider();
			if (adaptableObject instanceof ConfigVariable)
				return getConfigVariableProvider();
			if (adaptableObject instanceof ConfigHash)
				return getConfigHashProvider();
			if (adaptableObject instanceof DomainArtifactsHolder)
				return getDomainArtifactsHolderProvider();
			if (adaptableObject instanceof ArtifactGroup)
				return getArtifactGroupProvider();
			if (adaptableObject instanceof PrimitivesGroup)
				return getPrimitivesGroupProvider();
			if (adaptableObject instanceof DomainTypes)
				return getDomainTypesProvider();
			if (adaptableObject instanceof TypeGroup)
				return getTypeGroupProvider();
			if (adaptableObject instanceof DomainTypesRepository)
				return getDomainTypesRepositoryProvider();
			if (adaptableObject instanceof ApplicationGroup)
				return getApplicationGroupProvider();
			if (adaptableObject instanceof Application)
				return getApplicationProvider();
			if (adaptableObject instanceof ApplicationRealm)
				return getApplicationRealmProvider();
			if (adaptableObject instanceof ApplicationRealms)
				return getApplicationRealmsProvider();
			if (adaptableObject instanceof ApplicationStyleLibraries)
				return getApplicationStyleLibrariesProvider();
			if (adaptableObject instanceof ApplicationMessageLibrary)
				return getApplicationMessageLibraryProvider();
			if (adaptableObject instanceof ApplicationMapper)
				return getApplicationMapperProvider();
			if (adaptableObject instanceof Mapper)
				return getMapperProvider();
			if (adaptableObject instanceof MappersRoot)
				return getMapperRootProvider();

		
					
		
		}
		return null;
	}

	protected WindowProvider getWindowProvider() {
		if (windowProvider == null)
			windowProvider = new WindowProvider();
		return windowProvider;
	}
	
	protected TreeDataControlProvider getTreeDataControlProvider() {
		if (treeDataControlProvider == null)
			treeDataControlProvider = new TreeDataControlProvider();
		return treeDataControlProvider;
	}

	protected DataControlFakeAttributeProvider getDataControlFakeAttributeProvider() {
		if (dataControlFakeAttributeProvider == null)
			dataControlFakeAttributeProvider = new DataControlFakeAttributeProvider();
		return dataControlFakeAttributeProvider;
	}

	protected DataControlFakeMethodProvider getDataControlFakeMethodProvider() {
		if (dataControlFakeMethodProvider == null)
			dataControlFakeMethodProvider = new DataControlFakeMethodProvider();
		return dataControlFakeMethodProvider;
	}

	protected DomainArtifactsProvider getDomainArtifactsProvider() {
		if (domainArtifactsProvider == null)
			domainArtifactsProvider = new DomainArtifactsProvider();
		return domainArtifactsProvider;
	}

	protected DomainArtifactProvider getDomainArtifactProvider() {
		if (domainArtifactProvider == null)
			domainArtifactProvider = new DomainArtifactProvider();
		return domainArtifactProvider;
	}

	protected ArtifactProvider getArtifactProvider() {
		if (artifactProvider == null)
			artifactProvider = new ArtifactProvider();
		return artifactProvider;
	}

	protected GeneratioinHintProvider getGeneratioinHintProvider() {
		if (generatioinHintProvider == null)
			generatioinHintProvider = new GeneratioinHintProvider();
		return generatioinHintProvider;
	}

	protected TreeRootProvider getTreeRootProvider() {
		if (treeRootProvider == null)
			treeRootProvider = new TreeRootProvider();
		return treeRootProvider;
	}

	protected DataControlHolderProvider getDataControlHolderProvider() {
		if (dataControlHolderProvider == null)
			dataControlHolderProvider = new DataControlHolderProvider();
		return dataControlHolderProvider;
	}

	protected TreeRootDataControlHolderProvider getTreeRootDataControlHolderProvider() {
		if (treeRootDataControlHolder == null)
			treeRootDataControlHolder = new TreeRootDataControlHolderProvider();
		return treeRootDataControlHolder;
	}

	protected DataControlProvider getDataControlProvider() {
		if (dataControlProvider == null)
			dataControlProvider = new DataControlProvider();
		return dataControlProvider;
	}

	protected TriggerProvider getTriggerProvider() {
		if (triggerProvider == null)
			triggerProvider = new TriggerProvider();
		return triggerProvider;
	}

	protected TypeElementProvider getTypeElementProvider() {
		if (typeElementProvider == null)
			typeElementProvider = new TypeElementProvider();
		return typeElementProvider;
	}

	protected AttributeProvider getAttributeProvider() {
		if (attributeProvider == null)
			attributeProvider = new AttributeProvider();
		return attributeProvider;
	}

	protected OperationProvider getOperationProvider() {
		if (operationProvider == null)
			operationProvider = new OperationProvider();
		return operationProvider;
	}


	protected GroupProvider getGroupProvider() {
		if (groupProvider == null)
			groupProvider = new GroupProvider();
		return groupProvider;
	}

	protected RoleProvider getRoleProvider() {
		if (roleProvider == null)
			roleProvider = new RoleProvider();
		return roleProvider;
	}

	protected MessageProvider getMessageProvider() {
		if (messageProvider == null)
			messageProvider = new MessageProvider();
		return messageProvider;
	}


	protected MessageLibraryProvider getMessageLibraryProvider() {
		if (messageLibraryProvider == null)
			messageLibraryProvider = new MessageLibraryProvider();
		return messageLibraryProvider;
	}

	protected ExtendedTypeProvider getExtendedTypeProvider() {
		if (extendedTypeProvider == null)
			extendedTypeProvider = new ExtendedTypeProvider();
		return extendedTypeProvider;
	}

	protected ArtificialFieldProvider getArtificialFieldProvider() {
		if (artificialFieldProvider == null)
			artificialFieldProvider = new ArtificialFieldProvider();
		return artificialFieldProvider;
	}

	protected RolesProvider getRolesProvider() {
		if (rolesProvider == null)
			rolesProvider = new RolesProvider();
		return rolesProvider;
	}

	protected ApplicationStyleProvider getApplicationStyleProvider(){
		if (applicationStyleProvider == null)
			applicationStyleProvider = new ApplicationStyleProvider();
		return applicationStyleProvider;		
	}
	
	protected StyleLibraryProvider getStyleLibraryProvider(){
		if (styleLibraryProvider == null)
			styleLibraryProvider = new StyleLibraryProvider();
		return styleLibraryProvider;		
	}
	
	protected StyleSetProvider getStyleSetProvider(){
		if (styleSetProvider == null)
			styleSetProvider = new StyleSetProvider();
		return styleSetProvider;		
	}
	
	protected FormVariablesProvider getFormVariablesProvider(){
		if (formVariablesProvider == null)
			formVariablesProvider = new FormVariablesProvider();
		return formVariablesProvider;		
	}
	
	protected FormVariableProvider getFormVariableProvider(){
		if (formVariableProvider == null)
			formVariableProvider = new FormVariableProvider();
		return formVariableProvider;		
	}
	
	protected DomainApplicationsProvider getDomainApplicationsProvider(){
		if (domainApplicationsProvider == null)
			domainApplicationsProvider = new DomainApplicationsProvider();
		return domainApplicationsProvider;		
	}
	protected DomainApplicationProvider getDomainApplicationProvider(){
		if (domainApplicationProvider == null)
			domainApplicationProvider = new DomainApplicationProvider();
		return domainApplicationProvider;		
	}
	protected FormProvider getFormProvider(){
		if (formProvider == null)
			formProvider = new FormProvider();
		return formProvider;		
	}
	protected ApplicationUIPackageProvider getApplicationUIPackageProvider(){
		if (applicationUIPackageProvider == null)
			applicationUIPackageProvider = new ApplicationUIPackageProvider();
		return applicationUIPackageProvider;		
	}
	protected TechLeafProvider getTechLeafProvider(){
		if (techLeafProvider == null)
			techLeafProvider = new TechLeafProvider();
		return techLeafProvider;		
	}
	
	protected ConfigurationHashesHolderProvider getConfigurationHashesHolderProvider(){
		if (configurationHashesHolderProvider == null)
			configurationHashesHolderProvider = new ConfigurationHashesHolderProvider();
		return configurationHashesHolderProvider;		
	}
	protected ConfigurationVariablesHolderProvider getConfigurationVariablesHolderProvider(){
		if (configurationVariablesHolderProvider == null)
			configurationVariablesHolderProvider = new ConfigurationVariablesHolderProvider();
		return configurationVariablesHolderProvider;		
	}
	protected GenerationHintsHolderProvider getGenerationHintsHolderProvider(){
		if (generationHintsHolderProvider == null)
			generationHintsHolderProvider = new GenerationHintsHolderProvider();
		return generationHintsHolderProvider;		
	}
	protected ConfigurationVariableProvider getConfigVariableProvider(){
		if (configVariableProvider == null)
			configVariableProvider = new ConfigurationVariableProvider();
		return configVariableProvider;		
	}
	protected ConfigurationHashProvider getConfigHashProvider(){
		if (configHashProvider == null)
			configHashProvider = new ConfigurationHashProvider();
		return configHashProvider;		
	}
	
	protected DomainArtifactsHolderProvider getDomainArtifactsHolderProvider(){
		if (domainArtifactsHolderProvider == null)
			domainArtifactsHolderProvider = new DomainArtifactsHolderProvider();
		return domainArtifactsHolderProvider;		
	}
	
	protected ArtifactGroupProvider getArtifactGroupProvider(){
		if (artifactGroupProvider == null)
			artifactGroupProvider = new ArtifactGroupProvider();
		return artifactGroupProvider;		
	}
	
	protected PrimitivesGroupProvider getPrimitivesGroupProvider(){
		if (primitivesGroupProvider == null)
			primitivesGroupProvider = new PrimitivesGroupProvider();
		return primitivesGroupProvider;		
	}
	
	protected DomainTypesProvider getDomainTypesProvider(){
		if (domainTypesProvider == null)
			domainTypesProvider = new DomainTypesProvider();
		return domainTypesProvider;		
	}
	
	protected TypeGroupProvider getTypeGroupProvider(){
		if (typeGroupProvider == null)
			typeGroupProvider = new TypeGroupProvider();
		return typeGroupProvider;		
	}
		
	protected DomainTypesRepositoryProvider getDomainTypesRepositoryProvider(){
		if (domainTypesRepositoryProvider == null)
			domainTypesRepositoryProvider = new DomainTypesRepositoryProvider();
		return domainTypesRepositoryProvider;		
	}


	protected ApplicationGroupProvider getApplicationGroupProvider(){
		if (applicationGroupProvider == null)
			applicationGroupProvider = new ApplicationGroupProvider();
		return applicationGroupProvider;		
	}

	protected ApplicationProvider getApplicationProvider(){
		if (applicationProvider == null)
			applicationProvider = new ApplicationProvider();
		return applicationProvider;		
	}
	
	protected ApplicationRealmProvider getApplicationRealmProvider(){
		if (applicationRealmProvider == null)
			applicationRealmProvider = new ApplicationRealmProvider();
		return applicationRealmProvider;		
	}
	
	protected ApplicationRealmsProvider getApplicationRealmsProvider(){
		if (applicationRealmsProvider == null)
			applicationRealmsProvider = new ApplicationRealmsProvider();
		return applicationRealmsProvider;		
	}


	protected ApplicationStyleLibrariesProvider getApplicationStyleLibrariesProvider(){
		if (applicationStyleLibrariesProvider == null)
			applicationStyleLibrariesProvider = new ApplicationStyleLibrariesProvider();
		return applicationStyleLibrariesProvider;		
	}

	protected ApplicationMessageLibraryProvider getApplicationMessageLibraryProvider(){
		if (applicationMessageLibraryProvider == null)
			applicationMessageLibraryProvider = new ApplicationMessageLibraryProvider();
		return applicationMessageLibraryProvider;		
	}
	
	
	protected ApplicationMapperProvider getApplicationMapperProvider(){
		if (applicationMapperProvider == null)
			applicationMapperProvider = new ApplicationMapperProvider();
		return applicationMapperProvider;		
	}
	

	protected MapperProvider getMapperProvider(){
		if (mapperProvider == null)
			mapperProvider = new MapperProvider();
		return mapperProvider;		
	}
	
	
	protected MapperRootProvider getMapperRootProvider(){
		if (mapperRootProvider == null)
			mapperRootProvider = new MapperRootProvider();
		return mapperRootProvider;		
	}

}
