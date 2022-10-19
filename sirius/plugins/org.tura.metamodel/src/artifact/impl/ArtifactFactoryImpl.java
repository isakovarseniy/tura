/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package artifact.impl;

import artifact.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactFactoryImpl extends EFactoryImpl implements ArtifactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactFactory init() {
		try {
			ArtifactFactory theArtifactFactory = (ArtifactFactory)EPackage.Registry.INSTANCE.getEFactory(ArtifactPackage.eNS_URI);
			if (theArtifactFactory != null) {
				return theArtifactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtifactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtifactPackage.ARTIFACT_GROUP: return createArtifactGroup();
			case ArtifactPackage.TECH_LEAF: return createTechLeaf();
			case ArtifactPackage.ARTIFACT: return createArtifact();
			case ArtifactPackage.GENERATION_HINT_WITH_NICK_NAME: return createGenerationHintWithNickName();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME: return createConfigVariableWithNickName();
			case ArtifactPackage.CONFIG_HASH_WITH_NICK_NAME: return createConfigHashWithNickName();
			case ArtifactPackage.GENERATION_HINT: return createGenerationHint();
			case ArtifactPackage.CONFIG_VARIABLE: return createConfigVariable();
			case ArtifactPackage.CONFIG_HASH: return createConfigHash();
			case ArtifactPackage.MODEL_QUERY: return createModelQuery();
			case ArtifactPackage.QUERY_PARAMETER: return createQueryParameter();
			case ArtifactPackage.TECHNOLOGY: return createTechnology();
			case ArtifactPackage.OPTION: return createOption();
			case ArtifactPackage.CATEGORIZED: return createCategorized();
			case ArtifactPackage.CLASSIFIER: return createClassifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactGroup createArtifactGroup() {
		ArtifactGroupImpl artifactGroup = new ArtifactGroupImpl();
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechLeaf createTechLeaf() {
		TechLeafImpl techLeaf = new TechLeafImpl();
		return techLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationHintWithNickName createGenerationHintWithNickName() {
		GenerationHintWithNickNameImpl generationHintWithNickName = new GenerationHintWithNickNameImpl();
		return generationHintWithNickName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigVariableWithNickName createConfigVariableWithNickName() {
		ConfigVariableWithNickNameImpl configVariableWithNickName = new ConfigVariableWithNickNameImpl();
		return configVariableWithNickName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigHashWithNickName createConfigHashWithNickName() {
		ConfigHashWithNickNameImpl configHashWithNickName = new ConfigHashWithNickNameImpl();
		return configHashWithNickName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationHint createGenerationHint() {
		GenerationHintImpl generationHint = new GenerationHintImpl();
		return generationHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigVariable createConfigVariable() {
		ConfigVariableImpl configVariable = new ConfigVariableImpl();
		return configVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigHash createConfigHash() {
		ConfigHashImpl configHash = new ConfigHashImpl();
		return configHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelQuery createModelQuery() {
		ModelQueryImpl modelQuery = new ModelQueryImpl();
		return modelQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categorized createCategorized() {
		CategorizedImpl categorized = new CategorizedImpl();
		return categorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactPackage getArtifactPackage() {
		return (ArtifactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtifactPackage getPackage() {
		return ArtifactPackage.eINSTANCE;
	}

} //ArtifactFactoryImpl
