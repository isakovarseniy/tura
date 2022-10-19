/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package mapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.JavaMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}</li>
 *   <li>{@link mapper.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}</li>
 *   <li>{@link mapper.JavaMapper#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link mapper.JavaMapper#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link mapper.JavaMapper#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link mapper.JavaMapper#getArtifactType <em>Artifact Type</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getJavaMapper()
 * @model
 * @generated
 */
public interface JavaMapper extends TypeMapper, VersionRef {
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
	 * @see mapper.MapperPackage#getJavaMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Mapped To Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped To Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped To Package Name</em>' attribute.
	 * @see #setMappedToPackageName(String)
	 * @see mapper.MapperPackage#getJavaMapper_MappedToPackageName()
	 * @model
	 * @generated
	 */
	String getMappedToPackageName();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getMappedToPackageName <em>Mapped To Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To Package Name</em>' attribute.
	 * @see #getMappedToPackageName()
	 * @generated
	 */
	void setMappedToPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Mapped To Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped To Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped To Class Name</em>' attribute.
	 * @see #setMappedToClassName(String)
	 * @see mapper.MapperPackage#getJavaMapper_MappedToClassName()
	 * @model
	 * @generated
	 */
	String getMappedToClassName();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getMappedToClassName <em>Mapped To Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To Class Name</em>' attribute.
	 * @see #getMappedToClassName()
	 * @generated
	 */
	void setMappedToClassName(String value);

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
	 * @see mapper.MapperPackage#getJavaMapper_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * @see mapper.MapperPackage#getJavaMapper_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Name</em>' attribute.
	 * @see #setLibraryName(String)
	 * @see mapper.MapperPackage#getJavaMapper_LibraryName()
	 * @model
	 * @generated
	 */
	String getLibraryName();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getLibraryName <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Name</em>' attribute.
	 * @see #getLibraryName()
	 * @generated
	 */
	void setLibraryName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' attribute.
	 * The default value is <code>"jar"</code>.
	 * The literals are from the enumeration {@link mapper.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' attribute.
	 * @see mapper.ArtifactType
	 * @see #setArtifactType(ArtifactType)
	 * @see mapper.MapperPackage#getJavaMapper_ArtifactType()
	 * @model default="jar"
	 * @generated
	 */
	ArtifactType getArtifactType();

	/**
	 * Sets the value of the '{@link mapper.JavaMapper#getArtifactType <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' attribute.
	 * @see mapper.ArtifactType
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(ArtifactType value);

} // JavaMapper
