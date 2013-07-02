/**
 */
package businessobjects.util;

import businessobjects.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import typedefinition.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see businessobjects.BusinessobjectsPackage
 * @generated
 */
public class BusinessobjectsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BusinessobjectsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BusinessobjectsPackage.eINSTANCE;
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
  protected BusinessobjectsSwitch<Adapter> modelSwitch =
    new BusinessobjectsSwitch<Adapter>()
    {
      @Override
      public Adapter caseBusinessObjects(BusinessObjects object)
      {
        return createBusinessObjectsAdapter();
      }
      @Override
      public Adapter caseBusinessObject(BusinessObject object)
      {
        return createBusinessObjectAdapter();
      }
      @Override
      public Adapter caseBusinessMethod(BusinessMethod object)
      {
        return createBusinessMethodAdapter();
      }
      @Override
      public Adapter caseCreateMethod(CreateMethod object)
      {
        return createCreateMethodAdapter();
      }
      @Override
      public Adapter caseInsertMethod(InsertMethod object)
      {
        return createInsertMethodAdapter();
      }
      @Override
      public Adapter caseUpdateMethod(UpdateMethod object)
      {
        return createUpdateMethodAdapter();
      }
      @Override
      public Adapter caseRemoveMethod(RemoveMethod object)
      {
        return createRemoveMethodAdapter();
      }
      @Override
      public Adapter caseSearchMethod(SearchMethod object)
      {
        return createSearchMethodAdapter();
      }
      @Override
      public Adapter caseOtherMethod(OtherMethod object)
      {
        return createOtherMethodAdapter();
      }
      @Override
      public Adapter caseTypePointer(TypePointer object)
      {
        return createTypePointerAdapter();
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
   * Creates a new adapter for an object of class '{@link businessobjects.BusinessObjects <em>Business Objects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.BusinessObjects
   * @generated
   */
  public Adapter createBusinessObjectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.BusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.BusinessObject
   * @generated
   */
  public Adapter createBusinessObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.BusinessMethod <em>Business Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.BusinessMethod
   * @generated
   */
  public Adapter createBusinessMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.CreateMethod <em>Create Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.CreateMethod
   * @generated
   */
  public Adapter createCreateMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.InsertMethod <em>Insert Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.InsertMethod
   * @generated
   */
  public Adapter createInsertMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.UpdateMethod <em>Update Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.UpdateMethod
   * @generated
   */
  public Adapter createUpdateMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.RemoveMethod <em>Remove Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.RemoveMethod
   * @generated
   */
  public Adapter createRemoveMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.SearchMethod <em>Search Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.SearchMethod
   * @generated
   */
  public Adapter createSearchMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link businessobjects.OtherMethod <em>Other Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see businessobjects.OtherMethod
   * @generated
   */
  public Adapter createOtherMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link typedefinition.TypePointer <em>Type Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see typedefinition.TypePointer
   * @generated
   */
  public Adapter createTypePointerAdapter()
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

} //BusinessobjectsAdapterFactory
