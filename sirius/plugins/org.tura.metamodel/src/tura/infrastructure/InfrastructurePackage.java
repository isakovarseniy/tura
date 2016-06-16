/**
 */
package tura.infrastructure;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tura.infrastructure.InfrastructureFactory
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
	InfrastructurePackage eINSTANCE = tura.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.EnterpriseInfrastructureImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getEnterpriseInfrastructure()
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
	 * The feature id for the '<em><b>Datacenters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__DATACENTERS = 1;

	/**
	 * The feature id for the '<em><b>Infrastructure Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE__INFRASTRUCTURE_CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Enterprise Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enterprise Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.DatacenterImpl <em>Datacenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.DatacenterImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getDatacenter()
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
	 * The number of operations of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.SubsystemImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getSubsystem()
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
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.InfrastructureLayerImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
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
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.InfrastructureConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.InfrastructureConnectionImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureConnection()
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
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION__MASTER = 1;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION__DETAIL = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.InfrastructureComponentImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
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
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.ServerImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getServer()
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
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.RouterImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getRouter()
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
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.HubImpl <em>Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.HubImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getHub()
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
	 * The number of operations of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.StorageImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getStorage()
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
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tura.infrastructure.impl.ServerClasterImpl <em>Server Claster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tura.infrastructure.impl.ServerClasterImpl
	 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getServerClaster()
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
	 * The number of operations of the '<em>Server Claster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CLASTER_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tura.infrastructure.EnterpriseInfrastructure <em>Enterprise Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Infrastructure</em>'.
	 * @see tura.infrastructure.EnterpriseInfrastructure
	 * @generated
	 */
	EClass getEnterpriseInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.EnterpriseInfrastructure#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.EnterpriseInfrastructure#getUid()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EAttribute getEnterpriseInfrastructure_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.EnterpriseInfrastructure#getDatacenters <em>Datacenters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datacenters</em>'.
	 * @see tura.infrastructure.EnterpriseInfrastructure#getDatacenters()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EReference getEnterpriseInfrastructure_Datacenters();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.EnterpriseInfrastructure#getInfrastructureConnections <em>Infrastructure Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Connections</em>'.
	 * @see tura.infrastructure.EnterpriseInfrastructure#getInfrastructureConnections()
	 * @see #getEnterpriseInfrastructure()
	 * @generated
	 */
	EReference getEnterpriseInfrastructure_InfrastructureConnections();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenter</em>'.
	 * @see tura.infrastructure.Datacenter
	 * @generated
	 */
	EClass getDatacenter();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.Datacenter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.Datacenter#getUid()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.Datacenter#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see tura.infrastructure.Datacenter#getSubsystems()
	 * @see #getDatacenter()
	 * @generated
	 */
	EReference getDatacenter_Subsystems();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.Datacenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.infrastructure.Datacenter#getName()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Name();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see tura.infrastructure.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.Subsystem#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.Subsystem#getUid()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.Subsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.infrastructure.Subsystem#getName()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.Subsystem#getInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Layer</em>'.
	 * @see tura.infrastructure.Subsystem#getInfrastructureLayer()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_InfrastructureLayer();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.InfrastructureLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see tura.infrastructure.InfrastructureLayer
	 * @generated
	 */
	EClass getInfrastructureLayer();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.InfrastructureLayer#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.InfrastructureLayer#getUid()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EAttribute getInfrastructureLayer_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.InfrastructureLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.infrastructure.InfrastructureLayer#getName()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EAttribute getInfrastructureLayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.InfrastructureLayer#getInfrastructureComponent <em>Infrastructure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Component</em>'.
	 * @see tura.infrastructure.InfrastructureLayer#getInfrastructureComponent()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_InfrastructureComponent();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.InfrastructureConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see tura.infrastructure.InfrastructureConnection
	 * @generated
	 */
	EClass getInfrastructureConnection();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.InfrastructureConnection#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.InfrastructureConnection#getUid()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EAttribute getInfrastructureConnection_Uid();

	/**
	 * Returns the meta object for the reference '{@link tura.infrastructure.InfrastructureConnection#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see tura.infrastructure.InfrastructureConnection#getMaster()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EReference getInfrastructureConnection_Master();

	/**
	 * Returns the meta object for the reference '{@link tura.infrastructure.InfrastructureConnection#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail</em>'.
	 * @see tura.infrastructure.InfrastructureConnection#getDetail()
	 * @see #getInfrastructureConnection()
	 * @generated
	 */
	EReference getInfrastructureConnection_Detail();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.InfrastructureComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see tura.infrastructure.InfrastructureComponent
	 * @generated
	 */
	EClass getInfrastructureComponent();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.InfrastructureComponent#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see tura.infrastructure.InfrastructureComponent#getUid()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EAttribute getInfrastructureComponent_Uid();

	/**
	 * Returns the meta object for the attribute '{@link tura.infrastructure.InfrastructureComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tura.infrastructure.InfrastructureComponent#getName()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EAttribute getInfrastructureComponent_Name();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see tura.infrastructure.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see tura.infrastructure.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Hub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub</em>'.
	 * @see tura.infrastructure.Hub
	 * @generated
	 */
	EClass getHub();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see tura.infrastructure.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link tura.infrastructure.ServerClaster <em>Server Claster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Claster</em>'.
	 * @see tura.infrastructure.ServerClaster
	 * @generated
	 */
	EClass getServerClaster();

	/**
	 * Returns the meta object for the containment reference list '{@link tura.infrastructure.ServerClaster#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see tura.infrastructure.ServerClaster#getServers()
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.EnterpriseInfrastructureImpl <em>Enterprise Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.EnterpriseInfrastructureImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getEnterpriseInfrastructure()
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
		 * The meta object literal for the '{@link tura.infrastructure.impl.DatacenterImpl <em>Datacenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.DatacenterImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getDatacenter()
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
		 * The meta object literal for the '{@link tura.infrastructure.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.SubsystemImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getSubsystem()
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
		 * The meta object literal for the '{@link tura.infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.InfrastructureLayerImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
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
		 * The meta object literal for the '{@link tura.infrastructure.impl.InfrastructureConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.InfrastructureConnectionImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureConnection()
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
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CONNECTION__MASTER = eINSTANCE.getInfrastructureConnection_Master();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CONNECTION__DETAIL = eINSTANCE.getInfrastructureConnection_Detail();

		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.InfrastructureComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.InfrastructureComponentImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureComponent()
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
		 * The meta object literal for the '{@link tura.infrastructure.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.ServerImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.RouterImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.HubImpl <em>Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.HubImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getHub()
		 * @generated
		 */
		EClass HUB = eINSTANCE.getHub();

		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.StorageImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link tura.infrastructure.impl.ServerClasterImpl <em>Server Claster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tura.infrastructure.impl.ServerClasterImpl
		 * @see tura.infrastructure.impl.InfrastructurePackageImpl#getServerClaster()
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
