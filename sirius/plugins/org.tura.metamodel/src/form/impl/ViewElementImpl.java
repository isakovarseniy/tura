/**
 */
package form.impl;

import common.Categorized;
import common.Classifier;
import common.CommonPackage;

import form.FormPackage;
import form.NickNamed;
import form.ViewElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.ViewElementImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.ViewElementImpl#getNickname <em>Nickname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewElementImpl extends StyleElementImpl implements ViewElement {
	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.VIEW_ELEMENT__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VIEW_ELEMENT__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.VIEW_ELEMENT__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
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
			case FormPackage.VIEW_ELEMENT__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.VIEW_ELEMENT__NICKNAME:
				return getNickname();
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
			case FormPackage.VIEW_ELEMENT__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.VIEW_ELEMENT__NICKNAME:
				setNickname((String)newValue);
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
			case FormPackage.VIEW_ELEMENT__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.VIEW_ELEMENT__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
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
			case FormPackage.VIEW_ELEMENT__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.VIEW_ELEMENT__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.VIEW_ELEMENT__CLASSIFIERS: return CommonPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (derivedFeatureID) {
				case FormPackage.VIEW_ELEMENT__NICKNAME: return FormPackage.NICK_NAMED__NICKNAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case CommonPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.VIEW_ELEMENT__CLASSIFIERS;
				default: return -1;
			}
		}
		if (baseClass == NickNamed.class) {
			switch (baseFeatureID) {
				case FormPackage.NICK_NAMED__NICKNAME: return FormPackage.VIEW_ELEMENT__NICKNAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(')');
		return result.toString();
	}

} //ViewElementImpl
