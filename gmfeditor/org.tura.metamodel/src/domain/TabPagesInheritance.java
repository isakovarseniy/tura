/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Pages Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TabPagesInheritance#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.TabPagesInheritance#getSource <em>Source</em>}</li>
 *   <li>{@link domain.TabPagesInheritance#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTabPagesInheritance()
 * @model annotation="gmf.link source='source' target='target' style='dash' color='238,16,16' width='2' target.decoration='arrow'"
 * @generated
 */
public interface TabPagesInheritance extends EObject
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
   * @see domain.DomainPackage#getTabPagesInheritance_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.TabPagesInheritance#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(TabCanvas)
   * @see domain.DomainPackage#getTabPagesInheritance_Source()
   * @model
   * @generated
   */
  TabCanvas getSource();

  /**
   * Sets the value of the '{@link domain.TabPagesInheritance#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(TabCanvas value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(TabPage)
   * @see domain.DomainPackage#getTabPagesInheritance_Target()
   * @model
   * @generated
   */
  TabPage getTarget();

  /**
   * Sets the value of the '{@link domain.TabPagesInheritance#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TabPage value);

} // TabPagesInheritance