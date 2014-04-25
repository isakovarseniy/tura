/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Group#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Group#getName <em>Name</em>}</li>
 *   <li>{@link domain.Group#getGroup2Group <em>Group2 Group</em>}</li>
 *   <li>{@link domain.Group#getGroup2Role <em>Group2 Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getGroup()
 * @model annotation="gmf.node figure='org.tura.metamodel.commons.figures.GroupFigure' label.icon='false' label='name' label.placement='external' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/group.png'"
 * @generated
 */
public interface Group extends EObject
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
   * @see domain.DomainPackage#getGroup_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Group#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Group#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Group2 Group</b></em>' reference list.
   * The list contents are of type {@link domain.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group2 Group</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group2 Group</em>' reference list.
   * @see domain.DomainPackage#getGroup_Group2Group()
   * @model annotation="gmf.link target.decoration='arrow' style='dash'"
   * @generated
   */
  EList<Group> getGroup2Group();

  /**
   * Returns the value of the '<em><b>Group2 Role</b></em>' reference list.
   * The list contents are of type {@link domain.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group2 Role</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group2 Role</em>' reference list.
   * @see domain.DomainPackage#getGroup_Group2Role()
   * @model annotation="gmf.link target.decoration='arrow' style='dash'"
   * @generated
   */
  EList<Role> getGroup2Role();

} // Group
