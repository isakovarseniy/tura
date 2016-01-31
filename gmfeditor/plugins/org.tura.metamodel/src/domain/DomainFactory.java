/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>HTML Layer Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Layer Holder</em>'.
	 * @generated
	 */
	HTMLLayerHolder createHTMLLayerHolder();

	/**
	 * Returns a new object of class '<em>Categorized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorized</em>'.
	 * @generated
	 */
	Categorized createCategorized();

	/**
	 * Returns a new object of class '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier</em>'.
	 * @generated
	 */
	Classifier createClassifier();

	/**
	 * Returns a new object of class '<em>Secured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secured</em>'.
	 * @generated
	 */
	Secured createSecured();

	/**
	 * Returns a new object of class '<em>Grant Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grant Access</em>'.
	 * @generated
	 */
	GrantAccess createGrantAccess();

	/**
	 * Returns a new object of class '<em>Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifacts</em>'.
	 * @generated
	 */
	DomainArtifacts createDomainArtifacts();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	DomainTypes createDomainTypes();

	/**
	 * Returns a new object of class '<em>Applications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Applications</em>'.
	 * @generated
	 */
	DomainApplications createDomainApplications();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	DomainApplication createDomainApplication();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	DomainArtifact createDomainArtifact();

	/**
	 * Returns a new object of class '<em>ORM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ORM Entity</em>'.
	 * @generated
	 */
	ORMEntity createORMEntity();

	/**
	 * Returns a new object of class '<em>JPA Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPA Service</em>'.
	 * @generated
	 */
	JPAService createJPAService();

	/**
	 * Returns a new object of class '<em>EJB Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJB Service</em>'.
	 * @generated
	 */
	EJBService createEJBService();

	/**
	 * Returns a new object of class '<em>Continuous Iintegration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Iintegration</em>'.
	 * @generated
	 */
	ContinuousIintegration createContinuousIintegration();

	/**
	 * Returns a new object of class '<em>Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifacts</em>'.
	 * @generated
	 */
	Artifacts createArtifacts();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Generation Hint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Hint</em>'.
	 * @generated
	 */
	GenerationHint createGenerationHint();

	/**
	 * Returns a new object of class '<em>Config Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Variable</em>'.
	 * @generated
	 */
	ConfigVariable createConfigVariable();

	/**
	 * Returns a new object of class '<em>Model Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Query</em>'.
	 * @generated
	 */
	ModelQuery createModelQuery();

	/**
	 * Returns a new object of class '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter</em>'.
	 * @generated
	 */
	QueryParameter createQueryParameter();

	/**
	 * Returns a new object of class '<em>Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specifier</em>'.
	 * @generated
	 */
	Specifier createSpecifier();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Application Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Messages</em>'.
	 * @generated
	 */
	ApplicationMessages createApplicationMessages();

	/**
	 * Returns a new object of class '<em>Application Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Role</em>'.
	 * @generated
	 */
	ApplicationRole createApplicationRole();

	/**
	 * Returns a new object of class '<em>Application Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Style</em>'.
	 * @generated
	 */
	ApplicationStyle createApplicationStyle();

	/**
	 * Returns a new object of class '<em>Styles Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styles Package</em>'.
	 * @generated
	 */
	StylesPackage createStylesPackage();

	/**
	 * Returns a new object of class '<em>Application UI Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application UI Layer</em>'.
	 * @generated
	 */
	ApplicationUILayer createApplicationUILayer();

	/**
	 * Returns a new object of class '<em>Application UI Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application UI Package</em>'.
	 * @generated
	 */
	ApplicationUIPackage createApplicationUIPackage();

	/**
	 * Returns a new object of class '<em>Application Recipes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Recipes</em>'.
	 * @generated
	 */
	ApplicationRecipes createApplicationRecipes();

	/**
	 * Returns a new object of class '<em>Application Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Recipe</em>'.
	 * @generated
	 */
	ApplicationRecipe createApplicationRecipe();

	/**
	 * Returns a new object of class '<em>Application Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Mappers</em>'.
	 * @generated
	 */
	ApplicationMappers createApplicationMappers();

	/**
	 * Returns a new object of class '<em>Application Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Mapper</em>'.
	 * @generated
	 */
	ApplicationMapper createApplicationMapper();

	/**
	 * Returns a new object of class '<em>Method Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Pointer</em>'.
	 * @generated
	 */
	MethodPointer createMethodPointer();

	/**
	 * Returns a new object of class '<em>Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messages</em>'.
	 * @generated
	 */
	Messages createMessages();

	/**
	 * Returns a new object of class '<em>Message Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Library</em>'.
	 * @generated
	 */
	MessageLibrary createMessageLibrary();

	/**
	 * Returns a new object of class '<em>Language Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Ref</em>'.
	 * @generated
	 */
	LanguageRef createLanguageRef();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation</em>'.
	 * @generated
	 */
	Translation createTranslation();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roles</em>'.
	 * @generated
	 */
	Roles createRoles();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Styles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styles</em>'.
	 * @generated
	 */
	Styles createStyles();

	/**
	 * Returns a new object of class '<em>Style Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Library</em>'.
	 * @generated
	 */
	StyleLibrary createStyleLibrary();

	/**
	 * Returns a new object of class '<em>Style Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Set</em>'.
	 * @generated
	 */
	StyleSet createStyleSet();

	/**
	 * Returns a new object of class '<em>Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mappers</em>'.
	 * @generated
	 */
	Mappers createMappers();

	/**
	 * Returns a new object of class '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapper</em>'.
	 * @generated
	 */
	Mapper createMapper();

	/**
	 * Returns a new object of class '<em>Type Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Mapper</em>'.
	 * @generated
	 */
	TypeMapper createTypeMapper();

	/**
	 * Returns a new object of class '<em>Java Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Mapper</em>'.
	 * @generated
	 */
	JavaMapper createJavaMapper();

	/**
	 * Returns a new object of class '<em>Java Script Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Mapper</em>'.
	 * @generated
	 */
	JavaScriptMapper createJavaScriptMapper();

	/**
	 * Returns a new object of class '<em>CSS Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSS Mapper</em>'.
	 * @generated
	 */
	CSSMapper createCSSMapper();

	/**
	 * Returns a new object of class '<em>Role Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mapper</em>'.
	 * @generated
	 */
	RoleMapper createRoleMapper();

	/**
	 * Returns a new object of class '<em>Recipes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipes</em>'.
	 * @generated
	 */
	Recipes createRecipes();

	/**
	 * Returns a new object of class '<em>Deployment Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Sequence</em>'.
	 * @generated
	 */
	DeploymentSequence createDeploymentSequence();

	/**
	 * Returns a new object of class '<em>Deployment Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Components</em>'.
	 * @generated
	 */
	DeploymentComponents createDeploymentComponents();

	/**
	 * Returns a new object of class '<em>Deployment Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Component</em>'.
	 * @generated
	 */
	DeploymentComponent createDeploymentComponent();

	/**
	 * Returns a new object of class '<em>Deployment Star Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Star Step</em>'.
	 * @generated
	 */
	DeploymentStarStep createDeploymentStarStep();

	/**
	 * Returns a new object of class '<em>Using Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Using Mappers</em>'.
	 * @generated
	 */
	UsingMappers createUsingMappers();

	/**
	 * Returns a new object of class '<em>Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe</em>'.
	 * @generated
	 */
	Recipe createRecipe();

	/**
	 * Returns a new object of class '<em>Config Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Extension</em>'.
	 * @generated
	 */
	ConfigExtension createConfigExtension();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Java Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Component</em>'.
	 * @generated
	 */
	JavaComponent createJavaComponent();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Model Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Mapper</em>'.
	 * @generated
	 */
	ModelMapper createModelMapper();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Mapping Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Specifier</em>'.
	 * @generated
	 */
	MappingSpecifier createMappingSpecifier();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Query Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Variable</em>'.
	 * @generated
	 */
	QueryVariable createQueryVariable();

	/**
	 * Returns a new object of class '<em>Artifact Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Ref</em>'.
	 * @generated
	 */
	ArtifactRef createArtifactRef();

	/**
	 * Returns a new object of class '<em>Type Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Pointer</em>'.
	 * @generated
	 */
	TypePointer createTypePointer();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns a new object of class '<em>Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Element</em>'.
	 * @generated
	 */
	TypeElement createTypeElement();

	/**
	 * Returns a new object of class '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive</em>'.
	 * @generated
	 */
	Primitive createPrimitive();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Reference</em>'.
	 * @generated
	 */
	TypeReference createTypeReference();

	/**
	 * Returns a new object of class '<em>Type Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Extension</em>'.
	 * @generated
	 */
	TypeExtension createTypeExtension();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Value</em>'.
	 * @generated
	 */
	ReturnValue createReturnValue();

	/**
	 * Returns a new object of class '<em>Enumarator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumarator</em>'.
	 * @generated
	 */
	Enumarator createEnumarator();

	/**
	 * Returns a new object of class '<em>Enum Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Attribute</em>'.
	 * @generated
	 */
	EnumAttribute createEnumAttribute();

	/**
	 * Returns a new object of class '<em>Types Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Repository</em>'.
	 * @generated
	 */
	TypesRepository createTypesRepository();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	Types createTypes();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>UI Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Package</em>'.
	 * @generated
	 */
	UIPackage createUIPackage();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Form Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Parameter</em>'.
	 * @generated
	 */
	FormParameter createFormParameter();

	/**
	 * Returns a new object of class '<em>Form View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form View</em>'.
	 * @generated
	 */
	FormView createFormView();

	/**
	 * Returns a new object of class '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Views</em>'.
	 * @generated
	 */
	Views createViews();

	/**
	 * Returns a new object of class '<em>Orderable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orderable</em>'.
	 * @generated
	 */
	Orderable createOrderable();

	/**
	 * Returns a new object of class '<em>Multi Lang Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Lang Label</em>'.
	 * @generated
	 */
	MultiLangLabel createMultiLangLabel();

	/**
	 * Returns a new object of class '<em>Canvas Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas Frame</em>'.
	 * @generated
	 */
	CanvasFrame createCanvasFrame();

	/**
	 * Returns a new object of class '<em>View Port Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port Holder</em>'.
	 * @generated
	 */
	ViewPortHolder createViewPortHolder();

	/**
	 * Returns a new object of class '<em>Default Cavas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Cavas</em>'.
	 * @generated
	 */
	DefaultCavas createDefaultCavas();

	/**
	 * Returns a new object of class '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Element</em>'.
	 * @generated
	 */
	ViewElement createViewElement();

	/**
	 * Returns a new object of class '<em>Popup Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Popup Canvas</em>'.
	 * @generated
	 */
	PopupCanvas createPopupCanvas();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Menu Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Definition</em>'.
	 * @generated
	 */
	MenuDefinition createMenuDefinition();

	/**
	 * Returns a new object of class '<em>Tab Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Canvas</em>'.
	 * @generated
	 */
	TabCanvas createTabCanvas();

	/**
	 * Returns a new object of class '<em>Tab Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Page</em>'.
	 * @generated
	 */
	TabPage createTabPage();

	/**
	 * Returns a new object of class '<em>View Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port</em>'.
	 * @generated
	 */
	ViewPort createViewPort();

	/**
	 * Returns a new object of class '<em>View Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Area</em>'.
	 * @generated
	 */
	ViewArea createViewArea();

	/**
	 * Returns a new object of class '<em>View Port Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port Trigger</em>'.
	 * @generated
	 */
	ViewPortTrigger createViewPortTrigger();

	/**
	 * Returns a new object of class '<em>View Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Inheritance</em>'.
	 * @generated
	 */
	ViewInheritance createViewInheritance();

	/**
	 * Returns a new object of class '<em>Tab Pages Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Pages Inheritance</em>'.
	 * @generated
	 */
	TabPagesInheritance createTabPagesInheritance();

	/**
	 * Returns a new object of class '<em>Form Data Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Data Controls</em>'.
	 * @generated
	 */
	FormDataControls createFormDataControls();

	/**
	 * Returns a new object of class '<em>Canvas View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas View</em>'.
	 * @generated
	 */
	CanvasView createCanvasView();

	/**
	 * Returns a new object of class '<em>Link To Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link To Message</em>'.
	 * @generated
	 */
	LinkToMessage createLinkToMessage();

	/**
	 * Returns a new object of class '<em>Link To Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link To Label</em>'.
	 * @generated
	 */
	LinkToLabel createLinkToLabel();

	/**
	 * Returns a new object of class '<em>Children Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Holder</em>'.
	 * @generated
	 */
	ChildrenHolder createChildrenHolder();

	/**
	 * Returns a new object of class '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameter</em>'.
	 * @generated
	 */
	ContextParameter createContextParameter();

	/**
	 * Returns a new object of class '<em>Context Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Value</em>'.
	 * @generated
	 */
	ContextValue createContextValue();

	/**
	 * Returns a new object of class '<em>Expression Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Part</em>'.
	 * @generated
	 */
	ExpressionPart createExpressionPart();

	/**
	 * Returns a new object of class '<em>Context Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameters</em>'.
	 * @generated
	 */
	ContextParameters createContextParameters();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Style Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Element</em>'.
	 * @generated
	 */
	StyleElement createStyleElement();

	/**
	 * Returns a new object of class '<em>Style Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Class</em>'.
	 * @generated
	 */
	StyleClass createStyleClass();

	/**
	 * Returns a new object of class '<em>Nick Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nick Named</em>'.
	 * @generated
	 */
	NickNamed createNickNamed();

	/**
	 * Returns a new object of class '<em>Flex Fields</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flex Fields</em>'.
	 * @generated
	 */
	FlexFields createFlexFields();

	/**
	 * Returns a new object of class '<em>Flex Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flex Field</em>'.
	 * @generated
	 */
	FlexField createFlexField();

	/**
	 * Returns a new object of class '<em>Enabled UI Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabled UI Item</em>'.
	 * @generated
	 */
	EnabledUIItem createEnabledUIItem();

	/**
	 * Returns a new object of class '<em>Uielement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uielement</em>'.
	 * @generated
	 */
	Uielement createUielement();

	/**
	 * Returns a new object of class '<em>Item Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Icon</em>'.
	 * @generated
	 */
	ItemIcon createItemIcon();

	/**
	 * Returns a new object of class '<em>Area Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Ref</em>'.
	 * @generated
	 */
	AreaRef createAreaRef();

	/**
	 * Returns a new object of class '<em>Formatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formatable</em>'.
	 * @generated
	 */
	Formatable createFormatable();

	/**
	 * Returns a new object of class '<em>Sources Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sources Pointer</em>'.
	 * @generated
	 */
	SourcesPointer createSourcesPointer();

	/**
	 * Returns a new object of class '<em>Input Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Element</em>'.
	 * @generated
	 */
	InputElement createInputElement();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Option Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Selection</em>'.
	 * @generated
	 */
	OptionSelection createOptionSelection();

	/**
	 * Returns a new object of class '<em>Layer Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Holder</em>'.
	 * @generated
	 */
	LayerHolder createLayerHolder();

	/**
	 * Returns a new object of class '<em>Input Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Text</em>'.
	 * @generated
	 */
	InputText createInputText();

	/**
	 * Returns a new object of class '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password</em>'.
	 * @generated
	 */
	Password createPassword();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Message Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Element</em>'.
	 * @generated
	 */
	MessageElement createMessageElement();

	/**
	 * Returns a new object of class '<em>Output Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Text</em>'.
	 * @generated
	 */
	OutputText createOutputText();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Drop Down Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Down Selection</em>'.
	 * @generated
	 */
	DropDownSelection createDropDownSelection();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controls</em>'.
	 * @generated
	 */
	Controls createControls();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>PRE Form Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Form Trigger</em>'.
	 * @generated
	 */
	PREFormTrigger createPREFormTrigger();

	/**
	 * Returns a new object of class '<em>PRE Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Query Trigger</em>'.
	 * @generated
	 */
	PREQueryTrigger createPREQueryTrigger();

	/**
	 * Returns a new object of class '<em>POST Query Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POST Query Trigger</em>'.
	 * @generated
	 */
	POSTQueryTrigger createPOSTQueryTrigger();

	/**
	 * Returns a new object of class '<em>PRE Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Insert Trigger</em>'.
	 * @generated
	 */
	PREInsertTrigger createPREInsertTrigger();

	/**
	 * Returns a new object of class '<em>PRE Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Delete Trigger</em>'.
	 * @generated
	 */
	PREDeleteTrigger createPREDeleteTrigger();

	/**
	 * Returns a new object of class '<em>POST Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POST Create Trigger</em>'.
	 * @generated
	 */
	POSTCreateTrigger createPOSTCreateTrigger();

	/**
	 * Returns a new object of class '<em>PRE Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRE Update Trigger</em>'.
	 * @generated
	 */
	PREUpdateTrigger createPREUpdateTrigger();

	/**
	 * Returns a new object of class '<em>Create Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Trigger</em>'.
	 * @generated
	 */
	CreateTrigger createCreateTrigger();

	/**
	 * Returns a new object of class '<em>Insert Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Trigger</em>'.
	 * @generated
	 */
	InsertTrigger createInsertTrigger();

	/**
	 * Returns a new object of class '<em>Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Trigger</em>'.
	 * @generated
	 */
	UpdateTrigger createUpdateTrigger();

	/**
	 * Returns a new object of class '<em>Delete Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Trigger</em>'.
	 * @generated
	 */
	DeleteTrigger createDeleteTrigger();

	/**
	 * Returns a new object of class '<em>Search Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Trigger</em>'.
	 * @generated
	 */
	SearchTrigger createSearchTrigger();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Form Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Variable</em>'.
	 * @generated
	 */
	FormVariable createFormVariable();

	/**
	 * Returns a new object of class '<em>Data Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Control</em>'.
	 * @generated
	 */
	DataControl createDataControl();

	/**
	 * Returns a new object of class '<em>Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orders</em>'.
	 * @generated
	 */
	Orders createOrders();

	/**
	 * Returns a new object of class '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By</em>'.
	 * @generated
	 */
	OrderBy createOrderBy();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Artificial Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artificial Field</em>'.
	 * @generated
	 */
	ArtificialField createArtificialField();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Application Infrastructure Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Infrastructure Layer</em>'.
	 * @generated
	 */
	ApplicationInfrastructureLayer createApplicationInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Enterprise Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Infrastructure</em>'.
	 * @generated
	 */
	EnterpriseInfrastructure createEnterpriseInfrastructure();

	/**
	 * Returns a new object of class '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenter</em>'.
	 * @generated
	 */
	Datacenter createDatacenter();

	/**
	 * Returns a new object of class '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsystem</em>'.
	 * @generated
	 */
	Subsystem createSubsystem();

	/**
	 * Returns a new object of class '<em>Infrastructure Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Layer</em>'.
	 * @generated
	 */
	InfrastructureLayer createInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Infrastructure Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Connection</em>'.
	 * @generated
	 */
	InfrastructureConnection createInfrastructureConnection();

	/**
	 * Returns a new object of class '<em>Infrastructure Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Component</em>'.
	 * @generated
	 */
	InfrastructureComponent createInfrastructureComponent();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router</em>'.
	 * @generated
	 */
	Router createRouter();

	/**
	 * Returns a new object of class '<em>Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hub</em>'.
	 * @generated
	 */
	Hub createHub();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Server Claster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Claster</em>'.
	 * @generated
	 */
	ServerClaster createServerClaster();

	/**
	 * Returns a new object of class '<em>Menu View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu View</em>'.
	 * @generated
	 */
	MenuView createMenuView();

	/**
	 * Returns a new object of class '<em>Menu Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Holder</em>'.
	 * @generated
	 */
	MenuHolder createMenuHolder();

	/**
	 * Returns a new object of class '<em>Menu Extension Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Extension Ref</em>'.
	 * @generated
	 */
	MenuExtensionRef createMenuExtensionRef();

	/**
	 * Returns a new object of class '<em>Menu Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Element</em>'.
	 * @generated
	 */
	MenuElement createMenuElement();

	/**
	 * Returns a new object of class '<em>Menu Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Folder</em>'.
	 * @generated
	 */
	MenuFolder createMenuFolder();

	/**
	 * Returns a new object of class '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item</em>'.
	 * @generated
	 */
	MenuItem createMenuItem();

	/**
	 * Returns a new object of class '<em>Menu Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Extension Point</em>'.
	 * @generated
	 */
	MenuExtensionPoint createMenuExtensionPoint();

	/**
	 * Returns a new object of class '<em>Sub Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Menu</em>'.
	 * @generated
	 */
	SubMenu createSubMenu();

	/**
	 * Returns a new object of class '<em>Menu Separator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Separator</em>'.
	 * @generated
	 */
	MenuSeparator createMenuSeparator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
