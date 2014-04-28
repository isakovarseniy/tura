/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.CanvasView#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.CanvasView#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.CanvasView#getBaseCanvas <em>Base Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getCanvasView()
 * @model
 * @generated
 */
public interface CanvasView extends EObject
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
   * @see domain.DomainPackage#getCanvasView_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.CanvasView#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.ViewArea#getCanvasView <em>Canvas View</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(ViewArea)
   * @see domain.DomainPackage#getCanvasView_Parent()
   * @see domain.ViewArea#getCanvasView
   * @model opposite="canvasView" transient="false"
   * @generated
   */
  ViewArea getParent();

  /**
   * Sets the value of the '{@link domain.CanvasView#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ViewArea value);

  /**
   * Returns the value of the '<em><b>Base Canvas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Canvas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Canvas</em>' containment reference.
   * @see #setBaseCanvas(LayerHolder)
   * @see domain.DomainPackage#getCanvasView_BaseCanvas()
   * @model containment="true"
   * @generated
   */
  LayerHolder getBaseCanvas();

  /**
   * Sets the value of the '{@link domain.CanvasView#getBaseCanvas <em>Base Canvas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Canvas</em>' containment reference.
   * @see #getBaseCanvas()
   * @generated
   */
  void setBaseCanvas(LayerHolder value);

} // CanvasView
