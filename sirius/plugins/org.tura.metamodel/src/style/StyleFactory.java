/**
 */
package style;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see style.StylePackage
 * @generated
 */
public interface StyleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StyleFactory eINSTANCE = style.impl.StyleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Styles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styles</em>'.
	 * @generated
	 */
	Styles createStyles();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	StyleLibrary createStyleLibrary();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	StyleSet createStyleSet();

	/**
	 * Returns a new object of class '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer</em>'.
	 * @generated
	 */
	StylePointer createStylePointer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StylePackage getStylePackage();

} //StyleFactory
