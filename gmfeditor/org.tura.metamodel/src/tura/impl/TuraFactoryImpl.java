/**
 */
package tura.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tura.Primitive;
import tura.TuraFactory;
import tura.TuraMetamodel;
import tura.TuraPackage;
import tura.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuraFactoryImpl extends EFactoryImpl implements TuraFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static TuraFactory init() {
    try
    {
      TuraFactory theTuraFactory = (TuraFactory)EPackage.Registry.INSTANCE.getEFactory("http://tura.org/2013/v1/tura"); 
      if (theTuraFactory != null)
      {
        return theTuraFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TuraFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TuraFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case TuraPackage.TURA_METAMODEL: return createTuraMetamodel();
      case TuraPackage.TYPES: return createTypes();
      case TuraPackage.PRIMITIVE: return createPrimitive();
      case TuraPackage.PACKAGE: return createPackage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TuraMetamodel createTuraMetamodel() {
    TuraMetamodelImpl turaMetamodel = new TuraMetamodelImpl();
    return turaMetamodel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Types createTypes() {
    TypesImpl types = new TypesImpl();
    return types;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Primitive createPrimitive() {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public tura.Package createPackage() {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TuraPackage getTuraPackage() {
    return (TuraPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static TuraPackage getPackage() {
    return TuraPackage.eINSTANCE;
  }

} //TuraFactoryImpl
