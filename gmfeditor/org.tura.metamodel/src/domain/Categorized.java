/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Categorized#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getCategorized()
 * @model
 * @generated
 */
public interface Categorized extends EObject
{
  /**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Classifier}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see domain.DomainPackage#getCategorized_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
  EList<Classifier> getClassifiers();

} // Categorized
