/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.CanvasFrame#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.CanvasFrame#getName <em>Name</em>}</li>
 *   <li>{@link domain.CanvasFrame#getCanvasView <em>Canvas View</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getCanvasFrame()
 * @model
 * @generated
 */
public interface CanvasFrame extends EObject
{
  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getCanvasFrame_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.CanvasFrame#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see domain.DomainPackage#getCanvasFrame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.CanvasFrame#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Canvas View</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.CanvasView#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Canvas View</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Canvas View</em>' containment reference.
   * @see #setCanvasView(CanvasView)
   * @see domain.DomainPackage#getCanvasFrame_CanvasView()
   * @see domain.CanvasView#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  CanvasView getCanvasView();

  /**
   * Sets the value of the '{@link domain.CanvasFrame#getCanvasView <em>Canvas View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Canvas View</em>' containment reference.
   * @see #getCanvasView()
   * @generated
   */
  void setCanvasView(CanvasView value);

} // CanvasFrame
