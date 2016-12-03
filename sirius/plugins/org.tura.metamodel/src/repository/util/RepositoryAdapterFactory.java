/**
 */
package repository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import repository.*;

import type.AttributePointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see repository.RepositoryPackage
 * @generated
 */
public class RepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositorySwitch<Adapter> modelSwitch =
		new RepositorySwitch<Adapter>() {
			@Override
			public Adapter caseUnitMapper(UnitMapper object) {
				return createUnitMapperAdapter();
			}
			@Override
			public Adapter caseUnits(Units object) {
				return createUnitsAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseObjectMapper(ObjectMapper object) {
				return createObjectMapperAdapter();
			}
			@Override
			public Adapter caseAttributeMapper(AttributeMapper object) {
				return createAttributeMapperAdapter();
			}
			@Override
			public Adapter caseRelationMapper(RelationMapper object) {
				return createRelationMapperAdapter();
			}
			@Override
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter caseAttributePointer(AttributePointer object) {
				return createAttributePointerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link repository.UnitMapper <em>Unit Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.UnitMapper
	 * @generated
	 */
	public Adapter createUnitMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link repository.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.Units
	 * @generated
	 */
	public Adapter createUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link repository.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link repository.ObjectMapper <em>Object Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.ObjectMapper
	 * @generated
	 */
	public Adapter createObjectMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link repository.AttributeMapper <em>Attribute Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.AttributeMapper
	 * @generated
	 */
	public Adapter createAttributeMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link repository.RelationMapper <em>Relation Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see repository.RelationMapper
	 * @generated
	 */
	public Adapter createRelationMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.AttributePointer <em>Attribute Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.AttributePointer
	 * @generated
	 */
	public Adapter createAttributePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RepositoryAdapterFactory
