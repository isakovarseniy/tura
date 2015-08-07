/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Subsystem#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Subsystem#getName <em>Name</em>}</li>
 *   <li>{@link domain.Subsystem#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Subsystem#getInfrastructureLayer <em>Infrastructure Layer</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getSubsystem()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/subsystem.png'"
 * @generated
 */
public interface Subsystem extends EObject {
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
	 * @see domain.DomainPackage#getSubsystem_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Subsystem#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getSubsystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Subsystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Datacenter#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Datacenter)
	 * @see domain.DomainPackage#getSubsystem_Parent()
	 * @see domain.Datacenter#getSubsystems
	 * @model opposite="subsystems" transient="false"
	 * @generated
	 */
	Datacenter getParent();

	/**
	 * Sets the value of the '{@link domain.Subsystem#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Datacenter value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Layer</b></em>' containment reference list.
	 * The list contents are of type {@link domain.InfrastructureLayer}.
	 * It is bidirectional and its opposite is '{@link domain.InfrastructureLayer#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Layer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Layer</em>' containment reference list.
	 * @see domain.DomainPackage#getSubsystem_InfrastructureLayer()
	 * @see domain.InfrastructureLayer#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<InfrastructureLayer> getInfrastructureLayer();

} // Subsystem
