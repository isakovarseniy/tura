/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.Categorized#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getCategorized()
 * @model
 * @generated
 */
public interface Categorized extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getCategorized_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifiers();

} // Categorized
