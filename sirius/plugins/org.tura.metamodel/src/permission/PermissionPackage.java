/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package permission;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see permission.PermissionFactory
 * @model kind="package"
 * @generated
 */
public interface PermissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "permission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/permission";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.permission";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PermissionPackage eINSTANCE = permission.impl.PermissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link permission.impl.RolesImpl <em>Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.RolesImpl
	 * @see permission.impl.PermissionPackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__UID = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Group2 Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__GROUP2_GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Group2 Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__GROUP2_ROLES = 4;

	/**
	 * The number of structural features of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link permission.impl.SecurityEntityImpl <em>Security Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.SecurityEntityImpl
	 * @see permission.impl.PermissionPackageImpl#getSecurityEntity()
	 * @generated
	 */
	int SECURITY_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Security Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link permission.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.RoleImpl
	 * @see permission.impl.PermissionPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = SECURITY_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UID = SECURITY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = SECURITY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link permission.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.GroupImpl
	 * @see permission.impl.PermissionPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = SECURITY_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__UID = SECURITY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = SECURITY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link permission.impl.Group2GroupImpl <em>Group2 Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.Group2GroupImpl
	 * @see permission.impl.PermissionPackageImpl#getGroup2Group()
	 * @generated
	 */
	int GROUP2_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_GROUP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_GROUP__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Group2 Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link permission.impl.Group2RoleImpl <em>Group2 Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.Group2RoleImpl
	 * @see permission.impl.PermissionPackageImpl#getGroup2Role()
	 * @generated
	 */
	int GROUP2_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_ROLE__UID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_ROLE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_ROLE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Group2 Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP2_ROLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link permission.impl.SecuredImpl <em>Secured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.SecuredImpl
	 * @see permission.impl.PermissionPackageImpl#getSecured()
	 * @generated
	 */
	int SECURED = 6;

	/**
	 * The feature id for the '<em><b>Grants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED__GRANTS = 0;

	/**
	 * The number of structural features of the '<em>Secured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link permission.impl.SecurityEntityPointerImpl <em>Security Entity Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.SecurityEntityPointerImpl
	 * @see permission.impl.PermissionPackageImpl#getSecurityEntityPointer()
	 * @generated
	 */
	int SECURITY_ENTITY_POINTER = 8;

	/**
	 * The feature id for the '<em><b>Security Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ENTITY_POINTER__SECURITY_ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Security Entity Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ENTITY_POINTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link permission.impl.GrantAccessImpl <em>Grant Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see permission.impl.GrantAccessImpl
	 * @see permission.impl.PermissionPackageImpl#getGrantAccess()
	 * @generated
	 */
	int GRANT_ACCESS = 7;

	/**
	 * The feature id for the '<em><b>Security Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ACCESS__SECURITY_ENTITY = SECURITY_ENTITY_POINTER__SECURITY_ENTITY;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ACCESS__UID = SECURITY_ENTITY_POINTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grant Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_ACCESS_FEATURE_COUNT = SECURITY_ENTITY_POINTER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link permission.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles</em>'.
	 * @see permission.Roles
	 * @generated
	 */
	EClass getRoles();

	/**
	 * Returns the meta object for the attribute '{@link permission.Roles#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.Roles#getUid()
	 * @see #getRoles()
	 * @generated
	 */
	EAttribute getRoles_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link permission.Roles#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see permission.Roles#getRoles()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link permission.Roles#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see permission.Roles#getGroups()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link permission.Roles#getGroup2Groups <em>Group2 Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group2 Groups</em>'.
	 * @see permission.Roles#getGroup2Groups()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Group2Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link permission.Roles#getGroup2Roles <em>Group2 Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group2 Roles</em>'.
	 * @see permission.Roles#getGroup2Roles()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Group2Roles();

	/**
	 * Returns the meta object for class '{@link permission.SecurityEntity <em>Security Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Entity</em>'.
	 * @see permission.SecurityEntity
	 * @generated
	 */
	EClass getSecurityEntity();

	/**
	 * Returns the meta object for the attribute '{@link permission.SecurityEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see permission.SecurityEntity#getName()
	 * @see #getSecurityEntity()
	 * @generated
	 */
	EAttribute getSecurityEntity_Name();

	/**
	 * Returns the meta object for class '{@link permission.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see permission.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link permission.Role#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.Role#getUid()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Uid();

	/**
	 * Returns the meta object for class '{@link permission.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see permission.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link permission.Group#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.Group#getUid()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Uid();

	/**
	 * Returns the meta object for class '{@link permission.Group2Group <em>Group2 Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group2 Group</em>'.
	 * @see permission.Group2Group
	 * @generated
	 */
	EClass getGroup2Group();

	/**
	 * Returns the meta object for the attribute '{@link permission.Group2Group#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.Group2Group#getUid()
	 * @see #getGroup2Group()
	 * @generated
	 */
	EAttribute getGroup2Group_Uid();

	/**
	 * Returns the meta object for the reference '{@link permission.Group2Group#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see permission.Group2Group#getSource()
	 * @see #getGroup2Group()
	 * @generated
	 */
	EReference getGroup2Group_Source();

	/**
	 * Returns the meta object for the reference '{@link permission.Group2Group#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see permission.Group2Group#getTarget()
	 * @see #getGroup2Group()
	 * @generated
	 */
	EReference getGroup2Group_Target();

	/**
	 * Returns the meta object for class '{@link permission.Group2Role <em>Group2 Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group2 Role</em>'.
	 * @see permission.Group2Role
	 * @generated
	 */
	EClass getGroup2Role();

	/**
	 * Returns the meta object for the attribute '{@link permission.Group2Role#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.Group2Role#getUid()
	 * @see #getGroup2Role()
	 * @generated
	 */
	EAttribute getGroup2Role_Uid();

	/**
	 * Returns the meta object for the reference '{@link permission.Group2Role#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see permission.Group2Role#getSource()
	 * @see #getGroup2Role()
	 * @generated
	 */
	EReference getGroup2Role_Source();

	/**
	 * Returns the meta object for the reference '{@link permission.Group2Role#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see permission.Group2Role#getTarget()
	 * @see #getGroup2Role()
	 * @generated
	 */
	EReference getGroup2Role_Target();

	/**
	 * Returns the meta object for class '{@link permission.Secured <em>Secured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secured</em>'.
	 * @see permission.Secured
	 * @generated
	 */
	EClass getSecured();

	/**
	 * Returns the meta object for the containment reference list '{@link permission.Secured#getGrants <em>Grants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grants</em>'.
	 * @see permission.Secured#getGrants()
	 * @see #getSecured()
	 * @generated
	 */
	EReference getSecured_Grants();

	/**
	 * Returns the meta object for class '{@link permission.GrantAccess <em>Grant Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grant Access</em>'.
	 * @see permission.GrantAccess
	 * @generated
	 */
	EClass getGrantAccess();

	/**
	 * Returns the meta object for the attribute '{@link permission.GrantAccess#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see permission.GrantAccess#getUid()
	 * @see #getGrantAccess()
	 * @generated
	 */
	EAttribute getGrantAccess_Uid();

	/**
	 * Returns the meta object for class '{@link permission.SecurityEntityPointer <em>Security Entity Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Entity Pointer</em>'.
	 * @see permission.SecurityEntityPointer
	 * @generated
	 */
	EClass getSecurityEntityPointer();

	/**
	 * Returns the meta object for the reference '{@link permission.SecurityEntityPointer#getSecurityEntity <em>Security Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Entity</em>'.
	 * @see permission.SecurityEntityPointer#getSecurityEntity()
	 * @see #getSecurityEntityPointer()
	 * @generated
	 */
	EReference getSecurityEntityPointer_SecurityEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PermissionFactory getPermissionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link permission.impl.RolesImpl <em>Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.RolesImpl
		 * @see permission.impl.PermissionPackageImpl#getRoles()
		 * @generated
		 */
		EClass ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLES__UID = eINSTANCE.getRoles_Uid();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__ROLES = eINSTANCE.getRoles_Roles();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__GROUPS = eINSTANCE.getRoles_Groups();

		/**
		 * The meta object literal for the '<em><b>Group2 Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__GROUP2_GROUPS = eINSTANCE.getRoles_Group2Groups();

		/**
		 * The meta object literal for the '<em><b>Group2 Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__GROUP2_ROLES = eINSTANCE.getRoles_Group2Roles();

		/**
		 * The meta object literal for the '{@link permission.impl.SecurityEntityImpl <em>Security Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.SecurityEntityImpl
		 * @see permission.impl.PermissionPackageImpl#getSecurityEntity()
		 * @generated
		 */
		EClass SECURITY_ENTITY = eINSTANCE.getSecurityEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ENTITY__NAME = eINSTANCE.getSecurityEntity_Name();

		/**
		 * The meta object literal for the '{@link permission.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.RoleImpl
		 * @see permission.impl.PermissionPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__UID = eINSTANCE.getRole_Uid();

		/**
		 * The meta object literal for the '{@link permission.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.GroupImpl
		 * @see permission.impl.PermissionPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__UID = eINSTANCE.getGroup_Uid();

		/**
		 * The meta object literal for the '{@link permission.impl.Group2GroupImpl <em>Group2 Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.Group2GroupImpl
		 * @see permission.impl.PermissionPackageImpl#getGroup2Group()
		 * @generated
		 */
		EClass GROUP2_GROUP = eINSTANCE.getGroup2Group();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP2_GROUP__UID = eINSTANCE.getGroup2Group_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP2_GROUP__SOURCE = eINSTANCE.getGroup2Group_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP2_GROUP__TARGET = eINSTANCE.getGroup2Group_Target();

		/**
		 * The meta object literal for the '{@link permission.impl.Group2RoleImpl <em>Group2 Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.Group2RoleImpl
		 * @see permission.impl.PermissionPackageImpl#getGroup2Role()
		 * @generated
		 */
		EClass GROUP2_ROLE = eINSTANCE.getGroup2Role();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP2_ROLE__UID = eINSTANCE.getGroup2Role_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP2_ROLE__SOURCE = eINSTANCE.getGroup2Role_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP2_ROLE__TARGET = eINSTANCE.getGroup2Role_Target();

		/**
		 * The meta object literal for the '{@link permission.impl.SecuredImpl <em>Secured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.SecuredImpl
		 * @see permission.impl.PermissionPackageImpl#getSecured()
		 * @generated
		 */
		EClass SECURED = eINSTANCE.getSecured();

		/**
		 * The meta object literal for the '<em><b>Grants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURED__GRANTS = eINSTANCE.getSecured_Grants();

		/**
		 * The meta object literal for the '{@link permission.impl.GrantAccessImpl <em>Grant Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.GrantAccessImpl
		 * @see permission.impl.PermissionPackageImpl#getGrantAccess()
		 * @generated
		 */
		EClass GRANT_ACCESS = eINSTANCE.getGrantAccess();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_ACCESS__UID = eINSTANCE.getGrantAccess_Uid();

		/**
		 * The meta object literal for the '{@link permission.impl.SecurityEntityPointerImpl <em>Security Entity Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see permission.impl.SecurityEntityPointerImpl
		 * @see permission.impl.PermissionPackageImpl#getSecurityEntityPointer()
		 * @generated
		 */
		EClass SECURITY_ENTITY_POINTER = eINSTANCE.getSecurityEntityPointer();

		/**
		 * The meta object literal for the '<em><b>Security Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ENTITY_POINTER__SECURITY_ENTITY = eINSTANCE.getSecurityEntityPointer_SecurityEntity();

	}

} //PermissionPackage
