/**
 */
package domain.impl;

import domain.DefaultCavas;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Cavas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DefaultCavasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultCavasImpl extends EObjectImpl implements DefaultCavas {
	/**
	 * The default value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_CANVAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultCanvas() <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultCanvas()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultCanvas = DEFAULT_CANVAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultCavasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DEFAULT_CAVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultCanvas() {
		return defaultCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCanvas(boolean newDefaultCanvas) {
		boolean oldDefaultCanvas = defaultCanvas;
		defaultCanvas = newDefaultCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS:
				return isDefaultCanvas();
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
			case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS:
				setDefaultCanvas((Boolean)newValue);
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
			case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS:
				setDefaultCanvas(DEFAULT_CANVAS_EDEFAULT);
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
			case DomainPackage.DEFAULT_CAVAS__DEFAULT_CANVAS:
				return defaultCanvas != DEFAULT_CANVAS_EDEFAULT;
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
		result.append(" (defaultCanvas: ");
		result.append(defaultCanvas);
		result.append(')');
		return result.toString();
	}

} //DefaultCavasImpl
