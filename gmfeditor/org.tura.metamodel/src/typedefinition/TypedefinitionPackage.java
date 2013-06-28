/**
 */
package typedefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see typedefinition.TypedefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface TypedefinitionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "typedefinition";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://tura.org/2013/v1/typedefinition";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tura.typedefinition";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypedefinitionPackage eINSTANCE = typedefinition.impl.TypedefinitionPackageImpl.init();

  /**
   * The meta object id for the '{@link typedefinition.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeDefinitionImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__TYPES = 0;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__ENUMS = 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link typedefinition.impl.TypeElementImpl <em>Type Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeElementImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeElement()
   * @generated
   */
  int TYPE_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Type Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link typedefinition.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = TYPE_ELEMENT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXTENSION = TYPE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link typedefinition.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeReferenceImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__TYPE = TYPE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__NAME = TYPE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link typedefinition.impl.TypeExtensionImpl <em>Type Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypeExtensionImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeExtension()
   * @generated
   */
  int TYPE_EXTENSION = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION__TARGET = 1;

  /**
   * The number of structural features of the '<em>Type Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXTENSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link typedefinition.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.AttributeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The meta object id for the '{@link typedefinition.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.OperationImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 6;

  /**
   * The meta object id for the '{@link typedefinition.impl.ReturnValueImpl <em>Return Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.ReturnValueImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getReturnValue()
   * @generated
   */
  int RETURN_VALUE = 7;

  /**
   * The meta object id for the '{@link typedefinition.impl.EnumaratorImpl <em>Enumarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.EnumaratorImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getEnumarator()
   * @generated
   */
  int ENUMARATOR = 8;

  /**
   * The meta object id for the '{@link typedefinition.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.EnumAttributeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getEnumAttribute()
   * @generated
   */
  int ENUM_ATTRIBUTE = 9;

  /**
   * The meta object id for the '{@link typedefinition.impl.TypePointerImpl <em>Type Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see typedefinition.impl.TypePointerImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getTypePointer()
   * @generated
   */
  int TYPE_POINTER = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_POINTER_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = TYPE_POINTER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RETURN_VALUE = 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__TYPE = TYPE_POINTER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE__NAME = TYPE_POINTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE_FEATURE_COUNT = TYPE_POINTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR__VALUES = 1;

  /**
   * The number of structural features of the '<em>Enumarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMARATOR_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '<em>reftype</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tura.metamodel.commons.types.impl.RefTypeImpl
   * @see typedefinition.impl.TypedefinitionPackageImpl#getreftype()
   * @generated
   */
  int REFTYPE = 11;


  /**
   * Returns the meta object for class '{@link typedefinition.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see typedefinition.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.TypeDefinition#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see typedefinition.TypeDefinition#getTypes()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Types();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.TypeDefinition#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see typedefinition.TypeDefinition#getEnums()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Enums();

  /**
   * Returns the meta object for class '{@link typedefinition.TypeElement <em>Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Element</em>'.
   * @see typedefinition.TypeElement
   * @generated
   */
  EClass getTypeElement();

  /**
   * Returns the meta object for class '{@link typedefinition.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see typedefinition.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.Type#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see typedefinition.Type#getAttributes()
   * @see #getType()
   * @generated
   */
  EReference getType_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.Type#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see typedefinition.Type#getOperations()
   * @see #getType()
   * @generated
   */
  EReference getType_Operations();

  /**
   * Returns the meta object for the containment reference '{@link typedefinition.Type#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extension</em>'.
   * @see typedefinition.Type#getExtension()
   * @see #getType()
   * @generated
   */
  EReference getType_Extension();

  /**
   * Returns the meta object for class '{@link typedefinition.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see typedefinition.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.TypeReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.TypeReference#getName()
   * @see #getTypeReference()
   * @generated
   */
  EAttribute getTypeReference_Name();

  /**
   * Returns the meta object for class '{@link typedefinition.TypeExtension <em>Type Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Extension</em>'.
   * @see typedefinition.TypeExtension
   * @generated
   */
  EClass getTypeExtension();

  /**
   * Returns the meta object for the reference '{@link typedefinition.TypeExtension#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see typedefinition.TypeExtension#getSource()
   * @see #getTypeExtension()
   * @generated
   */
  EReference getTypeExtension_Source();

  /**
   * Returns the meta object for the reference '{@link typedefinition.TypeExtension#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see typedefinition.TypeExtension#getTarget()
   * @see #getTypeExtension()
   * @generated
   */
  EReference getTypeExtension_Target();

  /**
   * Returns the meta object for class '{@link typedefinition.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see typedefinition.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link typedefinition.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see typedefinition.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see typedefinition.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link typedefinition.Operation#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see typedefinition.Operation#getReturnValue()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_ReturnValue();

  /**
   * Returns the meta object for class '{@link typedefinition.ReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Value</em>'.
   * @see typedefinition.ReturnValue
   * @generated
   */
  EClass getReturnValue();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.ReturnValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.ReturnValue#getName()
   * @see #getReturnValue()
   * @generated
   */
  EAttribute getReturnValue_Name();

  /**
   * Returns the meta object for class '{@link typedefinition.Enumarator <em>Enumarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumarator</em>'.
   * @see typedefinition.Enumarator
   * @generated
   */
  EClass getEnumarator();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.Enumarator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.Enumarator#getName()
   * @see #getEnumarator()
   * @generated
   */
  EAttribute getEnumarator_Name();

  /**
   * Returns the meta object for the containment reference list '{@link typedefinition.Enumarator#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see typedefinition.Enumarator#getValues()
   * @see #getEnumarator()
   * @generated
   */
  EReference getEnumarator_Values();

  /**
   * Returns the meta object for class '{@link typedefinition.EnumAttribute <em>Enum Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute</em>'.
   * @see typedefinition.EnumAttribute
   * @generated
   */
  EClass getEnumAttribute();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.EnumAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see typedefinition.EnumAttribute#getName()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.EnumAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see typedefinition.EnumAttribute#getValue()
   * @see #getEnumAttribute()
   * @generated
   */
  EAttribute getEnumAttribute_Value();

  /**
   * Returns the meta object for class '{@link typedefinition.TypePointer <em>Type Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Pointer</em>'.
   * @see typedefinition.TypePointer
   * @generated
   */
  EClass getTypePointer();

  /**
   * Returns the meta object for the attribute '{@link typedefinition.TypePointer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see typedefinition.TypePointer#getType()
   * @see #getTypePointer()
   * @generated
   */
  EAttribute getTypePointer_Type();

  /**
   * Returns the meta object for data type '{@link org.tura.metamodel.commons.types.impl.RefTypeImpl <em>reftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>reftype</em>'.
   * @see org.tura.metamodel.commons.types.impl.RefTypeImpl
   * @model instanceClass="org.tura.metamodel.commons.types.impl.RefTypeImpl"
   * @generated
   */
  EDataType getreftype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypedefinitionFactory getTypedefinitionFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link typedefinition.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeDefinitionImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__TYPES = eINSTANCE.getTypeDefinition_Types();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__ENUMS = eINSTANCE.getTypeDefinition_Enums();

    /**
     * The meta object literal for the '{@link typedefinition.impl.TypeElementImpl <em>Type Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeElementImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeElement()
     * @generated
     */
    EClass TYPE_ELEMENT = eINSTANCE.getTypeElement();

    /**
     * The meta object literal for the '{@link typedefinition.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

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
     * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__EXTENSION = eINSTANCE.getType_Extension();

    /**
     * The meta object literal for the '{@link typedefinition.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeReferenceImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REFERENCE__NAME = eINSTANCE.getTypeReference_Name();

    /**
     * The meta object literal for the '{@link typedefinition.impl.TypeExtensionImpl <em>Type Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypeExtensionImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypeExtension()
     * @generated
     */
    EClass TYPE_EXTENSION = eINSTANCE.getTypeExtension();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXTENSION__SOURCE = eINSTANCE.getTypeExtension_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXTENSION__TARGET = eINSTANCE.getTypeExtension_Target();

    /**
     * The meta object literal for the '{@link typedefinition.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.AttributeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link typedefinition.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.OperationImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

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
     * The meta object literal for the '{@link typedefinition.impl.ReturnValueImpl <em>Return Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.ReturnValueImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getReturnValue()
     * @generated
     */
    EClass RETURN_VALUE = eINSTANCE.getReturnValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_VALUE__NAME = eINSTANCE.getReturnValue_Name();

    /**
     * The meta object literal for the '{@link typedefinition.impl.EnumaratorImpl <em>Enumarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.EnumaratorImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getEnumarator()
     * @generated
     */
    EClass ENUMARATOR = eINSTANCE.getEnumarator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMARATOR__NAME = eINSTANCE.getEnumarator_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMARATOR__VALUES = eINSTANCE.getEnumarator_Values();

    /**
     * The meta object literal for the '{@link typedefinition.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.EnumAttributeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getEnumAttribute()
     * @generated
     */
    EClass ENUM_ATTRIBUTE = eINSTANCE.getEnumAttribute();

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
     * The meta object literal for the '{@link typedefinition.impl.TypePointerImpl <em>Type Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see typedefinition.impl.TypePointerImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getTypePointer()
     * @generated
     */
    EClass TYPE_POINTER = eINSTANCE.getTypePointer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_POINTER__TYPE = eINSTANCE.getTypePointer_Type();

    /**
     * The meta object literal for the '<em>reftype</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tura.metamodel.commons.types.impl.RefTypeImpl
     * @see typedefinition.impl.TypedefinitionPackageImpl#getreftype()
     * @generated
     */
    EDataType REFTYPE = eINSTANCE.getreftype();

  }

} //TypedefinitionPackage
