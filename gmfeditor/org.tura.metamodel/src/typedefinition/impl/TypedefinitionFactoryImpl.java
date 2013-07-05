/**
 */
package typedefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typedefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedefinitionFactoryImpl extends EFactoryImpl implements TypedefinitionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypedefinitionFactory init()
  {
    try
    {
      TypedefinitionFactory theTypedefinitionFactory = (TypedefinitionFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/typedefinition"); 
      if (theTypedefinitionFactory != null)
      {
        return theTypedefinitionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TypedefinitionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefinitionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TypedefinitionPackage.TYPE_DEFINITION: return createTypeDefinition();
      case TypedefinitionPackage.TYPE_ELEMENT: return createTypeElement();
      case TypedefinitionPackage.TYPE: return createType();
      case TypedefinitionPackage.TYPE_REFERENCE: return createTypeReference();
      case TypedefinitionPackage.TYPE_EXTENSION: return createTypeExtension();
      case TypedefinitionPackage.ATTRIBUTE: return createAttribute();
      case TypedefinitionPackage.OPERATION: return createOperation();
      case TypedefinitionPackage.RETURN_VALUE: return createReturnValue();
      case TypedefinitionPackage.ENUMARATOR: return createEnumarator();
      case TypedefinitionPackage.ENUM_ATTRIBUTE: return createEnumAttribute();
      case TypedefinitionPackage.TYPE_POINTER: return createTypePointer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeElement createTypeElement()
  {
    TypeElementImpl typeElement = new TypeElementImpl();
    return typeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExtension createTypeExtension()
  {
    TypeExtensionImpl typeExtension = new TypeExtensionImpl();
    return typeExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnValue createReturnValue()
  {
    ReturnValueImpl returnValue = new ReturnValueImpl();
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumarator createEnumarator()
  {
    EnumaratorImpl enumarator = new EnumaratorImpl();
    return enumarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAttribute createEnumAttribute()
  {
    EnumAttributeImpl enumAttribute = new EnumAttributeImpl();
    return enumAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePointer createTypePointer()
  {
    TypePointerImpl typePointer = new TypePointerImpl();
    return typePointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefinitionPackage getTypedefinitionPackage()
  {
    return (TypedefinitionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TypedefinitionPackage getPackage()
  {
    return TypedefinitionPackage.eINSTANCE;
  }

} //TypedefinitionFactoryImpl
