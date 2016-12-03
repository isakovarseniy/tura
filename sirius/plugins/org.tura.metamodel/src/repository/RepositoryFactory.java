/**
 */
package repository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see repository.RepositoryPackage
 * @generated
 */
public interface RepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryFactory eINSTANCE = repository.impl.RepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unit Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Mapper</em>'.
	 * @generated
	 */
	UnitMapper createUnitMapper();

	/**
	 * Returns a new object of class '<em>Units</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Units</em>'.
	 * @generated
	 */
	Units createUnits();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Object Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Mapper</em>'.
	 * @generated
	 */
	ObjectMapper createObjectMapper();

	/**
	 * Returns a new object of class '<em>Attribute Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Mapper</em>'.
	 * @generated
	 */
	AttributeMapper createAttributeMapper();

	/**
	 * Returns a new object of class '<em>Relation Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Mapper</em>'.
	 * @generated
	 */
	RelationMapper createRelationMapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepositoryPackage getRepositoryPackage();

} //RepositoryFactory
