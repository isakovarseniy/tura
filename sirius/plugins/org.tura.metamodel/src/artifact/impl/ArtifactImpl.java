/**
 */
package artifact.impl;

import artifact.Artifact;
import artifact.ArtifactPackage;
import artifact.ConfigHashWithNickName;
import artifact.ConfigVariableWithNickName;
import artifact.GenerationHintWithNickName;
import artifact.ModelQuery;
import artifact.Technology;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getConfigHashes <em>Config Hashes</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link artifact.impl.ArtifactImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends EObjectImpl implements Artifact {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigVariables() <em>Config Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigVariableWithNickName> configVariables;

	/**
	 * The cached value of the '{@link #getConfigHashes() <em>Config Hashes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigHashes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigHashWithNickName> configHashes;

	/**
	 * The cached value of the '{@link #getModelQuery() <em>Model Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelQuery> modelQuery;

	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> technologies;

	/**
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected EList<GenerationHintWithNickName> hints;

	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected String template = TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.ARTIFACT__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.ARTIFACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigVariableWithNickName> getConfigVariables() {
		if (configVariables == null) {
			configVariables = new EObjectContainmentEList<ConfigVariableWithNickName>(ConfigVariableWithNickName.class, this, ArtifactPackage.ARTIFACT__CONFIG_VARIABLES);
		}
		return configVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigHashWithNickName> getConfigHashes() {
		if (configHashes == null) {
			configHashes = new EObjectContainmentEList<ConfigHashWithNickName>(ConfigHashWithNickName.class, this, ArtifactPackage.ARTIFACT__CONFIG_HASHES);
		}
		return configHashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelQuery> getModelQuery() {
		if (modelQuery == null) {
			modelQuery = new EObjectContainmentEList<ModelQuery>(ModelQuery.class, this, ArtifactPackage.ARTIFACT__MODEL_QUERY);
		}
		return modelQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Technology> getTechnologies() {
		if (technologies == null) {
			technologies = new EObjectContainmentEList<Technology>(Technology.class, this, ArtifactPackage.ARTIFACT__TECHNOLOGIES);
		}
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenerationHintWithNickName> getHints() {
		if (hints == null) {
			hints = new EObjectContainmentEList<GenerationHintWithNickName>(GenerationHintWithNickName.class, this, ArtifactPackage.ARTIFACT__HINTS);
		}
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		String oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactPackage.ARTIFACT__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactPackage.ARTIFACT__CONFIG_VARIABLES:
				return ((InternalEList<?>)getConfigVariables()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.ARTIFACT__CONFIG_HASHES:
				return ((InternalEList<?>)getConfigHashes()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.ARTIFACT__MODEL_QUERY:
				return ((InternalEList<?>)getModelQuery()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.ARTIFACT__TECHNOLOGIES:
				return ((InternalEList<?>)getTechnologies()).basicRemove(otherEnd, msgs);
			case ArtifactPackage.ARTIFACT__HINTS:
				return ((InternalEList<?>)getHints()).basicRemove(otherEnd, msgs);
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
			case ArtifactPackage.ARTIFACT__UID:
				return getUid();
			case ArtifactPackage.ARTIFACT__NAME:
				return getName();
			case ArtifactPackage.ARTIFACT__DESCRIPTION:
				return getDescription();
			case ArtifactPackage.ARTIFACT__CONFIG_VARIABLES:
				return getConfigVariables();
			case ArtifactPackage.ARTIFACT__CONFIG_HASHES:
				return getConfigHashes();
			case ArtifactPackage.ARTIFACT__MODEL_QUERY:
				return getModelQuery();
			case ArtifactPackage.ARTIFACT__TECHNOLOGIES:
				return getTechnologies();
			case ArtifactPackage.ARTIFACT__HINTS:
				return getHints();
			case ArtifactPackage.ARTIFACT__TEMPLATE:
				return getTemplate();
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
			case ArtifactPackage.ARTIFACT__UID:
				setUid((String)newValue);
				return;
			case ArtifactPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case ArtifactPackage.ARTIFACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArtifactPackage.ARTIFACT__CONFIG_VARIABLES:
				getConfigVariables().clear();
				getConfigVariables().addAll((Collection<? extends ConfigVariableWithNickName>)newValue);
				return;
			case ArtifactPackage.ARTIFACT__CONFIG_HASHES:
				getConfigHashes().clear();
				getConfigHashes().addAll((Collection<? extends ConfigHashWithNickName>)newValue);
				return;
			case ArtifactPackage.ARTIFACT__MODEL_QUERY:
				getModelQuery().clear();
				getModelQuery().addAll((Collection<? extends ModelQuery>)newValue);
				return;
			case ArtifactPackage.ARTIFACT__TECHNOLOGIES:
				getTechnologies().clear();
				getTechnologies().addAll((Collection<? extends Technology>)newValue);
				return;
			case ArtifactPackage.ARTIFACT__HINTS:
				getHints().clear();
				getHints().addAll((Collection<? extends GenerationHintWithNickName>)newValue);
				return;
			case ArtifactPackage.ARTIFACT__TEMPLATE:
				setTemplate((String)newValue);
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
			case ArtifactPackage.ARTIFACT__UID:
				setUid(UID_EDEFAULT);
				return;
			case ArtifactPackage.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactPackage.ARTIFACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArtifactPackage.ARTIFACT__CONFIG_VARIABLES:
				getConfigVariables().clear();
				return;
			case ArtifactPackage.ARTIFACT__CONFIG_HASHES:
				getConfigHashes().clear();
				return;
			case ArtifactPackage.ARTIFACT__MODEL_QUERY:
				getModelQuery().clear();
				return;
			case ArtifactPackage.ARTIFACT__TECHNOLOGIES:
				getTechnologies().clear();
				return;
			case ArtifactPackage.ARTIFACT__HINTS:
				getHints().clear();
				return;
			case ArtifactPackage.ARTIFACT__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
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
			case ArtifactPackage.ARTIFACT__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ArtifactPackage.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactPackage.ARTIFACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArtifactPackage.ARTIFACT__CONFIG_VARIABLES:
				return configVariables != null && !configVariables.isEmpty();
			case ArtifactPackage.ARTIFACT__CONFIG_HASHES:
				return configHashes != null && !configHashes.isEmpty();
			case ArtifactPackage.ARTIFACT__MODEL_QUERY:
				return modelQuery != null && !modelQuery.isEmpty();
			case ArtifactPackage.ARTIFACT__TECHNOLOGIES:
				return technologies != null && !technologies.isEmpty();
			case ArtifactPackage.ARTIFACT__HINTS:
				return hints != null && !hints.isEmpty();
			case ArtifactPackage.ARTIFACT__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
		}
		return super.eIsSet(featureID);
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", template: ");
		result.append(template);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
