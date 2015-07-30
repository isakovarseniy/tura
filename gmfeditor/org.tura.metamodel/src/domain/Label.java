/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Label#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getLabel()
 * @model annotation="gmf.node label='label' tool.small.bundle='org.tura.metamodel.commons' label.icon='false' tool.small.path='icons/label.png'"
 * @generated
 */
public interface Label extends Uielement, MultiLangLabel
{
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
	 * @see domain.DomainPackage#getLabel_Label()
	 * @model
	 * @generated
	 */
  String getLabel();

  /**
	 * Sets the value of the '{@link domain.Label#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
  void setLabel(String value);

} // Label
