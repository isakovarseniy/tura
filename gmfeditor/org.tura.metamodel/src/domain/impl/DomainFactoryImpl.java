/**
 */
package domain.impl;

import domain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainFactory init()
  {
    try
    {
      DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/domain"); 
      if (theDomainFactory != null)
      {
        return theDomainFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainPackage.DAMMY1: return createDammy1();
      case DomainPackage.DAMMY2: return createDammy2();
      case DomainPackage.DAMMY3: return createDammy3();
      case DomainPackage.DAMMY4: return createDammy4();
      case DomainPackage.DOMAIN: return createDomain();
      case DomainPackage.DOMAIN_ARTIFACTS: return createDomainArtifacts();
      case DomainPackage.DOMAIN_ARTIFACT: return createDomainArtifact();
      case DomainPackage.DOMAIN_TYPES: return createDomainTypes();
      case DomainPackage.DOMAIN_APPLICATIONS: return createDomainApplications();
      case DomainPackage.DOMAIN_APPLICATION: return createDomainApplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy1 createDammy1()
  {
    Dammy1Impl dammy1 = new Dammy1Impl();
    return dammy1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy2 createDammy2()
  {
    Dammy2Impl dammy2 = new Dammy2Impl();
    return dammy2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy3 createDammy3()
  {
    Dammy3Impl dammy3 = new Dammy3Impl();
    return dammy3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dammy4 createDammy4()
  {
    Dammy4Impl dammy4 = new Dammy4Impl();
    return dammy4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifacts createDomainArtifacts()
  {
    DomainArtifactsImpl domainArtifacts = new DomainArtifactsImpl();
    return domainArtifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainArtifact createDomainArtifact()
  {
    DomainArtifactImpl domainArtifact = new DomainArtifactImpl();
    return domainArtifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainTypes createDomainTypes()
  {
    DomainTypesImpl domainTypes = new DomainTypesImpl();
    return domainTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplications createDomainApplications()
  {
    DomainApplicationsImpl domainApplications = new DomainApplicationsImpl();
    return domainApplications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplication createDomainApplication()
  {
    DomainApplicationImpl domainApplication = new DomainApplicationImpl();
    return domainApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainPackage getDomainPackage()
  {
    return (DomainPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainPackage getPackage()
  {
    return DomainPackage.eINSTANCE;
  }

} //DomainFactoryImpl
