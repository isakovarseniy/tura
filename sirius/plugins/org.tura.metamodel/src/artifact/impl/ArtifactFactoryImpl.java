/**
 */
package artifact.impl;

import artifact.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactFactoryImpl extends EFactoryImpl implements ArtifactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactFactory init() {
		try {
			ArtifactFactory theArtifactFactory = (ArtifactFactory)EPackage.Registry.INSTANCE.getEFactory(ArtifactPackage.eNS_URI);
			if (theArtifactFactory != null) {
				return theArtifactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtifactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtifactPackage.ARTIFACT_GROUP: return createArtifactGroup();
			case ArtifactPackage.ARTIFACT: return createArtifact();
			case ArtifactPackage.GENERATION_HINT: return createGenerationHint();
			case ArtifactPackage.CONFIG_VARIABLE: return createConfigVariable();
			case ArtifactPackage.CONFIG_HASH: return createConfigHash();
			case ArtifactPackage.MODEL_QUERY: return createModelQuery();
			case ArtifactPackage.QUERY_PARAMETER: return createQueryParameter();
			case ArtifactPackage.TECHNOLOGY: return createTechnology();
			case ArtifactPackage.OPTION: return createOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactGroup createArtifactGroup() {
		ArtifactGroupImpl artifactGroup = new ArtifactGroupImpl();
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationHint createGenerationHint() {
		GenerationHintImpl generationHint = new GenerationHintImpl();
		return generationHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariable createConfigVariable() {
		ConfigVariableImpl configVariable = new ConfigVariableImpl();
		return configVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigHash createConfigHash() {
		ConfigHashImpl configHash = new ConfigHashImpl();
		return configHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery createModelQuery() {
		ModelQueryImpl modelQuery = new ModelQueryImpl();
		return modelQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackage getArtifactPackage() {
		return (ArtifactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtifactPackage getPackage() {
		return ArtifactPackage.eINSTANCE;
	}

} //ArtifactFactoryImpl
