/**
 */
package recipe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.DeploymentComponent;
import recipe.DeploymentComponents;
import recipe.DeploymentStarStep;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.DeploymentComponentsImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.impl.DeploymentComponentsImpl#getDeplymentStep <em>Deplyment Step</em>}</li>
 *   <li>{@link recipe.impl.DeploymentComponentsImpl#getStartSeq <em>Start Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentComponentsImpl extends EObjectImpl implements DeploymentComponents {
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
	 * The cached value of the '{@link #getDeplymentStep() <em>Deplyment Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplymentStep()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentComponent> deplymentStep;

	/**
	 * The cached value of the '{@link #getStartSeq() <em>Start Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSeq()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStarStep startSeq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.DEPLOYMENT_COMPONENTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENTS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentComponent> getDeplymentStep() {
		if (deplymentStep == null) {
			deplymentStep = new EObjectContainmentEList<DeploymentComponent>(DeploymentComponent.class, this, RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP);
		}
		return deplymentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStarStep getStartSeq() {
		return startSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSeq(DeploymentStarStep newStartSeq, NotificationChain msgs) {
		DeploymentStarStep oldStartSeq = startSeq;
		startSeq = newStartSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ, oldStartSeq, newStartSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSeq(DeploymentStarStep newStartSeq) {
		if (newStartSeq != startSeq) {
			NotificationChain msgs = null;
			if (startSeq != null)
				msgs = ((InternalEObject)startSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ, null, msgs);
			if (newStartSeq != null)
				msgs = ((InternalEObject)newStartSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ, null, msgs);
			msgs = basicSetStartSeq(newStartSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ, newStartSeq, newStartSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP:
				return ((InternalEList<?>)getDeplymentStep()).basicRemove(otherEnd, msgs);
			case RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ:
				return basicSetStartSeq(null, msgs);
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
			case RecipePackage.DEPLOYMENT_COMPONENTS__UID:
				return getUid();
			case RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP:
				return getDeplymentStep();
			case RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ:
				return getStartSeq();
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
			case RecipePackage.DEPLOYMENT_COMPONENTS__UID:
				setUid((String)newValue);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP:
				getDeplymentStep().clear();
				getDeplymentStep().addAll((Collection<? extends DeploymentComponent>)newValue);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ:
				setStartSeq((DeploymentStarStep)newValue);
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
			case RecipePackage.DEPLOYMENT_COMPONENTS__UID:
				setUid(UID_EDEFAULT);
				return;
			case RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP:
				getDeplymentStep().clear();
				return;
			case RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ:
				setStartSeq((DeploymentStarStep)null);
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
			case RecipePackage.DEPLOYMENT_COMPONENTS__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case RecipePackage.DEPLOYMENT_COMPONENTS__DEPLYMENT_STEP:
				return deplymentStep != null && !deplymentStep.isEmpty();
			case RecipePackage.DEPLOYMENT_COMPONENTS__START_SEQ:
				return startSeq != null;
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
		result.append(')');
		return result.toString();
	}

} //DeploymentComponentsImpl
