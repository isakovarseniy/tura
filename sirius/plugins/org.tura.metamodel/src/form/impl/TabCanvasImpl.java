/**
 */
package form.impl;

import common.Categorized;
import common.Classifier;
import common.CommonPackage;

import form.Context;
import form.DefaultCavas;
import form.FormPackage;
import form.MultiLangLabel;
import form.Orientation;
import form.TabCanvas;

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
 * An implementation of the model object '<em><b>Tab Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.TabCanvasImpl#isDefaultCanvas <em>Default Canvas</em>}</li>
 *   <li>{@link form.impl.TabCanvasImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link form.impl.TabCanvasImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.TabCanvasImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabCanvasImpl extends CanvasFrameImpl implements TabCanvas {
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
	 * The cached value of the '{@link #getMultiLangLabel() <em>Multi Lang Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLangLabel()
	 * @generated
	 * @ordered
	 */
	protected Context multiLangLabel;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.TOP;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabCanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.TAB_CANVAS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_CANVAS__DEFAULT_CANVAS, oldDefaultCanvas, defaultCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getMultiLangLabel() {
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLangLabel(Context newMultiLangLabel, NotificationChain msgs) {
		Context oldMultiLangLabel = multiLangLabel;
		multiLangLabel = newMultiLangLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.TAB_CANVAS__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLangLabel(Context newMultiLangLabel) {
		if (newMultiLangLabel != multiLangLabel) {
			NotificationChain msgs = null;
			if (multiLangLabel != null)
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.TAB_CANVAS__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.TAB_CANVAS__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_CANVAS__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.TAB_CANVAS__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TAB_CANVAS__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case FormPackage.TAB_CANVAS__CLASSIFIERS:
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
			case FormPackage.TAB_CANVAS__DEFAULT_CANVAS:
				return isDefaultCanvas();
			case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case FormPackage.TAB_CANVAS__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.TAB_CANVAS__ORIENTATION:
				return getOrientation();
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
			case FormPackage.TAB_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas((Boolean)newValue);
				return;
			case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case FormPackage.TAB_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.TAB_CANVAS__ORIENTATION:
				setOrientation((Orientation)newValue);
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
			case FormPackage.TAB_CANVAS__DEFAULT_CANVAS:
				setDefaultCanvas(DEFAULT_CANVAS_EDEFAULT);
				return;
			case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case FormPackage.TAB_CANVAS__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.TAB_CANVAS__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case FormPackage.TAB_CANVAS__DEFAULT_CANVAS:
				return defaultCanvas != DEFAULT_CANVAS_EDEFAULT;
			case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case FormPackage.TAB_CANVAS__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.TAB_CANVAS__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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
		if (baseClass == DefaultCavas.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_CANVAS__DEFAULT_CANVAS: return FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_CANVAS__MULTI_LANG_LABEL: return FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.TAB_CANVAS__CLASSIFIERS: return CommonPackage.CATEGORIZED__CLASSIFIERS;
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
		if (baseClass == DefaultCavas.class) {
			switch (baseFeatureID) {
				case FormPackage.DEFAULT_CAVAS__DEFAULT_CANVAS: return FormPackage.TAB_CANVAS__DEFAULT_CANVAS;
				default: return -1;
			}
		}
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return FormPackage.TAB_CANVAS__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case CommonPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.TAB_CANVAS__CLASSIFIERS;
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
		result.append(" (defaultCanvas: ");
		result.append(defaultCanvas);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //TabCanvasImpl
