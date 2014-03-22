/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Application#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Application#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link domain.Application#getApplicationMappers <em>Application Mappers</em>}</li>
 *   <li>{@link domain.Application#getApplicationUILayer <em>Application UI Layer</em>}</li>
 *   <li>{@link domain.Application#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
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
   * @see domain.DomainPackage#getApplication_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Application#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Application Recipes</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationRecipes#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application Recipes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Recipes</em>' containment reference.
   * @see #setApplicationRecipes(ApplicationRecipes)
   * @see domain.DomainPackage#getApplication_ApplicationRecipes()
   * @see domain.ApplicationRecipes#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  ApplicationRecipes getApplicationRecipes();

  /**
   * Sets the value of the '{@link domain.Application#getApplicationRecipes <em>Application Recipes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application Recipes</em>' containment reference.
   * @see #getApplicationRecipes()
   * @generated
   */
  void setApplicationRecipes(ApplicationRecipes value);

  /**
   * Returns the value of the '<em><b>Application Mappers</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationMappers#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application Mappers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Mappers</em>' containment reference.
   * @see #setApplicationMappers(ApplicationMappers)
   * @see domain.DomainPackage#getApplication_ApplicationMappers()
   * @see domain.ApplicationMappers#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  ApplicationMappers getApplicationMappers();

  /**
   * Sets the value of the '{@link domain.Application#getApplicationMappers <em>Application Mappers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application Mappers</em>' containment reference.
   * @see #getApplicationMappers()
   * @generated
   */
  void setApplicationMappers(ApplicationMappers value);

  /**
   * Returns the value of the '<em><b>Application UI Layer</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationUILayer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application UI Layer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application UI Layer</em>' containment reference.
   * @see #setApplicationUILayer(ApplicationUILayer)
   * @see domain.DomainPackage#getApplication_ApplicationUILayer()
   * @see domain.ApplicationUILayer#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  ApplicationUILayer getApplicationUILayer();

  /**
   * Sets the value of the '{@link domain.Application#getApplicationUILayer <em>Application UI Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application UI Layer</em>' containment reference.
   * @see #getApplicationUILayer()
   * @generated
   */
  void setApplicationUILayer(ApplicationUILayer value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.DomainApplication#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(DomainApplication)
   * @see domain.DomainPackage#getApplication_Parent()
   * @see domain.DomainApplication#getApplication
   * @model opposite="application"
   * @generated
   */
  DomainApplication getParent();

  /**
   * Sets the value of the '{@link domain.Application#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(DomainApplication value);

} // Application
