/**
 */
package tura.permission.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tura.permission.*;

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
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityEntity createSecurityEntity() {
		SecurityEntityImpl securityEntity = new SecurityEntityImpl();
		return securityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secured createSecured() {
		SecuredImpl secured = new SecuredImpl();
		return secured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrantAccess createGrantAccess() {
		GrantAccessImpl grantAccess = new GrantAccessImpl();
		return grantAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityEntityPointer createSecurityEntityPointer() {
		SecurityEntityPointerImpl securityEntityPointer = new SecurityEntityPointerImpl();
		return securityEntityPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
