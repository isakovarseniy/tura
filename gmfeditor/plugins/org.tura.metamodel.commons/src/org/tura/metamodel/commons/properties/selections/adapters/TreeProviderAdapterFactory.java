package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

public class TreeProviderAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] TYPES = { IWorkbenchAdapter.class,
			IReturnTypeProvider.class };

	private ArtificialFieldProvider artificialFieldProvider;
	private TreeRootProvider treeRootProvider;
	private DataControlHolderProvider dataControlHolderProvider;
	private TreeRootDataControlHolderProvider treeRootDataControlHolder;
	private DataControlProvider dataControlProvider;
	private TriggerProvider triggerProvider;
	private TypeElementProvider typeElementProvider;
	private AttributeProvider attributeProvider;
	private TypesProvider typesProvider;
	private PackageProvider packageProvider;
	private OperationProvider operationProvider;
	private ApplicationRoleProvider applicationRoleProvider;
	private GroupProvider groupProvider;
	private RoleProvider roleProvider;
	private MessageLibraryProvider messageLibraryProvider;
	private MessagesProvider messagesProvider;
	private MessageProvider messageProvider;
	private DomainArtifactsProvider domainArtifactsProvider;
	private DomainArtifactProvider domainArtifactProvider;
	private ArtifactProvider artifactProvider;
	private GeneratioinHintProvider generatioinHintProvider;
	private DataControlFakeAttributeProvider dataControlFakeAttributeProvider;
	private DataControlFakeMethodProvider dataControlFakeMethodProvider;
	private TreeDataControlProvider treeDataControlProvider;
	private ExtendedTypeProvider extendedTypeProvider;
	private RolesProvider rolesProvider;
	private ApplicationStyleProvider applicationStyleProvider;
	private StylesPackageProvider stylesPackageProvider;
	private StyleLibraryProvider styleLibraryProvider;
	private StyleSetProvider styleSetProvider;
	private FormVariableProvider formVariableProvider;
	private FormVariablesProvider formVariablesProvider;
	private DomainApplicationsProvider domainApplicationsProvider;
	private DomainApplicationProvider domainApplicationProvider;
	private ApplicationUIPackageProvider applicationUIPackageProvider;
	private FormProvider formProvider;
	private WindowProvider windowProvider;
	
	
	

	@SuppressWarnings({ "rawtypes" })
	public Class[] getAdapterList() {
		return TYPES;
	}

	@SuppressWarnings({ "rawtypes" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class
				|| adapterType == IReturnTypeProvider.class) {
			if (adaptableObject instanceof TreeRoot)
				return getTreeRootProvider();
			if (adaptableObject instanceof DataControlHolder)
				return getDataControlHolderProvider();
			if (adaptableObject instanceof TreeRootDataControlHolder)
				return getTreeRootDataControlHolderProvider();
			if (adaptableObject instanceof domain.DataControl)
				return getDataControlProvider();
			if (adaptableObject instanceof TriggerHolder)
				return getTriggerProvider();
			if (adaptableObject instanceof domain.TypeElement)
				return getTypeElementProvider();
			if (adaptableObject instanceof domain.Attribute)
				return getAttributeProvider();
			if (adaptableObject instanceof domain.Operation)
				return getOperationProvider();
			if (adaptableObject instanceof domain.Types)
				return getTypesProvider();
			if (adaptableObject instanceof domain.Package)
				return getPackageProvider();
			if (adaptableObject instanceof domain.ApplicationRole)
				return getApplicationRoleProvider();
			if (adaptableObject instanceof domain.Group)
				return getGroupProvider();
			if (adaptableObject instanceof domain.Role)
				return getRoleProvider();
			if (adaptableObject instanceof domain.Message)
				return getMessageProvider();
			if (adaptableObject instanceof domain.Messages)
				return getMessagesProvider();
			if (adaptableObject instanceof domain.MessageLibrary)
				return getMessageLibraryProvider();
			if (adaptableObject instanceof domain.DomainArtifacts)
				return getDomainArtifactsProvider();
			if (adaptableObject instanceof domain.DomainArtifact)
				return getDomainArtifactProvider();
			if (adaptableObject instanceof domain.Artifact)
				return getArtifactProvider();
			if (adaptableObject instanceof domain.GenerationHint)
				return getGeneratioinHintProvider();
			if (adaptableObject instanceof DataControlFakeAttribute)
				return getDataControlFakeAttributeProvider();
			if (adaptableObject instanceof DataControlFakeMethod)
				return getDataControlFakeMethodProvider();
			if (adaptableObject instanceof TreeDataControl)
				return getTreeDataControlProvider();
			if (adaptableObject instanceof ExtendedType)
				return getExtendedTypeProvider();
			if (adaptableObject instanceof domain.ArtificialField)
				return getArtificialFieldProvider();
			if (adaptableObject instanceof domain.Roles)
				return getRolesProvider();
			if (adaptableObject instanceof domain.ApplicationStyle)
				return getApplicationStyleProvider();
			if (adaptableObject instanceof domain.StylesPackage)
				return getStylesPackageProvider();
			if (adaptableObject instanceof domain.StyleLibrary)
				return getStyleLibraryProvider();
			if (adaptableObject instanceof domain.StyleSet)
				return getStyleSetProvider();
			if (adaptableObject instanceof domain.Root)
				return getFormVariablesProvider();
			if (adaptableObject instanceof domain.FormVariable)
				return getFormVariableProvider();
			if (adaptableObject instanceof domain.DomainApplications)
				return getDomainApplicationsProvider();
			if (adaptableObject instanceof domain.DomainApplication)
				return getDomainApplicationProvider();
			if (adaptableObject instanceof domain.Form)
				return getFormProvider();
			if (adaptableObject instanceof domain.ApplicationUIPackage)
				return getApplicationUIPackageProvider();
			if (adaptableObject instanceof domain.Window)
				return getWindowProvider();
		}
		return null;
	}

	protected TreeDataControlProvider getTreeDataControlProvider() {
		if (treeDataControlProvider == null)
			treeDataControlProvider = new TreeDataControlProvider();
		return treeDataControlProvider;
	}

	protected DataControlFakeAttributeProvider getDataControlFakeAttributeProvider() {
		if (dataControlFakeAttributeProvider == null)
			dataControlFakeAttributeProvider = new DataControlFakeAttributeProvider();
		return dataControlFakeAttributeProvider;
	}

	protected DataControlFakeMethodProvider getDataControlFakeMethodProvider() {
		if (dataControlFakeMethodProvider == null)
			dataControlFakeMethodProvider = new DataControlFakeMethodProvider();
		return dataControlFakeMethodProvider;
	}

	protected DomainArtifactsProvider getDomainArtifactsProvider() {
		if (domainArtifactsProvider == null)
			domainArtifactsProvider = new DomainArtifactsProvider();
		return domainArtifactsProvider;
	}

	protected DomainArtifactProvider getDomainArtifactProvider() {
		if (domainArtifactProvider == null)
			domainArtifactProvider = new DomainArtifactProvider();
		return domainArtifactProvider;
	}

	protected ArtifactProvider getArtifactProvider() {
		if (artifactProvider == null)
			artifactProvider = new ArtifactProvider();
		return artifactProvider;
	}

	protected GeneratioinHintProvider getGeneratioinHintProvider() {
		if (generatioinHintProvider == null)
			generatioinHintProvider = new GeneratioinHintProvider();
		return generatioinHintProvider;
	}

	protected TreeRootProvider getTreeRootProvider() {
		if (treeRootProvider == null)
			treeRootProvider = new TreeRootProvider();
		return treeRootProvider;
	}

	protected DataControlHolderProvider getDataControlHolderProvider() {
		if (dataControlHolderProvider == null)
			dataControlHolderProvider = new DataControlHolderProvider();
		return dataControlHolderProvider;
	}

	protected TreeRootDataControlHolderProvider getTreeRootDataControlHolderProvider() {
		if (treeRootDataControlHolder == null)
			treeRootDataControlHolder = new TreeRootDataControlHolderProvider();
		return treeRootDataControlHolder;
	}

	protected DataControlProvider getDataControlProvider() {
		if (dataControlProvider == null)
			dataControlProvider = new DataControlProvider();
		return dataControlProvider;
	}

	protected TriggerProvider getTriggerProvider() {
		if (triggerProvider == null)
			triggerProvider = new TriggerProvider();
		return triggerProvider;
	}

	protected TypeElementProvider getTypeElementProvider() {
		if (typeElementProvider == null)
			typeElementProvider = new TypeElementProvider();
		return typeElementProvider;
	}

	protected AttributeProvider getAttributeProvider() {
		if (attributeProvider == null)
			attributeProvider = new AttributeProvider();
		return attributeProvider;
	}

	protected OperationProvider getOperationProvider() {
		if (operationProvider == null)
			operationProvider = new OperationProvider();
		return operationProvider;
	}

	protected TypesProvider getTypesProvider() {
		if (typesProvider == null)
			typesProvider = new TypesProvider();
		return typesProvider;
	}

	protected PackageProvider getPackageProvider() {
		if (packageProvider == null)
			packageProvider = new PackageProvider();
		return packageProvider;
	}

	protected ApplicationRoleProvider getApplicationRoleProvider() {
		if (applicationRoleProvider == null)
			applicationRoleProvider = new ApplicationRoleProvider();
		return applicationRoleProvider;
	}

	protected GroupProvider getGroupProvider() {
		if (groupProvider == null)
			groupProvider = new GroupProvider();
		return groupProvider;
	}

	protected RoleProvider getRoleProvider() {
		if (roleProvider == null)
			roleProvider = new RoleProvider();
		return roleProvider;
	}

	protected MessageProvider getMessageProvider() {
		if (messageProvider == null)
			messageProvider = new MessageProvider();
		return messageProvider;
	}

	protected MessagesProvider getMessagesProvider() {
		if (messagesProvider == null)
			messagesProvider = new MessagesProvider();
		return messagesProvider;
	}

	protected MessageLibraryProvider getMessageLibraryProvider() {
		if (messageLibraryProvider == null)
			messageLibraryProvider = new MessageLibraryProvider();
		return messageLibraryProvider;
	}

	protected ExtendedTypeProvider getExtendedTypeProvider() {
		if (extendedTypeProvider == null)
			extendedTypeProvider = new ExtendedTypeProvider();
		return extendedTypeProvider;
	}

	protected ArtificialFieldProvider getArtificialFieldProvider() {
		if (artificialFieldProvider == null)
			artificialFieldProvider = new ArtificialFieldProvider();
		return artificialFieldProvider;
	}

	protected RolesProvider getRolesProvider() {
		if (rolesProvider == null)
			rolesProvider = new RolesProvider();
		return rolesProvider;
	}

	protected ApplicationStyleProvider getApplicationStyleProvider(){
		if (applicationStyleProvider == null)
			applicationStyleProvider = new ApplicationStyleProvider();
		return applicationStyleProvider;		
	}
	
	
	protected StylesPackageProvider getStylesPackageProvider(){
		if (stylesPackageProvider == null)
			stylesPackageProvider = new StylesPackageProvider();
		return stylesPackageProvider;		
	}
	

	protected StyleLibraryProvider getStyleLibraryProvider(){
		if (styleLibraryProvider == null)
			styleLibraryProvider = new StyleLibraryProvider();
		return styleLibraryProvider;		
	}
	
	protected StyleSetProvider getStyleSetProvider(){
		if (styleSetProvider == null)
			styleSetProvider = new StyleSetProvider();
		return styleSetProvider;		
	}
	
	protected FormVariablesProvider getFormVariablesProvider(){
		if (formVariablesProvider == null)
			formVariablesProvider = new FormVariablesProvider();
		return formVariablesProvider;		
	}
	
	protected FormVariableProvider getFormVariableProvider(){
		if (formVariableProvider == null)
			formVariableProvider = new FormVariableProvider();
		return formVariableProvider;		
	}
	
	protected DomainApplicationsProvider getDomainApplicationsProvider(){
		if (domainApplicationsProvider == null)
			domainApplicationsProvider = new DomainApplicationsProvider();
		return domainApplicationsProvider;		
	}
	protected DomainApplicationProvider getDomainApplicationProvider(){
		if (domainApplicationProvider == null)
			domainApplicationProvider = new DomainApplicationProvider();
		return domainApplicationProvider;		
	}
	protected FormProvider getFormProvider(){
		if (formProvider == null)
			formProvider = new FormProvider();
		return formProvider;		
	}
	protected ApplicationUIPackageProvider getApplicationUIPackageProvider(){
		if (applicationUIPackageProvider == null)
			applicationUIPackageProvider = new ApplicationUIPackageProvider();
		return applicationUIPackageProvider;		
	}
	protected WindowProvider getWindowProvider(){
		if (windowProvider == null)
			windowProvider = new WindowProvider();
		return windowProvider;		
	}
	
}
