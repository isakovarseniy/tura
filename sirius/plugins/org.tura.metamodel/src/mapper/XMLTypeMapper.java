/**
 */
package mapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Type Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.XMLTypeMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.XMLTypeMapper#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link mapper.XMLTypeMapper#getTypename <em>Typename</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getXMLTypeMapper()
 * @model
 * @generated
 */
public interface XMLTypeMapper extends TypeMapper {
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
	 * @see mapper.MapperPackage#getXMLTypeMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link mapper.XMLTypeMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see mapper.MapperPackage#getXMLTypeMapper_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link mapper.XMLTypeMapper#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typename</em>' attribute.
	 * @see #setTypename(String)
	 * @see mapper.MapperPackage#getXMLTypeMapper_Typename()
	 * @model
	 * @generated
	 */
	String getTypename();

	/**
	 * Sets the value of the '{@link mapper.XMLTypeMapper#getTypename <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typename</em>' attribute.
	 * @see #getTypename()
	 * @generated
	 */
	void setTypename(String value);

} // XMLTypeMapper
