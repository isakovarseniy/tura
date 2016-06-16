/**
 */
package tura.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.mapper.Mappers;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.recipe.UsingMappers#getMappers <em>Mappers</em>}</li>
 * </ul>
 *
 * @see tura.recipe.RecipePackage#getUsingMappers()
 * @model
 * @generated
 */
public interface UsingMappers extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' reference list.
	 * The list contents are of type {@link tura.mapper.Mappers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' reference list.
	 * @see tura.recipe.RecipePackage#getUsingMappers_Mappers()
	 * @model
	 * @generated
	 */
	EList<Mappers> getMappers();

} // UsingMappers
