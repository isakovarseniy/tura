/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nick Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.NickNamed#getNickname <em>Nickname</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getNickNamed()
 * @model
 * @generated
 */
public interface NickNamed extends EObject
{
  /**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see domain.DomainPackage#getNickNamed_Nickname()
	 * @model
	 * @generated
	 */
  String getNickname();

  /**
	 * Sets the value of the '{@link domain.NickNamed#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
  void setNickname(String value);

} // NickNamed
