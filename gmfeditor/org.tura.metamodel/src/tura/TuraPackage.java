/**
 */
package tura;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import typedefinition.TypedefinitionPackage;

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
 * @see tura.TuraFactory
 * @model kind="package"
 * @generated
 */
public interface TuraPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "tura";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://tura.org/2013/v1/tura";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "tura";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TuraPackage eINSTANCE = tura.impl.TuraPackageImpl.init();

	/**
   * The meta object id for the '{@link tura.impl.TuraMetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see tura.impl.TuraMetamodelImpl
   * @see tura.impl.TuraPackageImpl#getTuraMetamodel()
   * @generated
   */
	int TURA_METAMODEL = 0;

	/**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TURA_METAMODEL__TYPE_DEFINITION = 0;

	/**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TURA_METAMODEL_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link tura.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see tura.impl.TypesImpl
   * @see tura.impl.TuraPackageImpl#getTypes()
   * @generated
   */
	int TYPES = 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPES__NAME = 0;

	/**
   * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPES__PRIMITIVES = 1;

	/**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPES__PACKAGES = 2;

	/**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPES_FEATURE_COUNT = 3;

	/**
   * The meta object id for the '{@link tura.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see tura.impl.PrimitiveImpl
   * @see tura.impl.TuraPackageImpl#getPrimitive()
   * @generated
   */
	int PRIMITIVE = 2;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRIMITIVE__NAME = 0;

	/**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRIMITIVE_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link tura.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see tura.impl.PackageImpl
   * @see tura.impl.TuraPackageImpl#getPackage()
   * @generated
   */
	int PACKAGE = 3;

	/**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PACKAGE__TYPES = TypedefinitionPackage.TYPE_DEFINITION__TYPES;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PACKAGE__NAME = TypedefinitionPackage.TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PACKAGE_FEATURE_COUNT = TypedefinitionPackage.TYPE_DEFINITION_FEATURE_COUNT + 1;


	/**
   * Returns the meta object for class '{@link tura.TuraMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see tura.TuraMetamodel
   * @generated
   */
	EClass getTuraMetamodel();

	/**
   * Returns the meta object for the containment reference '{@link tura.TuraMetamodel#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition</em>'.
   * @see tura.TuraMetamodel#getTypeDefinition()
   * @see #getTuraMetamodel()
   * @generated
   */
	EReference getTuraMetamodel_TypeDefinition();

	/**
   * Returns the meta object for class '{@link tura.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see tura.Types
   * @generated
   */
	EClass getTypes();

	/**
   * Returns the meta object for the attribute '{@link tura.Types#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tura.Types#getName()
   * @see #getTypes()
   * @generated
   */
	EAttribute getTypes_Name();

	/**
   * Returns the meta object for the containment reference list '{@link tura.Types#getPrimitives <em>Primitives</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primitives</em>'.
   * @see tura.Types#getPrimitives()
   * @see #getTypes()
   * @generated
   */
	EReference getTypes_Primitives();

	/**
   * Returns the meta object for the containment reference list '{@link tura.Types#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see tura.Types#getPackages()
   * @see #getTypes()
   * @generated
   */
	EReference getTypes_Packages();

	/**
   * Returns the meta object for class '{@link tura.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see tura.Primitive
   * @generated
   */
	EClass getPrimitive();

	/**
   * Returns the meta object for the attribute '{@link tura.Primitive#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tura.Primitive#getName()
   * @see #getPrimitive()
   * @generated
   */
	EAttribute getPrimitive_Name();

	/**
   * Returns the meta object for class '{@link tura.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see tura.Package
   * @generated
   */
	EClass getPackage();

	/**
   * Returns the meta object for the attribute '{@link tura.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tura.Package#getName()
   * @see #getPackage()
   * @generated
   */
	EAttribute getPackage_Name();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	TuraFactory getTuraFactory();

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
     * The meta object literal for the '{@link tura.impl.TuraMetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see tura.impl.TuraMetamodelImpl
     * @see tura.impl.TuraPackageImpl#getTuraMetamodel()
     * @generated
     */
		EClass TURA_METAMODEL = eINSTANCE.getTuraMetamodel();

		/**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TURA_METAMODEL__TYPE_DEFINITION = eINSTANCE.getTuraMetamodel_TypeDefinition();

		/**
     * The meta object literal for the '{@link tura.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see tura.impl.TypesImpl
     * @see tura.impl.TuraPackageImpl#getTypes()
     * @generated
     */
		EClass TYPES = eINSTANCE.getTypes();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute TYPES__NAME = eINSTANCE.getTypes_Name();

		/**
     * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TYPES__PRIMITIVES = eINSTANCE.getTypes_Primitives();

		/**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TYPES__PACKAGES = eINSTANCE.getTypes_Packages();

		/**
     * The meta object literal for the '{@link tura.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see tura.impl.PrimitiveImpl
     * @see tura.impl.TuraPackageImpl#getPrimitive()
     * @generated
     */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PRIMITIVE__NAME = eINSTANCE.getPrimitive_Name();

		/**
     * The meta object literal for the '{@link tura.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see tura.impl.PackageImpl
     * @see tura.impl.TuraPackageImpl#getPackage()
     * @generated
     */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

	}

} //TuraPackage
