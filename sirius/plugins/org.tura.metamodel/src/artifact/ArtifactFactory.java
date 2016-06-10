/**
 */
package artifact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see artifact.ArtifactPackage
 * @generated
 */
public interface ArtifactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtifactFactory eINSTANCE = artifact.impl.ArtifactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifacts</em>'.
	 * @generated
	 */
	Artifacts createArtifacts();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Generation Hint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Hint</em>'.
	 * @generated
	 */
	GenerationHint createGenerationHint();

	/**
	 * Returns a new object of class '<em>Config Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Variable</em>'.
	 * @generated
	 */
	ConfigVariable createConfigVariable();

	/**
	 * Returns a new object of class '<em>Config Hash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Hash</em>'.
	 * @generated
	 */
	ConfigHash createConfigHash();

	/**
	 * Returns a new object of class '<em>Model Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Query</em>'.
	 * @generated
	 */
	ModelQuery createModelQuery();

	/**
	 * Returns a new object of class '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter</em>'.
	 * @generated
	 */
	QueryParameter createQueryParameter();

	/**
	 * Returns a new object of class '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technology</em>'.
	 * @generated
	 */
	Technology createTechnology();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArtifactPackage getArtifactPackage();

} //ArtifactFactory
