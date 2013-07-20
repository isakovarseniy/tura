/**
 */
package domain.util;

import businessobjects.BusinessObjects;

import domain.*;

import mapper.Mappers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import recipe.Recipes;

import typedefinition.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainPackage.eINSTANCE;
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
  protected DomainSwitch<Adapter> modelSwitch =
    new DomainSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseDammy1(Dammy1 object)
      {
        return createDammy1Adapter();
      }
      @Override
      public Adapter caseDammy2(Dammy2 object)
      {
        return createDammy2Adapter();
      }
      @Override
      public Adapter caseDammy3(Dammy3 object)
      {
        return createDammy3Adapter();
      }
      @Override
      public Adapter caseDammy4(Dammy4 object)
      {
        return createDammy4Adapter();
      }
      @Override
      public Adapter caseDomainArtifacts(DomainArtifacts object)
      {
        return createDomainArtifactsAdapter();
      }
      @Override
      public Adapter caseDomainTypes(DomainTypes object)
      {
        return createDomainTypesAdapter();
      }
      @Override
      public Adapter caseDomainApplications(DomainApplications object)
      {
        return createDomainApplicationsAdapter();
      }
      @Override
      public Adapter caseDomainApplication(DomainApplication object)
      {
        return createDomainApplicationAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseBusinessObjects(BusinessObjects object)
      {
        return createBusinessObjectsAdapter();
      }
      @Override
      public Adapter caseRecipes(Recipes object)
      {
        return createRecipesAdapter();
      }
      @Override
      public Adapter caseMappers(Mappers object)
      {
        return createMappersAdapter();
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
   * Creates a new adapter for an object of class '{@link domain.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Dammy1 <em>Dammy1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Dammy1
   * @generated
   */
  public Adapter createDammy1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Dammy2 <em>Dammy2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Dammy2
   * @generated
   */
  public Adapter createDammy2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Dammy3 <em>Dammy3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Dammy3
   * @generated
   */
  public Adapter createDammy3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.Dammy4 <em>Dammy4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.Dammy4
   * @generated
   */
  public Adapter createDammy4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainArtifacts
   * @generated
   */
  public Adapter createDomainArtifactsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainTypes
   * @generated
   */
  public Adapter createDomainTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainApplications
   * @generated
   */
  public Adapter createDomainApplicationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link domain.DomainApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see domain.DomainApplication
   * @generated
   */
  public Adapter createDomainApplicationAdapter()
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
   * Creates a new adapter for an object of class '{@link recipe.Recipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see recipe.Recipes
   * @generated
   */
  public Adapter createRecipesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mapper.Mappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mapper.Mappers
   * @generated
   */
  public Adapter createMappersAdapter()
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

} //DomainAdapterFactory
