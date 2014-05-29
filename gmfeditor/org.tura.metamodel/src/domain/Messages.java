/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Messages#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Messages#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Messages#getMessageLibraries <em>Message Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMessages()
 * @model
 * @generated
 */
public interface Messages extends EObject
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
   * @see domain.DomainPackage#getMessages_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Messages#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationMessages#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ApplicationMessages)
   * @see domain.DomainPackage#getMessages_Parent()
   * @see domain.ApplicationMessages#getMessages
   * @model opposite="messages"
   * @generated
   */
  ApplicationMessages getParent();

  /**
   * Sets the value of the '{@link domain.Messages#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ApplicationMessages value);

  /**
   * Returns the value of the '<em><b>Message Libraries</b></em>' containment reference list.
   * The list contents are of type {@link domain.MessageLibrary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Libraries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Libraries</em>' containment reference list.
   * @see domain.DomainPackage#getMessages_MessageLibraries()
   * @model containment="true"
   * @generated
   */
  EList<MessageLibrary> getMessageLibraries();

} // Messages
