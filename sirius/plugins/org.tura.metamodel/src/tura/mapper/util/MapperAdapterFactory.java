/**
 */
package tura.mapper.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tura.mapper.*;

import tura.permission.SecurityEntityPointer;

import tura.style.StylePointer;

import tura.type.PackagePointer;
import tura.type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tura.mapper.MapperPackage
 * @generated
 */
public class MapperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MapperPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapperSwitch<Adapter> modelSwitch =
		new MapperSwitch<Adapter>() {
			@Override
			public Adapter caseMappers(Mappers object) {
				return createMappersAdapter();
			}
			@Override
			public Adapter caseMapper(Mapper object) {
				return createMapperAdapter();
			}
			@Override
			public Adapter caseTypeMapper(TypeMapper object) {
				return createTypeMapperAdapter();
			}
			@Override
			public Adapter casePackageMapper(PackageMapper object) {
				return createPackageMapperAdapter();
			}
			@Override
			public Adapter caseJavaMapper(JavaMapper object) {
				return createJavaMapperAdapter();
			}
			@Override
			public Adapter caseJavaPackageMapper(JavaPackageMapper object) {
				return createJavaPackageMapperAdapter();
			}
			@Override
			public Adapter caseJavaScriptMapper(JavaScriptMapper object) {
				return createJavaScriptMapperAdapter();
			}
			@Override
			public Adapter caseCSSMapper(CSSMapper object) {
				return createCSSMapperAdapter();
			}
			@Override
			public Adapter caseRoleMapper(RoleMapper object) {
				return createRoleMapperAdapter();
			}
			@Override
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter casePackagePointer(PackagePointer object) {
				return createPackagePointerAdapter();
			}
			@Override
			public Adapter caseStylePointer(StylePointer object) {
				return createStylePointerAdapter();
			}
			@Override
			public Adapter caseSecurityEntityPointer(SecurityEntityPointer object) {
				return createSecurityEntityPointerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.Mappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.Mappers
	 * @generated
	 */
	public Adapter createMappersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.Mapper
	 * @generated
	 */
	public Adapter createMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.TypeMapper <em>Type Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.TypeMapper
	 * @generated
	 */
	public Adapter createTypeMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.PackageMapper <em>Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.PackageMapper
	 * @generated
	 */
	public Adapter createPackageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.JavaMapper <em>Java Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.JavaMapper
	 * @generated
	 */
	public Adapter createJavaMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.JavaPackageMapper <em>Java Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.JavaPackageMapper
	 * @generated
	 */
	public Adapter createJavaPackageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.JavaScriptMapper <em>Java Script Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.JavaScriptMapper
	 * @generated
	 */
	public Adapter createJavaScriptMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.CSSMapper <em>CSS Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.CSSMapper
	 * @generated
	 */
	public Adapter createCSSMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.mapper.RoleMapper <em>Role Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.mapper.RoleMapper
	 * @generated
	 */
	public Adapter createRoleMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.type.PackagePointer <em>Package Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.type.PackagePointer
	 * @generated
	 */
	public Adapter createPackagePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.style.StylePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.style.StylePointer
	 * @generated
	 */
	public Adapter createStylePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tura.permission.SecurityEntityPointer <em>Security Entity Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tura.permission.SecurityEntityPointer
	 * @generated
	 */
	public Adapter createSecurityEntityPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MapperAdapterFactory
