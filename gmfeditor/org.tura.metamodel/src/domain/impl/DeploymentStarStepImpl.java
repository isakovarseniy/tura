/**
 */
package domain.impl;

import domain.DeploymentComponent;
import domain.DeploymentStarStep;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Star Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DeploymentStarStepImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DeploymentStarStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DeploymentStarStepImpl#getFirstStep <em>First Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentStarStepImpl extends EObjectImpl implements DeploymentStarStep
{
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
	 * The cached value of the '{@link #getFirstStep() <em>First Step</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFirstStep()
	 * @generated
	 * @ordered
	 */
  protected DeploymentComponent firstStep;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DeploymentStarStepImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return DomainPackage.Literals.DEPLOYMENT_STAR_STEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUid()
  {
		return uid;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUid(String newUid)
  {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_STAR_STEP__UID, oldUid, uid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_STAR_STEP__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DeploymentComponent getFirstStep()
  {
		if (firstStep != null && firstStep.eIsProxy()) {
			InternalEObject oldFirstStep = (InternalEObject)firstStep;
			firstStep = (DeploymentComponent)eResolveProxy(oldFirstStep);
			if (firstStep != oldFirstStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP, oldFirstStep, firstStep));
			}
		}
		return firstStep;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DeploymentComponent basicGetFirstStep()
  {
		return firstStep;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFirstStep(DeploymentComponent newFirstStep)
  {
		DeploymentComponent oldFirstStep = firstStep;
		firstStep = newFirstStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP, oldFirstStep, firstStep));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DomainPackage.DEPLOYMENT_STAR_STEP__UID:
				return getUid();
			case DomainPackage.DEPLOYMENT_STAR_STEP__NAME:
				return getName();
			case DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP:
				if (resolve) return getFirstStep();
				return basicGetFirstStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DomainPackage.DEPLOYMENT_STAR_STEP__UID:
				setUid((String)newValue);
				return;
			case DomainPackage.DEPLOYMENT_STAR_STEP__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP:
				setFirstStep((DeploymentComponent)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case DomainPackage.DEPLOYMENT_STAR_STEP__UID:
				setUid(UID_EDEFAULT);
				return;
			case DomainPackage.DEPLOYMENT_STAR_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP:
				setFirstStep((DeploymentComponent)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case DomainPackage.DEPLOYMENT_STAR_STEP__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case DomainPackage.DEPLOYMENT_STAR_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DEPLOYMENT_STAR_STEP__FIRST_STEP:
				return firstStep != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeploymentStarStepImpl
