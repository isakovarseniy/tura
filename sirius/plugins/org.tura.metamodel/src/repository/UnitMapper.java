/**
 */
package repository;

import form.Controls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.UnitMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.UnitMapper#getName <em>Name</em>}</li>
 *   <li>{@link repository.UnitMapper#getUnits <em>Units</em>}</li>
 *   <li>{@link repository.UnitMapper#getDatacontrols <em>Datacontrols</em>}</li>
 * </ul>
 *
 * @see repository.RepositoryPackage#getUnitMapper()
 * @model
 * @generated
 */
public interface UnitMapper extends EObject {
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
	 * @see repository.RepositoryPackage#getUnitMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link repository.UnitMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see repository.RepositoryPackage#getUnitMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link repository.UnitMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(Units)
	 * @see repository.RepositoryPackage#getUnitMapper_Units()
	 * @model containment="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link repository.UnitMapper#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>Datacontrols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacontrols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacontrols</em>' containment reference.
	 * @see #setDatacontrols(Controls)
	 * @see repository.RepositoryPackage#getUnitMapper_Datacontrols()
	 * @model containment="true"
	 * @generated
	 */
	Controls getDatacontrols();

	/**
	 * Sets the value of the '{@link repository.UnitMapper#getDatacontrols <em>Datacontrols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacontrols</em>' containment reference.
	 * @see #getDatacontrols()
	 * @generated
	 */
	void setDatacontrols(Controls value);

} // UnitMapper
