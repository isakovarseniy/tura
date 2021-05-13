/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package style;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see style.StyleFactory
 * @model kind="package"
 * @generated
 */
public interface StylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "style";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/style";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.style";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StylePackage eINSTANCE = style.impl.StylePackageImpl.init();

	/**
	 * The meta object id for the '{@link style.impl.StyleLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see style.impl.StyleLibraryImpl
	 * @see style.impl.StylePackageImpl#getStyleLibrary()
	 * @generated
	 */
	int STYLE_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRARY__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRARY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRARY__STYLES = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link style.impl.StyleSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see style.impl.StyleSetImpl
	 * @see style.impl.StylePackageImpl#getStyleSet()
	 * @generated
	 */
	int STYLE_SET = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SET__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link style.impl.StylePointerImpl <em>Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see style.impl.StylePointerImpl
	 * @see style.impl.StylePackageImpl#getStylePointer()
	 * @generated
	 */
	int STYLE_POINTER = 2;

	/**
	 * The feature id for the '<em><b>Style Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_POINTER__STYLE_LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_POINTER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link style.StyleLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see style.StyleLibrary
	 * @generated
	 */
	EClass getStyleLibrary();

	/**
	 * Returns the meta object for the attribute '{@link style.StyleLibrary#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see style.StyleLibrary#getUid()
	 * @see #getStyleLibrary()
	 * @generated
	 */
	EAttribute getStyleLibrary_Uid();

	/**
	 * Returns the meta object for the attribute '{@link style.StyleLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see style.StyleLibrary#getName()
	 * @see #getStyleLibrary()
	 * @generated
	 */
	EAttribute getStyleLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link style.StyleLibrary#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see style.StyleLibrary#getStyles()
	 * @see #getStyleLibrary()
	 * @generated
	 */
	EReference getStyleLibrary_Styles();

	/**
	 * Returns the meta object for class '{@link style.StyleSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see style.StyleSet
	 * @generated
	 */
	EClass getStyleSet();

	/**
	 * Returns the meta object for the attribute '{@link style.StyleSet#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see style.StyleSet#getUid()
	 * @see #getStyleSet()
	 * @generated
	 */
	EAttribute getStyleSet_Uid();

	/**
	 * Returns the meta object for the attribute '{@link style.StyleSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see style.StyleSet#getName()
	 * @see #getStyleSet()
	 * @generated
	 */
	EAttribute getStyleSet_Name();

	/**
	 * Returns the meta object for class '{@link style.StylePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see style.StylePointer
	 * @generated
	 */
	EClass getStylePointer();

	/**
	 * Returns the meta object for the reference '{@link style.StylePointer#getStyleLibrary <em>Style Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style Library</em>'.
	 * @see style.StylePointer#getStyleLibrary()
	 * @see #getStylePointer()
	 * @generated
	 */
	EReference getStylePointer_StyleLibrary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StyleFactory getStyleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link style.impl.StyleLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see style.impl.StyleLibraryImpl
		 * @see style.impl.StylePackageImpl#getStyleLibrary()
		 * @generated
		 */
		EClass STYLE_LIBRARY = eINSTANCE.getStyleLibrary();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_LIBRARY__UID = eINSTANCE.getStyleLibrary_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_LIBRARY__NAME = eINSTANCE.getStyleLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_LIBRARY__STYLES = eINSTANCE.getStyleLibrary_Styles();

		/**
		 * The meta object literal for the '{@link style.impl.StyleSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see style.impl.StyleSetImpl
		 * @see style.impl.StylePackageImpl#getStyleSet()
		 * @generated
		 */
		EClass STYLE_SET = eINSTANCE.getStyleSet();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_SET__UID = eINSTANCE.getStyleSet_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_SET__NAME = eINSTANCE.getStyleSet_Name();

		/**
		 * The meta object literal for the '{@link style.impl.StylePointerImpl <em>Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see style.impl.StylePointerImpl
		 * @see style.impl.StylePackageImpl#getStylePointer()
		 * @generated
		 */
		EClass STYLE_POINTER = eINSTANCE.getStylePointer();

		/**
		 * The meta object literal for the '<em><b>Style Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_POINTER__STYLE_LIBRARY = eINSTANCE.getStylePointer_StyleLibrary();

	}

} //StylePackage
