/**
 */
package mapper;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link mapper.Mapper#isServiceLayer <em>Service Layer</em>}</li>
 *   <li>{@link mapper.Mapper#isUiLayer <em>Ui Layer</em>}</li>
 *   <li>{@link mapper.Mapper#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getMapper()
 * @model
 * @generated
 */
public interface Mapper extends EObject {
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
	 * @see mapper.MapperPackage#getMapper_ServiceLayer()
	 * @model
	 * @generated
	 */
	boolean isServiceLayer();

	/**
	 * Sets the value of the '{@link mapper.Mapper#isServiceLayer <em>Service Layer</em>}' attribute.
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
	 * @see mapper.MapperPackage#getMapper_UiLayer()
	 * @model
	 * @generated
	 */
	boolean isUiLayer();

	/**
	 * Sets the value of the '{@link mapper.Mapper#isUiLayer <em>Ui Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Layer</em>' attribute.
	 * @see #isUiLayer()
	 * @generated
	 */
	void setUiLayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link mapper.MappingLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see mapper.MapperPackage#getMapper_Layers()
	 * @model
	 * @generated
	 */
	EList<MappingLayer> getLayers();

} // Mapper
