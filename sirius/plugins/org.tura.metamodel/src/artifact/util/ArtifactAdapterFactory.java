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
package artifact.util;

import artifact.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see artifact.ArtifactPackage
 * @generated
 */
public class ArtifactAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtifactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArtifactPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactSwitch<Adapter> modelSwitch =
		new ArtifactSwitch<Adapter>() {
			@Override
			public Adapter caseArtifactGroup(ArtifactGroup object) {
				return createArtifactGroupAdapter();
			}
			@Override
			public Adapter caseTechLeaf(TechLeaf object) {
				return createTechLeafAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseGenerationHintWithNickName(GenerationHintWithNickName object) {
				return createGenerationHintWithNickNameAdapter();
			}
			@Override
			public Adapter caseConfigVariableWithNickName(ConfigVariableWithNickName object) {
				return createConfigVariableWithNickNameAdapter();
			}
			@Override
			public Adapter caseConfigHashWithNickName(ConfigHashWithNickName object) {
				return createConfigHashWithNickNameAdapter();
			}
			@Override
			public Adapter caseGenerationHint(GenerationHint object) {
				return createGenerationHintAdapter();
			}
			@Override
			public Adapter caseConfigVariable(ConfigVariable object) {
				return createConfigVariableAdapter();
			}
			@Override
			public Adapter caseConfigHash(ConfigHash object) {
				return createConfigHashAdapter();
			}
			@Override
			public Adapter caseModelQuery(ModelQuery object) {
				return createModelQueryAdapter();
			}
			@Override
			public Adapter caseQueryParameter(QueryParameter object) {
				return createQueryParameterAdapter();
			}
			@Override
			public Adapter caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseCategorized(Categorized object) {
				return createCategorizedAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link artifact.ArtifactGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ArtifactGroup
	 * @generated
	 */
	public Adapter createArtifactGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.TechLeaf <em>Tech Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.TechLeaf
	 * @generated
	 */
	public Adapter createTechLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.GenerationHintWithNickName <em>Generation Hint With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.GenerationHintWithNickName
	 * @generated
	 */
	public Adapter createGenerationHintWithNickNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.ConfigVariableWithNickName <em>Config Variable With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ConfigVariableWithNickName
	 * @generated
	 */
	public Adapter createConfigVariableWithNickNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.ConfigHashWithNickName <em>Config Hash With Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ConfigHashWithNickName
	 * @generated
	 */
	public Adapter createConfigHashWithNickNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.GenerationHint <em>Generation Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.GenerationHint
	 * @generated
	 */
	public Adapter createGenerationHintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.ConfigVariable <em>Config Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ConfigVariable
	 * @generated
	 */
	public Adapter createConfigVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.ConfigHash <em>Config Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ConfigHash
	 * @generated
	 */
	public Adapter createConfigHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.ModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.ModelQuery
	 * @generated
	 */
	public Adapter createModelQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.QueryParameter
	 * @generated
	 */
	public Adapter createQueryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Categorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Categorized
	 * @generated
	 */
	public Adapter createCategorizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link artifact.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see artifact.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArtifactAdapterFactory
