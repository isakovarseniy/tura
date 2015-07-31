/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.MessageLibrary#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.MessageLibrary#getName <em>Name</em>}</li>
 *   <li>{@link domain.MessageLibrary#getLibLanguages <em>Lib Languages</em>}</li>
 *   <li>{@link domain.MessageLibrary#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMessageLibrary()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,237,85'"
 * @generated
 */
public interface MessageLibrary extends EObject
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
	 * @see domain.DomainPackage#getMessageLibrary_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.MessageLibrary#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getMessageLibrary_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.MessageLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Lib Languages</b></em>' containment reference list.
	 * The list contents are of type {@link domain.LanguageRef}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib Languages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lib Languages</em>' containment reference list.
	 * @see domain.DomainPackage#getMessageLibrary_LibLanguages()
	 * @model containment="true"
	 * @generated
	 */
  EList<LanguageRef> getLibLanguages();

  /**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Message}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see domain.DomainPackage#getMessageLibrary_Messages()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<Message> getMessages();

} // MessageLibrary
