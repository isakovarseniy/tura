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
package permission.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import permission.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PermissionFactoryImpl extends EFactoryImpl implements PermissionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PermissionFactory init() {
		try {
			PermissionFactory thePermissionFactory = (PermissionFactory)EPackage.Registry.INSTANCE.getEFactory(PermissionPackage.eNS_URI);
			if (thePermissionFactory != null) {
				return thePermissionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PermissionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PermissionPackage.ROLES: return createRoles();
			case PermissionPackage.SECURITY_ENTITY: return createSecurityEntity();
			case PermissionPackage.ROLE: return createRole();
			case PermissionPackage.GROUP: return createGroup();
			case PermissionPackage.GROUP2_GROUP: return createGroup2Group();
			case PermissionPackage.GROUP2_ROLE: return createGroup2Role();
			case PermissionPackage.SECURED: return createSecured();
			case PermissionPackage.GRANT_ACCESS: return createGrantAccess();
			case PermissionPackage.SECURITY_ENTITY_POINTER: return createSecurityEntityPointer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityEntity createSecurityEntity() {
		SecurityEntityImpl securityEntity = new SecurityEntityImpl();
		return securityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group2Group createGroup2Group() {
		Group2GroupImpl group2Group = new Group2GroupImpl();
		return group2Group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group2Role createGroup2Role() {
		Group2RoleImpl group2Role = new Group2RoleImpl();
		return group2Role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secured createSecured() {
		SecuredImpl secured = new SecuredImpl();
		return secured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrantAccess createGrantAccess() {
		GrantAccessImpl grantAccess = new GrantAccessImpl();
		return grantAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityEntityPointer createSecurityEntityPointer() {
		SecurityEntityPointerImpl securityEntityPointer = new SecurityEntityPointerImpl();
		return securityEntityPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionPackage getPermissionPackage() {
		return (PermissionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PermissionPackage getPackage() {
		return PermissionPackage.eINSTANCE;
	}

} //PermissionFactoryImpl
