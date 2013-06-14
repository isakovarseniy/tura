/**
 */
package typedefinition;

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
 * @see typedefinition.TypedefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface TypedefinitionPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "typedefinition";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://tura.org/2013/v1/typedefinition";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "tura.typedefinition";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TypedefinitionPackage eINSTANCE = typedefinition.impl.TypedefinitionPackageImpl.init();

	/**
   * The meta object id for the '{@link typedefinition.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeDefinitionImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeDefinition()
   * @generated
   */
	int TYPE_DEFINITION = 0;

	/**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE_DEFINITION__TYPES = 0;

	/**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE_DEFINITION_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link typedefinition.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getType()
   * @generated
   */
	int TYPE = 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE__NAME = 0;

	/**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE__ATTRIBUTES = 1;

	/**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE__OPERATIONS = 2;

	/**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TYPE_FEATURE_COUNT = 3;

	/**
   * The meta object id for the '{@link typedefinition.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see typedefinition.impl.AttributeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getAttribute()
   * @generated
   */
	int ATTRIBUTE = 2;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__NAME = 0;

	/**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__TYPE = 1;

	/**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link typedefinition.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see typedefinition.impl.OperationImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getOperation()
   * @generated
   */
	int OPERATION = 3;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OPERATION__NAME = 0;

	/**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OPERATION__PARAMETERS = 1;

	/**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OPERATION__RETURN_VALUE = 2;

	/**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OPERATION_FEATURE_COUNT = 3;

	/**
   * The meta object id for the '{@link typedefinition.impl.ReturnValueImpl <em>Return Value</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see typedefinition.impl.ReturnValueImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getReturnValue()
   * @generated
   */
	int RETURN_VALUE = 4;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETURN_VALUE__NAME = 0;

	/**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETURN_VALUE__RETURN_VALUE = 1;

	/**
   * The number of structural features of the '<em>Return Value</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETURN_VALUE_FEATURE_COUNT = 2;


	/**
   * Returns the meta object for class '{@link typedefinition.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see typedefinition.TypeDefinition
   * @generated
   */
	EClass getTypeDefinition();

	/**
   * Returns the meta object for the containment reference list '{@link typedefinition.TypeDefinition#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see typedefinition.TypeDefinition#getTypes()
   * @see #getTypeDefinition()
   * @generated
   */
	EReference getTypeDefinition_Types();

	/**
   * Returns the meta object for class '{@link typedefinition.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see typedefinition.Type
   * @generated
   */
	EClass getType();

	/**
   * Returns the meta object for the attribute '{@link typedefinition.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Type#getName()
   * @see #getType()
   * @generated
   */
	EAttribute getType_Name();

	/**
   * Returns the meta object for the containment reference list '{@link typedefinition.Type#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see typedefinition.Type#getAttributes()
   * @see #getType()
   * @generated
   */
	EReference getType_Attributes();

	/**
   * Returns the meta object for the containment reference list '{@link typedefinition.Type#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see typedefinition.Type#getOperations()
   * @see #getType()
   * @generated
   */
	EReference getType_Operations();

	/**
   * Returns the meta object for class '{@link typedefinition.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see typedefinition.Attribute
   * @generated
   */
	EClass getAttribute();

	/**
   * Returns the meta object for the attribute '{@link typedefinition.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
	EAttribute getAttribute_Name();

	/**
   * Returns the meta object for the containment reference '{@link typedefinition.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see typedefinition.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
	EReference getAttribute_Type();

	/**
   * Returns the meta object for class '{@link typedefinition.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see typedefinition.Operation
   * @generated
   */
	EClass getOperation();

	/**
   * Returns the meta object for the attribute '{@link typedefinition.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Operation#getName()
   * @see #getOperation()
   * @generated
   */
	EAttribute getOperation_Name();

	/**
   * Returns the meta object for the containment reference list '{@link typedefinition.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see typedefinition.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
	EReference getOperation_Parameters();

	/**
   * Returns the meta object for the containment reference '{@link typedefinition.Operation#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see typedefinition.Operation#getReturnValue()
   * @see #getOperation()
   * @generated
   */
	EReference getOperation_ReturnValue();

	/**
   * Returns the meta object for class '{@link typedefinition.ReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Value</em>'.
   * @see typedefinition.ReturnValue
   * @generated
   */
	EClass getReturnValue();

	/**
   * Returns the meta object for the attribute '{@link typedefinition.ReturnValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.ReturnValue#getName()
   * @see #getReturnValue()
   * @generated
   */
	EAttribute getReturnValue_Name();

	/**
   * Returns the meta object for the containment reference '{@link typedefinition.ReturnValue#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see typedefinition.ReturnValue#getReturnValue()
   * @see #getReturnValue()
   * @generated
   */
	EReference getReturnValue_ReturnValue();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	TypedefinitionFactory getTypedefinitionFactory();

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
     * The meta object literal for the '{@link typedefinition.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeDefinitionImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeDefinition()
     * @generated
     */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TYPE_DEFINITION__TYPES = eINSTANCE.getTypeDefinition_Types();

		/**
     * The meta object literal for the '{@link typedefinition.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getType()
     * @generated
     */
		EClass TYPE = eINSTANCE.getType();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

		/**
     * The meta object literal for the '{@link typedefinition.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see typedefinition.impl.AttributeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getAttribute()
     * @generated
     */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
     * The meta object literal for the '{@link typedefinition.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see typedefinition.impl.OperationImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getOperation()
     * @generated
     */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OPERATION__RETURN_VALUE = eINSTANCE.getOperation_ReturnValue();

		/**
     * The meta object literal for the '{@link typedefinition.impl.ReturnValueImpl <em>Return Value</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see typedefinition.impl.ReturnValueImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getReturnValue()
     * @generated
     */
		EClass RETURN_VALUE = eINSTANCE.getReturnValue();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RETURN_VALUE__NAME = eINSTANCE.getReturnValue_Name();

		/**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RETURN_VALUE__RETURN_VALUE = eINSTANCE.getReturnValue_ReturnValue();

	}

} //TypedefinitionPackage