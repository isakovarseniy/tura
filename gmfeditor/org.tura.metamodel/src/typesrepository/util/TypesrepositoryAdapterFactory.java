/**
 */
package typesrepository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import typedefinition.TypeDefinition;

import typesrepository.Primitive;
import typesrepository.Types;
import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see typesrepository.TypesrepositoryPackage
 * @generated
 */
public class TypesrepositoryAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TypesrepositoryPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesrepositoryAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TypesrepositoryPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesrepositorySwitch<Adapter> modelSwitch =
    new TypesrepositorySwitch<Adapter>()
    {
      @Override
      public Adapter caseTypesRepository(TypesRepository object)
      {
        return createTypesRepositoryAdapter();
      }
      @Override
      public Adapter caseTypes(Types object)
      {
        return createTypesAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter casePackage(typesrepository.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link typesrepository.TypesRepository <em>Types Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typesrepository.TypesRepository
   * @generated
   */
  public Adapter createTypesRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link typesrepository.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typesrepository.Types
   * @generated
   */
  public Adapter createTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link typesrepository.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typesrepository.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link typesrepository.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typesrepository.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link typedefinition.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typedefinition.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TypesrepositoryAdapterFactory
