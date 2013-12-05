/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Query#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Query#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link domain.Query#getFakeName <em>Fake Name</em>}</li>
 *   <li>{@link domain.Query#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getQuery()
 * @model annotation="gmf.node label='fakeName'"
 * @generated
 */
public interface Query extends EObject
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
   * @see domain.DomainPackage#getQuery_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Query#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Model Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Query</em>' reference.
   * @see #setModelQuery(ModelQuery)
   * @see domain.DomainPackage#getQuery_ModelQuery()
   * @model
   * @generated
   */
  ModelQuery getModelQuery();

  /**
   * Sets the value of the '{@link domain.Query#getModelQuery <em>Model Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Query</em>' reference.
   * @see #getModelQuery()
   * @generated
   */
  void setModelQuery(ModelQuery value);

  /**
   * Returns the value of the '<em><b>Fake Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fake Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fake Name</em>' attribute.
   * @see #setFakeName(String)
   * @see domain.DomainPackage#getQuery_FakeName()
   * @model
   * @generated
   */
  String getFakeName();

  /**
   * Sets the value of the '{@link domain.Query#getFakeName <em>Fake Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fake Name</em>' attribute.
   * @see #getFakeName()
   * @generated
   */
  void setFakeName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link domain.QueryVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see domain.DomainPackage#getQuery_Variables()
   * @model containment="true"
   * @generated
   */
  EList<QueryVariable> getVariables();

} // Query
