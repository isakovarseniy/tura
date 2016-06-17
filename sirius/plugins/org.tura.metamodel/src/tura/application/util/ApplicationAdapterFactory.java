/**
 */
package tura.application.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tura.application.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tura.application.ApplicationPackage
 * @generated
 */
public class ApplicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected ApplicationSwitch<Adapter> modelSwitch =
		new ApplicationSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationGroup(ApplicationGroup object) {
				return createApplicationGroupAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseApplicationInfrastructureLayers(ApplicationInfrastructureLayers object) {
				return createApplicationInfrastructureLayersAdapter();
			}
			@Override
			public Adapter caseApplicationInfrastructureLayer(ApplicationInfrastructureLayer object) {
				return createApplicationInfrastructureLayerAdapter();
			}
			@Override
			public Adapter caseApplicationMessageLibraries(ApplicationMessageLibraries object) {
				return createApplicationMessageLibrariesAdapter();
			}
			@Override
			public Adapter caseApplicationLanguages(ApplicationLanguages object) {
				return createApplicationLanguagesAdapter();
			}
			@Override
			public Adapter caseApplicationMessageLibrary(ApplicationMessageLibrary object) {
				return createApplicationMessageLibraryAdapter();
			}
			@Override
			public Adapter caseApplicationRealms(ApplicationRealms object) {
				return createApplicationRealmsAdapter();
			}
			@Override
			public Adapter caseApplicationRealm(ApplicationRealm object) {
				return createApplicationRealmAdapter();
			}
			@Override
			public Adapter caseApplicationStyleLibraries(ApplicationStyleLibraries object) {
				return createApplicationStyleLibrariesAdapter();
			}
			@Override
			public Adapter caseApplicationStyle(ApplicationStyle object) {
				return createApplicationStyleAdapter();
			}
			@Override
			public Adapter caseApplicationUILayer(ApplicationUILayer object) {
				return createApplicationUILayerAdapter();
			}
			@Override
			public Adapter caseApplicationUIPackage(ApplicationUIPackage object) {
				return createApplicationUIPackageAdapter();
			}
			@Override
			public Adapter caseApplicationRecipes(ApplicationRecipes object) {
				return createApplicationRecipesAdapter();
			}
			@Override
			public Adapter caseApplicationRecipe(ApplicationRecipe object) {
				return createApplicationRecipeAdapter();
			}
			@Override
			public Adapter caseApplicationMappers(ApplicationMappers object) {
				return createApplicationMappersAdapter();
			}
			@Override
			public Adapter caseApplicationMapper(ApplicationMapper object) {
				return createApplicationMapperAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationGroup
	 * @generated
	 */
	public Adapter createApplicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationInfrastructureLayers <em>Infrastructure Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationInfrastructureLayers
	 * @generated
	 */
	public Adapter createApplicationInfrastructureLayersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationInfrastructureLayer
	 * @generated
	 */
	public Adapter createApplicationInfrastructureLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationMessageLibraries <em>Message Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationMessageLibraries
	 * @generated
	 */
	public Adapter createApplicationMessageLibrariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationLanguages
	 * @generated
	 */
	public Adapter createApplicationLanguagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationMessageLibrary <em>Message Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationMessageLibrary
	 * @generated
	 */
	public Adapter createApplicationMessageLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationRealms <em>Realms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationRealms
	 * @generated
	 */
	public Adapter createApplicationRealmsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationRealm <em>Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationRealm
	 * @generated
	 */
	public Adapter createApplicationRealmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationStyleLibraries <em>Style Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationStyleLibraries
	 * @generated
	 */
	public Adapter createApplicationStyleLibrariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationStyle
	 * @generated
	 */
	public Adapter createApplicationStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationUILayer <em>UI Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationUILayer
	 * @generated
	 */
	public Adapter createApplicationUILayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationUIPackage <em>UI Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationUIPackage
	 * @generated
	 */
	public Adapter createApplicationUIPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationRecipes
	 * @generated
	 */
	public Adapter createApplicationRecipesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationRecipe
	 * @generated
	 */
	public Adapter createApplicationRecipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationMappers
	 * @generated
	 */
	public Adapter createApplicationMappersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.application.ApplicationMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.application.ApplicationMapper
	 * @generated
	 */
	public Adapter createApplicationMapperAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationAdapterFactory
