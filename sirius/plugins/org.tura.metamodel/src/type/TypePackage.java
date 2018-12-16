/**
 */
package type;

import artifact.ArtifactPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import permission.PermissionPackage;

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
 * @see type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link type.impl.TypeGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.TypeGroupImpl
	 * @see type.impl.TypePackageImpl#getTypeGroup()
	 * @generated
	 */
	int TYPE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__TYPES = 2;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__RELATIONSHIPS = 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link type.impl.PrimitivesGroupImpl <em>Primitives Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.PrimitivesGroupImpl
	 * @see type.impl.TypePackageImpl#getPrimitivesGroup()
	 * @generated
	 */
	int PRIMITIVES_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_GROUP__PRIMITIVES = 0;

	/**
	 * The number of structural features of the '<em>Primitives Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVES_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link type.impl.TypeElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.TypeElementImpl
	 * @see type.impl.TypePackageImpl#getTypeElement()
	 * @generated
	 */
	int TYPE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link type.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.RelationshipImpl
	 * @see type.impl.TypePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CLASSIFIERS = ArtifactPackage.CATEGORIZED__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UID = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link type.impl.ReferencesImpl <em>References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.ReferencesImpl
	 * @see type.impl.TypePackageImpl#getReferences()
	 * @generated
	 */
	int REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__CLASSIFIERS = RELATIONSHIP__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__UID = RELATIONSHIP__UID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link type.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.GeneralizationImpl
	 * @see type.impl.TypePackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__CLASSIFIERS = RELATIONSHIP__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__UID = RELATIONSHIP__UID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link type.impl.TypePointerImpl <em>Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.TypePointerImpl
	 * @see type.impl.TypePackageImpl#getTypePointer()
	 * @generated
	 */
	int TYPE_POINTER = 6;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINTER__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_POINTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link type.impl.PackagePointerImpl <em>Package Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.PackagePointerImpl
	 * @see type.impl.TypePackageImpl#getPackagePointer()
	 * @generated
	 */
	int PACKAGE_POINTER = 7;

	/**
	 * The feature id for the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_POINTER__PACKAGE_REF = 0;

	/**
	 * The number of structural features of the '<em>Package Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_POINTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link type.impl.AssosiationImpl <em>Assosiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.AssosiationImpl
	 * @see type.impl.TypePackageImpl#getAssosiation()
	 * @generated
	 */
	int ASSOSIATION = 8;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__CLASSIFIERS = RELATIONSHIP__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__UID = RELATIONSHIP__UID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__CONTAINMENT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__INTERNAL = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__LINKS = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__SOURCE_OPERATION = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__TARGET_OPERATION = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Many2many Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION__MANY2MANY_HELPER = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Assosiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOSIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link type.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.LinkImpl
	 * @see type.impl.TypePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__UID = 0;

	/**
	 * The feature id for the '<em><b>Master Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MASTER_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Detail Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DETAIL_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link type.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.AttributeImpl
	 * @see type.impl.TypePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE_REF = TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLASSIFIERS = TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UID = TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PK = TYPE_POINTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link type.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.OperationImpl
	 * @see type.impl.TypePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Grants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__GRANTS = PermissionPackage.SECURED__GRANTS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASSIFIERS = PermissionPackage.SECURED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UID = PermissionPackage.SECURED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = PermissionPackage.SECURED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = PermissionPackage.SECURED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUE = PermissionPackage.SECURED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PermissionPackage.SECURED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link type.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.PrimitiveImpl
	 * @see type.impl.TypePackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__UID = TYPE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = TYPE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link type.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.TypeImpl
	 * @see type.impl.TypePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__UID = TYPE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TYPE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLASSIFIERS = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OPERATIONS = TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link type.impl.TypeReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.TypeReferenceImpl
	 * @see type.impl.TypePackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__UID = TYPE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__NAME = TYPE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE_REF = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link type.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.ParameterImpl
	 * @see type.impl.TypePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_REF = TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UID = TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ORDER = TYPE_POINTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link type.impl.ReturnValueImpl <em>Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.ReturnValueImpl
	 * @see type.impl.TypePackageImpl#getReturnValue()
	 * @generated
	 */
	int RETURN_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__TYPE_REF = TYPE_POINTER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__UID = TYPE_POINTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link type.impl.EnumeratorImpl <em>Enumerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.EnumeratorImpl
	 * @see type.impl.TypePackageImpl#getEnumerator()
	 * @generated
	 */
	int ENUMERATOR = 17;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__UID = TYPE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__NAME = TYPE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__CLASSIFIERS = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR__VALUES = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATOR_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link type.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.EnumAttributeImpl
	 * @see type.impl.TypePackageImpl#getEnumAttribute()
	 * @generated
	 */
	int ENUM_ATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ATTRIBUTE__CLASSIFIERS = ArtifactPackage.CATEGORIZED__CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ATTRIBUTE__UID = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ATTRIBUTE__NAME = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ATTRIBUTE__VALUE = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ATTRIBUTE_FEATURE_COUNT = ArtifactPackage.CATEGORIZED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link type.impl.MethodPointerImpl <em>Method Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.MethodPointerImpl
	 * @see type.impl.TypePackageImpl#getMethodPointer()
	 * @generated
	 */
	int METHOD_POINTER = 19;

	/**
	 * The feature id for the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_POINTER__METHOD_REF = 0;

	/**
	 * The number of structural features of the '<em>Method Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_POINTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link type.impl.AttributePointerImpl <em>Attribute Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.impl.AttributePointerImpl
	 * @see type.impl.TypePackageImpl#getAttributePointer()
	 * @generated
	 */
	int ATTRIBUTE_POINTER = 20;

	/**
	 * The feature id for the '<em><b>Attribute Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_POINTER__ATTRIBUTE_REF = 0;

	/**
	 * The number of structural features of the '<em>Attribute Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_POINTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link type.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.RelationType
	 * @see type.impl.TypePackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 21;

	/**
	 * The meta object id for the '{@link type.Containment <em>Containment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type.Containment
	 * @see type.impl.TypePackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 22;


	/**
	 * Returns the meta object for class '{@link type.TypeGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see type.TypeGroup
	 * @generated
	 */
	EClass getTypeGroup();

	/**
	 * Returns the meta object for the attribute '{@link type.TypeGroup#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.TypeGroup#getUid()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EAttribute getTypeGroup_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.TypeGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.TypeGroup#getName()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EAttribute getTypeGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link type.TypeGroup#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see type.TypeGroup#getTypes()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EReference getTypeGroup_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link type.TypeGroup#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see type.TypeGroup#getRelationships()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EReference getTypeGroup_Relationships();

	/**
	 * Returns the meta object for class '{@link type.PrimitivesGroup <em>Primitives Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitives Group</em>'.
	 * @see type.PrimitivesGroup
	 * @generated
	 */
	EClass getPrimitivesGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link type.PrimitivesGroup#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitives</em>'.
	 * @see type.PrimitivesGroup#getPrimitives()
	 * @see #getPrimitivesGroup()
	 * @generated
	 */
	EReference getPrimitivesGroup_Primitives();

	/**
	 * Returns the meta object for class '{@link type.TypeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see type.TypeElement
	 * @generated
	 */
	EClass getTypeElement();

	/**
	 * Returns the meta object for the attribute '{@link type.TypeElement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.TypeElement#getUid()
	 * @see #getTypeElement()
	 * @generated
	 */
	EAttribute getTypeElement_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.TypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.TypeElement#getName()
	 * @see #getTypeElement()
	 * @generated
	 */
	EAttribute getTypeElement_Name();

	/**
	 * Returns the meta object for class '{@link type.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see type.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link type.Relationship#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.Relationship#getUid()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Uid();

	/**
	 * Returns the meta object for the reference '{@link type.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see type.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link type.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see type.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link type.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References</em>'.
	 * @see type.References
	 * @generated
	 */
	EClass getReferences();

	/**
	 * Returns the meta object for class '{@link type.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see type.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see type.TypePointer
	 * @generated
	 */
	EClass getTypePointer();

	/**
	 * Returns the meta object for the reference '{@link type.TypePointer#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Ref</em>'.
	 * @see type.TypePointer#getTypeRef()
	 * @see #getTypePointer()
	 * @generated
	 */
	EReference getTypePointer_TypeRef();

	/**
	 * Returns the meta object for class '{@link type.PackagePointer <em>Package Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Pointer</em>'.
	 * @see type.PackagePointer
	 * @generated
	 */
	EClass getPackagePointer();

	/**
	 * Returns the meta object for the reference '{@link type.PackagePointer#getPackageRef <em>Package Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package Ref</em>'.
	 * @see type.PackagePointer#getPackageRef()
	 * @see #getPackagePointer()
	 * @generated
	 */
	EReference getPackagePointer_PackageRef();

	/**
	 * Returns the meta object for class '{@link type.Assosiation <em>Assosiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assosiation</em>'.
	 * @see type.Assosiation
	 * @generated
	 */
	EClass getAssosiation();

	/**
	 * Returns the meta object for the attribute '{@link type.Assosiation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see type.Assosiation#getType()
	 * @see #getAssosiation()
	 * @generated
	 */
	EAttribute getAssosiation_Type();

	/**
	 * Returns the meta object for the attribute '{@link type.Assosiation#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see type.Assosiation#getContainment()
	 * @see #getAssosiation()
	 * @generated
	 */
	EAttribute getAssosiation_Containment();

	/**
	 * Returns the meta object for the attribute '{@link type.Assosiation#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see type.Assosiation#isInternal()
	 * @see #getAssosiation()
	 * @generated
	 */
	EAttribute getAssosiation_Internal();

	/**
	 * Returns the meta object for the containment reference list '{@link type.Assosiation#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see type.Assosiation#getLinks()
	 * @see #getAssosiation()
	 * @generated
	 */
	EReference getAssosiation_Links();

	/**
	 * Returns the meta object for the attribute '{@link type.Assosiation#getSourceOperation <em>Source Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Operation</em>'.
	 * @see type.Assosiation#getSourceOperation()
	 * @see #getAssosiation()
	 * @generated
	 */
	EAttribute getAssosiation_SourceOperation();

	/**
	 * Returns the meta object for the attribute '{@link type.Assosiation#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Operation</em>'.
	 * @see type.Assosiation#getTargetOperation()
	 * @see #getAssosiation()
	 * @generated
	 */
	EAttribute getAssosiation_TargetOperation();

	/**
	 * Returns the meta object for the containment reference '{@link type.Assosiation#getMany2manyHelper <em>Many2many Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many2many Helper</em>'.
	 * @see type.Assosiation#getMany2manyHelper()
	 * @see #getAssosiation()
	 * @generated
	 */
	EReference getAssosiation_Many2manyHelper();

	/**
	 * Returns the meta object for class '{@link type.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see type.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link type.Link#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.Link#getUid()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Uid();

	/**
	 * Returns the meta object for the reference '{@link type.Link#getMasterField <em>Master Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Field</em>'.
	 * @see type.Link#getMasterField()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_MasterField();

	/**
	 * Returns the meta object for the reference '{@link type.Link#getDetailField <em>Detail Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail Field</em>'.
	 * @see type.Link#getDetailField()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_DetailField();

	/**
	 * Returns the meta object for class '{@link type.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see type.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link type.Attribute#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.Attribute#getUid()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link type.Attribute#isPk <em>Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk</em>'.
	 * @see type.Attribute#isPk()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Pk();

	/**
	 * Returns the meta object for class '{@link type.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see type.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link type.Operation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.Operation#getUid()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link type.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see type.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link type.Operation#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see type.Operation#getReturnValue()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValue();

	/**
	 * Returns the meta object for class '{@link type.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see type.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link type.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see type.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link type.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see type.Type#getAttributes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link type.Type#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see type.Type#getOperations()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Operations();

	/**
	 * Returns the meta object for class '{@link type.TypeReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see type.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link type.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see type.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link type.Parameter#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.Parameter#getUid()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link type.Parameter#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see type.Parameter#getOrder()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Order();

	/**
	 * Returns the meta object for class '{@link type.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value</em>'.
	 * @see type.ReturnValue
	 * @generated
	 */
	EClass getReturnValue();

	/**
	 * Returns the meta object for the attribute '{@link type.ReturnValue#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.ReturnValue#getUid()
	 * @see #getReturnValue()
	 * @generated
	 */
	EAttribute getReturnValue_Uid();

	/**
	 * Returns the meta object for class '{@link type.Enumerator <em>Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerator</em>'.
	 * @see type.Enumerator
	 * @generated
	 */
	EClass getEnumerator();

	/**
	 * Returns the meta object for the containment reference list '{@link type.Enumerator#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see type.Enumerator#getValues()
	 * @see #getEnumerator()
	 * @generated
	 */
	EReference getEnumerator_Values();

	/**
	 * Returns the meta object for class '{@link type.EnumAttribute <em>Enum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Attribute</em>'.
	 * @see type.EnumAttribute
	 * @generated
	 */
	EClass getEnumAttribute();

	/**
	 * Returns the meta object for the attribute '{@link type.EnumAttribute#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see type.EnumAttribute#getUid()
	 * @see #getEnumAttribute()
	 * @generated
	 */
	EAttribute getEnumAttribute_Uid();

	/**
	 * Returns the meta object for the attribute '{@link type.EnumAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see type.EnumAttribute#getName()
	 * @see #getEnumAttribute()
	 * @generated
	 */
	EAttribute getEnumAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link type.EnumAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see type.EnumAttribute#getValue()
	 * @see #getEnumAttribute()
	 * @generated
	 */
	EAttribute getEnumAttribute_Value();

	/**
	 * Returns the meta object for class '{@link type.MethodPointer <em>Method Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Pointer</em>'.
	 * @see type.MethodPointer
	 * @generated
	 */
	EClass getMethodPointer();

	/**
	 * Returns the meta object for the reference '{@link type.MethodPointer#getMethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Ref</em>'.
	 * @see type.MethodPointer#getMethodRef()
	 * @see #getMethodPointer()
	 * @generated
	 */
	EReference getMethodPointer_MethodRef();

	/**
	 * Returns the meta object for class '{@link type.AttributePointer <em>Attribute Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Pointer</em>'.
	 * @see type.AttributePointer
	 * @generated
	 */
	EClass getAttributePointer();

	/**
	 * Returns the meta object for the reference '{@link type.AttributePointer#getAttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Ref</em>'.
	 * @see type.AttributePointer#getAttributeRef()
	 * @see #getAttributePointer()
	 * @generated
	 */
	EReference getAttributePointer_AttributeRef();

	/**
	 * Returns the meta object for enum '{@link type.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see type.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for enum '{@link type.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Containment</em>'.
	 * @see type.Containment
	 * @generated
	 */
	EEnum getContainment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

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
		 * The meta object literal for the '{@link type.impl.TypeGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.TypeGroupImpl
		 * @see type.impl.TypePackageImpl#getTypeGroup()
		 * @generated
		 */
		EClass TYPE_GROUP = eINSTANCE.getTypeGroup();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GROUP__UID = eINSTANCE.getTypeGroup_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GROUP__NAME = eINSTANCE.getTypeGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GROUP__TYPES = eINSTANCE.getTypeGroup_Types();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GROUP__RELATIONSHIPS = eINSTANCE.getTypeGroup_Relationships();

		/**
		 * The meta object literal for the '{@link type.impl.PrimitivesGroupImpl <em>Primitives Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.PrimitivesGroupImpl
		 * @see type.impl.TypePackageImpl#getPrimitivesGroup()
		 * @generated
		 */
		EClass PRIMITIVES_GROUP = eINSTANCE.getPrimitivesGroup();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVES_GROUP__PRIMITIVES = eINSTANCE.getPrimitivesGroup_Primitives();

		/**
		 * The meta object literal for the '{@link type.impl.TypeElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.TypeElementImpl
		 * @see type.impl.TypePackageImpl#getTypeElement()
		 * @generated
		 */
		EClass TYPE_ELEMENT = eINSTANCE.getTypeElement();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ELEMENT__UID = eINSTANCE.getTypeElement_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ELEMENT__NAME = eINSTANCE.getTypeElement_Name();

		/**
		 * The meta object literal for the '{@link type.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.RelationshipImpl
		 * @see type.impl.TypePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UID = eINSTANCE.getRelationship_Uid();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link type.impl.ReferencesImpl <em>References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.ReferencesImpl
		 * @see type.impl.TypePackageImpl#getReferences()
		 * @generated
		 */
		EClass REFERENCES = eINSTANCE.getReferences();

		/**
		 * The meta object literal for the '{@link type.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.GeneralizationImpl
		 * @see type.impl.TypePackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link type.impl.TypePointerImpl <em>Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.TypePointerImpl
		 * @see type.impl.TypePackageImpl#getTypePointer()
		 * @generated
		 */
		EClass TYPE_POINTER = eINSTANCE.getTypePointer();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_POINTER__TYPE_REF = eINSTANCE.getTypePointer_TypeRef();

		/**
		 * The meta object literal for the '{@link type.impl.PackagePointerImpl <em>Package Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.PackagePointerImpl
		 * @see type.impl.TypePackageImpl#getPackagePointer()
		 * @generated
		 */
		EClass PACKAGE_POINTER = eINSTANCE.getPackagePointer();

		/**
		 * The meta object literal for the '<em><b>Package Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_POINTER__PACKAGE_REF = eINSTANCE.getPackagePointer_PackageRef();

		/**
		 * The meta object literal for the '{@link type.impl.AssosiationImpl <em>Assosiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.AssosiationImpl
		 * @see type.impl.TypePackageImpl#getAssosiation()
		 * @generated
		 */
		EClass ASSOSIATION = eINSTANCE.getAssosiation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOSIATION__TYPE = eINSTANCE.getAssosiation_Type();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOSIATION__CONTAINMENT = eINSTANCE.getAssosiation_Containment();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOSIATION__INTERNAL = eINSTANCE.getAssosiation_Internal();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOSIATION__LINKS = eINSTANCE.getAssosiation_Links();

		/**
		 * The meta object literal for the '<em><b>Source Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOSIATION__SOURCE_OPERATION = eINSTANCE.getAssosiation_SourceOperation();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOSIATION__TARGET_OPERATION = eINSTANCE.getAssosiation_TargetOperation();

		/**
		 * The meta object literal for the '<em><b>Many2many Helper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOSIATION__MANY2MANY_HELPER = eINSTANCE.getAssosiation_Many2manyHelper();

		/**
		 * The meta object literal for the '{@link type.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.LinkImpl
		 * @see type.impl.TypePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__UID = eINSTANCE.getLink_Uid();

		/**
		 * The meta object literal for the '<em><b>Master Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__MASTER_FIELD = eINSTANCE.getLink_MasterField();

		/**
		 * The meta object literal for the '<em><b>Detail Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DETAIL_FIELD = eINSTANCE.getLink_DetailField();

		/**
		 * The meta object literal for the '{@link type.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.AttributeImpl
		 * @see type.impl.TypePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UID = eINSTANCE.getAttribute_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PK = eINSTANCE.getAttribute_Pk();

		/**
		 * The meta object literal for the '{@link type.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.OperationImpl
		 * @see type.impl.TypePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UID = eINSTANCE.getOperation_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_VALUE = eINSTANCE.getOperation_ReturnValue();

		/**
		 * The meta object literal for the '{@link type.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.PrimitiveImpl
		 * @see type.impl.TypePackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link type.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.TypeImpl
		 * @see type.impl.TypePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

		/**
		 * The meta object literal for the '{@link type.impl.TypeReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.TypeReferenceImpl
		 * @see type.impl.TypePackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link type.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.ParameterImpl
		 * @see type.impl.TypePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UID = eINSTANCE.getParameter_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ORDER = eINSTANCE.getParameter_Order();

		/**
		 * The meta object literal for the '{@link type.impl.ReturnValueImpl <em>Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.ReturnValueImpl
		 * @see type.impl.TypePackageImpl#getReturnValue()
		 * @generated
		 */
		EClass RETURN_VALUE = eINSTANCE.getReturnValue();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALUE__UID = eINSTANCE.getReturnValue_Uid();

		/**
		 * The meta object literal for the '{@link type.impl.EnumeratorImpl <em>Enumerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.EnumeratorImpl
		 * @see type.impl.TypePackageImpl#getEnumerator()
		 * @generated
		 */
		EClass ENUMERATOR = eINSTANCE.getEnumerator();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATOR__VALUES = eINSTANCE.getEnumerator_Values();

		/**
		 * The meta object literal for the '{@link type.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.EnumAttributeImpl
		 * @see type.impl.TypePackageImpl#getEnumAttribute()
		 * @generated
		 */
		EClass ENUM_ATTRIBUTE = eINSTANCE.getEnumAttribute();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ATTRIBUTE__UID = eINSTANCE.getEnumAttribute_Uid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ATTRIBUTE__NAME = eINSTANCE.getEnumAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ATTRIBUTE__VALUE = eINSTANCE.getEnumAttribute_Value();

		/**
		 * The meta object literal for the '{@link type.impl.MethodPointerImpl <em>Method Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.MethodPointerImpl
		 * @see type.impl.TypePackageImpl#getMethodPointer()
		 * @generated
		 */
		EClass METHOD_POINTER = eINSTANCE.getMethodPointer();

		/**
		 * The meta object literal for the '<em><b>Method Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_POINTER__METHOD_REF = eINSTANCE.getMethodPointer_MethodRef();

		/**
		 * The meta object literal for the '{@link type.impl.AttributePointerImpl <em>Attribute Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.impl.AttributePointerImpl
		 * @see type.impl.TypePackageImpl#getAttributePointer()
		 * @generated
		 */
		EClass ATTRIBUTE_POINTER = eINSTANCE.getAttributePointer();

		/**
		 * The meta object literal for the '<em><b>Attribute Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_POINTER__ATTRIBUTE_REF = eINSTANCE.getAttributePointer_AttributeRef();

		/**
		 * The meta object literal for the '{@link type.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.RelationType
		 * @see type.impl.TypePackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link type.Containment <em>Containment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type.Containment
		 * @see type.impl.TypePackageImpl#getContainment()
		 * @generated
		 */
		EEnum CONTAINMENT = eINSTANCE.getContainment();

	}

} //TypePackage
