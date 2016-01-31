/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Menu#getFakeName <em>Fake Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMenu()
 * @model annotation="gmf.node label='fakeName' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/menu.png'"
 * @generated
 */
public interface Menu extends Uielement {
	/**
	 * Returns the value of the '<em><b>Fake Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Name</em>' attribute.
	 * @see #setFakeName(String)
	 * @see domain.DomainPackage#getMenu_FakeName()
	 * @model
	 * @generated
	 */
	String getFakeName();

	/**
	 * Sets the value of the '{@link domain.Menu#getFakeName <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Name</em>' attribute.
	 * @see #getFakeName()
	 * @generated
	 */
	void setFakeName(String value);

} // Menu
