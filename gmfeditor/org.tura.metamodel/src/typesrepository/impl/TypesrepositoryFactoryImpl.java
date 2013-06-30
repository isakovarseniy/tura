/**
 */
package typesrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typesrepository.Primitive;
import typesrepository.Types;
import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryFactory;
import typesrepository.TypesrepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesrepositoryFactoryImpl extends EFactoryImpl implements TypesrepositoryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypesrepositoryFactory init()
  {
    try
    {
      TypesrepositoryFactory theTypesrepositoryFactory = (TypesrepositoryFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/typesrepository"); 
      if (theTypesrepositoryFactory != null)
      {
        return theTypesrepositoryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TypesrepositoryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesrepositoryFactoryImpl()
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
      case TypesrepositoryPackage.TYPES_REPOSITORY: return createTypesRepository();
      case TypesrepositoryPackage.TYPES: return createTypes();
      case TypesrepositoryPackage.PRIMITIVE: return createPrimitive();
      case TypesrepositoryPackage.PACKAGE: return createPackage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesRepository createTypesRepository()
  {
    TypesRepositoryImpl typesRepository = new TypesRepositoryImpl();
    return typesRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types createTypes()
  {
    TypesImpl types = new TypesImpl();
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typesrepository.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesrepositoryPackage getTypesrepositoryPackage()
  {
    return (TypesrepositoryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TypesrepositoryPackage getPackage()
  {
    return TypesrepositoryPackage.eINSTANCE;
  }

} //TypesrepositoryFactoryImpl
