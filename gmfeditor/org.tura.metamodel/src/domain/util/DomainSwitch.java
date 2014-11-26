/**
 */
package domain.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import domain.*;

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
 * @see domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.HTML_LAYER_HOLDER:
      {
        HTMLLayerHolder htmlLayerHolder = (HTMLLayerHolder)theEObject;
        T result = caseHTMLLayerHolder(htmlLayerHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CATEGORIZED:
      {
        Categorized categorized = (Categorized)theEObject;
        T result = caseCategorized(categorized);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CLASSIFIER:
      {
        Classifier classifier = (Classifier)theEObject;
        T result = caseClassifier(classifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_ARTIFACTS:
      {
        DomainArtifacts domainArtifacts = (DomainArtifacts)theEObject;
        T result = caseDomainArtifacts(domainArtifacts);
        if (result == null) result = caseHTMLLayerHolder(domainArtifacts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_TYPES:
      {
        DomainTypes domainTypes = (DomainTypes)theEObject;
        T result = caseDomainTypes(domainTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_APPLICATIONS:
      {
        DomainApplications domainApplications = (DomainApplications)theEObject;
        T result = caseDomainApplications(domainApplications);
        if (result == null) result = caseHTMLLayerHolder(domainApplications);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_APPLICATION:
      {
        DomainApplication domainApplication = (DomainApplication)theEObject;
        T result = caseDomainApplication(domainApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DOMAIN_ARTIFACT:
      {
        DomainArtifact domainArtifact = (DomainArtifact)theEObject;
        T result = caseDomainArtifact(domainArtifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ORM_ENTITY:
      {
        ORMEntity ormEntity = (ORMEntity)theEObject;
        T result = caseORMEntity(ormEntity);
        if (result == null) result = caseDomainArtifact(ormEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JPA_SERVICE:
      {
        JPAService jpaService = (JPAService)theEObject;
        T result = caseJPAService(jpaService);
        if (result == null) result = caseDomainArtifact(jpaService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.EJB_SERVICE:
      {
        EJBService ejbService = (EJBService)theEObject;
        T result = caseEJBService(ejbService);
        if (result == null) result = caseDomainArtifact(ejbService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTINUOUS_IINTEGRATION:
      {
        ContinuousIintegration continuousIintegration = (ContinuousIintegration)theEObject;
        T result = caseContinuousIintegration(continuousIintegration);
        if (result == null) result = caseDomainArtifact(continuousIintegration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACTS:
      {
        Artifacts artifacts = (Artifacts)theEObject;
        T result = caseArtifacts(artifacts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACT:
      {
        Artifact artifact = (Artifact)theEObject;
        T result = caseArtifact(artifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.GENERATION_HINT:
      {
        GenerationHint generationHint = (GenerationHint)theEObject;
        T result = caseGenerationHint(generationHint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONFIG_VARIABLE:
      {
        ConfigVariable configVariable = (ConfigVariable)theEObject;
        T result = caseConfigVariable(configVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MODEL_QUERY:
      {
        ModelQuery modelQuery = (ModelQuery)theEObject;
        T result = caseModelQuery(modelQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY_PARAMETER:
      {
        QueryParameter queryParameter = (QueryParameter)theEObject;
        T result = caseQueryParameter(queryParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SPECIFIER:
      {
        Specifier specifier = (Specifier)theEObject;
        T result = caseSpecifier(specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_MESSAGES:
      {
        ApplicationMessages applicationMessages = (ApplicationMessages)theEObject;
        T result = caseApplicationMessages(applicationMessages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_ROLE:
      {
        ApplicationRole applicationRole = (ApplicationRole)theEObject;
        T result = caseApplicationRole(applicationRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_STYLE:
      {
        ApplicationStyle applicationStyle = (ApplicationStyle)theEObject;
        T result = caseApplicationStyle(applicationStyle);
        if (result == null) result = caseHTMLLayerHolder(applicationStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLES_PACKAGE:
      {
        StylesPackage stylesPackage = (StylesPackage)theEObject;
        T result = caseStylesPackage(stylesPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_UI_LAYER:
      {
        ApplicationUILayer applicationUILayer = (ApplicationUILayer)theEObject;
        T result = caseApplicationUILayer(applicationUILayer);
        if (result == null) result = caseHTMLLayerHolder(applicationUILayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_UI_PACKAGE:
      {
        ApplicationUIPackage applicationUIPackage = (ApplicationUIPackage)theEObject;
        T result = caseApplicationUIPackage(applicationUIPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_RECIPES:
      {
        ApplicationRecipes applicationRecipes = (ApplicationRecipes)theEObject;
        T result = caseApplicationRecipes(applicationRecipes);
        if (result == null) result = caseHTMLLayerHolder(applicationRecipes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_RECIPE:
      {
        ApplicationRecipe applicationRecipe = (ApplicationRecipe)theEObject;
        T result = caseApplicationRecipe(applicationRecipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_MAPPERS:
      {
        ApplicationMappers applicationMappers = (ApplicationMappers)theEObject;
        T result = caseApplicationMappers(applicationMappers);
        if (result == null) result = caseHTMLLayerHolder(applicationMappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_MAPPER:
      {
        ApplicationMapper applicationMapper = (ApplicationMapper)theEObject;
        T result = caseApplicationMapper(applicationMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.METHOD_POINTER:
      {
        MethodPointer methodPointer = (MethodPointer)theEObject;
        T result = caseMethodPointer(methodPointer);
        if (result == null) result = caseTypePointer(methodPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MESSAGES:
      {
        Messages messages = (Messages)theEObject;
        T result = caseMessages(messages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MESSAGE_LIBRARY:
      {
        MessageLibrary messageLibrary = (MessageLibrary)theEObject;
        T result = caseMessageLibrary(messageLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LANGUAGE_REF:
      {
        LanguageRef languageRef = (LanguageRef)theEObject;
        T result = caseLanguageRef(languageRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TRANSLATION:
      {
        Translation translation = (Translation)theEObject;
        T result = caseTranslation(translation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LANGUAGE:
      {
        Language language = (Language)theEObject;
        T result = caseLanguage(language);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROLES:
      {
        Roles roles = (Roles)theEObject;
        T result = caseRoles(roles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLES:
      {
        Styles styles = (Styles)theEObject;
        T result = caseStyles(styles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLE_LIBRARY:
      {
        StyleLibrary styleLibrary = (StyleLibrary)theEObject;
        T result = caseStyleLibrary(styleLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLE_SET:
      {
        StyleSet styleSet = (StyleSet)theEObject;
        T result = caseStyleSet(styleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPERS:
      {
        Mappers mappers = (Mappers)theEObject;
        T result = caseMappers(mappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPER:
      {
        Mapper mapper = (Mapper)theEObject;
        T result = caseMapper(mapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_MAPPER:
      {
        TypeMapper typeMapper = (TypeMapper)theEObject;
        T result = caseTypeMapper(typeMapper);
        if (result == null) result = caseMapper(typeMapper);
        if (result == null) result = caseTypePointer(typeMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JAVA_MAPPER:
      {
        JavaMapper javaMapper = (JavaMapper)theEObject;
        T result = caseJavaMapper(javaMapper);
        if (result == null) result = caseTypeMapper(javaMapper);
        if (result == null) result = caseMapper(javaMapper);
        if (result == null) result = caseTypePointer(javaMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JAVA_SCRIPT_MAPPER:
      {
        JavaScriptMapper javaScriptMapper = (JavaScriptMapper)theEObject;
        T result = caseJavaScriptMapper(javaScriptMapper);
        if (result == null) result = caseTypeMapper(javaScriptMapper);
        if (result == null) result = caseMapper(javaScriptMapper);
        if (result == null) result = caseTypePointer(javaScriptMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CSS_MAPPER:
      {
        CSSMapper cssMapper = (CSSMapper)theEObject;
        T result = caseCSSMapper(cssMapper);
        if (result == null) result = caseMapper(cssMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROLE_MAPPER:
      {
        RoleMapper roleMapper = (RoleMapper)theEObject;
        T result = caseRoleMapper(roleMapper);
        if (result == null) result = caseMapper(roleMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RECIPES:
      {
        Recipes recipes = (Recipes)theEObject;
        T result = caseRecipes(recipes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_SEQUENCE:
      {
        DeploymentSequence deploymentSequence = (DeploymentSequence)theEObject;
        T result = caseDeploymentSequence(deploymentSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_COMPONENTS:
      {
        DeploymentComponents deploymentComponents = (DeploymentComponents)theEObject;
        T result = caseDeploymentComponents(deploymentComponents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_COMPONENT:
      {
        DeploymentComponent deploymentComponent = (DeploymentComponent)theEObject;
        T result = caseDeploymentComponent(deploymentComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEPLOYMENT_STAR_STEP:
      {
        DeploymentStarStep deploymentStarStep = (DeploymentStarStep)theEObject;
        T result = caseDeploymentStarStep(deploymentStarStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.USING_MAPPERS:
      {
        UsingMappers usingMappers = (UsingMappers)theEObject;
        T result = caseUsingMappers(usingMappers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RECIPE:
      {
        Recipe recipe = (Recipe)theEObject;
        T result = caseRecipe(recipe);
        if (result == null) result = caseUsingMappers(recipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INGREDIENT:
      {
        Ingredient ingredient = (Ingredient)theEObject;
        T result = caseIngredient(ingredient);
        if (result == null) result = caseUsingMappers(ingredient);
        if (result == null) result = caseHTMLLayerHolder(ingredient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseHTMLLayerHolder(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.JAVA_COMPONENT:
      {
        JavaComponent javaComponent = (JavaComponent)theEObject;
        T result = caseJavaComponent(javaComponent);
        if (result == null) result = caseComponent(javaComponent);
        if (result == null) result = caseHTMLLayerHolder(javaComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INFRASTRUCTURE:
      {
        Infrastructure infrastructure = (Infrastructure)theEObject;
        T result = caseInfrastructure(infrastructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MODEL_MAPPER:
      {
        ModelMapper modelMapper = (ModelMapper)theEObject;
        T result = caseModelMapper(modelMapper);
        if (result == null) result = caseArtifactRef(modelMapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MAPPING_SPECIFIER:
      {
        MappingSpecifier mappingSpecifier = (MappingSpecifier)theEObject;
        T result = caseMappingSpecifier(mappingSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.QUERY_VARIABLE:
      {
        QueryVariable queryVariable = (QueryVariable)theEObject;
        T result = caseQueryVariable(queryVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFACT_REF:
      {
        ArtifactRef artifactRef = (ArtifactRef)theEObject;
        T result = caseArtifactRef(artifactRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_POINTER:
      {
        TypePointer typePointer = (TypePointer)theEObject;
        T result = caseTypePointer(typePointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_ELEMENT:
      {
        TypeElement typeElement = (TypeElement)theEObject;
        T result = caseTypeElement(typeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRIMITIVE:
      {
        Primitive primitive = (Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseTypeElement(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTypeElement(type);
        if (result == null) result = caseCategorized(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_REFERENCE:
      {
        TypeReference typeReference = (TypeReference)theEObject;
        T result = caseTypeReference(typeReference);
        if (result == null) result = caseTypeElement(typeReference);
        if (result == null) result = caseTypePointer(typeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPE_EXTENSION:
      {
        TypeExtension typeExtension = (TypeExtension)theEObject;
        T result = caseTypeExtension(typeExtension);
        if (result == null) result = caseCategorized(typeExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseTypePointer(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseTypePointer(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RETURN_VALUE:
      {
        ReturnValue returnValue = (ReturnValue)theEObject;
        T result = caseReturnValue(returnValue);
        if (result == null) result = caseTypePointer(returnValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ENUMARATOR:
      {
        Enumarator enumarator = (Enumarator)theEObject;
        T result = caseEnumarator(enumarator);
        if (result == null) result = caseTypeElement(enumarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ENUM_ATTRIBUTE:
      {
        EnumAttribute enumAttribute = (EnumAttribute)theEObject;
        T result = caseEnumAttribute(enumAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPES_REPOSITORY:
      {
        TypesRepository typesRepository = (TypesRepository)theEObject;
        T result = caseTypesRepository(typesRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TYPES:
      {
        Types types = (Types)theEObject;
        T result = caseTypes(types);
        if (result == null) result = caseHTMLLayerHolder(types);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PACKAGE:
      {
        domain.Package package_ = (domain.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UI_PACKAGE:
      {
        UIPackage uiPackage = (UIPackage)theEObject;
        T result = caseUIPackage(uiPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM:
      {
        Form form = (Form)theEObject;
        T result = caseForm(form);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM_VIEW:
      {
        FormView formView = (FormView)theEObject;
        T result = caseFormView(formView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEWS:
      {
        Views views = (Views)theEObject;
        T result = caseViews(views);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.MULTI_LANG_LABEL:
      {
        MultiLangLabel multiLangLabel = (MultiLangLabel)theEObject;
        T result = caseMultiLangLabel(multiLangLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CANVAS_FRAME:
      {
        CanvasFrame canvasFrame = (CanvasFrame)theEObject;
        T result = caseCanvasFrame(canvasFrame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_PORT_HOLDER:
      {
        ViewPortHolder viewPortHolder = (ViewPortHolder)theEObject;
        T result = caseViewPortHolder(viewPortHolder);
        if (result == null) result = caseHTMLLayerHolder(viewPortHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DEFAULT_CAVAS:
      {
        DefaultCavas defaultCavas = (DefaultCavas)theEObject;
        T result = caseDefaultCavas(defaultCavas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_ELEMENT:
      {
        ViewElement viewElement = (ViewElement)theEObject;
        T result = caseViewElement(viewElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CANVAS:
      {
        Canvas canvas = (Canvas)theEObject;
        T result = caseCanvas(canvas);
        if (result == null) result = caseCanvasFrame(canvas);
        if (result == null) result = caseViewPortHolder(canvas);
        if (result == null) result = caseDefaultCavas(canvas);
        if (result == null) result = caseMultiLangLabel(canvas);
        if (result == null) result = caseHTMLLayerHolder(canvas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.WINDOW:
      {
        Window window = (Window)theEObject;
        T result = caseWindow(window);
        if (result == null) result = caseCanvasFrame(window);
        if (result == null) result = caseViewPortHolder(window);
        if (result == null) result = caseMultiLangLabel(window);
        if (result == null) result = caseHTMLLayerHolder(window);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TAB_CANVAS:
      {
        TabCanvas tabCanvas = (TabCanvas)theEObject;
        T result = caseTabCanvas(tabCanvas);
        if (result == null) result = caseCanvasFrame(tabCanvas);
        if (result == null) result = caseDefaultCavas(tabCanvas);
        if (result == null) result = caseMultiLangLabel(tabCanvas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TAB_PAGE:
      {
        TabPage tabPage = (TabPage)theEObject;
        T result = caseTabPage(tabPage);
        if (result == null) result = caseCanvasFrame(tabPage);
        if (result == null) result = caseViewPortHolder(tabPage);
        if (result == null) result = caseMultiLangLabel(tabPage);
        if (result == null) result = caseHTMLLayerHolder(tabPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_PORT:
      {
        ViewPort viewPort = (ViewPort)theEObject;
        T result = caseViewPort(viewPort);
        if (result == null) result = caseViewElement(viewPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_AREA:
      {
        ViewArea viewArea = (ViewArea)theEObject;
        T result = caseViewArea(viewArea);
        if (result == null) result = caseViewElement(viewArea);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_PORT_TRIGGER:
      {
        ViewPortTrigger viewPortTrigger = (ViewPortTrigger)theEObject;
        T result = caseViewPortTrigger(viewPortTrigger);
        if (result == null) result = caseTrigger(viewPortTrigger);
        if (result == null) result = caseMethodPointer(viewPortTrigger);
        if (result == null) result = caseContextParameters(viewPortTrigger);
        if (result == null) result = caseTypePointer(viewPortTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.VIEW_INHERITANCE:
      {
        ViewInheritance viewInheritance = (ViewInheritance)theEObject;
        T result = caseViewInheritance(viewInheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TAB_PAGES_INHERITANCE:
      {
        TabPagesInheritance tabPagesInheritance = (TabPagesInheritance)theEObject;
        T result = caseTabPagesInheritance(tabPagesInheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FORM_DATA_CONTROLS:
      {
        FormDataControls formDataControls = (FormDataControls)theEObject;
        T result = caseFormDataControls(formDataControls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CANVAS_VIEW:
      {
        CanvasView canvasView = (CanvasView)theEObject;
        T result = caseCanvasView(canvasView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLE:
      {
        Style style = (Style)theEObject;
        T result = caseStyle(style);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CHILDREN_HOLDER:
      {
        ChildrenHolder childrenHolder = (ChildrenHolder)theEObject;
        T result = caseChildrenHolder(childrenHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLE_CLASS:
      {
        StyleClass styleClass = (StyleClass)theEObject;
        T result = caseStyleClass(styleClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTEXT_PARAMETER:
      {
        ContextParameter contextParameter = (ContextParameter)theEObject;
        T result = caseContextParameter(contextParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTEXT_VALUE:
      {
        ContextValue contextValue = (ContextValue)theEObject;
        T result = caseContextValue(contextValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.EXPRESSION_PART:
      {
        ExpressionPart expressionPart = (ExpressionPart)theEObject;
        T result = caseExpressionPart(expressionPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTEXT_PARAMETERS:
      {
        ContextParameters contextParameters = (ContextParameters)theEObject;
        T result = caseContextParameters(contextParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = caseContextValue(context);
        if (result == null) result = caseContextParameters(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STYLE_ELEMENT:
      {
        StyleElement styleElement = (StyleElement)theEObject;
        T result = caseStyleElement(styleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UIELEMENT:
      {
        Uielement uielement = (Uielement)theEObject;
        T result = caseUielement(uielement);
        if (result == null) result = caseStyleElement(uielement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SOURCES_POINTER:
      {
        SourcesPointer sourcesPointer = (SourcesPointer)theEObject;
        T result = caseSourcesPointer(sourcesPointer);
        if (result == null) result = caseUielement(sourcesPointer);
        if (result == null) result = caseStyleElement(sourcesPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ACTION_ELEMENT:
      {
        ActionElement actionElement = (ActionElement)theEObject;
        T result = caseActionElement(actionElement);
        if (result == null) result = caseUielement(actionElement);
        if (result == null) result = caseTrigger(actionElement);
        if (result == null) result = caseStyleElement(actionElement);
        if (result == null) result = caseMethodPointer(actionElement);
        if (result == null) result = caseContextParameters(actionElement);
        if (result == null) result = caseTypePointer(actionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INPUT_ELEMENT:
      {
        InputElement inputElement = (InputElement)theEObject;
        T result = caseInputElement(inputElement);
        if (result == null) result = caseSourcesPointer(inputElement);
        if (result == null) result = caseUielement(inputElement);
        if (result == null) result = caseStyleElement(inputElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SELECTION:
      {
        Selection selection = (Selection)theEObject;
        T result = caseSelection(selection);
        if (result == null) result = caseStyleElement(selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OPTION_SELECTION:
      {
        OptionSelection optionSelection = (OptionSelection)theEObject;
        T result = caseOptionSelection(optionSelection);
        if (result == null) result = caseInputElement(optionSelection);
        if (result == null) result = caseSourcesPointer(optionSelection);
        if (result == null) result = caseUielement(optionSelection);
        if (result == null) result = caseStyleElement(optionSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LAYER_HOLDER:
      {
        LayerHolder layerHolder = (LayerHolder)theEObject;
        T result = caseLayerHolder(layerHolder);
        if (result == null) result = caseUielement(layerHolder);
        if (result == null) result = caseChildrenHolder(layerHolder);
        if (result == null) result = caseHTMLLayerHolder(layerHolder);
        if (result == null) result = caseStyleElement(layerHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INPUT_TEXT:
      {
        InputText inputText = (InputText)theEObject;
        T result = caseInputText(inputText);
        if (result == null) result = caseInputElement(inputText);
        if (result == null) result = caseSourcesPointer(inputText);
        if (result == null) result = caseUielement(inputText);
        if (result == null) result = caseStyleElement(inputText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseUielement(label);
        if (result == null) result = caseMultiLangLabel(label);
        if (result == null) result = caseStyleElement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.OUTPUT_TEXT:
      {
        OutputText outputText = (OutputText)theEObject;
        T result = caseOutputText(outputText);
        if (result == null) result = caseInputElement(outputText);
        if (result == null) result = caseSourcesPointer(outputText);
        if (result == null) result = caseUielement(outputText);
        if (result == null) result = caseStyleElement(outputText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CHECK_BOX:
      {
        CheckBox checkBox = (CheckBox)theEObject;
        T result = caseCheckBox(checkBox);
        if (result == null) result = caseInputElement(checkBox);
        if (result == null) result = caseSourcesPointer(checkBox);
        if (result == null) result = caseUielement(checkBox);
        if (result == null) result = caseStyleElement(checkBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DROP_DOWN_SELECTION:
      {
        DropDownSelection dropDownSelection = (DropDownSelection)theEObject;
        T result = caseDropDownSelection(dropDownSelection);
        if (result == null) result = caseOptionSelection(dropDownSelection);
        if (result == null) result = caseInputElement(dropDownSelection);
        if (result == null) result = caseSourcesPointer(dropDownSelection);
        if (result == null) result = caseUielement(dropDownSelection);
        if (result == null) result = caseStyleElement(dropDownSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = caseStyleElement(column);
        if (result == null) result = caseMultiLangLabel(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TABLE:
      {
        Table table = (Table)theEObject;
        T result = caseTable(table);
        if (result == null) result = caseSourcesPointer(table);
        if (result == null) result = caseHTMLLayerHolder(table);
        if (result == null) result = caseMultiLangLabel(table);
        if (result == null) result = caseUielement(table);
        if (result == null) result = caseStyleElement(table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TREE:
      {
        Tree tree = (Tree)theEObject;
        T result = caseTree(tree);
        if (result == null) result = caseSourcesPointer(tree);
        if (result == null) result = caseHTMLLayerHolder(tree);
        if (result == null) result = caseMultiLangLabel(tree);
        if (result == null) result = caseUielement(tree);
        if (result == null) result = caseStyleElement(tree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseActionElement(button);
        if (result == null) result = caseMultiLangLabel(button);
        if (result == null) result = caseUielement(button);
        if (result == null) result = caseTrigger(button);
        if (result == null) result = caseStyleElement(button);
        if (result == null) result = caseMethodPointer(button);
        if (result == null) result = caseContextParameters(button);
        if (result == null) result = caseTypePointer(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CONTROLS:
      {
        Controls controls = (Controls)theEObject;
        T result = caseControls(controls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = caseMethodPointer(trigger);
        if (result == null) result = caseContextParameters(trigger);
        if (result == null) result = caseTypePointer(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_FORM_TRIGGER:
      {
        PREFormTrigger preFormTrigger = (PREFormTrigger)theEObject;
        T result = casePREFormTrigger(preFormTrigger);
        if (result == null) result = caseTrigger(preFormTrigger);
        if (result == null) result = caseMethodPointer(preFormTrigger);
        if (result == null) result = caseContextParameters(preFormTrigger);
        if (result == null) result = caseTypePointer(preFormTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_QUERY_TRIGGER:
      {
        PREQueryTrigger preQueryTrigger = (PREQueryTrigger)theEObject;
        T result = casePREQueryTrigger(preQueryTrigger);
        if (result == null) result = caseTrigger(preQueryTrigger);
        if (result == null) result = caseMethodPointer(preQueryTrigger);
        if (result == null) result = caseContextParameters(preQueryTrigger);
        if (result == null) result = caseTypePointer(preQueryTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.POST_QUERY_TRIGGER:
      {
        POSTQueryTrigger postQueryTrigger = (POSTQueryTrigger)theEObject;
        T result = casePOSTQueryTrigger(postQueryTrigger);
        if (result == null) result = caseTrigger(postQueryTrigger);
        if (result == null) result = caseMethodPointer(postQueryTrigger);
        if (result == null) result = caseContextParameters(postQueryTrigger);
        if (result == null) result = caseTypePointer(postQueryTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_INSERT_TRIGGER:
      {
        PREInsertTrigger preInsertTrigger = (PREInsertTrigger)theEObject;
        T result = casePREInsertTrigger(preInsertTrigger);
        if (result == null) result = caseTrigger(preInsertTrigger);
        if (result == null) result = caseMethodPointer(preInsertTrigger);
        if (result == null) result = caseContextParameters(preInsertTrigger);
        if (result == null) result = caseTypePointer(preInsertTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_DELETE_TRIGGER:
      {
        PREDeleteTrigger preDeleteTrigger = (PREDeleteTrigger)theEObject;
        T result = casePREDeleteTrigger(preDeleteTrigger);
        if (result == null) result = caseTrigger(preDeleteTrigger);
        if (result == null) result = caseMethodPointer(preDeleteTrigger);
        if (result == null) result = caseContextParameters(preDeleteTrigger);
        if (result == null) result = caseTypePointer(preDeleteTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.POST_CREATE_TRIGGER:
      {
        POSTCreateTrigger postCreateTrigger = (POSTCreateTrigger)theEObject;
        T result = casePOSTCreateTrigger(postCreateTrigger);
        if (result == null) result = caseTrigger(postCreateTrigger);
        if (result == null) result = caseMethodPointer(postCreateTrigger);
        if (result == null) result = caseContextParameters(postCreateTrigger);
        if (result == null) result = caseTypePointer(postCreateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.PRE_UPDATE_TRIGGER:
      {
        PREUpdateTrigger preUpdateTrigger = (PREUpdateTrigger)theEObject;
        T result = casePREUpdateTrigger(preUpdateTrigger);
        if (result == null) result = caseTrigger(preUpdateTrigger);
        if (result == null) result = caseMethodPointer(preUpdateTrigger);
        if (result == null) result = caseContextParameters(preUpdateTrigger);
        if (result == null) result = caseTypePointer(preUpdateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.CREATE_TRIGGER:
      {
        CreateTrigger createTrigger = (CreateTrigger)theEObject;
        T result = caseCreateTrigger(createTrigger);
        if (result == null) result = caseTrigger(createTrigger);
        if (result == null) result = caseMethodPointer(createTrigger);
        if (result == null) result = caseContextParameters(createTrigger);
        if (result == null) result = caseTypePointer(createTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INSERT_TRIGGER:
      {
        InsertTrigger insertTrigger = (InsertTrigger)theEObject;
        T result = caseInsertTrigger(insertTrigger);
        if (result == null) result = caseTrigger(insertTrigger);
        if (result == null) result = caseMethodPointer(insertTrigger);
        if (result == null) result = caseContextParameters(insertTrigger);
        if (result == null) result = caseTypePointer(insertTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.UPDATE_TRIGGER:
      {
        UpdateTrigger updateTrigger = (UpdateTrigger)theEObject;
        T result = caseUpdateTrigger(updateTrigger);
        if (result == null) result = caseTrigger(updateTrigger);
        if (result == null) result = caseMethodPointer(updateTrigger);
        if (result == null) result = caseContextParameters(updateTrigger);
        if (result == null) result = caseTypePointer(updateTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DELETE_TRIGGER:
      {
        DeleteTrigger deleteTrigger = (DeleteTrigger)theEObject;
        T result = caseDeleteTrigger(deleteTrigger);
        if (result == null) result = caseTrigger(deleteTrigger);
        if (result == null) result = caseMethodPointer(deleteTrigger);
        if (result == null) result = caseContextParameters(deleteTrigger);
        if (result == null) result = caseTypePointer(deleteTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SEARCH_TRIGGER:
      {
        SearchTrigger searchTrigger = (SearchTrigger)theEObject;
        T result = caseSearchTrigger(searchTrigger);
        if (result == null) result = caseTrigger(searchTrigger);
        if (result == null) result = caseMethodPointer(searchTrigger);
        if (result == null) result = caseContextParameters(searchTrigger);
        if (result == null) result = caseTypePointer(searchTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DATA_CONTROL:
      {
        DataControl dataControl = (DataControl)theEObject;
        T result = caseDataControl(dataControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ORDERS:
      {
        Orders orders = (Orders)theEObject;
        T result = caseOrders(orders);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ORDER_BY:
      {
        OrderBy orderBy = (OrderBy)theEObject;
        T result = caseOrderBy(orderBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIFICIAL_FIELD:
      {
        ArtificialField artificialField = (ArtificialField)theEObject;
        T result = caseArtificialField(artificialField);
        if (result == null) result = caseTypePointer(artificialField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.APPLICATION_INFRASTRUCTURE_LAYER:
      {
        ApplicationInfrastructureLayer applicationInfrastructureLayer = (ApplicationInfrastructureLayer)theEObject;
        T result = caseApplicationInfrastructureLayer(applicationInfrastructureLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ENTERPRISE_INFRASTRUCTURE:
      {
        EnterpriseInfrastructure enterpriseInfrastructure = (EnterpriseInfrastructure)theEObject;
        T result = caseEnterpriseInfrastructure(enterpriseInfrastructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.DATACENTER:
      {
        Datacenter datacenter = (Datacenter)theEObject;
        T result = caseDatacenter(datacenter);
        if (result == null) result = caseHTMLLayerHolder(datacenter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SUBSYSTEM:
      {
        Subsystem subsystem = (Subsystem)theEObject;
        T result = caseSubsystem(subsystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INFRASTRUCTURE_LAYER:
      {
        InfrastructureLayer infrastructureLayer = (InfrastructureLayer)theEObject;
        T result = caseInfrastructureLayer(infrastructureLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INFRASTRUCTURE_CONNECTION:
      {
        InfrastructureConnection infrastructureConnection = (InfrastructureConnection)theEObject;
        T result = caseInfrastructureConnection(infrastructureConnection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.INFRASTRUCTURE_COMPONENT:
      {
        InfrastructureComponent infrastructureComponent = (InfrastructureComponent)theEObject;
        T result = caseInfrastructureComponent(infrastructureComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SERVER:
      {
        Server server = (Server)theEObject;
        T result = caseServer(server);
        if (result == null) result = caseInfrastructureComponent(server);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ROUTER:
      {
        Router router = (Router)theEObject;
        T result = caseRouter(router);
        if (result == null) result = caseInfrastructureComponent(router);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.HUB:
      {
        Hub hub = (Hub)theEObject;
        T result = caseHub(hub);
        if (result == null) result = caseInfrastructureComponent(hub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STORAGE:
      {
        Storage storage = (Storage)theEObject;
        T result = caseStorage(storage);
        if (result == null) result = caseInfrastructureComponent(storage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.SERVER_CLASTER:
      {
        ServerClaster serverClaster = (ServerClaster)theEObject;
        T result = caseServerClaster(serverClaster);
        if (result == null) result = caseInfrastructureComponent(serverClaster);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HTML Layer Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HTML Layer Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHTMLLayerHolder(HTMLLayerHolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Categorized</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Categorized</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategorized(Categorized object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainArtifacts(DomainArtifacts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainTypes(DomainTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applications</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applications</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainApplications(DomainApplications object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainApplication(DomainApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainArtifact(DomainArtifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORM Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORM Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORMEntity(ORMEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAService(JPAService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EJB Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EJB Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEJBService(EJBService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continuous Iintegration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continuous Iintegration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinuousIintegration(ContinuousIintegration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifacts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifacts(Artifacts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifact(Artifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generation Hint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generation Hint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerationHint(GenerationHint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigVariable(ConfigVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelQuery(ModelQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryParameter(QueryParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecifier(Specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Messages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Messages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMessages(ApplicationMessages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationRole(ApplicationRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationStyle(ApplicationStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Styles Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Styles Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStylesPackage(StylesPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application UI Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application UI Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationUILayer(ApplicationUILayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application UI Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application UI Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationUIPackage(ApplicationUIPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Recipes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Recipes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationRecipes(ApplicationRecipes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationRecipe(ApplicationRecipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Mappers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Mappers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMappers(ApplicationMappers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMapper(ApplicationMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPointer(MethodPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Messages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Messages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessages(Messages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageLibrary(MessageLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageRef(LanguageRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Translation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Translation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTranslation(Translation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguage(Language object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Roles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Roles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoles(Roles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Styles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Styles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyles(Styles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleLibrary(StyleLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleSet(StyleSet object)
  {
    return null;
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
  public T caseMappers(Mappers object)
  {
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
  public T caseMapper(Mapper object)
  {
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
  public T caseTypeMapper(TypeMapper object)
  {
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
  public T caseJavaMapper(JavaMapper object)
  {
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
  public T caseJavaScriptMapper(JavaScriptMapper object)
  {
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
  public T caseCSSMapper(CSSMapper object)
  {
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
  public T caseRoleMapper(RoleMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipes(Recipes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentSequence(DeploymentSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Components</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Components</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentComponents(DeploymentComponents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentComponent(DeploymentComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Star Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Star Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentStarStep(DeploymentStarStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Mappers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Mappers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsingMappers(UsingMappers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipe(Recipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredient(Ingredient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaComponent(JavaComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructure(Infrastructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Mapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Mapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelMapper(ModelMapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingSpecifier(MappingSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryVariable(QueryVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifactRef(ArtifactRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePointer(TypePointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeElement(TypeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive(Primitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeReference(TypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeExtension(TypeExtension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnValue(ReturnValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumarator(Enumarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumAttribute(EnumAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypesRepository(TypesRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypes(Types object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(domain.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIPackage(UIPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForm(Form object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormView(FormView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Views</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Views</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViews(Views object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Lang Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Lang Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiLangLabel(MultiLangLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Canvas Frame</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Canvas Frame</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCanvasFrame(CanvasFrame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Port Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Port Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewPortHolder(ViewPortHolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Cavas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Cavas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultCavas(DefaultCavas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewElement(ViewElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCanvas(Canvas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Window</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWindow(Window object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Canvas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Canvas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabCanvas(TabCanvas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabPage(TabPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewPort(ViewPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewArea(ViewArea object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Port Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Port Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewPortTrigger(ViewPortTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewInheritance(ViewInheritance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Pages Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Pages Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabPagesInheritance(TabPagesInheritance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Data Controls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Data Controls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormDataControls(FormDataControls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Canvas View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Canvas View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCanvasView(CanvasView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyle(Style object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Children Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Children Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildrenHolder(ChildrenHolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleClass(StyleClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextParameter(ContextParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextValue(ContextValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionPart(ExpressionPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextParameters(ContextParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStyleElement(StyleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uielement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uielement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUielement(Uielement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sources Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sources Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourcesPointer(SourcesPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionElement(ActionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputElement(InputElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelection(Selection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionSelection(OptionSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayerHolder(LayerHolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputText(InputText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputText(OutputText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBox(CheckBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Down Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Down Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropDownSelection(DropDownSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTable(Table object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTree(Tree object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControls(Controls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Form Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREFormTrigger(PREFormTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Query Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREQueryTrigger(PREQueryTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POST Query Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOSTQueryTrigger(POSTQueryTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Insert Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREInsertTrigger(PREInsertTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Delete Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREDeleteTrigger(PREDeleteTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POST Create Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOSTCreateTrigger(POSTCreateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PRE Update Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREUpdateTrigger(PREUpdateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateTrigger(CreateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertTrigger(InsertTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateTrigger(UpdateTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteTrigger(DeleteTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchTrigger(SearchTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataControl(DataControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orders</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orders</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrders(Orders object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderBy(OrderBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artificial Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtificialField(ArtificialField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Infrastructure Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Infrastructure Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationInfrastructureLayer(ApplicationInfrastructureLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enterprise Infrastructure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enterprise Infrastructure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnterpriseInfrastructure(EnterpriseInfrastructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datacenter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datacenter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatacenter(Datacenter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsystem(Subsystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureLayer(InfrastructureLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Connection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Connection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureConnection(InfrastructureConnection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureComponent(InfrastructureComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServer(Server object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Router</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRouter(Router object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHub(Hub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStorage(Storage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server Claster</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server Claster</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServerClaster(ServerClaster object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainSwitch
