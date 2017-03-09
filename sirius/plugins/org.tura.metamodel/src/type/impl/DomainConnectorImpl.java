/**
 */
package type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import type.DomainConnector;
import type.Link;
import type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link type.impl.DomainConnectorImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link type.impl.DomainConnectorImpl#getSourceOperation <em>Source Operation</em>}</li>
 *   <li>{@link type.impl.DomainConnectorImpl#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainConnectorImpl extends RelationshipImpl implements DomainConnector {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getSourceOperation() <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceOperation() <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOperation()
	 * @generated
	 * @ordered
	 */
	protected String sourceOperation = SOURCE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected String targetOperation = TARGET_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.DOMAIN_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TypePackage.DOMAIN_CONNECTOR__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceOperation() {
		return sourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOperation(String newSourceOperation) {
		String oldSourceOperation = sourceOperation;
		sourceOperation = newSourceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DOMAIN_CONNECTOR__SOURCE_OPERATION, oldSourceOperation, sourceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetOperation() {
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperation(String newTargetOperation) {
		String oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DOMAIN_CONNECTOR__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.DOMAIN_CONNECTOR__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.DOMAIN_CONNECTOR__LINKS:
				return getLinks();
			case TypePackage.DOMAIN_CONNECTOR__SOURCE_OPERATION:
				return getSourceOperation();
			case TypePackage.DOMAIN_CONNECTOR__TARGET_OPERATION:
				return getTargetOperation();
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
			case TypePackage.DOMAIN_CONNECTOR__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case TypePackage.DOMAIN_CONNECTOR__SOURCE_OPERATION:
				setSourceOperation((String)newValue);
				return;
			case TypePackage.DOMAIN_CONNECTOR__TARGET_OPERATION:
				setTargetOperation((String)newValue);
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
			case TypePackage.DOMAIN_CONNECTOR__LINKS:
				getLinks().clear();
				return;
			case TypePackage.DOMAIN_CONNECTOR__SOURCE_OPERATION:
				setSourceOperation(SOURCE_OPERATION_EDEFAULT);
				return;
			case TypePackage.DOMAIN_CONNECTOR__TARGET_OPERATION:
				setTargetOperation(TARGET_OPERATION_EDEFAULT);
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
			case TypePackage.DOMAIN_CONNECTOR__LINKS:
				return links != null && !links.isEmpty();
			case TypePackage.DOMAIN_CONNECTOR__SOURCE_OPERATION:
				return SOURCE_OPERATION_EDEFAULT == null ? sourceOperation != null : !SOURCE_OPERATION_EDEFAULT.equals(sourceOperation);
			case TypePackage.DOMAIN_CONNECTOR__TARGET_OPERATION:
				return TARGET_OPERATION_EDEFAULT == null ? targetOperation != null : !TARGET_OPERATION_EDEFAULT.equals(targetOperation);
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
		result.append(" (sourceOperation: ");
		result.append(sourceOperation);
		result.append(", targetOperation: ");
		result.append(targetOperation);
		result.append(')');
		return result.toString();
	}

} //DomainConnectorImpl
