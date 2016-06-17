/**
 */
package tura.application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tura.application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationFactory eINSTANCE = tura.application.impl.ApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	ApplicationGroup createApplicationGroup();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Infrastructure Layers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Layers</em>'.
	 * @generated
	 */
	ApplicationInfrastructureLayers createApplicationInfrastructureLayers();

	/**
	 * Returns a new object of class '<em>Infrastructure Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Layer</em>'.
	 * @generated
	 */
	ApplicationInfrastructureLayer createApplicationInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Message Libraries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Libraries</em>'.
	 * @generated
	 */
	ApplicationMessageLibraries createApplicationMessageLibraries();

	/**
	 * Returns a new object of class '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Languages</em>'.
	 * @generated
	 */
	ApplicationLanguages createApplicationLanguages();

	/**
	 * Returns a new object of class '<em>Message Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Library</em>'.
	 * @generated
	 */
	ApplicationMessageLibrary createApplicationMessageLibrary();

	/**
	 * Returns a new object of class '<em>Realms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realms</em>'.
	 * @generated
	 */
	ApplicationRealms createApplicationRealms();

	/**
	 * Returns a new object of class '<em>Realm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realm</em>'.
	 * @generated
	 */
	ApplicationRealm createApplicationRealm();

	/**
	 * Returns a new object of class '<em>Style Libraries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Libraries</em>'.
	 * @generated
	 */
	ApplicationStyleLibraries createApplicationStyleLibraries();

	/**
	 * Returns a new object of class '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style</em>'.
	 * @generated
	 */
	ApplicationStyle createApplicationStyle();

	/**
	 * Returns a new object of class '<em>UI Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Layer</em>'.
	 * @generated
	 */
	ApplicationUILayer createApplicationUILayer();

	/**
	 * Returns a new object of class '<em>UI Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Package</em>'.
	 * @generated
	 */
	ApplicationUIPackage createApplicationUIPackage();

	/**
	 * Returns a new object of class '<em>Recipes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipes</em>'.
	 * @generated
	 */
	ApplicationRecipes createApplicationRecipes();

	/**
	 * Returns a new object of class '<em>Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe</em>'.
	 * @generated
	 */
	ApplicationRecipe createApplicationRecipe();

	/**
	 * Returns a new object of class '<em>Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mappers</em>'.
	 * @generated
	 */
	ApplicationMappers createApplicationMappers();

	/**
	 * Returns a new object of class '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapper</em>'.
	 * @generated
	 */
	ApplicationMapper createApplicationMapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory
