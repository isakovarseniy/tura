/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Types#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Types#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Types#getName <em>Name</em>}</li>
 *   <li>{@link domain.Types#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link domain.Types#getPackages <em>Packages</em>}</li>
 *   <li>{@link domain.Types#getBusinessPackages <em>Business Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypes()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Types extends EObject
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
   * @see domain.DomainPackage#getTypes_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Types#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.TypesRepository#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(TypesRepository)
   * @see domain.DomainPackage#getTypes_Parent()
   * @see domain.TypesRepository#getTypeDefinition
   * @model opposite="typeDefinition" transient="false"
   * @generated
   */
  TypesRepository getParent();

  /**
   * Sets the value of the '{@link domain.Types#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(TypesRepository value);

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
   * @see domain.DomainPackage#getTypes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Types#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
   * The list contents are of type {@link domain.Primitive}.
   * It is bidirectional and its opposite is '{@link domain.Primitive#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_Primitives()
   * @see domain.Primitive#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Primitive> getPrimitives();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link domain.Package}.
   * It is bidirectional and its opposite is '{@link domain.Package#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_Packages()
   * @see domain.Package#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<domain.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Business Packages</b></em>' containment reference list.
   * The list contents are of type {@link domain.BusinessPackage}.
   * It is bidirectional and its opposite is '{@link domain.BusinessPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Packages</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_BusinessPackages()
   * @see domain.BusinessPackage#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<BusinessPackage> getBusinessPackages();

} // Types
