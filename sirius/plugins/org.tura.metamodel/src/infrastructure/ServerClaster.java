/**
 */
package infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Claster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.ServerClaster#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see infrastructure.InfrastructurePackage#getServerClaster()
 * @model
 * @generated
 */
public interface ServerClaster extends InfrastructureComponent {
	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see infrastructure.InfrastructurePackage#getServerClaster_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

} // ServerClaster
