/**
 */
package typedefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typedefinition.TypedefinitionPackage
 * @generated
 */
public interface TypedefinitionFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TypedefinitionFactory eINSTANCE = typedefinition.impl.TypedefinitionFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
	TypeDefinition createTypeDefinition();

	/**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
	Type createType();

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
   * Returns a new object of class '<em>Return Value</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Value</em>'.
   * @generated
   */
	ReturnValue createReturnValue();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	TypedefinitionPackage getTypedefinitionPackage();

} //TypedefinitionFactory