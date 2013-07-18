/**
 */
package artifact.impl;

import artifact.*;

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
public class ArtifactFactoryImpl extends EFactoryImpl implements ArtifactFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArtifactFactory init()
  {
    try
    {
      ArtifactFactory theArtifactFactory = (ArtifactFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/artifact"); 
      if (theArtifactFactory != null)
      {
        return theArtifactFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArtifactFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactFactoryImpl()
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
      case ArtifactPackage.ARTIFACTS: return createArtifacts();
      case ArtifactPackage.ARTIFACT: return createArtifact();
      case ArtifactPackage.VARIABLE: return createVariable();
      case ArtifactPackage.SPECIFIER: return createSpecifier();
      case ArtifactPackage.OPTION: return createOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts createArtifacts()
  {
    ArtifactsImpl artifacts = new ArtifactsImpl();
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specifier createSpecifier()
  {
    SpecifierImpl specifier = new SpecifierImpl();
    return specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactPackage getArtifactPackage()
  {
    return (ArtifactPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArtifactPackage getPackage()
  {
    return ArtifactPackage.eINSTANCE;
  }

} //ArtifactFactoryImpl
