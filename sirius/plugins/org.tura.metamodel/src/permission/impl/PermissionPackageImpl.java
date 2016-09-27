/**
 */
package permission.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.ArtifactPackage;

import artifact.impl.ArtifactPackageImpl;

import common.CommonPackage;

import common.impl.CommonPackageImpl;

import domain.DomainPackage;

import domain.impl.DomainPackageImpl;

import form.FormPackage;

import form.impl.FormPackageImpl;

import infrastructure.InfrastructurePackage;

import infrastructure.impl.InfrastructurePackageImpl;

import mapper.MapperPackage;

import mapper.impl.MapperPackageImpl;

import message.MessagePackage;

import message.impl.MessagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.GrantAccess;
import permission.Group;
import permission.Group2Group;
import permission.Group2Role;
import permission.PermissionFactory;
import permission.PermissionPackage;
import permission.Role;
import permission.Roles;
import permission.Secured;
import permission.SecurityEntity;
import permission.SecurityEntityPointer;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

import style.StylePackage;

import style.impl.StylePackageImpl;

import type.TypePackage;

import type.impl.TypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PermissionPackageImpl extends EPackageImpl implements PermissionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass group2GroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass group2RoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grantAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEntityPointerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see permission.PermissionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PermissionPackageImpl() {
		super(eNS_URI, PermissionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PermissionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PermissionPackage init() {
		if (isInited) return (PermissionPackage)EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI);

		// Obtain or create and register package
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PermissionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PermissionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) instanceof ArtifactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI) : ArtifactPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) instanceof MessagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI) : MessagePackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) instanceof RecipePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI) : RecipePackage.eINSTANCE);
		MapperPackageImpl theMapperPackage = (MapperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) instanceof MapperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI) : MapperPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		thePermissionPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theMapperPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		thePermissionPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theMapperPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePermissionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PermissionPackage.eNS_URI, thePermissionPackage);
		return thePermissionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoles() {
		return rolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoles_Uid() {
		return (EAttribute)rolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Roles() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Groups() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Group2Groups() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Group2Roles() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityEntity() {
		return securityEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityEntity_Name() {
		return (EAttribute)securityEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Uid() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Uid() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup2Group() {
		return group2GroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup2Group_Uid() {
		return (EAttribute)group2GroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup2Group_Source() {
		return (EReference)group2GroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup2Group_Target() {
		return (EReference)group2GroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup2Role() {
		return group2RoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup2Role_Uid() {
		return (EAttribute)group2RoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup2Role_Source() {
		return (EReference)group2RoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup2Role_Target() {
		return (EReference)group2RoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecured() {
		return securedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecured_Grants() {
		return (EReference)securedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrantAccess() {
		return grantAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrantAccess_Uid() {
		return (EAttribute)grantAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityEntityPointer() {
		return securityEntityPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityEntityPointer_SecurityEntity() {
		return (EReference)securityEntityPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionFactory getPermissionFactory() {
		return (PermissionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rolesEClass = createEClass(ROLES);
		createEAttribute(rolesEClass, ROLES__UID);
		createEReference(rolesEClass, ROLES__ROLES);
		createEReference(rolesEClass, ROLES__GROUPS);
		createEReference(rolesEClass, ROLES__GROUP2_GROUPS);
		createEReference(rolesEClass, ROLES__GROUP2_ROLES);

		securityEntityEClass = createEClass(SECURITY_ENTITY);
		createEAttribute(securityEntityEClass, SECURITY_ENTITY__NAME);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__UID);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__UID);

		group2GroupEClass = createEClass(GROUP2_GROUP);
		createEAttribute(group2GroupEClass, GROUP2_GROUP__UID);
		createEReference(group2GroupEClass, GROUP2_GROUP__SOURCE);
		createEReference(group2GroupEClass, GROUP2_GROUP__TARGET);

		group2RoleEClass = createEClass(GROUP2_ROLE);
		createEAttribute(group2RoleEClass, GROUP2_ROLE__UID);
		createEReference(group2RoleEClass, GROUP2_ROLE__SOURCE);
		createEReference(group2RoleEClass, GROUP2_ROLE__TARGET);

		securedEClass = createEClass(SECURED);
		createEReference(securedEClass, SECURED__GRANTS);

		grantAccessEClass = createEClass(GRANT_ACCESS);
		createEAttribute(grantAccessEClass, GRANT_ACCESS__UID);

		securityEntityPointerEClass = createEClass(SECURITY_ENTITY_POINTER);
		createEReference(securityEntityPointerEClass, SECURITY_ENTITY_POINTER__SECURITY_ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(this.getSecurityEntity());
		groupEClass.getESuperTypes().add(this.getSecurityEntity());
		grantAccessEClass.getESuperTypes().add(this.getSecurityEntityPointer());

		// Initialize classes and features; add operations and parameters
		initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoles_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Roles(), this.getRole(), null, "roles", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Groups(), this.getGroup(), null, "groups", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Group2Groups(), this.getGroup2Group(), null, "group2Groups", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Group2Roles(), this.getGroup2Role(), null, "group2Roles", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEntityEClass, SecurityEntity.class, "SecurityEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(group2GroupEClass, Group2Group.class, "Group2Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup2Group_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Group2Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup2Group_Source(), this.getGroup(), null, "source", null, 0, 1, Group2Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup2Group_Target(), this.getGroup(), null, "target", null, 0, 1, Group2Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(group2RoleEClass, Group2Role.class, "Group2Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup2Role_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Group2Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup2Role_Source(), this.getGroup(), null, "source", null, 0, 1, Group2Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup2Role_Target(), this.getRole(), null, "target", null, 0, 1, Group2Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securedEClass, Secured.class, "Secured", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecured_Grants(), this.getGrantAccess(), null, "grants", null, 0, -1, Secured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grantAccessEClass, GrantAccess.class, "GrantAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrantAccess_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, GrantAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEntityPointerEClass, SecurityEntityPointer.class, "SecurityEntityPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityEntityPointer_SecurityEntity(), this.getSecurityEntity(), null, "securityEntity", null, 0, 1, SecurityEntityPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PermissionPackageImpl
