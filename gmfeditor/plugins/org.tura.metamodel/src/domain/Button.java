/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Button#getLabel <em>Label</em>}</li>
 *   <li>{@link domain.Button#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getButton()
 * @model annotation="gmf.node figure='org.tura.metamodel.commons.figures.ButtonFigure' label='label' label.icon='false' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/button.png'"
 * @generated
 */
public interface Button extends Uielement, MultiLangLabel {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see domain.DomainPackage#getButton_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link domain.Button#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(Context)
	 * @see domain.DomainPackage#getButton_Icon()
	 * @model containment="true"
	 * @generated
	 */
	Context getIcon();

	/**
	 * Sets the value of the '{@link domain.Button#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(Context value);

} // Button
