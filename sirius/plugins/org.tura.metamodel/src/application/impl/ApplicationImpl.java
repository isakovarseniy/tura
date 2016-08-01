/**
 */
package application.impl;

import application.Application;
import application.ApplicationInfrastructureLayers;
import application.ApplicationMappers;
import application.ApplicationMessageLibraries;
import application.ApplicationPackage;
import application.ApplicationRealms;
import application.ApplicationRecipes;
import application.ApplicationStyleLibraries;
import application.ApplicationUILayer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link application.impl.ApplicationImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationRecipes <em>Application Recipes</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationMappers <em>Application Mappers</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationUILayer <em>Application UI Layer</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationInfrastructureLayer <em>Application Infrastructure Layer</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationStyle <em>Application Style</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link application.impl.ApplicationImpl#getApplicationMessages <em>Application Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
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
	 * The cached value of the '{@link #getApplicationRecipes() <em>Application Recipes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRecipes()
	 * @generated
	 * @ordered
	 */
	protected ApplicationRecipes applicationRecipes;

	/**
	 * The cached value of the '{@link #getApplicationMappers() <em>Application Mappers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationMappers()
	 * @generated
	 * @ordered
	 */
	protected ApplicationMappers applicationMappers;

	/**
	 * The cached value of the '{@link #getApplicationUILayer() <em>Application UI Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationUILayer()
	 * @generated
	 * @ordered
	 */
	protected ApplicationUILayer applicationUILayer;

	/**
	 * The cached value of the '{@link #getApplicationInfrastructureLayer() <em>Application Infrastructure Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationInfrastructureLayer()
	 * @generated
	 * @ordered
	 */
	protected ApplicationInfrastructureLayers applicationInfrastructureLayer;

	/**
	 * The cached value of the '{@link #getApplicationStyle() <em>Application Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationStyle()
	 * @generated
	 * @ordered
	 */
	protected ApplicationStyleLibraries applicationStyle;

	/**
	 * The cached value of the '{@link #getApplicationRole() <em>Application Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRole()
	 * @generated
	 * @ordered
	 */
	protected ApplicationRealms applicationRole;

	/**
	 * The cached value of the '{@link #getApplicationMessages() <em>Application Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationMessages()
	 * @generated
	 * @ordered
	 */
	protected ApplicationMessageLibraries applicationMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipes getApplicationRecipes() {
		return applicationRecipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationRecipes(ApplicationRecipes newApplicationRecipes, NotificationChain msgs) {
		ApplicationRecipes oldApplicationRecipes = applicationRecipes;
		applicationRecipes = newApplicationRecipes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_RECIPES, oldApplicationRecipes, newApplicationRecipes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRecipes(ApplicationRecipes newApplicationRecipes) {
		if (newApplicationRecipes != applicationRecipes) {
			NotificationChain msgs = null;
			if (applicationRecipes != null)
				msgs = ((InternalEObject)applicationRecipes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_RECIPES, null, msgs);
			if (newApplicationRecipes != null)
				msgs = ((InternalEObject)newApplicationRecipes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_RECIPES, null, msgs);
			msgs = basicSetApplicationRecipes(newApplicationRecipes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_RECIPES, newApplicationRecipes, newApplicationRecipes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMappers getApplicationMappers() {
		return applicationMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationMappers(ApplicationMappers newApplicationMappers, NotificationChain msgs) {
		ApplicationMappers oldApplicationMappers = applicationMappers;
		applicationMappers = newApplicationMappers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, oldApplicationMappers, newApplicationMappers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationMappers(ApplicationMappers newApplicationMappers) {
		if (newApplicationMappers != applicationMappers) {
			NotificationChain msgs = null;
			if (applicationMappers != null)
				msgs = ((InternalEObject)applicationMappers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, null, msgs);
			if (newApplicationMappers != null)
				msgs = ((InternalEObject)newApplicationMappers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, null, msgs);
			msgs = basicSetApplicationMappers(newApplicationMappers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MAPPERS, newApplicationMappers, newApplicationMappers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUILayer getApplicationUILayer() {
		return applicationUILayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationUILayer(ApplicationUILayer newApplicationUILayer, NotificationChain msgs) {
		ApplicationUILayer oldApplicationUILayer = applicationUILayer;
		applicationUILayer = newApplicationUILayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER, oldApplicationUILayer, newApplicationUILayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationUILayer(ApplicationUILayer newApplicationUILayer) {
		if (newApplicationUILayer != applicationUILayer) {
			NotificationChain msgs = null;
			if (applicationUILayer != null)
				msgs = ((InternalEObject)applicationUILayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER, null, msgs);
			if (newApplicationUILayer != null)
				msgs = ((InternalEObject)newApplicationUILayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER, null, msgs);
			msgs = basicSetApplicationUILayer(newApplicationUILayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER, newApplicationUILayer, newApplicationUILayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInfrastructureLayers getApplicationInfrastructureLayer() {
		return applicationInfrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationInfrastructureLayer(ApplicationInfrastructureLayers newApplicationInfrastructureLayer, NotificationChain msgs) {
		ApplicationInfrastructureLayers oldApplicationInfrastructureLayer = applicationInfrastructureLayer;
		applicationInfrastructureLayer = newApplicationInfrastructureLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, oldApplicationInfrastructureLayer, newApplicationInfrastructureLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationInfrastructureLayer(ApplicationInfrastructureLayers newApplicationInfrastructureLayer) {
		if (newApplicationInfrastructureLayer != applicationInfrastructureLayer) {
			NotificationChain msgs = null;
			if (applicationInfrastructureLayer != null)
				msgs = ((InternalEObject)applicationInfrastructureLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, null, msgs);
			if (newApplicationInfrastructureLayer != null)
				msgs = ((InternalEObject)newApplicationInfrastructureLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, null, msgs);
			msgs = basicSetApplicationInfrastructureLayer(newApplicationInfrastructureLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER, newApplicationInfrastructureLayer, newApplicationInfrastructureLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationStyleLibraries getApplicationStyle() {
		return applicationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationStyle(ApplicationStyleLibraries newApplicationStyle, NotificationChain msgs) {
		ApplicationStyleLibraries oldApplicationStyle = applicationStyle;
		applicationStyle = newApplicationStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_STYLE, oldApplicationStyle, newApplicationStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationStyle(ApplicationStyleLibraries newApplicationStyle) {
		if (newApplicationStyle != applicationStyle) {
			NotificationChain msgs = null;
			if (applicationStyle != null)
				msgs = ((InternalEObject)applicationStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_STYLE, null, msgs);
			if (newApplicationStyle != null)
				msgs = ((InternalEObject)newApplicationStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_STYLE, null, msgs);
			msgs = basicSetApplicationStyle(newApplicationStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_STYLE, newApplicationStyle, newApplicationStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRealms getApplicationRole() {
		return applicationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationRole(ApplicationRealms newApplicationRole, NotificationChain msgs) {
		ApplicationRealms oldApplicationRole = applicationRole;
		applicationRole = newApplicationRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_ROLE, oldApplicationRole, newApplicationRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRole(ApplicationRealms newApplicationRole) {
		if (newApplicationRole != applicationRole) {
			NotificationChain msgs = null;
			if (applicationRole != null)
				msgs = ((InternalEObject)applicationRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_ROLE, null, msgs);
			if (newApplicationRole != null)
				msgs = ((InternalEObject)newApplicationRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_ROLE, null, msgs);
			msgs = basicSetApplicationRole(newApplicationRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_ROLE, newApplicationRole, newApplicationRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMessageLibraries getApplicationMessages() {
		return applicationMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationMessages(ApplicationMessageLibraries newApplicationMessages, NotificationChain msgs) {
		ApplicationMessageLibraries oldApplicationMessages = applicationMessages;
		applicationMessages = newApplicationMessages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MESSAGES, oldApplicationMessages, newApplicationMessages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationMessages(ApplicationMessageLibraries newApplicationMessages) {
		if (newApplicationMessages != applicationMessages) {
			NotificationChain msgs = null;
			if (applicationMessages != null)
				msgs = ((InternalEObject)applicationMessages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MESSAGES, null, msgs);
			if (newApplicationMessages != null)
				msgs = ((InternalEObject)newApplicationMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__APPLICATION_MESSAGES, null, msgs);
			msgs = basicSetApplicationMessages(newApplicationMessages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__APPLICATION_MESSAGES, newApplicationMessages, newApplicationMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
				return basicSetApplicationRecipes(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
				return basicSetApplicationMappers(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER:
				return basicSetApplicationUILayer(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
				return basicSetApplicationInfrastructureLayer(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_STYLE:
				return basicSetApplicationStyle(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_ROLE:
				return basicSetApplicationRole(null, msgs);
			case ApplicationPackage.APPLICATION__APPLICATION_MESSAGES:
				return basicSetApplicationMessages(null, msgs);
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
			case ApplicationPackage.APPLICATION__UID:
				return getUid();
			case ApplicationPackage.APPLICATION__NAME:
				return getName();
			case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
				return getApplicationRecipes();
			case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
				return getApplicationMappers();
			case ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER:
				return getApplicationUILayer();
			case ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
				return getApplicationInfrastructureLayer();
			case ApplicationPackage.APPLICATION__APPLICATION_STYLE:
				return getApplicationStyle();
			case ApplicationPackage.APPLICATION__APPLICATION_ROLE:
				return getApplicationRole();
			case ApplicationPackage.APPLICATION__APPLICATION_MESSAGES:
				return getApplicationMessages();
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
			case ApplicationPackage.APPLICATION__UID:
				setUid((String)newValue);
				return;
			case ApplicationPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
				setApplicationRecipes((ApplicationRecipes)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
				setApplicationMappers((ApplicationMappers)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER:
				setApplicationUILayer((ApplicationUILayer)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
				setApplicationInfrastructureLayer((ApplicationInfrastructureLayers)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_STYLE:
				setApplicationStyle((ApplicationStyleLibraries)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_ROLE:
				setApplicationRole((ApplicationRealms)newValue);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_MESSAGES:
				setApplicationMessages((ApplicationMessageLibraries)newValue);
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
			case ApplicationPackage.APPLICATION__UID:
				setUid(UID_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
				setApplicationRecipes((ApplicationRecipes)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
				setApplicationMappers((ApplicationMappers)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER:
				setApplicationUILayer((ApplicationUILayer)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
				setApplicationInfrastructureLayer((ApplicationInfrastructureLayers)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_STYLE:
				setApplicationStyle((ApplicationStyleLibraries)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_ROLE:
				setApplicationRole((ApplicationRealms)null);
				return;
			case ApplicationPackage.APPLICATION__APPLICATION_MESSAGES:
				setApplicationMessages((ApplicationMessageLibraries)null);
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
			case ApplicationPackage.APPLICATION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ApplicationPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION__APPLICATION_RECIPES:
				return applicationRecipes != null;
			case ApplicationPackage.APPLICATION__APPLICATION_MAPPERS:
				return applicationMappers != null;
			case ApplicationPackage.APPLICATION__APPLICATION_UI_LAYER:
				return applicationUILayer != null;
			case ApplicationPackage.APPLICATION__APPLICATION_INFRASTRUCTURE_LAYER:
				return applicationInfrastructureLayer != null;
			case ApplicationPackage.APPLICATION__APPLICATION_STYLE:
				return applicationStyle != null;
			case ApplicationPackage.APPLICATION__APPLICATION_ROLE:
				return applicationRole != null;
			case ApplicationPackage.APPLICATION__APPLICATION_MESSAGES:
				return applicationMessages != null;
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

} //ApplicationImpl
