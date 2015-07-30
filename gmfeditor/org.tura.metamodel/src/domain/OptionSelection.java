/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.OptionSelection#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link domain.OptionSelection#getOptionCast <em>Option Cast</em>}</li>
 *   <li>{@link domain.OptionSelection#getOptionCastDataControl <em>Option Cast Data Control</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getOptionSelection()
 * @model
 * @generated
 */
public interface OptionSelection extends InputElement
{
  /**
	 * Returns the value of the '<em><b>Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Pointer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Pointer</em>' reference.
	 * @see #setOptionPointer(DataControl)
	 * @see domain.DomainPackage#getOptionSelection_OptionPointer()
	 * @model
	 * @generated
	 */
  DataControl getOptionPointer();

  /**
	 * Sets the value of the '{@link domain.OptionSelection#getOptionPointer <em>Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Pointer</em>' reference.
	 * @see #getOptionPointer()
	 * @generated
	 */
  void setOptionPointer(DataControl value);

  /**
	 * Returns the value of the '<em><b>Option Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Cast</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Cast</em>' reference.
	 * @see #setOptionCast(Type)
	 * @see domain.DomainPackage#getOptionSelection_OptionCast()
	 * @model
	 * @generated
	 */
  Type getOptionCast();

  /**
	 * Sets the value of the '{@link domain.OptionSelection#getOptionCast <em>Option Cast</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Cast</em>' reference.
	 * @see #getOptionCast()
	 * @generated
	 */
  void setOptionCast(Type value);

  /**
	 * Returns the value of the '<em><b>Option Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Cast Data Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Cast Data Control</em>' reference.
	 * @see #setOptionCastDataControl(DataControl)
	 * @see domain.DomainPackage#getOptionSelection_OptionCastDataControl()
	 * @model
	 * @generated
	 */
  DataControl getOptionCastDataControl();

  /**
	 * Sets the value of the '{@link domain.OptionSelection#getOptionCastDataControl <em>Option Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Cast Data Control</em>' reference.
	 * @see #getOptionCastDataControl()
	 * @generated
	 */
  void setOptionCastDataControl(DataControl value);

} // OptionSelection
