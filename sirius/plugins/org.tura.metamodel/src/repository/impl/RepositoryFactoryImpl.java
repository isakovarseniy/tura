/**
 */
package repository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import repository.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryFactoryImpl extends EFactoryImpl implements RepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryFactory init() {
		try {
			RepositoryFactory theRepositoryFactory = (RepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(RepositoryPackage.eNS_URI);
			if (theRepositoryFactory != null) {
				return theRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryFactoryImpl() {
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
			case RepositoryPackage.UNIT_MAPPER: return createUnitMapper();
			case RepositoryPackage.UNITS: return createUnits();
			case RepositoryPackage.UNIT: return createUnit();
			case RepositoryPackage.OBJECT_MAPPER: return createObjectMapper();
			case RepositoryPackage.ATTRIBUTE_MAPPER: return createAttributeMapper();
			case RepositoryPackage.RELATION_MAPPER: return createRelationMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMapper createUnitMapper() {
		UnitMapperImpl unitMapper = new UnitMapperImpl();
		return unitMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnits() {
		UnitsImpl units = new UnitsImpl();
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapper createObjectMapper() {
		ObjectMapperImpl objectMapper = new ObjectMapperImpl();
		return objectMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMapper createAttributeMapper() {
		AttributeMapperImpl attributeMapper = new AttributeMapperImpl();
		return attributeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapper createRelationMapper() {
		RelationMapperImpl relationMapper = new RelationMapperImpl();
		return relationMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryPackage getRepositoryPackage() {
		return (RepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepositoryPackage getPackage() {
		return RepositoryPackage.eINSTANCE;
	}

} //RepositoryFactoryImpl
