/**
 */
package repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import type.TypePackage;

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
 * @see repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link repository.impl.UnitMapperImpl <em>Unit Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.UnitMapperImpl
	 * @see repository.impl.RepositoryPackageImpl#getUnitMapper()
	 * @generated
	 */
	int UNIT_MAPPER = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MAPPER__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MAPPER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MAPPER__UNITS = 2;

	/**
	 * The feature id for the '<em><b>Datacontrols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MAPPER__DATACONTROLS = 3;

	/**
	 * The number of structural features of the '<em>Unit Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MAPPER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link repository.impl.UnitsImpl <em>Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.UnitsImpl
	 * @see repository.impl.RepositoryPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS__UID = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS__UNITS = 1;

	/**
	 * The number of structural features of the '<em>Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link repository.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.UnitImpl
	 * @see repository.impl.RepositoryPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OBJECT_MAPPERS = 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link repository.impl.ObjectMapperImpl <em>Object Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.ObjectMapperImpl
	 * @see repository.impl.RepositoryPackageImpl#getObjectMapper()
	 * @generated
	 */
	int OBJECT_MAPPER = 3;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__ATTRIBUTE_MAPPERS = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER__RELATION_MAPPERS = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAPPER_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link repository.impl.AttributeMapperImpl <em>Attribute Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.AttributeMapperImpl
	 * @see repository.impl.RepositoryPackageImpl#getAttributeMapper()
	 * @generated
	 */
	int ATTRIBUTE_MAPPER = 4;

	/**
	 * The feature id for the '<em><b>Attribute Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPER__ATTRIBUTE_REF = TypePackage.ATTRIBUTE_POINTER__ATTRIBUTE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPER__UID = TypePackage.ATTRIBUTE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPER__OBJECT_MAPPER_REF = TypePackage.ATTRIBUTE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPER_FEATURE_COUNT = TypePackage.ATTRIBUTE_POINTER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link repository.impl.RelationMapperImpl <em>Relation Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see repository.impl.RelationMapperImpl
	 * @see repository.impl.RepositoryPackageImpl#getRelationMapper()
	 * @generated
	 */
	int RELATION_MAPPER = 5;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPER__TYPE_REF = TypePackage.TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPER__UID = TypePackage.TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPER__OBJECT_MAPPER_REF = TypePackage.TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPER_FEATURE_COUNT = TypePackage.TYPE_POINTER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link repository.UnitMapper <em>Unit Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Mapper</em>'.
	 * @see repository.UnitMapper
	 * @generated
	 */
	EClass getUnitMapper();

	/**
	 * Returns the meta object for the attribute '{@link repository.UnitMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.UnitMapper#getUid()
	 * @see #getUnitMapper()
	 * @generated
	 */
	EAttribute getUnitMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link repository.UnitMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see repository.UnitMapper#getName()
	 * @see #getUnitMapper()
	 * @generated
	 */
	EAttribute getUnitMapper_Name();

	/**
	 * Returns the meta object for the containment reference '{@link repository.UnitMapper#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Units</em>'.
	 * @see repository.UnitMapper#getUnits()
	 * @see #getUnitMapper()
	 * @generated
	 */
	EReference getUnitMapper_Units();

	/**
	 * Returns the meta object for the containment reference '{@link repository.UnitMapper#getDatacontrols <em>Datacontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datacontrols</em>'.
	 * @see repository.UnitMapper#getDatacontrols()
	 * @see #getUnitMapper()
	 * @generated
	 */
	EReference getUnitMapper_Datacontrols();

	/**
	 * Returns the meta object for class '{@link repository.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Units</em>'.
	 * @see repository.Units
	 * @generated
	 */
	EClass getUnits();

	/**
	 * Returns the meta object for the attribute '{@link repository.Units#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.Units#getUid()
	 * @see #getUnits()
	 * @generated
	 */
	EAttribute getUnits_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link repository.Units#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see repository.Units#getUnits()
	 * @see #getUnits()
	 * @generated
	 */
	EReference getUnits_Units();

	/**
	 * Returns the meta object for class '{@link repository.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see repository.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link repository.Unit#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.Unit#getUid()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Uid();

	/**
	 * Returns the meta object for the attribute '{@link repository.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see repository.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link repository.Unit#getObjectMappers <em>Object Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Mappers</em>'.
	 * @see repository.Unit#getObjectMappers()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_ObjectMappers();

	/**
	 * Returns the meta object for class '{@link repository.ObjectMapper <em>Object Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Mapper</em>'.
	 * @see repository.ObjectMapper
	 * @generated
	 */
	EClass getObjectMapper();

	/**
	 * Returns the meta object for the attribute '{@link repository.ObjectMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.ObjectMapper#getUid()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EAttribute getObjectMapper_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link repository.ObjectMapper#getAttributeMappers <em>Attribute Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Mappers</em>'.
	 * @see repository.ObjectMapper#getAttributeMappers()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_AttributeMappers();

	/**
	 * Returns the meta object for the containment reference list '{@link repository.ObjectMapper#getRelationMappers <em>Relation Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Mappers</em>'.
	 * @see repository.ObjectMapper#getRelationMappers()
	 * @see #getObjectMapper()
	 * @generated
	 */
	EReference getObjectMapper_RelationMappers();

	/**
	 * Returns the meta object for class '{@link repository.AttributeMapper <em>Attribute Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapper</em>'.
	 * @see repository.AttributeMapper
	 * @generated
	 */
	EClass getAttributeMapper();

	/**
	 * Returns the meta object for the attribute '{@link repository.AttributeMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.AttributeMapper#getUid()
	 * @see #getAttributeMapper()
	 * @generated
	 */
	EAttribute getAttributeMapper_Uid();

	/**
	 * Returns the meta object for the reference '{@link repository.AttributeMapper#getObjectMapperRef <em>Object Mapper Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Mapper Ref</em>'.
	 * @see repository.AttributeMapper#getObjectMapperRef()
	 * @see #getAttributeMapper()
	 * @generated
	 */
	EReference getAttributeMapper_ObjectMapperRef();

	/**
	 * Returns the meta object for class '{@link repository.RelationMapper <em>Relation Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Mapper</em>'.
	 * @see repository.RelationMapper
	 * @generated
	 */
	EClass getRelationMapper();

	/**
	 * Returns the meta object for the attribute '{@link repository.RelationMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see repository.RelationMapper#getUid()
	 * @see #getRelationMapper()
	 * @generated
	 */
	EAttribute getRelationMapper_Uid();

	/**
	 * Returns the meta object for the reference '{@link repository.RelationMapper#getObjectMapperRef <em>Object Mapper Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Mapper Ref</em>'.
	 * @see repository.RelationMapper#getObjectMapperRef()
	 * @see #getRelationMapper()
	 * @generated
	 */
	EReference getRelationMapper_ObjectMapperRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link repository.impl.UnitMapperImpl <em>Unit Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.UnitMapperImpl
		 * @see repository.impl.RepositoryPackageImpl#getUnitMapper()
		 * @generated
		 */
		EClass UNIT_MAPPER = eINSTANCE.getUnitMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_MAPPER__UID = eINSTANCE.getUnitMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_MAPPER__NAME = eINSTANCE.getUnitMapper_Name();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MAPPER__UNITS = eINSTANCE.getUnitMapper_Units();

		/**
		 * The meta object literal for the '<em><b>Datacontrols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MAPPER__DATACONTROLS = eINSTANCE.getUnitMapper_Datacontrols();

		/**
		 * The meta object literal for the '{@link repository.impl.UnitsImpl <em>Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.UnitsImpl
		 * @see repository.impl.RepositoryPackageImpl#getUnits()
		 * @generated
		 */
		EClass UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITS__UID = eINSTANCE.getUnits_Uid();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITS__UNITS = eINSTANCE.getUnits_Units();

		/**
		 * The meta object literal for the '{@link repository.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.UnitImpl
		 * @see repository.impl.RepositoryPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__UID = eINSTANCE.getUnit_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Object Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__OBJECT_MAPPERS = eINSTANCE.getUnit_ObjectMappers();

		/**
		 * The meta object literal for the '{@link repository.impl.ObjectMapperImpl <em>Object Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.ObjectMapperImpl
		 * @see repository.impl.RepositoryPackageImpl#getObjectMapper()
		 * @generated
		 */
		EClass OBJECT_MAPPER = eINSTANCE.getObjectMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAPPER__UID = eINSTANCE.getObjectMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Attribute Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__ATTRIBUTE_MAPPERS = eINSTANCE.getObjectMapper_AttributeMappers();

		/**
		 * The meta object literal for the '<em><b>Relation Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAPPER__RELATION_MAPPERS = eINSTANCE.getObjectMapper_RelationMappers();

		/**
		 * The meta object literal for the '{@link repository.impl.AttributeMapperImpl <em>Attribute Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.AttributeMapperImpl
		 * @see repository.impl.RepositoryPackageImpl#getAttributeMapper()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPER = eINSTANCE.getAttributeMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPER__UID = eINSTANCE.getAttributeMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Object Mapper Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPER__OBJECT_MAPPER_REF = eINSTANCE.getAttributeMapper_ObjectMapperRef();

		/**
		 * The meta object literal for the '{@link repository.impl.RelationMapperImpl <em>Relation Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see repository.impl.RelationMapperImpl
		 * @see repository.impl.RepositoryPackageImpl#getRelationMapper()
		 * @generated
		 */
		EClass RELATION_MAPPER = eINSTANCE.getRelationMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MAPPER__UID = eINSTANCE.getRelationMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Object Mapper Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPER__OBJECT_MAPPER_REF = eINSTANCE.getRelationMapper_ObjectMapperRef();

	}

} //RepositoryPackage
