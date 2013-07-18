/**
 */
package domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainFactory eINSTANCE = domain.impl.DomainFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dammy1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dammy1</em>'.
   * @generated
   */
  Dammy1 createDammy1();

  /**
   * Returns a new object of class '<em>Dammy2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dammy2</em>'.
   * @generated
   */
  Dammy2 createDammy2();

  /**
   * Returns a new object of class '<em>Dammy3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dammy3</em>'.
   * @generated
   */
  Dammy3 createDammy3();

  /**
   * Returns a new object of class '<em>Dammy4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dammy4</em>'.
   * @generated
   */
  Dammy4 createDammy4();

  /**
   * Returns a new object of class '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain</em>'.
   * @generated
   */
  Domain createDomain();

  /**
   * Returns a new object of class '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifacts</em>'.
   * @generated
   */
  DomainArtifacts createDomainArtifacts();

  /**
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  DomainArtifact createDomainArtifact();

  /**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
  DomainTypes createDomainTypes();

  /**
   * Returns a new object of class '<em>Applications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applications</em>'.
   * @generated
   */
  DomainApplications createDomainApplications();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  DomainApplication createDomainApplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainPackage getDomainPackage();

} //DomainFactory
