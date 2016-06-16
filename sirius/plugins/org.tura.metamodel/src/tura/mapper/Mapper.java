/**
 */
package tura.mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.mapper.Mapper#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.mapper.Mapper#isServiceLayer <em>Service Layer</em>}</li>
 *   <li>{@link tura.mapper.Mapper#isUiLayer <em>Ui Layer</em>}</li>
 * </ul>
 *
 * @see tura.mapper.MapperPackage#getMapper()
 * @model
 * @generated
 */
public interface Mapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see tura.mapper.MapperPackage#getMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.mapper.Mapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Layer</em>' attribute.
	 * @see #setServiceLayer(boolean)
	 * @see tura.mapper.MapperPackage#getMapper_ServiceLayer()
	 * @model
	 * @generated
	 */
	boolean isServiceLayer();

	/**
	 * Sets the value of the '{@link tura.mapper.Mapper#isServiceLayer <em>Service Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Layer</em>' attribute.
	 * @see #isServiceLayer()
	 * @generated
	 */
	void setServiceLayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Ui Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Layer</em>' attribute.
	 * @see #setUiLayer(boolean)
	 * @see tura.mapper.MapperPackage#getMapper_UiLayer()
	 * @model
	 * @generated
	 */
	boolean isUiLayer();

	/**
	 * Sets the value of the '{@link tura.mapper.Mapper#isUiLayer <em>Ui Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Layer</em>' attribute.
	 * @see #isUiLayer()
	 * @generated
	 */
	void setUiLayer(boolean value);

} // Mapper
