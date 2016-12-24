/**
 */
package mapper.impl;

import mapper.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperFactoryImpl extends EFactoryImpl implements MapperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapperFactory init() {
		try {
			MapperFactory theMapperFactory = (MapperFactory)EPackage.Registry.INSTANCE.getEFactory(MapperPackage.eNS_URI);
			if (theMapperFactory != null) {
				return theMapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MapperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperFactoryImpl() {
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
			case MapperPackage.MAPPERS: return createMappers();
			case MapperPackage.MAPPER: return createMapper();
			case MapperPackage.MAPPING_LAYER: return createMappingLayer();
			case MapperPackage.TYPE_MAPPER: return createTypeMapper();
			case MapperPackage.PACKAGE_MAPPER: return createPackageMapper();
			case MapperPackage.JAVA_MAPPER: return createJavaMapper();
			case MapperPackage.JAVA_PACKAGE_MAPPER: return createJavaPackageMapper();
			case MapperPackage.JAVA_SCRIPT_MAPPER: return createJavaScriptMapper();
			case MapperPackage.CSS_MAPPER: return createCSSMapper();
			case MapperPackage.ROLE_MAPPER: return createRoleMapper();
			case MapperPackage.XML_PACKAGE_MAPPER: return createXMLPackageMapper();
			case MapperPackage.XML_TYPE_MAPPER: return createXMLTypeMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mappers createMappers() {
		MappersImpl mappers = new MappersImpl();
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapper createMapper() {
		MapperImpl mapper = new MapperImpl();
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingLayer createMappingLayer() {
		MappingLayerImpl mappingLayer = new MappingLayerImpl();
		return mappingLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapper createTypeMapper() {
		TypeMapperImpl typeMapper = new TypeMapperImpl();
		return typeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMapper createPackageMapper() {
		PackageMapperImpl packageMapper = new PackageMapperImpl();
		return packageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMapper createJavaMapper() {
		JavaMapperImpl javaMapper = new JavaMapperImpl();
		return javaMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackageMapper createJavaPackageMapper() {
		JavaPackageMapperImpl javaPackageMapper = new JavaPackageMapperImpl();
		return javaPackageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptMapper createJavaScriptMapper() {
		JavaScriptMapperImpl javaScriptMapper = new JavaScriptMapperImpl();
		return javaScriptMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSSMapper createCSSMapper() {
		CSSMapperImpl cssMapper = new CSSMapperImpl();
		return cssMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleMapper createRoleMapper() {
		RoleMapperImpl roleMapper = new RoleMapperImpl();
		return roleMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLPackageMapper createXMLPackageMapper() {
		XMLPackageMapperImpl xmlPackageMapper = new XMLPackageMapperImpl();
		return xmlPackageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTypeMapper createXMLTypeMapper() {
		XMLTypeMapperImpl xmlTypeMapper = new XMLTypeMapperImpl();
		return xmlTypeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperPackage getMapperPackage() {
		return (MapperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MapperPackage getPackage() {
		return MapperPackage.eINSTANCE;
	}

} //MapperFactoryImpl
