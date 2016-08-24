/**
 */
package recipe.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import mapper.Mappers;
import recipe.RecipePackage;
import recipe.UsingMappers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.UsingMappersImpl#getMappers <em>Mappers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsingMappersImpl extends EObjectImpl implements UsingMappers {
	/**
	 * The cached value of the '{@link #getMappers() <em>Mappers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<Mappers> mappers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingMappersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.USING_MAPPERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mappers> getMappers() {
		if (mappers == null) {
			mappers = new EObjectResolvingEList<Mappers>(Mappers.class, this, RecipePackage.USING_MAPPERS__MAPPERS);
		}
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.USING_MAPPERS__MAPPERS:
				return getMappers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipePackage.USING_MAPPERS__MAPPERS:
				getMappers().clear();
				getMappers().addAll((Collection<? extends Mappers>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecipePackage.USING_MAPPERS__MAPPERS:
				getMappers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecipePackage.USING_MAPPERS__MAPPERS:
				return mappers != null && !mappers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsingMappersImpl
