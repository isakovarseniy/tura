/**
 */
package common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link common.impl.CategorizedImpl <em>Categorized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see common.impl.CategorizedImpl
	 * @see common.impl.CommonPackageImpl#getCategorized()
	 * @generated
	 */
	int CATEGORIZED = 0;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED__CLASSIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Categorized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link common.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see common.impl.ClassifierImpl
	 * @see common.impl.CommonPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__UID = 0;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__HINT = 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DETAILS = 2;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link common.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see common.impl.GenerationHintImpl
	 * @see common.impl.CommonPackageImpl#getGenerationHint()
	 * @generated
	 */
	int GENERATION_HINT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Applyed Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT__APPLYED_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Generation Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_HINT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link common.Categorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorized</em>'.
	 * @see common.Categorized
	 * @generated
	 */
	EClass getCategorized();

	/**
	 * Returns the meta object for the containment reference list '{@link common.Categorized#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see common.Categorized#getClassifiers()
	 * @see #getCategorized()
	 * @generated
	 */
	EReference getCategorized_Classifiers();

	/**
	 * Returns the meta object for class '{@link common.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see common.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link common.Classifier#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see common.Classifier#getUid()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Uid();

	/**
	 * Returns the meta object for the reference '{@link common.Classifier#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hint</em>'.
	 * @see common.Classifier#getHint()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Hint();

	/**
	 * Returns the meta object for the attribute '{@link common.Classifier#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see common.Classifier#getDetails()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Details();

	/**
	 * Returns the meta object for class '{@link common.GenerationHint <em>Generation Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Hint</em>'.
	 * @see common.GenerationHint
	 * @generated
	 */
	EClass getGenerationHint();

	/**
	 * Returns the meta object for the attribute '{@link common.GenerationHint#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see common.GenerationHint#getUid()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Uid();

	/**
	 * Returns the meta object for the attribute '{@link common.GenerationHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see common.GenerationHint#getName()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link common.GenerationHint#getApplyedClass <em>Applyed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applyed Class</em>'.
	 * @see common.GenerationHint#getApplyedClass()
	 * @see #getGenerationHint()
	 * @generated
	 */
	EAttribute getGenerationHint_ApplyedClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link common.impl.CategorizedImpl <em>Categorized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see common.impl.CategorizedImpl
		 * @see common.impl.CommonPackageImpl#getCategorized()
		 * @generated
		 */
		EClass CATEGORIZED = eINSTANCE.getCategorized();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZED__CLASSIFIERS = eINSTANCE.getCategorized_Classifiers();

		/**
		 * The meta object literal for the '{@link common.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see common.impl.ClassifierImpl
		 * @see common.impl.CommonPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__UID = eINSTANCE.getClassifier_Uid();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__HINT = eINSTANCE.getClassifier_Hint();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__DETAILS = eINSTANCE.getClassifier_Details();

		/**
		 * The meta object literal for the '{@link common.impl.GenerationHintImpl <em>Generation Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see common.impl.GenerationHintImpl
		 * @see common.impl.CommonPackageImpl#getGenerationHint()
		 * @generated
		 */
		EClass GENERATION_HINT = eINSTANCE.getGenerationHint();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__UID = eINSTANCE.getGenerationHint_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__NAME = eINSTANCE.getGenerationHint_Name();

		/**
		 * The meta object literal for the '<em><b>Applyed Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_HINT__APPLYED_CLASS = eINSTANCE.getGenerationHint_ApplyedClass();

	}

} //CommonPackage
