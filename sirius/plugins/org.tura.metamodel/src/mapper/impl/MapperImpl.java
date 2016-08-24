/**
 */
package mapper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import mapper.Mapper;
import mapper.MapperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapper.impl.MapperImpl#isServiceLayer <em>Service Layer</em>}</li>
 *   <li>{@link mapper.impl.MapperImpl#isUiLayer <em>Ui Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapperImpl extends EObjectImpl implements Mapper {
	/**
	 * The default value of the '{@link #isServiceLayer() <em>Service Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceLayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_LAYER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceLayer() <em>Service Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceLayer()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceLayer = SERVICE_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #isUiLayer() <em>Ui Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiLayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UI_LAYER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUiLayer() <em>Ui Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiLayer()
	 * @generated
	 * @ordered
	 */
	protected boolean uiLayer = UI_LAYER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapperPackage.Literals.MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceLayer() {
		return serviceLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLayer(boolean newServiceLayer) {
		boolean oldServiceLayer = serviceLayer;
		serviceLayer = newServiceLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MAPPER__SERVICE_LAYER, oldServiceLayer, serviceLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUiLayer() {
		return uiLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiLayer(boolean newUiLayer) {
		boolean oldUiLayer = uiLayer;
		uiLayer = newUiLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MAPPER__UI_LAYER, oldUiLayer, uiLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapperPackage.MAPPER__SERVICE_LAYER:
				return isServiceLayer();
			case MapperPackage.MAPPER__UI_LAYER:
				return isUiLayer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MapperPackage.MAPPER__SERVICE_LAYER:
				setServiceLayer((Boolean)newValue);
				return;
			case MapperPackage.MAPPER__UI_LAYER:
				setUiLayer((Boolean)newValue);
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
			case MapperPackage.MAPPER__SERVICE_LAYER:
				setServiceLayer(SERVICE_LAYER_EDEFAULT);
				return;
			case MapperPackage.MAPPER__UI_LAYER:
				setUiLayer(UI_LAYER_EDEFAULT);
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
			case MapperPackage.MAPPER__SERVICE_LAYER:
				return serviceLayer != SERVICE_LAYER_EDEFAULT;
			case MapperPackage.MAPPER__UI_LAYER:
				return uiLayer != UI_LAYER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceLayer: ");
		result.append(serviceLayer);
		result.append(", uiLayer: ");
		result.append(uiLayer);
		result.append(')');
		return result.toString();
	}

} //MapperImpl
