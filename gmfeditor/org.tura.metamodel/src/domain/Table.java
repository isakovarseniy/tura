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
 *   <li>{@link domain.Table#getLabel <em>Label</em>}</li>
 *   <li>{@link domain.Table#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link domain.Table#getCols <em>Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTable()
 * @model annotation="gmf.node label='label' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/table.png'"
 * @generated
 */
public interface Table extends SourcesPointer, HTMLLayerHolder, MultiLangLabel
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
   * @see domain.DomainPackage#getTable_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link domain.Table#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Row Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row Number</em>' attribute.
   * @see #setRowNumber(int)
   * @see domain.DomainPackage#getTable_RowNumber()
   * @model
   * @generated
   */
  int getRowNumber();

  /**
   * Sets the value of the '{@link domain.Table#getRowNumber <em>Row Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row Number</em>' attribute.
   * @see #getRowNumber()
   * @generated
   */
  void setRowNumber(int value);

  /**
   * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
   * The list contents are of type {@link domain.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cols</em>' containment reference list.
   * @see domain.DomainPackage#getTable_Cols()
   * @model containment="true"
   * @generated
   */
  EList<Column> getCols();

} // Table
