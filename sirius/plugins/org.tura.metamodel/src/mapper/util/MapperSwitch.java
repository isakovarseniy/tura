/**
 */
package mapper.util;

import mapper.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import permission.SecurityEntityPointer;

import style.StylePointer;

import type.PackagePointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mapper.MapperPackage
 * @generated
 */
public class MapperSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapperPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperSwitch() {
		if (modelPackage == null) {
			modelPackage = MapperPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MapperPackage.MAPPERS: {
				Mappers mappers = (Mappers)theEObject;
				T result = caseMappers(mappers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.MAPPER: {
				Mapper mapper = (Mapper)theEObject;
				T result = caseMapper(mapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.TYPE_MAPPER: {
				TypeMapper typeMapper = (TypeMapper)theEObject;
				T result = caseTypeMapper(typeMapper);
				if (result == null) result = caseMapper(typeMapper);
				if (result == null) result = caseTypePointer(typeMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.PACKAGE_MAPPER: {
				PackageMapper packageMapper = (PackageMapper)theEObject;
				T result = casePackageMapper(packageMapper);
				if (result == null) result = caseMapper(packageMapper);
				if (result == null) result = casePackagePointer(packageMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.JAVA_MAPPER: {
				JavaMapper javaMapper = (JavaMapper)theEObject;
				T result = caseJavaMapper(javaMapper);
				if (result == null) result = caseTypeMapper(javaMapper);
				if (result == null) result = caseMapper(javaMapper);
				if (result == null) result = caseTypePointer(javaMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.JAVA_PACKAGE_MAPPER: {
				JavaPackageMapper javaPackageMapper = (JavaPackageMapper)theEObject;
				T result = caseJavaPackageMapper(javaPackageMapper);
				if (result == null) result = casePackageMapper(javaPackageMapper);
				if (result == null) result = caseMapper(javaPackageMapper);
				if (result == null) result = casePackagePointer(javaPackageMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.JAVA_SCRIPT_MAPPER: {
				JavaScriptMapper javaScriptMapper = (JavaScriptMapper)theEObject;
				T result = caseJavaScriptMapper(javaScriptMapper);
				if (result == null) result = caseTypeMapper(javaScriptMapper);
				if (result == null) result = caseMapper(javaScriptMapper);
				if (result == null) result = caseTypePointer(javaScriptMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.CSS_MAPPER: {
				CSSMapper cssMapper = (CSSMapper)theEObject;
				T result = caseCSSMapper(cssMapper);
				if (result == null) result = caseMapper(cssMapper);
				if (result == null) result = caseStylePointer(cssMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.ROLE_MAPPER: {
				RoleMapper roleMapper = (RoleMapper)theEObject;
				T result = caseRoleMapper(roleMapper);
				if (result == null) result = caseMapper(roleMapper);
				if (result == null) result = caseSecurityEntityPointer(roleMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.XML_PACKAGE_MAPPER: {
				XMLPackageMapper xmlPackageMapper = (XMLPackageMapper)theEObject;
				T result = caseXMLPackageMapper(xmlPackageMapper);
				if (result == null) result = casePackageMapper(xmlPackageMapper);
				if (result == null) result = caseMapper(xmlPackageMapper);
				if (result == null) result = casePackagePointer(xmlPackageMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapperPackage.XML_TYPE_MAPPER: {
				XMLTypeMapper xmlTypeMapper = (XMLTypeMapper)theEObject;
				T result = caseXMLTypeMapper(xmlTypeMapper);
				if (result == null) result = caseTypeMapper(xmlTypeMapper);
				if (result == null) result = caseMapper(xmlTypeMapper);
				if (result == null) result = caseTypePointer(xmlTypeMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mappers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappers(Mappers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapper(Mapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMapper(TypeMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMapper(PackageMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaMapper(JavaMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Package Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPackageMapper(JavaPackageMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScriptMapper(JavaScriptMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSS Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSS Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSSMapper(CSSMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleMapper(RoleMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Package Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLPackageMapper(XMLPackageMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Type Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Type Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTypeMapper(XMLTypeMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePointer(TypePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagePointer(PackagePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylePointer(StylePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Entity Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Entity Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityEntityPointer(SecurityEntityPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MapperSwitch
