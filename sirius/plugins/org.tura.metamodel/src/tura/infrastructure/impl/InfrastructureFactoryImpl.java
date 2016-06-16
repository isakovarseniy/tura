/**
 */
package tura.infrastructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tura.infrastructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureFactoryImpl extends EFactoryImpl implements InfrastructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureFactory init() {
		try {
			InfrastructureFactory theInfrastructureFactory = (InfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(InfrastructurePackage.eNS_URI);
			if (theInfrastructureFactory != null) {
				return theInfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfrastructurePackage.ENTERPRISE_INFRASTRUCTURE: return createEnterpriseInfrastructure();
			case InfrastructurePackage.DATACENTER: return createDatacenter();
			case InfrastructurePackage.SUBSYSTEM: return createSubsystem();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER: return createInfrastructureLayer();
			case InfrastructurePackage.INFRASTRUCTURE_CONNECTION: return createInfrastructureConnection();
			case InfrastructurePackage.INFRASTRUCTURE_COMPONENT: return createInfrastructureComponent();
			case InfrastructurePackage.SERVER: return createServer();
			case InfrastructurePackage.ROUTER: return createRouter();
			case InfrastructurePackage.HUB: return createHub();
			case InfrastructurePackage.STORAGE: return createStorage();
			case InfrastructurePackage.SERVER_CLASTER: return createServerClaster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseInfrastructure createEnterpriseInfrastructure() {
		EnterpriseInfrastructureImpl enterpriseInfrastructure = new EnterpriseInfrastructureImpl();
		return enterpriseInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenter createDatacenter() {
		DatacenterImpl datacenter = new DatacenterImpl();
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureLayer createInfrastructureLayer() {
		InfrastructureLayerImpl infrastructureLayer = new InfrastructureLayerImpl();
		return infrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureConnection createInfrastructureConnection() {
		InfrastructureConnectionImpl infrastructureConnection = new InfrastructureConnectionImpl();
		return infrastructureConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent createInfrastructureComponent() {
		InfrastructureComponentImpl infrastructureComponent = new InfrastructureComponentImpl();
		return infrastructureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hub createHub() {
		HubImpl hub = new HubImpl();
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerClaster createServerClaster() {
		ServerClasterImpl serverClaster = new ServerClasterImpl();
		return serverClaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePackage getInfrastructurePackage() {
		return (InfrastructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfrastructurePackage getPackage() {
		return InfrastructurePackage.eINSTANCE;
	}

} //InfrastructureFactoryImpl
