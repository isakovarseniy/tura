/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Tree#getLabel <em>Label</em>}</li>
 *   <li>{@link domain.Tree#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTree()
 * @model annotation="gmf.node label='label' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/tree.png'"
 * @generated
 */
public interface Tree extends SourcesPointer, MultiLangLabel
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
   * @see domain.DomainPackage#getTree_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link domain.Tree#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(Context)
   * @see domain.DomainPackage#getTree_Image()
   * @model containment="true"
   * @generated
   */
  Context getImage();

  /**
   * Sets the value of the '{@link domain.Tree#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(Context value);

} // Tree
