/**
 */
package infrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/infrastructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link infrastructure.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.EnterpriseInfrastructureImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getEnterpriseInfrastructure()
	 * @generated
	 */
	int ENTERPRISE_INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Datacenters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__DATACENTERS = 2;

	/**
	 * The feature id for the '<em><b>Infrastructure Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS = 3;

	/**
	 * The number of structural features of the '<em>Enterprise Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link infrastructure.impl.DatacenterImpl <em>Datacenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.DatacenterImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getDatacenter()
	 * @generated
	 */
	int DATACENTER = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__UID = 0;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__SUBSYSTEMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link infrastructure.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.SubsystemImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Infrastructure Layer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__INFRASTRUCTURE_LAYER = 2;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.InfrastructureLayerImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
	 * @generated
	 */
	int INFRASTRUCTURE_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Infrastructure Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link infrastructure.impl.InfrastructureConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.InfrastructureConnectionImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureConnection()
	 * @generated
	 */
	int INFRASTRUCTURE_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.InfrastructureComponentImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link infrastructure.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.ServerImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__UID = INFRASTRUCTURE_COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link infrastructure.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.RouterImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__UID = INFRASTRUCTURE_COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link infrastructure.impl.HubImpl <em>Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.HubImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getHub()
	 * @generated
	 */
	int HUB = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__UID = INFRASTRUCTURE_COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link infrastructure.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.StorageImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__UID = INFRASTRUCTURE_COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link infrastructure.impl.ServerClasterImpl <em>Server Claster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.impl.ServerClasterImpl
	 * @see infrastructure.impl.InfrastructurePackageImpl#getServerClaster()
	 * @generated
	 */
	int SERVER_CLASTER = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CLASTER__UID = INFRASTRUCTURE_COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CLASTER__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CLASTER__SERVERS = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server Claster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CLASTER_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link infrastructure.EnterpriseInfrastructure <em>Enterprise Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Infrastructure</em>'.
	 * @see infrastructure.EnterpriseInfrastructure
	 * @generated
	 */
	EClass getEnterpriseInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.EnterpriseInfrastructure#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.EnterpriseInfrastructure#getUid()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EAttribute getEnterpriseInfrastructure_Uid();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.EnterpriseInfrastructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see infrastructure.EnterpriseInfrastructure#getName()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EAttribute getEnterpriseInfrastructure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.EnterpriseInfrastructure#getDatacenters <em>Datacenters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datacenters</em>'.
	 * @see infrastructure.EnterpriseInfrastructure#getDatacenters()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EReference getEnterpriseInfrastructure_Datacenters();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.EnterpriseInfrastructure#getInfrastructureConnections <em>Infrastructure Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Connections</em>'.
	 * @see infrastructure.EnterpriseInfrastructure#getInfrastructureConnections()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EReference getEnterpriseInfrastructure_InfrastructureConnections();

	/**
	 * Returns the meta object for class '{@link infrastructure.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenter</em>'.
	 * @see infrastructure.Datacenter
	 * @generated
	 */
	EClass getDatacenter();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.Datacenter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.Datacenter#getUid()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.Datacenter#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see infrastructure.Datacenter#getSubsystems()
	 * @see #getDatacenter()
	 * @generated
	 */
	EReference getDatacenter_Subsystems();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.Datacenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see infrastructure.Datacenter#getName()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Name();

	/**
	 * Returns the meta object for class '{@link infrastructure.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see infrastructure.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.Subsystem#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.Subsystem#getUid()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Uid();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.Subsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see infrastructure.Subsystem#getName()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.Subsystem#getInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Layer</em>'.
	 * @see infrastructure.Subsystem#getInfrastructureLayer()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_InfrastructureLayer();

	/**
	 * Returns the meta object for class '{@link infrastructure.InfrastructureLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see infrastructure.InfrastructureLayer
	 * @generated
	 */
	EClass getInfrastructureLayer();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.InfrastructureLayer#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.InfrastructureLayer#getUid()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EAttribute getInfrastructureLayer_Uid();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.InfrastructureLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see infrastructure.InfrastructureLayer#getName()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EAttribute getInfrastructureLayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.InfrastructureLayer#getInfrastructureComponent <em>Infrastructure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Component</em>'.
	 * @see infrastructure.InfrastructureLayer#getInfrastructureComponent()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_InfrastructureComponent();

	/**
	 * Returns the meta object for class '{@link infrastructure.InfrastructureConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see infrastructure.InfrastructureConnection
	 * @generated
	 */
	EClass getInfrastructureConnection();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.InfrastructureConnection#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.InfrastructureConnection#getUid()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EAttribute getInfrastructureConnection_Uid();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.InfrastructureConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see infrastructure.InfrastructureConnection#getSource()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EReference getInfrastructureConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.InfrastructureConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see infrastructure.InfrastructureConnection#getTarget()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EReference getInfrastructureConnection_Target();

	/**
	 * Returns the meta object for class '{@link infrastructure.InfrastructureComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see infrastructure.InfrastructureComponent
	 * @generated
	 */
	EClass getInfrastructureComponent();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.InfrastructureComponent#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see infrastructure.InfrastructureComponent#getUid()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EAttribute getInfrastructureComponent_Uid();

	/**
	 * Returns the meta object for the attribute '{@link infrastructure.InfrastructureComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see infrastructure.InfrastructureComponent#getName()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EAttribute getInfrastructureComponent_Name();

	/**
	 * Returns the meta object for class '{@link infrastructure.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see infrastructure.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link infrastructure.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see infrastructure.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link infrastructure.Hub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub</em>'.
	 * @see infrastructure.Hub
	 * @generated
	 */
	EClass getHub();

	/**
	 * Returns the meta object for class '{@link infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see infrastructure.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link infrastructure.ServerClaster <em>Server Claster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Claster</em>'.
	 * @see infrastructure.ServerClaster
	 * @generated
	 */
	EClass getServerClaster();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.ServerClaster#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see infrastructure.ServerClaster#getServers()
	 * @see #getServerClaster()
	 * @generated
	 */
	EReference getServerClaster_Servers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link infrastructure.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.EnterpriseInfrastructureImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getEnterpriseInfrastructure()
		 * @generated
		 */
		EClass ENTERPRISE_INFRASTRUCTURE = eINSTANCE.getEnterpriseInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_INFRASTRUCTURE__UID = eINSTANCE.getEnterpriseInfrastructure_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_INFRASTRUCTURE__NAME = eINSTANCE.getEnterpriseInfrastructure_Name();

		/**
		 * The meta object literal for the '<em><b>Datacenters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_INFRASTRUCTURE__DATACENTERS = eINSTANCE.getEnterpriseInfrastructure_Datacenters();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS = eINSTANCE.getEnterpriseInfrastructure_InfrastructureConnections();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.DatacenterImpl <em>Datacenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.DatacenterImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getDatacenter()
		 * @generated
		 */
		EClass DATACENTER = eINSTANCE.getDatacenter();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__UID = eINSTANCE.getDatacenter_Uid();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATACENTER__SUBSYSTEMS = eINSTANCE.getDatacenter_Subsystems();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__NAME = eINSTANCE.getDatacenter_Name();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.SubsystemImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__UID = eINSTANCE.getSubsystem_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__NAME = eINSTANCE.getSubsystem_Name();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Layer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__INFRASTRUCTURE_LAYER = eINSTANCE.getSubsystem_InfrastructureLayer();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.InfrastructureLayerImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
		 * @generated
		 */
		EClass INFRASTRUCTURE_LAYER = eINSTANCE.getInfrastructureLayer();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_LAYER__UID = eINSTANCE.getInfrastructureLayer_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_LAYER__NAME = eINSTANCE.getInfrastructureLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureLayer_InfrastructureComponent();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.InfrastructureConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.InfrastructureConnectionImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureConnection()
		 * @generated
		 */
		EClass INFRASTRUCTURE_CONNECTION = eINSTANCE.getInfrastructureConnection();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_CONNECTION__UID = eINSTANCE.getInfrastructureConnection_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CONNECTION__SOURCE = eINSTANCE.getInfrastructureConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CONNECTION__TARGET = eINSTANCE.getInfrastructureConnection_Target();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.InfrastructureComponentImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureComponent();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_COMPONENT__UID = eINSTANCE.getInfrastructureComponent_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_COMPONENT__NAME = eINSTANCE.getInfrastructureComponent_Name();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.ServerImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.RouterImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.HubImpl <em>Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.HubImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getHub()
		 * @generated
		 */
		EClass HUB = eINSTANCE.getHub();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.StorageImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link infrastructure.impl.ServerClasterImpl <em>Server Claster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.impl.ServerClasterImpl
		 * @see infrastructure.impl.InfrastructurePackageImpl#getServerClaster()
		 * @generated
		 */
		EClass SERVER_CLASTER = eINSTANCE.getServerClaster();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CLASTER__SERVERS = eINSTANCE.getServerClaster_Servers();

	}

} //InfrastructurePackage
