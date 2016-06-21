/**
 */
package infrastructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see infrastructure.InfrastructurePackage
 * @generated
 */
public interface InfrastructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructureFactory eINSTANCE = infrastructure.impl.InfrastructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Infrastructure</em>'.
	 * @generated
	 */
	EnterpriseInfrastructure createEnterpriseInfrastructure();

	/**
	 * Returns a new object of class '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenter</em>'.
	 * @generated
	 */
	Datacenter createDatacenter();

	/**
	 * Returns a new object of class '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsystem</em>'.
	 * @generated
	 */
	Subsystem createSubsystem();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	InfrastructureLayer createInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	InfrastructureConnection createInfrastructureConnection();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	InfrastructureComponent createInfrastructureComponent();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router</em>'.
	 * @generated
	 */
	Router createRouter();

	/**
	 * Returns a new object of class '<em>Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hub</em>'.
	 * @generated
	 */
	Hub createHub();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Server Claster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Claster</em>'.
	 * @generated
	 */
	ServerClaster createServerClaster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfrastructurePackage getInfrastructurePackage();

} //InfrastructureFactory
