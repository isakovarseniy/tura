package org.tura.metamodel.sirius.diagram.designer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.tura.metamodel.commons.Helper1;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.actions.ConfigHashVarDialog;
import org.tura.metamodel.sirius.properties.actions.ConfigVarDialog;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.GrantAccessRoleRef;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.StylePointerLibraryName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.TypeGroupPointerName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.TypePointerTypeName;

import application.Application;
import application.ApplicationGroup;
import application.ApplicationInfrastructureLayer;
import application.ApplicationInfrastructureLayers;
import application.ApplicationLanguages;
import application.ApplicationMapper;
import application.ApplicationMappers;
import application.ApplicationMessageLibrary;
import application.ApplicationRealm;
import application.ApplicationRealms;
import application.ApplicationRecipe;
import application.ApplicationRecipes;
import application.ApplicationStyle;
import application.ApplicationStyleLibraries;
import application.ApplicationUILayer;
import application.ApplicationUIPackage;
import artifact.ArtifactGroup;
import artifact.Classifier;
import artifact.ConfigHash;
import artifact.ConfigVariable;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.DomainTypesRepository;
import form.ArtificialField;
import form.BlockUI;
import form.Column;
import form.CreateTrigger;
import form.DataControl;
import form.DeleteTrigger;
import form.DropDownSelection;
import form.Form;
import form.FormParameter;
import form.InsertTrigger;
import form.InternalRelation;
import form.LayerHolder;
import form.Menu;
import form.OptionSelection;
import form.POSTCreateTrigger;
import form.POSTQueryTrigger;
import form.PREDeleteTrigger;
import form.PREFormTrigger;
import form.PREInsertTrigger;
import form.PREQueryTrigger;
import form.PREUpdateTrigger;
import form.RadioSelection;
import form.Relation;
import form.RelationMapper;
import form.SearchTrigger;
import form.Selection;
import form.SourcesPointer;
import form.Table;
import form.Tree;
import form.UpdateTrigger;
import form.ViewArea;
import form.ViewPortTrigger;
import infrastructure.EnterpriseInfrastructure;
import mapper.CSSMapper;
import mapper.JavaMapper;
import mapper.JavaPackageMapper;
import mapper.JavaScriptMapper;
import mapper.RoleMapper;
import mapper.XMLPackageMapper;
import mapper.XMLTypeMapper;
import message.Language;
import message.Message;
import message.MessageLibrary;
import message.Translation;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.Query;
import recipe.Recipes;
import style.StyleLibrary;
import style.StyleSet;
import type.Assosiation;
import type.Containment;
import type.Link;
import type.Primitive;
import type.RelationType;
import type.Type;
import type.TypeElement;
import type.TypeGroup;
import type.TypePointer;
import type.TypeReference;

public class DiagramService {

	public String getTypeReferenceName(TypeReference typeRef) {
		if (typeRef.getTypeRef() != null) {
			return (String) new TypePointerTypeName().getFeatureValue(typeRef, null);
		}
		return "Ref : null";
	}

	public Object getContextForLink(EObject eobject) {
		EObject obj = eobject.eContainer();
		if (obj instanceof ViewArea) {
			return obj;
		} else {
			return getContextForLink(obj);
		}
	}

