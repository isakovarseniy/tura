/**
 */
package common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link common.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see common.impl.HTMLLayerHolderImpl
	 * @see common.impl.CommonPackageImpl#getHTMLLayerHolder()
	 * @generated
	 */
	int HTML_LAYER_HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LAYER_HOLDER__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>HTML Layer Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LAYER_HOLDER_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link common.impl.OrderableImpl <em>Orderable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see common.impl.OrderableImpl
	 * @see common.impl.CommonPackageImpl#getOrderable()
	 * @generated
	 */
	int ORDERABLE = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERABLE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Orderable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERABLE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link common.HTMLLayerHolder <em>HTML Layer Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Layer Holder</em>'.
	 * @see common.HTMLLayerHolder
	 * @generated
	 */
	EClass getHTMLLayerHolder();

	/**
	 * Returns the meta object for the attribute '{@link common.HTMLLayerHolder#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see common.HTMLLayerHolder#getColumns()
	 * @see #getHTMLLayerHolder()
	 * @generated
	 */
	EAttribute getHTMLLayerHolder_Columns();

	/**
	 * Returns the meta object for class '{@link common.Orderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderable</em>'.
	 * @see common.Orderable
	 * @generated
	 */
	EClass getOrderable();

	/**
	 * Returns the meta object for the attribute '{@link common.Orderable#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see common.Orderable#getOrder()
	 * @see #getOrderable()
	 * @generated
	 */
	EAttribute getOrderable_Order();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link common.impl.HTMLLayerHolderImpl <em>HTML Layer Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see common.impl.HTMLLayerHolderImpl
		 * @see common.impl.CommonPackageImpl#getHTMLLayerHolder()
		 * @generated
		 */
		EClass HTML_LAYER_HOLDER = eINSTANCE.getHTMLLayerHolder();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_LAYER_HOLDER__COLUMNS = eINSTANCE.getHTMLLayerHolder_Columns();

		/**
		 * The meta object literal for the '{@link common.impl.OrderableImpl <em>Orderable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see common.impl.OrderableImpl
		 * @see common.impl.CommonPackageImpl#getOrderable()
		 * @generated
		 */
		EClass ORDERABLE = eINSTANCE.getOrderable();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERABLE__ORDER = eINSTANCE.getOrderable_Order();

	}

} //CommonPackage
