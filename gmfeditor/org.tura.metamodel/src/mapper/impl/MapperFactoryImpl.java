/**
 */
package mapper.impl;

import mapper.*;

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
public class MapperFactoryImpl extends EFactoryImpl implements MapperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MapperFactory init()
  {
    try
    {
      MapperFactory theMapperFactory = (MapperFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/mapper"); 
      if (theMapperFactory != null)
      {
        return theMapperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MapperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperFactoryImpl()
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
      case MapperPackage.MAPPERS: return createMappers();
      case MapperPackage.MAPPER: return createMapper();
      case MapperPackage.JAVA_MAPPER: return createJavaMapper();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappers createMappers()
  {
    MappersImpl mappers = new MappersImpl();
    return mappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapper createMapper()
  {
    MapperImpl mapper = new MapperImpl();
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaMapper createJavaMapper()
  {
    JavaMapperImpl javaMapper = new JavaMapperImpl();
    return javaMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperPackage getMapperPackage()
  {
    return (MapperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MapperPackage getPackage()
  {
    return MapperPackage.eINSTANCE;
  }

} //MapperFactoryImpl
