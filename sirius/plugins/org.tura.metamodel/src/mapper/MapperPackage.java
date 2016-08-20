/**
 */
package mapper;

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
 * @see mapper.MapperFactory
 * @model kind="package"
 * @generated
 */
public interface MapperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/mapper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.mapper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapperPackage eINSTANCE = mapper.impl.MapperPackageImpl.init();

	/**
	 * The meta object id for the '{@link mapper.impl.MappersImpl <em>Mappers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.MappersImpl
	 * @see mapper.impl.MapperPackageImpl#getMappers()
	 * @generated
	 */
	int MAPPERS = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPERS__MAPPERS = 1;

	/**
	 * The number of structural features of the '<em>Mappers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPERS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mapper.impl.MapperImpl <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.MapperImpl
	 * @see mapper.impl.MapperPackageImpl#getMapper()
	 * @generated
	 */
	int MAPPER = 1;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__SERVICE_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__UI_LAYER = 1;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mapper.impl.TypeMapperImpl <em>Type Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.TypeMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getTypeMapper()
	 * @generated
	 */
	int TYPE_MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPER__TYPE_REF = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mapper.impl.PackageMapperImpl <em>Package Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.PackageMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getPackageMapper()
	 * @generated
	 */
	int PACKAGE_MAPPER = 3;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MAPPER__PACKAGE_REF = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mapper.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.JavaMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getJavaMapper()
	 * @generated
	 */
	int JAVA_MAPPER = 4;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__SERVICE_LAYER = TYPE_MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__UI_LAYER = TYPE_MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__TYPE_REF = TYPE_MAPPER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__UID = TYPE_MAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapped To Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = TYPE_MAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapped To Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__MAPPED_TO_CLASS_NAME = TYPE_MAPPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__ARTIFACT_ID = TYPE_MAPPER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__GROUP_ID = TYPE_MAPPER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__VERSION = TYPE_MAPPER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__LIBRARY_NAME = TYPE_MAPPER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER__ARTIFACT_TYPE = TYPE_MAPPER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Java Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAPPER_FEATURE_COUNT = TYPE_MAPPER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link mapper.impl.JavaPackageMapperImpl <em>Java Package Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.JavaPackageMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getJavaPackageMapper()
	 * @generated
	 */
	int JAVA_PACKAGE_MAPPER = 5;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__SERVICE_LAYER = PACKAGE_MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__UI_LAYER = PACKAGE_MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__PACKAGE_REF = PACKAGE_MAPPER__PACKAGE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__UID = PACKAGE_MAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapped To Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME = PACKAGE_MAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__ARTIFACT_ID = PACKAGE_MAPPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__GROUP_ID = PACKAGE_MAPPER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__VERSION = PACKAGE_MAPPER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__LIBRARY_NAME = PACKAGE_MAPPER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE = PACKAGE_MAPPER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Java Package Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_MAPPER_FEATURE_COUNT = PACKAGE_MAPPER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link mapper.impl.JavaScriptMapperImpl <em>Java Script Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.JavaScriptMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getJavaScriptMapper()
	 * @generated
	 */
	int JAVA_SCRIPT_MAPPER = 6;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER__SERVICE_LAYER = TYPE_MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER__UI_LAYER = TYPE_MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER__TYPE_REF = TYPE_MAPPER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER__UID = TYPE_MAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER__LIBRARY_URL = TYPE_MAPPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Script Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_MAPPER_FEATURE_COUNT = TYPE_MAPPER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mapper.impl.CSSMapperImpl <em>CSS Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.CSSMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getCSSMapper()
	 * @generated
	 */
	int CSS_MAPPER = 7;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Style Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER__STYLE_LIBRARY = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER__UID = MAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Library Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER__LIBRARY_URL = MAPPER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSS Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mapper.impl.RoleMapperImpl <em>Role Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapper.impl.RoleMapperImpl
	 * @see mapper.impl.MapperPackageImpl#getRoleMapper()
	 * @generated
	 */
	int ROLE_MAPPER = 8;

	/**
	 * The feature id for the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__SERVICE_LAYER = MAPPER__SERVICE_LAYER;

	/**
	 * The feature id for the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__UI_LAYER = MAPPER__UI_LAYER;

	/**
	 * The feature id for the '<em><b>Security Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__SECURITY_ENTITY = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__UID = MAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__LOCAL_ROLE_NAME = MAPPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Global Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER__GLOBAL_ROLE_NAME = MAPPER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link mapper.Mappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappers</em>'.
	 * @see mapper.Mappers
	 * @generated
	 */
	EClass getMappers();

	/**
	 * Returns the meta object for the attribute '{@link mapper.Mappers#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.Mappers#getUid()
	 * @see #getMappers()
	 * @generated
	 */
	EAttribute getMappers_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link mapper.Mappers#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappers</em>'.
	 * @see mapper.Mappers#getMappers()
	 * @see #getMappers()
	 * @generated
	 */
	EReference getMappers_Mappers();

	/**
	 * Returns the meta object for class '{@link mapper.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see mapper.Mapper
	 * @generated
	 */
	EClass getMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.Mapper#isServiceLayer <em>Service Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Layer</em>'.
	 * @see mapper.Mapper#isServiceLayer()
	 * @see #getMapper()
	 * @generated
	 */
	EAttribute getMapper_ServiceLayer();

	/**
	 * Returns the meta object for the attribute '{@link mapper.Mapper#isUiLayer <em>Ui Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Layer</em>'.
	 * @see mapper.Mapper#isUiLayer()
	 * @see #getMapper()
	 * @generated
	 */
	EAttribute getMapper_UiLayer();

	/**
	 * Returns the meta object for class '{@link mapper.TypeMapper <em>Type Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapper</em>'.
	 * @see mapper.TypeMapper
	 * @generated
	 */
	EClass getTypeMapper();

	/**
	 * Returns the meta object for class '{@link mapper.PackageMapper <em>Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Mapper</em>'.
	 * @see mapper.PackageMapper
	 * @generated
	 */
	EClass getPackageMapper();

	/**
	 * Returns the meta object for class '{@link mapper.JavaMapper <em>Java Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Mapper</em>'.
	 * @see mapper.JavaMapper
	 * @generated
	 */
	EClass getJavaMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.JavaMapper#getUid()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped To Package Name</em>'.
	 * @see mapper.JavaMapper#getMappedToPackageName()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_MappedToPackageName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped To Class Name</em>'.
	 * @see mapper.JavaMapper#getMappedToClassName()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_MappedToClassName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see mapper.JavaMapper#getArtifactId()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see mapper.JavaMapper#getGroupId()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mapper.JavaMapper#getVersion()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_Version();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see mapper.JavaMapper#getLibraryName()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaMapper#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see mapper.JavaMapper#getArtifactType()
	 * @see #getJavaMapper()
	 * @generated
	 */
	EAttribute getJavaMapper_ArtifactType();

	/**
	 * Returns the meta object for class '{@link mapper.JavaPackageMapper <em>Java Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Package Mapper</em>'.
	 * @see mapper.JavaPackageMapper
	 * @generated
	 */
	EClass getJavaPackageMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.JavaPackageMapper#getUid()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getMappedToPackageName <em>Mapped To Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped To Package Name</em>'.
	 * @see mapper.JavaPackageMapper#getMappedToPackageName()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_MappedToPackageName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see mapper.JavaPackageMapper#getArtifactId()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see mapper.JavaPackageMapper#getGroupId()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mapper.JavaPackageMapper#getVersion()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_Version();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see mapper.JavaPackageMapper#getLibraryName()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaPackageMapper#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see mapper.JavaPackageMapper#getArtifactType()
	 * @see #getJavaPackageMapper()
	 * @generated
	 */
	EAttribute getJavaPackageMapper_ArtifactType();

	/**
	 * Returns the meta object for class '{@link mapper.JavaScriptMapper <em>Java Script Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script Mapper</em>'.
	 * @see mapper.JavaScriptMapper
	 * @generated
	 */
	EClass getJavaScriptMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaScriptMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.JavaScriptMapper#getUid()
	 * @see #getJavaScriptMapper()
	 * @generated
	 */
	EAttribute getJavaScriptMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link mapper.JavaScriptMapper#getLibraryUrl <em>Library Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Url</em>'.
	 * @see mapper.JavaScriptMapper#getLibraryUrl()
	 * @see #getJavaScriptMapper()
	 * @generated
	 */
	EAttribute getJavaScriptMapper_LibraryUrl();

	/**
	 * Returns the meta object for class '{@link mapper.CSSMapper <em>CSS Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSS Mapper</em>'.
	 * @see mapper.CSSMapper
	 * @generated
	 */
	EClass getCSSMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.CSSMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.CSSMapper#getUid()
	 * @see #getCSSMapper()
	 * @generated
	 */
	EAttribute getCSSMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link mapper.CSSMapper#getLibraryUrl <em>Library Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Url</em>'.
	 * @see mapper.CSSMapper#getLibraryUrl()
	 * @see #getCSSMapper()
	 * @generated
	 */
	EAttribute getCSSMapper_LibraryUrl();

	/**
	 * Returns the meta object for class '{@link mapper.RoleMapper <em>Role Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Mapper</em>'.
	 * @see mapper.RoleMapper
	 * @generated
	 */
	EClass getRoleMapper();

	/**
	 * Returns the meta object for the attribute '{@link mapper.RoleMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see mapper.RoleMapper#getUid()
	 * @see #getRoleMapper()
	 * @generated
	 */
	EAttribute getRoleMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link mapper.RoleMapper#getLocalRoleName <em>Local Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Role Name</em>'.
	 * @see mapper.RoleMapper#getLocalRoleName()
	 * @see #getRoleMapper()
	 * @generated
	 */
	EAttribute getRoleMapper_LocalRoleName();

	/**
	 * Returns the meta object for the attribute '{@link mapper.RoleMapper#getGlobalRoleName <em>Global Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Role Name</em>'.
	 * @see mapper.RoleMapper#getGlobalRoleName()
	 * @see #getRoleMapper()
	 * @generated
	 */
	EAttribute getRoleMapper_GlobalRoleName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MapperFactory getMapperFactory();

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
		 * The meta object literal for the '{@link mapper.impl.MappersImpl <em>Mappers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.MappersImpl
		 * @see mapper.impl.MapperPackageImpl#getMappers()
		 * @generated
		 */
		EClass MAPPERS = eINSTANCE.getMappers();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPERS__UID = eINSTANCE.getMappers_Uid();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPERS__MAPPERS = eINSTANCE.getMappers_Mappers();

		/**
		 * The meta object literal for the '{@link mapper.impl.MapperImpl <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.MapperImpl
		 * @see mapper.impl.MapperPackageImpl#getMapper()
		 * @generated
		 */
		EClass MAPPER = eINSTANCE.getMapper();

		/**
		 * The meta object literal for the '<em><b>Service Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPER__SERVICE_LAYER = eINSTANCE.getMapper_ServiceLayer();

		/**
		 * The meta object literal for the '<em><b>Ui Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPER__UI_LAYER = eINSTANCE.getMapper_UiLayer();

		/**
		 * The meta object literal for the '{@link mapper.impl.TypeMapperImpl <em>Type Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.TypeMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getTypeMapper()
		 * @generated
		 */
		EClass TYPE_MAPPER = eINSTANCE.getTypeMapper();

		/**
		 * The meta object literal for the '{@link mapper.impl.PackageMapperImpl <em>Package Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.PackageMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getPackageMapper()
		 * @generated
		 */
		EClass PACKAGE_MAPPER = eINSTANCE.getPackageMapper();

		/**
		 * The meta object literal for the '{@link mapper.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.JavaMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getJavaMapper()
		 * @generated
		 */
		EClass JAVA_MAPPER = eINSTANCE.getJavaMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__UID = eINSTANCE.getJavaMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Mapped To Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = eINSTANCE.getJavaMapper_MappedToPackageName();

		/**
		 * The meta object literal for the '<em><b>Mapped To Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__MAPPED_TO_CLASS_NAME = eINSTANCE.getJavaMapper_MappedToClassName();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__ARTIFACT_ID = eINSTANCE.getJavaMapper_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__GROUP_ID = eINSTANCE.getJavaMapper_GroupId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__VERSION = eINSTANCE.getJavaMapper_Version();

		/**
		 * The meta object literal for the '<em><b>Library Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__LIBRARY_NAME = eINSTANCE.getJavaMapper_LibraryName();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MAPPER__ARTIFACT_TYPE = eINSTANCE.getJavaMapper_ArtifactType();

		/**
		 * The meta object literal for the '{@link mapper.impl.JavaPackageMapperImpl <em>Java Package Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.JavaPackageMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getJavaPackageMapper()
		 * @generated
		 */
		EClass JAVA_PACKAGE_MAPPER = eINSTANCE.getJavaPackageMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__UID = eINSTANCE.getJavaPackageMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Mapped To Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME = eINSTANCE.getJavaPackageMapper_MappedToPackageName();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__ARTIFACT_ID = eINSTANCE.getJavaPackageMapper_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__GROUP_ID = eINSTANCE.getJavaPackageMapper_GroupId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__VERSION = eINSTANCE.getJavaPackageMapper_Version();

		/**
		 * The meta object literal for the '<em><b>Library Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__LIBRARY_NAME = eINSTANCE.getJavaPackageMapper_LibraryName();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE = eINSTANCE.getJavaPackageMapper_ArtifactType();

		/**
		 * The meta object literal for the '{@link mapper.impl.JavaScriptMapperImpl <em>Java Script Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.JavaScriptMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getJavaScriptMapper()
		 * @generated
		 */
		EClass JAVA_SCRIPT_MAPPER = eINSTANCE.getJavaScriptMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SCRIPT_MAPPER__UID = eINSTANCE.getJavaScriptMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Library Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SCRIPT_MAPPER__LIBRARY_URL = eINSTANCE.getJavaScriptMapper_LibraryUrl();

		/**
		 * The meta object literal for the '{@link mapper.impl.CSSMapperImpl <em>CSS Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.CSSMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getCSSMapper()
		 * @generated
		 */
		EClass CSS_MAPPER = eINSTANCE.getCSSMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_MAPPER__UID = eINSTANCE.getCSSMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Library Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_MAPPER__LIBRARY_URL = eINSTANCE.getCSSMapper_LibraryUrl();

		/**
		 * The meta object literal for the '{@link mapper.impl.RoleMapperImpl <em>Role Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapper.impl.RoleMapperImpl
		 * @see mapper.impl.MapperPackageImpl#getRoleMapper()
		 * @generated
		 */
		EClass ROLE_MAPPER = eINSTANCE.getRoleMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MAPPER__UID = eINSTANCE.getRoleMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Local Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MAPPER__LOCAL_ROLE_NAME = eINSTANCE.getRoleMapper_LocalRoleName();

		/**
		 * The meta object literal for the '<em><b>Global Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MAPPER__GLOBAL_ROLE_NAME = eINSTANCE.getRoleMapper_GlobalRoleName();

	}

} //MapperPackage