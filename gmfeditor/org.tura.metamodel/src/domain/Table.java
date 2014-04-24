/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends SourcesPointer
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link domain.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see domain.DomainPackage#getTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

} // Table
