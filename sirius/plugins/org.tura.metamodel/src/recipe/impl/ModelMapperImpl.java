/**
 */
package recipe.impl;

import artifact.ArtifactPackage;
import artifact.Categorized;
import artifact.Classifier;
import common.CommonPackage;
import common.Orderable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.Query;
import recipe.RecipePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recipe.impl.ModelMapperImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getArtifactRoot <em>Artifact Root</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getArtifactExecutionString <em>Artifact Execution String</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#isSkip <em>Skip</em>}</li>
 *   <li>{@link recipe.impl.ModelMapperImpl#getArtifactExtension <em>Artifact Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelMapperImpl extends ArtifactRefImpl implements ModelMapper {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactRoot() <em>Artifact Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactRoot() <em>Artifact Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRoot()
	 * @generated
	 * @ordered
	 */
	protected String artifactRoot = ARTIFACT_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingTecnologiy> technologies;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * The default value of the '{@link #getArtifactExecutionString() <em>Artifact Execution String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactExecutionString()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EXECUTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactExecutionString() <em>Artifact Execution String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactExecutionString()
	 * @generated
	 * @ordered
	 */
	protected String artifactExecutionString = ARTIFACT_EXECUTION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkip() <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip()
	 * @generated
	 * @ordered
	 */
	protected boolean skip = SKIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactExtension() <em>Artifact Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactExtension() <em>Artifact Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactExtension()
	 * @generated
	 * @ordered
	 */
	protected String artifactExtension = ARTIFACT_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.MODEL_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, RecipePackage.MODEL_MAPPER__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactRoot() {
		return artifactRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRoot(String newArtifactRoot) {
		String oldArtifactRoot = artifactRoot;
		artifactRoot = newArtifactRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ARTIFACT_ROOT, oldArtifactRoot, artifactRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingTecnologiy> getTechnologies() {
		if (technologies == null) {
			technologies = new EObjectContainmentEList<MappingTecnologiy>(MappingTecnologiy.class, this, RecipePackage.MODEL_MAPPER__TECHNOLOGIES);
		}
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<Query>(Query.class, this, RecipePackage.MODEL_MAPPER__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactExecutionString() {
		return artifactExecutionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactExecutionString(String newArtifactExecutionString) {
		String oldArtifactExecutionString = artifactExecutionString;
		artifactExecutionString = newArtifactExecutionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING, oldArtifactExecutionString, artifactExecutionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSkip() {
		return skip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkip(boolean newSkip) {
		boolean oldSkip = skip;
		skip = newSkip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__SKIP, oldSkip, skip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactExtension() {
		return artifactExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactExtension(String newArtifactExtension) {
		String oldArtifactExtension = artifactExtension;
		artifactExtension = newArtifactExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.MODEL_MAPPER__ARTIFACT_EXTENSION, oldArtifactExtension, artifactExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.MODEL_MAPPER__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case RecipePackage.MODEL_MAPPER__TECHNOLOGIES:
				return ((InternalEList<?>)getTechnologies()).basicRemove(otherEnd, msgs);
			case RecipePackage.MODEL_MAPPER__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.MODEL_MAPPER__ORDER:
				return getOrder();
			case RecipePackage.MODEL_MAPPER__CLASSIFIERS:
				return getClassifiers();
			case RecipePackage.MODEL_MAPPER__NAME:
				return getName();
			case RecipePackage.MODEL_MAPPER__ARTIFACT_ROOT:
				return getArtifactRoot();
			case RecipePackage.MODEL_MAPPER__TECHNOLOGIES:
				return getTechnologies();
			case RecipePackage.MODEL_MAPPER__QUERIES:
				return getQueries();
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
				return getArtifactExecutionString();
			case RecipePackage.MODEL_MAPPER__SKIP:
				return isSkip();
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXTENSION:
				return getArtifactExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipePackage.MODEL_MAPPER__ORDER:
				setOrder((Integer)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_ROOT:
				setArtifactRoot((String)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__TECHNOLOGIES:
				getTechnologies().clear();
				getTechnologies().addAll((Collection<? extends MappingTecnologiy>)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends Query>)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
				setArtifactExecutionString((String)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__SKIP:
				setSkip((Boolean)newValue);
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXTENSION:
				setArtifactExtension((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecipePackage.MODEL_MAPPER__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case RecipePackage.MODEL_MAPPER__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case RecipePackage.MODEL_MAPPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_ROOT:
				setArtifactRoot(ARTIFACT_ROOT_EDEFAULT);
				return;
			case RecipePackage.MODEL_MAPPER__TECHNOLOGIES:
				getTechnologies().clear();
				return;
			case RecipePackage.MODEL_MAPPER__QUERIES:
				getQueries().clear();
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
				setArtifactExecutionString(ARTIFACT_EXECUTION_STRING_EDEFAULT);
				return;
			case RecipePackage.MODEL_MAPPER__SKIP:
				setSkip(SKIP_EDEFAULT);
				return;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXTENSION:
				setArtifactExtension(ARTIFACT_EXTENSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecipePackage.MODEL_MAPPER__ORDER:
				return order != ORDER_EDEFAULT;
			case RecipePackage.MODEL_MAPPER__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case RecipePackage.MODEL_MAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.MODEL_MAPPER__ARTIFACT_ROOT:
				return ARTIFACT_ROOT_EDEFAULT == null ? artifactRoot != null : !ARTIFACT_ROOT_EDEFAULT.equals(artifactRoot);
			case RecipePackage.MODEL_MAPPER__TECHNOLOGIES:
				return technologies != null && !technologies.isEmpty();
			case RecipePackage.MODEL_MAPPER__QUERIES:
				return queries != null && !queries.isEmpty();
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXECUTION_STRING:
				return ARTIFACT_EXECUTION_STRING_EDEFAULT == null ? artifactExecutionString != null : !ARTIFACT_EXECUTION_STRING_EDEFAULT.equals(artifactExecutionString);
			case RecipePackage.MODEL_MAPPER__SKIP:
				return skip != SKIP_EDEFAULT;
			case RecipePackage.MODEL_MAPPER__ARTIFACT_EXTENSION:
				return ARTIFACT_EXTENSION_EDEFAULT == null ? artifactExtension != null : !ARTIFACT_EXTENSION_EDEFAULT.equals(artifactExtension);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Orderable.class) {
			switch (derivedFeatureID) {
				case RecipePackage.MODEL_MAPPER__ORDER: return CommonPackage.ORDERABLE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case RecipePackage.MODEL_MAPPER__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Orderable.class) {
			switch (baseFeatureID) {
				case CommonPackage.ORDERABLE__ORDER: return RecipePackage.MODEL_MAPPER__ORDER;
				default: return -1;
			}
		}
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return RecipePackage.MODEL_MAPPER__CLASSIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(", name: ");
		result.append(name);
		result.append(", artifactRoot: ");
		result.append(artifactRoot);
		result.append(", artifactExecutionString: ");
		result.append(artifactExecutionString);
		result.append(", skip: ");
		result.append(skip);
		result.append(", artifactExtension: ");
		result.append(artifactExtension);
		result.append(')');
		return result.toString();
	}

} //ModelMapperImpl
