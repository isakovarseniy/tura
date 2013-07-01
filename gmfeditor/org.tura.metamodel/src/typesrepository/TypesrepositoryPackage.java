/**
 */
package typesrepository;

import businessobjects.BusinessobjectsPackage;
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
 * @see typesrepository.TypesrepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface TypesrepositoryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "typesrepository";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/typesrepository";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.typesrepository";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypesrepositoryPackage eINSTANCE = typesrepository.impl.TypesrepositoryPackageImpl.init();

  /**
   * The meta object id for the '{@link typesrepository.impl.TypesRepositoryImpl <em>Types Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typesrepository.impl.TypesRepositoryImpl
   * @see typesrepository.impl.TypesrepositoryPackageImpl#getTypesRepository()
   * @generated
   */
  int TYPES_REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY__TYPE_DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Types Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_REPOSITORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link typesrepository.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typesrepository.impl.TypesImpl
   * @see typesrepository.impl.TypesrepositoryPackageImpl#getTypes()
   * @generated
   */
  int TYPES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__NAME = 0;

  /**
   * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PRIMITIVES = 1;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__PACKAGES = 2;

  /**
   * The feature id for the '<em><b>Business Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES__BUSINESS_PACKAGES = 3;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link typesrepository.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typesrepository.impl.PrimitiveImpl
   * @see typesrepository.impl.TypesrepositoryPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = 0;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link typesrepository.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typesrepository.impl.PackageImpl
   * @see typesrepository.impl.TypesrepositoryPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TYPES = TypedefinitionPackage.TYPE_DEFINITION__TYPES;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENUMS = TypedefinitionPackage.TYPE_DEFINITION__ENUMS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = TypedefinitionPackage.TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = TypedefinitionPackage.TYPE_DEFINITION_FEATURE_COUNT + 1;


  /**
   * The meta object id for the '{@link typesrepository.impl.BusinessPackageImpl <em>Business Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typesrepository.impl.BusinessPackageImpl
   * @see typesrepository.impl.TypesrepositoryPackageImpl#getBusinessPackage()
   * @generated
   */
  int BUSINESS_PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Business Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__BUSINESS_OBJECT = BusinessobjectsPackage.BUSINESS_OBJECTS__BUSINESS_OBJECT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE__NAME = BusinessobjectsPackage.BUSINESS_OBJECTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Business Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PACKAGE_FEATURE_COUNT = BusinessobjectsPackage.BUSINESS_OBJECTS_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link typesrepository.TypesRepository <em>Types Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types Repository</em>'.
   * @see typesrepository.TypesRepository
   * @generated
   */
  EClass getTypesRepository();

  /**
   * Returns the meta object for the containment reference '{@link typesrepository.TypesRepository#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition</em>'.
   * @see typesrepository.TypesRepository#getTypeDefinition()
   * @see #getTypesRepository()
   * @generated
   */
  EReference getTypesRepository_TypeDefinition();

  /**
   * Returns the meta object for class '{@link typesrepository.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see typesrepository.Types
   * @generated
   */
  EClass getTypes();

  /**
   * Returns the meta object for the attribute '{@link typesrepository.Types#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typesrepository.Types#getName()
   * @see #getTypes()
   * @generated
   */
  EAttribute getTypes_Name();

  /**
   * Returns the meta object for the containment reference list '{@link typesrepository.Types#getPrimitives <em>Primitives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primitives</em>'.
   * @see typesrepository.Types#getPrimitives()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_Primitives();

  /**
   * Returns the meta object for the containment reference list '{@link typesrepository.Types#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see typesrepository.Types#getPackages()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link typesrepository.Types#getBusinessPackages <em>Business Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Packages</em>'.
   * @see typesrepository.Types#getBusinessPackages()
   * @see #getTypes()
   * @generated
   */
  EReference getTypes_BusinessPackages();

  /**
   * Returns the meta object for class '{@link typesrepository.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see typesrepository.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for the attribute '{@link typesrepository.Primitive#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typesrepository.Primitive#getName()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Name();

  /**
   * Returns the meta object for class '{@link typesrepository.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see typesrepository.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link typesrepository.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typesrepository.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link typesrepository.BusinessPackage <em>Business Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Package</em>'.
   * @see typesrepository.BusinessPackage
   * @generated
   */
  EClass getBusinessPackage();

  /**
   * Returns the meta object for the attribute '{@link typesrepository.BusinessPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typesrepository.BusinessPackage#getName()
   * @see #getBusinessPackage()
   * @generated
   */
  EAttribute getBusinessPackage_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypesrepositoryFactory getTypesrepositoryFactory();

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
     * The meta object literal for the '{@link typesrepository.impl.TypesRepositoryImpl <em>Types Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typesrepository.impl.TypesRepositoryImpl
     * @see typesrepository.impl.TypesrepositoryPackageImpl#getTypesRepository()
     * @generated
     */
    EClass TYPES_REPOSITORY = eINSTANCE.getTypesRepository();

    /**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES_REPOSITORY__TYPE_DEFINITION = eINSTANCE.getTypesRepository_TypeDefinition();

    /**
     * The meta object literal for the '{@link typesrepository.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typesrepository.impl.TypesImpl
     * @see typesrepository.impl.TypesrepositoryPackageImpl#getTypes()
     * @generated
     */
    EClass TYPES = eINSTANCE.getTypes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPES__NAME = eINSTANCE.getTypes_Name();

    /**
     * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__PRIMITIVES = eINSTANCE.getTypes_Primitives();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__PACKAGES = eINSTANCE.getTypes_Packages();

    /**
     * The meta object literal for the '<em><b>Business Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPES__BUSINESS_PACKAGES = eINSTANCE.getTypes_BusinessPackages();

    /**
     * The meta object literal for the '{@link typesrepository.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typesrepository.impl.PrimitiveImpl
     * @see typesrepository.impl.TypesrepositoryPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__NAME = eINSTANCE.getPrimitive_Name();

    /**
     * The meta object literal for the '{@link typesrepository.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typesrepository.impl.PackageImpl
     * @see typesrepository.impl.TypesrepositoryPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link typesrepository.impl.BusinessPackageImpl <em>Business Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typesrepository.impl.BusinessPackageImpl
     * @see typesrepository.impl.TypesrepositoryPackageImpl#getBusinessPackage()
     * @generated
     */
    EClass BUSINESS_PACKAGE = eINSTANCE.getBusinessPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_PACKAGE__NAME = eINSTANCE.getBusinessPackage_Name();

  }

} //TypesrepositoryPackage
