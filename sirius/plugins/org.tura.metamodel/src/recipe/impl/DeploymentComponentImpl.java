/**
 */
package recipe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import recipe.DeploymentComponent;
import recipe.ModelMapper;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.DeploymentComponentImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.DeploymentComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.DeploymentComponentImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link recipe.impl.DeploymentComponentImpl#getDeploymentComponentLink <em>Deployment Component Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentComponentImpl extends MinimalEObjectImpl.Container implements DeploymentComponent {
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
	 * The cached value of the '{@link #getMapper() <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapper()
	 * @generated
	 * @ordered
	 */
	protected ModelMapper mapper;

	/**
	 * The cached value of the '{@link #getDeploymentComponentLink() <em>Deployment Component Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentComponentLink()
	 * @generated
	 * @ordered
	 */
	protected DeploymentComponent deploymentComponentLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.DEPLOYMENT_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMapper getMapper() {
		if (mapper != null && mapper.eIsProxy()) {
			InternalEObject oldMapper = (InternalEObject)mapper;
			mapper = (ModelMapper)eResolveProxy(oldMapper);
			if (mapper != oldMapper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.DEPLOYMENT_COMPONENT__MAPPER, oldMapper, mapper));
			}
		}
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMapper basicGetMapper() {
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapper(ModelMapper newMapper) {
		ModelMapper oldMapper = mapper;
		mapper = newMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENT__MAPPER, oldMapper, mapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponent getDeploymentComponentLink() {
		if (deploymentComponentLink != null && deploymentComponentLink.eIsProxy()) {
			InternalEObject oldDeploymentComponentLink = (InternalEObject)deploymentComponentLink;
			deploymentComponentLink = (DeploymentComponent)eResolveProxy(oldDeploymentComponentLink);
			if (deploymentComponentLink != oldDeploymentComponentLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK, oldDeploymentComponentLink, deploymentComponentLink));
			}
		}
		return deploymentComponentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentComponent basicGetDeploymentComponentLink() {
		return deploymentComponentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentComponentLink(DeploymentComponent newDeploymentComponentLink) {
		DeploymentComponent oldDeploymentComponentLink = deploymentComponentLink;
		deploymentComponentLink = newDeploymentComponentLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK, oldDeploymentComponentLink, deploymentComponentLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.DEPLOYMENT_COMPONENT__UID:
				return getUid();
			case RecipePackage.DEPLOYMENT_COMPONENT__NAME:
				return getName();
			case RecipePackage.DEPLOYMENT_COMPONENT__MAPPER:
				if (resolve) return getMapper();
				return basicGetMapper();
			case RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK:
				if (resolve) return getDeploymentComponentLink();
				return basicGetDeploymentComponentLink();
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
			case RecipePackage.DEPLOYMENT_COMPONENT__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__MAPPER:
				setMapper((ModelMapper)newValue);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK:
				setDeploymentComponentLink((DeploymentComponent)newValue);
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
			case RecipePackage.DEPLOYMENT_COMPONENT__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__MAPPER:
				setMapper((ModelMapper)null);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK:
				setDeploymentComponentLink((DeploymentComponent)null);
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
			case RecipePackage.DEPLOYMENT_COMPONENT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.DEPLOYMENT_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.DEPLOYMENT_COMPONENT__MAPPER:
				return mapper != null;
			case RecipePackage.DEPLOYMENT_COMPONENT__DEPLOYMENT_COMPONENT_LINK:
				return deploymentComponentLink != null;
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

} //DeploymentComponentImpl
