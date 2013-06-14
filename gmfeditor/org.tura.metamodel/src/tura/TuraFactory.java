/**
 */
package tura;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tura.TuraPackage
 * @generated
 */
public interface TuraFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TuraFactory eINSTANCE = tura.impl.TuraFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel</em>'.
   * @generated
   */
	TuraMetamodel createTuraMetamodel();

	/**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
	Types createTypes();

	/**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
	Primitive createPrimitive();

	/**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
	Package createPackage();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	TuraPackage getTuraPackage();

} //TuraFactory
