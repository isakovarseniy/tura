/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Layer Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.HTMLLayerHolder#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getHTMLLayerHolder()
 * @model
 * @generated
 */
public interface HTMLLayerHolder extends EObject
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see domain.DomainPackage#getHTMLLayerHolder_Columns()
   * @model default="1"
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link domain.HTMLLayerHolder#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

} // HTMLLayerHolder
