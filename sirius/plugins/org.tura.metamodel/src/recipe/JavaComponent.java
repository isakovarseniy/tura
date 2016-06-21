/**
 */
package recipe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.JavaComponent#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link recipe.JavaComponent#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link recipe.JavaComponent#getVersion <em>Version</em>}</li>
 *   <li>{@link recipe.JavaComponent#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getJavaComponent()
 * @model
 * @generated
 */
public interface JavaComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see recipe.RecipePackage#getJavaComponent_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link recipe.JavaComponent#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see recipe.RecipePackage#getJavaComponent_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link recipe.JavaComponent#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see recipe.RecipePackage#getJavaComponent_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link recipe.JavaComponent#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see recipe.RecipePackage#getJavaComponent_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link recipe.JavaComponent#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

} // JavaComponent
