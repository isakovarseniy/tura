/**
 */
package mapper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import typedefinition.TypedefinitionPackage;

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
 * @see mapper.MapperFactory
 * @model kind="package"
 * @generated
 */
public interface MapperPackage extends EPackage
{
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
  String eNS_URI = "http://tura.org/2013/v1/mapper";

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
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS__MAPPERS = 0;

  /**
   * The number of structural features of the '<em>Mappers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPERS_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__PACKAGE_NAME = TypedefinitionPackage.TYPE_POINTER__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__TYPE_NAME = TypedefinitionPackage.TYPE_POINTER__TYPE_NAME;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER_FEATURE_COUNT = TypedefinitionPackage.TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mapper.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mapper.impl.JavaMapperImpl
   * @see mapper.impl.MapperPackageImpl#getJavaMapper()
   * @generated
   */
  int JAVA_MAPPER = 2;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__PACKAGE_NAME = MAPPER__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__TYPE_NAME = MAPPER__TYPE_NAME;

  /**
   * The feature id for the '<em><b>Mapped To Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME = MAPPER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped To Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__MAPPED_TO_CLASS_NAME = MAPPER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__ARTIFACT_ID = MAPPER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__GROUP_ID = MAPPER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__VERSION = MAPPER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Library Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER__LIBRARY_NAME = MAPPER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Java Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 6;


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
   * Returns the meta object for class '{@link mapper.JavaMapper <em>Java Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Mapper</em>'.
   * @see mapper.JavaMapper
   * @generated
   */
  EClass getJavaMapper();

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
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
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
     * The meta object literal for the '{@link mapper.impl.JavaMapperImpl <em>Java Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mapper.impl.JavaMapperImpl
     * @see mapper.impl.MapperPackageImpl#getJavaMapper()
     * @generated
     */
    EClass JAVA_MAPPER = eINSTANCE.getJavaMapper();

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

  }

} //MapperPackage
