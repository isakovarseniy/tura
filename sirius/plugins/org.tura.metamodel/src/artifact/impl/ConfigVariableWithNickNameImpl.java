/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.ConfigVariable;
import artifact.ConfigVariableWithNickName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Variable With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link artifact.impl.ConfigVariableWithNickNameImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigVariableWithNickNameImpl extends EObjectImpl implements ConfigVariableWithNickName {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected ConfigVariable var;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableWithNickNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.CONFIG_VARIABLE_WITH_NICK_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariable getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject)var;
			var = (ConfigVariable)eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR, oldVar, var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariable basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(ConfigVariable newVar) {
		ConfigVariable oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				return getUid();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				return getName();
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR:
				if (resolve) return getVar();
				return basicGetVar();
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				setUid((String)newValue);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				setName((String)newValue);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR:
				setVar((ConfigVariable)newValue);
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				setUid(UID_EDEFAULT);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR:
				setVar((ConfigVariable)null);
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
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactPackage.CONFIG_VARIABLE_WITH_NICK_NAME__VAR:
				return var != null;
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigVariableWithNickNameImpl