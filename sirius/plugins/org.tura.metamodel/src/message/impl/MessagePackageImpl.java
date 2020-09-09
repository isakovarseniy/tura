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

/**
 */
package message.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.ArtifactPackage;

import artifact.impl.ArtifactPackageImpl;

import common.CommonPackage;

import common.impl.CommonPackageImpl;

import domain.DomainPackage;

import domain.impl.DomainPackageImpl;

import form.FormPackage;

import form.impl.FormPackageImpl;

import infrastructure.InfrastructurePackage;

import infrastructure.impl.InfrastructurePackageImpl;

import mapper.MapperPackage;

import mapper.impl.MapperPackageImpl;

import message.Language;
import message.Message;
import message.MessageFactory;
import message.MessageLibrary;
import message.MessagePackage;
import message.Translation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.PermissionPackage;

import permission.impl.PermissionPackageImpl;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

import style.StylePackage;

import style.impl.StylePackageImpl;

import type.TypePackage;

import type.impl.TypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagePackageImpl extends EPackageImpl implements MessagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see message.MessagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MessagePackageImpl() {
		super(eNS_URI, MessageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MessagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MessagePackage init() {
		if (isInited) return (MessagePackage)EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMessagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MessagePackageImpl theMessagePackage = registeredMessagePackage instanceof MessagePackageImpl ? (MessagePackageImpl)registeredMessagePackage : new MessagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(registeredPackage instanceof ArtifactPackageImpl ? registeredPackage : ArtifactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		TypePackageImpl theTypePackage = (TypePackageImpl)(registeredPackage instanceof TypePackageImpl ? registeredPackage : TypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(registeredPackage instanceof PermissionPackageImpl ? registeredPackage : PermissionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		StylePackageImpl theStylePackage = (StylePackageImpl)(registeredPackage instanceof StylePackageImpl ? registeredPackage : StylePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(registeredPackage instanceof RecipePackageImpl ? registeredPackage : RecipePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(registeredPackage instanceof MapperPackageImpl ? registeredPackage : MapperPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theMessagePackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theMapperPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theMessagePackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theMapperPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMessagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MessagePackage.eNS_URI, theMessagePackage);
		return theMessagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageLibrary() {
		return messageLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLibrary_Uid() {
		return (EAttribute)messageLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageLibrary_Name() {
		return (EAttribute)messageLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageLibrary_Messages() {
		return (EReference)messageLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Uid() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Translatioins() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Uid() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Translation() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslation_Lang() {
		return (EReference)translationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Uid() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Lang() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Code() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_DefaultLang() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactory getMessageFactory() {
		return (MessageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		messageLibraryEClass = createEClass(MESSAGE_LIBRARY);
		createEAttribute(messageLibraryEClass, MESSAGE_LIBRARY__UID);
		createEAttribute(messageLibraryEClass, MESSAGE_LIBRARY__NAME);
		createEReference(messageLibraryEClass, MESSAGE_LIBRARY__MESSAGES);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__UID);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEReference(messageEClass, MESSAGE__TRANSLATIOINS);

		translationEClass = createEClass(TRANSLATION);
		createEAttribute(translationEClass, TRANSLATION__UID);
		createEAttribute(translationEClass, TRANSLATION__TRANSLATION);
		createEReference(translationEClass, TRANSLATION__LANG);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__UID);
		createEAttribute(languageEClass, LANGUAGE__LANG);
		createEAttribute(languageEClass, LANGUAGE__CODE);
		createEAttribute(languageEClass, LANGUAGE__DEFAULT_LANG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArtifactPackage theArtifactPackage = (ArtifactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		messageLibraryEClass.getESuperTypes().add(theArtifactPackage.getCategorized());

		// Initialize classes and features; add operations and parameters
		initEClass(messageLibraryEClass, MessageLibrary.class, "MessageLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageLibrary_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageLibrary_Messages(), this.getMessage(), null, "messages", null, 0, -1, MessageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Translatioins(), this.getTranslation(), null, "translatioins", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationEClass, Translation.class, "Translation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslation_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_Translation(), ecorePackage.getEString(), "translation", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTranslation_Lang(), this.getLanguage(), null, "lang", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Code(), ecorePackage.getEString(), "code", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_DefaultLang(), ecorePackage.getEBoolean(), "defaultLang", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MessagePackageImpl
