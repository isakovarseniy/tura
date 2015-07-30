/**
 */
package domain;

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
 *   <li>{@link domain.ServerClaster#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getServerClaster()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/serverclaster.png'"
 * @generated
 */
public interface ServerClaster extends InfrastructureComponent
{
  /**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Server}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see domain.DomainPackage#getServerClaster_Servers()
	 * @model containment="true"
	 * @generated
	 */
  EList<Server> getServers();

} // ServerClaster
