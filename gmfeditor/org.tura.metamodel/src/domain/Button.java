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
 * <ul>
 *   <li>{@link domain.Button#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getButton()
 * @model annotation="gmf.node figure='org.tura.metamodel.commons.figures.ButtonFigure' label.icon='false' label='label' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/button.png'"
 * @generated
 */
public interface Button extends ActionElement, MultiLangLabel
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

} // Button
