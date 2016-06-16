/**
 */
package tura.style.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tura.style.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleFactoryImpl extends EFactoryImpl implements StyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleFactory init() {
		try {
			StyleFactory theStyleFactory = (StyleFactory)EPackage.Registry.INSTANCE.getEFactory(StylePackage.eNS_URI);
			if (theStyleFactory != null) {
				return theStyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StylePackage.STYLES: return createStyles();
			case StylePackage.STYLE_LIBRARY: return createStyleLibrary();
			case StylePackage.STYLE_SET: return createStyleSet();
			case StylePackage.STYLE_POINTER: return createStylePointer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styles createStyles() {
		StylesImpl styles = new StylesImpl();
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleLibrary createStyleLibrary() {
		StyleLibraryImpl styleLibrary = new StyleLibraryImpl();
		return styleLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSet createStyleSet() {
		StyleSetImpl styleSet = new StyleSetImpl();
		return styleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePointer createStylePointer() {
		StylePointerImpl stylePointer = new StylePointerImpl();
		return stylePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePackage getStylePackage() {
		return (StylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StylePackage getPackage() {
		return StylePackage.eINSTANCE;
	}

} //StyleFactoryImpl