	public boolean enableContextMenuForConfiguration(EObject eobject) {
		if (eobject instanceof Configuration) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enableContextMenuForDatacontrol(EObject eobject) {
		if (eobject instanceof DataControl) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enableContextMenuForInfrastructure(EObject eobject) {
		if (eobject instanceof Infrastructure) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enableContextMenuForModelMapper(EObject eobject) {
		if (eobject instanceof ModelMapper) {
			return true;
		} else {
			return false;
		}
	}

	public Object getCandidates(EObject eobject) {
		if (eobject instanceof ViewArea) {
			return ((ViewArea) eobject).getBaseCanvas();
		}
		if (eobject instanceof LayerHolder) {
			return ((LayerHolder) eobject).getChildren();
		}

		if (eobject instanceof Column) {
			return ((Column) eobject).getElement();
		}

		if (eobject instanceof BlockUI) {
			return ((BlockUI) eobject).getChildren();
		}

		
		
		return new ArrayList<EObject>();
	}

	public String generateUID(EObject eobject) {
		return UUID.randomUUID().toString();
	}

	public String generateName(Menu menu) {
		if (menu.getMenu() == null) {
			return "N/A";
		}
		return menu.getMenu().getName();
	}

	public String generateName(DomainArtifact domainArtifact) {
		return "Domain Artifact" + ((DomainArtifacts) (domainArtifact.eContainer())).getDomainArtifact().size();
	}

	public String generateName(DomainTypesRepository domainRepository) {
		return "Domain Repository" + ((DomainTypes) (domainRepository.eContainer())).getTypesRepository().size();
	}

	public String generateName(DomainApplication domainApplication) {
		return "Domain Application" + ((DomainApplications) (domainApplication.eContainer())).getApplications().size();
	}

	public String generateName(ApplicationGroup applicationGroup) {
		return "Application package"
				+ ((DomainApplication) (applicationGroup.eContainer())).getApplicationPackages().size();
	}

	public String generateName(ArtifactGroup artifactGroup) {
		return "Artifact package" + ((DomainArtifact) (artifactGroup.eContainer())).getArtifactPackages().size();
	}

	public String generateName(TypeGroup typeGroup) {
		return "Type package" + ((DomainTypesRepository) (typeGroup.eContainer())).getRepositoryPackages().size();
	}

	public String generateName(Application application) {
		return "Application" + ((ApplicationGroup) (application.eContainer())).getApplications().size();
	}

	public String generateName(Language language) {
		return "Language" + ((ApplicationLanguages) (language.eContainer())).getLanguages().size();
	}

	public String generateName(MessageLibrary lib) {
		return "Library " + ((ApplicationMessageLibrary) (lib.eContainer())).getLibraries().size();
	}

	public String generateName(Message message) {
		if (message.getName() == null) {
			return "Key  " + ((MessageLibrary) (message.eContainer())).getMessages().size();
		} else {
			return message.getName();
		}
	}

	public String generateName(Translation translation) {
		if (translation.getLang() == null) {
			return "Translation  " + ((Message) (translation.eContainer())).getTranslatioins().size();
		} else {
			return translation.getLang().getLang();
		}
	}

	public String getLangName(Translation translation) {
		if (translation.getLang() == null) {
			return "Translation  " + ((Message) (translation.eContainer())).getTranslatioins().size();
		} else {
			return translation.getLang().getLang();
		}
	}

	public String generateName(ApplicationInfrastructureLayer layer) {
		return "Infrastructure Environment  "
				+ ((ApplicationInfrastructureLayers) (layer.eContainer())).getInfarastructureLayers().size();
	}

	public String generateName(ApplicationRealm realm) {
		return "Security rules set  " + ((ApplicationRealms) (realm.eContainer())).getRealms().size();
	}

	public String generateName(EnterpriseInfrastructure infra) {
		return "Infrastructure layer  "
				+ ((ApplicationInfrastructureLayer) (infra.eContainer())).getInfarastructures().size();
	}

	public String generateName(ApplicationRecipe recipe) {
		return "Application recipes  package" + ((ApplicationRecipes) (recipe.eContainer())).getRecipes().size();
	}

	public String generateName(Recipes recipe) {
		return "Recipe " + ((ApplicationRecipe) (recipe.eContainer())).getRecipes().size();
	}

	public String generateName(ApplicationStyle style) {
		return "Style libraies package "
				+ ((ApplicationStyleLibraries) (style.eContainer())).getStyleLibraries().size();
	}

	public String generateName(StyleLibrary style) {
		return "Style library  " + ((ApplicationStyle) (style.eContainer())).getLibraries().size();
	}

	public String generateName(StyleSet style) {
		return "Style " + ((StyleLibrary) (style.eContainer())).getStyles().size();
	}

	public String generateName(ApplicationUIPackage uipackage) {
		return "UI Package " + ((ApplicationUILayer) (uipackage.eContainer())).getApplicationUIPackages().size();
	}

	public String generateName(Form form) {
		return "Form " + ((ApplicationUIPackage) (form.eContainer())).getForms().size();
	}

	public String generateName(FormParameter param) {
		return "Form parameter" + ((Form) (param.eContainer())).getParameters().size();
	}

	public String generateName(ArtificialField param) {
		return "Artificial field" + ((DataControl) (param.eContainer())).getArtificialFields().size();
	}

	public String generateName(ApplicationMapper param) {
		return "Mapping package" + ((ApplicationMappers) (param.eContainer())).getMappers().size();
	}

	public String generateName(JavaMapper mapper) {
		return (String) new TypePointerTypeName().getFeatureValue(mapper, null);
	}

	public String generateName(JavaScriptMapper mapper) {
		return (String) new TypePointerTypeName().getFeatureValue(mapper, null);
	}

	public String generateName(JavaPackageMapper mapper) {
		return (String) new TypeGroupPointerName().getFeatureValue(mapper, null);
	}

	public String generateName(CSSMapper mapper) {
		return (String) new StylePointerLibraryName().getFeatureValue(mapper, null);
	}

	public String generateName(RoleMapper mapper) {
		return (String) new GrantAccessRoleRef().getFeatureValue(mapper, null);
	}

	public String generateName(CreateTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "create  -  n/a";
		}
		return "create - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(UpdateTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "update  -  n/a";
		}
		return "update - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(DeleteTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "remove  -  n/a";
		}
		return "remove - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(InsertTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "insert  -  n/a";
		}
		return "insert - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(SearchTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "search  -  n/a";
		}
		return "search - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(PREInsertTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "pre-insert  -  n/a";
		}
		return "pre-insert - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(PREDeleteTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "pre-remove  -  n/a";
		}
		return "pre-remove - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(PREUpdateTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "pre-update  -  n/a";
		}
		return "pre-update - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(PREQueryTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "pre-query  -  n/a";
		}
		return "pre-query - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(POSTQueryTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "post-query  -  n/a";
		}
		return "post-query - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(POSTCreateTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "post-create  -  n/a";
		}
		return "post-create - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(PREFormTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "pre-form  -  n/a";
		}
		return "pre-form - " + trigger.getMethodRef().getName() + "()";
	}

	public String generateName(ViewPortTrigger trigger) {
		if (trigger.getMethodRef() == null) {
			return "viewport  -  n/a";
		}
		return "viewport - " + trigger.getMethodRef().getName() + "()";
	}

	

	public String generateName(RelationMapper relationMapper) {
		if (relationMapper.getTypeRef()== null) {
			return "relatioin  -  n/a";
		}
		if (relationMapper.getTypeRef() instanceof Type){
			return "relatioin - " + relationMapper.getTypeRef().getName();
		}
		if (relationMapper.getTypeRef() instanceof TypeReference){
			TypeReference ref = (TypeReference) relationMapper.getTypeRef();
			return "relatioin - " + ref.getTypeRef().getName();
		}
		return "null";
		
	}
	
	
	public String generateName(XMLPackageMapper pkg) {
		if (pkg.getPackageRef() == null) {
			return "N/A";
		}
		return pkg.getPackageRef().getName();
	}
	
	public String generateName(XMLTypeMapper tp) {
		if (tp.getTypeRef() == null) {
			return "N/A";
		}
		return tp.getTypeRef().getName();
	}

	
	
	public String generateSourceName(Assosiation assosiation) {
		if (assosiation.getType().equals(RelationType.MANY2_MANY) && assosiation.isInternal() ) {
			return "Error  !!!!!!!!!!!!!!!!!!";
		}
		
		if (assosiation.getType().equals(RelationType.MANY2_MANY)  ) {
			return "1..n";
		} else {
			return "1";
		}
	}

	public String generateTargetName(Assosiation assosiation) {
		if (assosiation.getType().equals(RelationType.MANY2_MANY) && assosiation.isInternal() ) {
			return "Error  !!!!!!!!!!!!!!!!!!";
		}

		if (assosiation.getType().equals(RelationType.ONE2_ONE)) {
			return "1";
		} else {
			return "1..n";
		}
	}

	public boolean validateSourcesPointer(SourcesPointer pointer) {
		if (pointer.eContainer() instanceof Column) {
			return true;
		} else {
			if (pointer.getSourcePointer() == null)
				return false;
			else
				return true;
		}
	}

	public boolean validateValuePointer(SourcesPointer pointer) {
		if (pointer instanceof Tree || pointer instanceof Table) {
			return true;
		} else {
			if (pointer.getValuePointer() == null)
				return false;
			else
				return true;
		}
	}

	public boolean validateOptionSelectionSourcesPointer(OptionSelection pointer) {
		if (pointer.getOptionPointer() == null)
			return false;
		else
			return true;
	}

	public boolean validateOptionSelectionSelection(DropDownSelection pointer) {
		if (pointer.getSelection() == null)
			return false;
		else
			return true;
	}

	public boolean validateOptionSelectionSelection(RadioSelection pointer) {
		if (pointer.getSelection() == null)
			return false;
		else
			return true;
	}
	
	
	
	public boolean validateSelectionValuePointer(Selection pointer) {
		if (pointer.getDisplayOptionPointer() == null)
			return false;
		else
			return true;
	}

	public boolean validateSelectionDisplayOption(Selection pointer) {
		if (pointer.getDisplayOptionPointer() == null)
			return false;
		else
			return true;
	}

	public boolean validateConfigVariablesIsDefine(Configuration config) {
		Set<ConfigVariable> prop = new ConfigVarDialog().propertiesList(config);
		if (prop.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateConfigHashVariablesIsDefine(Configuration config) {
		Set<ConfigHash> prop = new ConfigHashVarDialog().propertiesList(config);
		if (prop.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public boolean validateMappingTechnologies(ModelMapper mapper) {
		try {
			if (mapper.getArtifactRef() == null) {
				return false;
			}
			Object[] result = new QueryHelper().findMappingTechnologies(mapper, null);
			if (((List) result[0]).size() == 0 && ((List) result[1]).size() == 0) {
				for (  MappingTecnologiy tech : mapper.getTechnologies()){
					if (tech.getValueRef() == null){
						return false;
					}
				}
			}else{
			   return false;
			}
			return true;
		} catch (Exception e) {
			LogUtil.log(e);
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public boolean validateQueryParameters(Query query) {
		try {
			ModelMapper mapper = (ModelMapper) query.eContainer();
			if (mapper.getArtifactRef() == null) {
				return false;
			}
			if (query.getQueryRef() == null ){
				return false;
			}
			
			Object[] result = new QueryHelper().findMappingVariable(query, query);
			if (((List) result[0]).size() == 0 && ((List) result[1]).size() == 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			LogUtil.log(e);
			return false;
		}
	}
	
	public boolean validateRelation(Relation relation) {
		if (relation.getLinks().size() == 0){
			return false;
		}
		for (Link link : relation.getLinks()){
			if (link.getMasterField() == null || link.getDetailField() == null){
				return false;
			}
		}
		return true;
	}
	
	
	
	public boolean checkRelationMapperDropDown(RelationMapper relationMapper){
		if (relationMapper.getTypeRef() instanceof Primitive){
			return false;
		}

		if (relationMapper.getDataControlRef() == null){
			return true;
		}else{
			return false;
		}
	}

	
	public boolean checkRelationMapperSefDropDown(RelationMapper relationMapper){
		if (relationMapper.getTypeRef() instanceof Primitive){
			return false;
		}

		if (relationMapper.getDataControlRef() == null){
			DataControl dc =   (DataControl) relationMapper.eContainer();
			if (dc.getBaseType().getTypeRef().getUid().equals(relationMapper.getTypeRef().getUid())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	

	public boolean showRelationMapper(RelationMapper relationMapper){
		if (relationMapper.getDataControlRef() == null){
			DataControl srcDC = (DataControl) relationMapper.eContainer();
			
			Type tp = null;
			if (relationMapper.getTypeRef() instanceof Type){
				tp = (Type) relationMapper.getTypeRef();
			}
			if (relationMapper.getTypeRef() instanceof TypeReference){
				tp = (Type) ((TypeReference) relationMapper.getTypeRef()).getTypeRef();
			}
			
			Assosiation assosiation =  new QueryHelper().getAssosiation((Type)srcDC.getBaseType().getTypeRef(), tp );
			return !checkIfNOAssosiatioin(assosiation);
			
		}else{
			return false;
		}
	}	
	

	public DataControl findDataControlForRelation(DataControl dataControl){
		return new QueryHelper().findDataControlForRelation(dataControl);
	}
	
	public DataControl findDataControlForRelation(Object dataControl){
		System.out.println(dataControl.getClass().getName());
		return null;
	}

	
	
	public String generateUIDForObjectMapper(DataControl datacontrol){
		new Helper1().populateObjectMapper(datacontrol, datacontrol);
		return generateUID(datacontrol);
	}
	
	public boolean checkIfSourcetContainment(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.SOURCE.equals(assosiation.getContainment())&!checkIfNOAssosiatioin(assosiation);  
	}

	public boolean checkIfTargetContainment(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.TARGET.equals(assosiation.getContainment())&!checkIfNOAssosiatioin(assosiation);  
	}
	
	public boolean checkIfNONContainment(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.NON.equals(assosiation.getContainment())&!checkIfNOAssosiatioin(assosiation);  
	}
	
	
	public boolean checkIfSourcetContainmentNoAssosiation(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.SOURCE.equals(assosiation.getContainment())&checkIfNOAssosiatioin(assosiation);  
	}

	public boolean checkIfTargetContainmentNoAssosiation(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.TARGET.equals(assosiation.getContainment())&checkIfNOAssosiatioin(assosiation);  
	}
	
	public boolean checkIfNONContainmentNoAssosiation(Assosiation assosiation){
		if (assosiation.isInternal() ){
			return false;
		}
		return Containment.NON.equals(assosiation.getContainment())&checkIfNOAssosiatioin(assosiation);  
	}	
	

	public boolean checkIfInternalAssosiation(Assosiation assosiation){
		return assosiation.isInternal();  
	}	
	
	
	public boolean checkIfNOAssosiatioin(Assosiation assosiation){
//		for ( Classifier c : assosiation.getClassifiers()){
//			if ( c.getHint().getName().equals("No Assosiation")){
//				return true;
//			}
//		}
		return false;
	}
	
	public boolean checkIfAdapterType(Type assosiation){
		for ( Classifier c :assosiation.getClassifiers()){
			if ( c.getHint().getName().equals("Adapter")){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkIfNotAdapterType(Type assosiation){
		for ( Classifier c :assosiation.getClassifiers()){
			if ( c.getHint().getName().equals("Adapter")){
				return false;
			}
		}
		return true;
	}

	
	
	public boolean checkIfNoInternalRelations(DataControl dc){
		for (  RelationMapper r:  dc.getRelationMappers()){
			if (r.getDataControlRef() != null){
				return false;
			}
		}
		return true;
	}

	
	public TypeElement getBaseType( TypePointer pointer, RelationMapper element){
		TypeElement e = element.getTypeRef();
		if (e instanceof Type){
			return e;
		}
		if (e instanceof TypeReference){
			return  ((TypeReference)e).getTypeRef();
		}
		return null;
	}
	
	public String getBaseTypeName( DataControl dc, RelationMapper element){
		TypeElement e = element.getTypeRef();
		if (e instanceof Type){
			return e.getName();
		}
		if (e instanceof TypeReference){
			return  ((TypeReference)e).getTypeRef().getName();
		}
		return null;
	}	

	public TypeElement getTypeRef( InternalRelation relation, RelationMapper element){
		TypeElement e = element.getTypeRef();

		if (e instanceof TypeReference){
			return  e;
		}
		return null;
	}	
	
}