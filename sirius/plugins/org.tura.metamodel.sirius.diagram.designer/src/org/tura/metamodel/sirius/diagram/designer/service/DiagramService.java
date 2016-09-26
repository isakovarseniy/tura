package org.tura.metamodel.sirius.diagram.designer.service;

import java.util.ArrayList;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
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
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.DomainTypesRepository;
import form.ArtificialField;
import form.Column;
import form.CreateTrigger;
import form.DataControl;
import form.DeleteTrigger;
import form.DropDownSelection;
import form.Form;
import form.FormParameter;
import form.InsertTrigger;
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
import message.Language;
import message.Message;
import message.MessageLibrary;
import message.Translation;
import recipe.Configuration;
import recipe.ModelMapper;
import recipe.Recipes;
import style.StyleLibrary;
import style.StyleSet;
import type.Assosiation;
import type.RelationType;
import type.TypeGroup;
import type.TypeReference;

public class DiagramService {

	
	public String getTypeReferenceName(TypeReference typeRef){
		if (typeRef.getTypeRef() != null){
			return (String) new TypePointerTypeName().getFeatureValue(typeRef, null);
		}
		return "Ref : null";
	}
	
	public Object getContextForLink( EObject eobject ){
		EObject obj = eobject.eContainer();
		if (obj instanceof ViewArea){
			return obj;
		}else{
			return getContextForLink(obj);
		}
	}	

	public boolean enableContextMenuForConfiguration( EObject eobject ){
		if (eobject instanceof Configuration){
			return true;
		}else{
			return false;
		}
	}	

		
	public boolean enableContextMenuForDatacontrol( EObject eobject ){
		if (eobject instanceof DataControl){
			return true;
		}else{
			return false;
		}
	}	
	
	
	public boolean enableContextMenuForModelMapper( EObject eobject ){
		if (eobject instanceof ModelMapper){
			return true;
		}else{
			return false;
		}
	}	

	
	public Object getCandidates(EObject eobject ){
		if  (eobject instanceof ViewArea){
			return ((ViewArea)eobject).getBaseCanvas();
		}
		if  (eobject instanceof LayerHolder){
			return ((LayerHolder)eobject).getChildren();
		}

		if  (eobject instanceof Column){
			return ((Column)eobject).getElement();
		}
		
		return new ArrayList<EObject>();
	}
	
	public String generateUID(EObject eobject ){
		return UUID.randomUUID().toString();
	}

	public String generateName(Menu menu ){
		if (menu.getMenu() == null){
			return "N/A";
		}
		return menu.getMenu().getName();
	}

	
	public String generateName(DomainArtifact domainArtifact ){
		return "Domain Artifact"+ ((DomainArtifacts)(domainArtifact.eContainer())).getDomainArtifact().size();
	}
	
	public String generateName(DomainTypesRepository domainRepository ){
		return "Domain Repository"+ ((DomainTypes)(domainRepository.eContainer())).getTypesRepository().size();
	}
	
	public String generateName(DomainApplication domainApplication ){
		return "Domain Application"+ ((DomainApplications)(domainApplication.eContainer())).getApplications().size();
	}

	
	public String generateName(ApplicationGroup applicationGroup ){
		return "Application package"+ ((DomainApplication)(applicationGroup.eContainer())).getApplicationPackages().size();
	}
	
	public String generateName(ArtifactGroup artifactGroup ){
		return "Artifact package"+ ((DomainArtifact)(artifactGroup.eContainer())).getArtifactPackages().size();
	}

	public String generateName(TypeGroup typeGroup ){
		return "Type package"+ ((DomainTypesRepository)(typeGroup.eContainer())).getRepositoryPackages().size();
	}
	
	public String generateName(Application application ){
		return "Application"+ ((ApplicationGroup)(application.eContainer())).getApplications().size();
	}

	public String generateName(Language language ){
		return "Language"+ ((ApplicationLanguages)(language.eContainer())).getLanguages().size();
	}
	
	public String generateName(MessageLibrary lib ){
		return "Library "+ ((ApplicationMessageLibrary)(lib.eContainer())).getLibraries().size();
	}
	

	public String generateName(Message message ){
		if (message.getName() == null){
		    return "Key  "+ ((MessageLibrary)(message.eContainer())).getMessages().size();
		}else{
			return message.getName();
		}
	}


	public String generateName(Translation translation ){
		if (translation.getLang() == null){
		     return "Translation  "+ ((Message)(translation.eContainer())).getTranslatioins().size();
		}else{
			return translation.getLang().getLang();
		}
	}
	
	public String getLangName(Translation translation ){
		if (translation.getLang() == null){
		     return "Translation  "+ ((Message)(translation.eContainer())).getTranslatioins().size();
		}else{
			return translation.getLang().getLang();
		}
	}	
	

	public String generateName(ApplicationInfrastructureLayer layer ){
		return "Infrastructure Environment  "+ ((ApplicationInfrastructureLayers)(layer.eContainer())).getInfarastructureLayers().size();
	}

	public String generateName(ApplicationRealm realm ){
		return "Security rules set  "+ ((ApplicationRealms)(realm.eContainer())).getRealms().size();
	}
	

	public String generateName(EnterpriseInfrastructure infra ){
		return "Infrastructure layer  "+ ((ApplicationInfrastructureLayer)(infra.eContainer())).getInfarastructures().size();
	}

	public String generateName(ApplicationRecipe recipe ){
		return "Application recipes  package"+ ((ApplicationRecipes)(recipe.eContainer())).getRecipes().size();
	}

	public String generateName(Recipes recipe ){
		return "Recipe "+ ((ApplicationRecipe)(recipe.eContainer())).getRecipes().size();
	}

	public String generateName(ApplicationStyle style ){
		return "Style libraies package "+ ((ApplicationStyleLibraries)(style.eContainer())).getStyleLibraries().size();
	}

	public String generateName(StyleLibrary style ){
		return "Style library  "+ ((ApplicationStyle)(style.eContainer())).getLibraries().size();
	}
		
	public String generateName(StyleSet style ){
		return "Style "+ ((StyleLibrary)(style.eContainer())).getStyles().size();
	}

	public String generateName(ApplicationUIPackage uipackage ){
		return "UI Package "+ ((ApplicationUILayer)(uipackage.eContainer())).getApplicationUIPackages().size();
	}
	
	public String generateName(Form form ){
		return "Form "+ ((ApplicationUIPackage)(form.eContainer())).getForms().size();
	}

	public String generateName(FormParameter param ){
		return "Form parameter"+ ((Form)(param.eContainer())).getParameters().size();
	}
	
	public String generateName(ArtificialField param ){
		return "Artificial field"+ ((DataControl)(param.eContainer())).getArtificialFields().size();
	}
	
	public String generateName(ApplicationMapper param ){
		return "Mapping package"+ ((ApplicationMappers)(param.eContainer())).getMappers().size();
	}


	public String generateName(JavaMapper mapper ){
		return  (String) new TypePointerTypeName().getFeatureValue(mapper, null);
	}

	public String generateName(JavaScriptMapper mapper ){
		return (String) new TypePointerTypeName().getFeatureValue(mapper, null);
	}

	public String generateName(JavaPackageMapper mapper ){
		return (String) new TypeGroupPointerName().getFeatureValue(mapper, null);
	}
	
	public String generateName(CSSMapper mapper ){
		return (String) new StylePointerLibraryName().getFeatureValue(mapper, null);
	}
	
	public String generateName(RoleMapper mapper ){
		return (String) new GrantAccessRoleRef().getFeatureValue(mapper, null);
	}
	
	public String generateName(CreateTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "create  -  n/a";
		}
		return "create - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(UpdateTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "update  -  n/a";
		}
		return "update - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(DeleteTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "remove  -  n/a";
		}
		return "remove - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(InsertTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "insert  -  n/a";
		}
		return "insert - "+trigger.getMethodRef().getName()+"()";
	}

	public String generateName(SearchTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "search  -  n/a";
		}
		return "search - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(PREInsertTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "pre-insert  -  n/a";
		}
		return "pre-insert - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(PREDeleteTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "pre-remove  -  n/a";
		}
		return "pre-remove - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(PREUpdateTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "pre-update  -  n/a";
		}
		return "pre-update - "+trigger.getMethodRef().getName()+"()";
	}

	public String generateName(PREQueryTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "pre-query  -  n/a";
		}
		return "pre-query - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(POSTQueryTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "post-query  -  n/a";
		}
		return "post-query - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(POSTCreateTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "post-create  -  n/a";
		}
		return "post-create - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateName(PREFormTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "pre-form  -  n/a";
		}
		return "pre-form - "+trigger.getMethodRef().getName()+"()";
	}

	public String generateName(ViewPortTrigger trigger ){
		if (trigger.getMethodRef() == null){
			return "viewport  -  n/a";
		}
		return "viewport - "+trigger.getMethodRef().getName()+"()";
	}
	
	public String generateSourceName(Assosiation assosiation ){
		if (assosiation.getType().equals(RelationType.MANY2_MANY)){
			return "1..n";
		}else{
			return "1";
		}
	}	

	public String generateTargetName(Assosiation assosiation ){
		if (assosiation.getType().equals(RelationType.ONE2_ONE)){
			return "1";
		}else{
			return "1..n";
		}
	}	

	public boolean validateSourcesPointer(SourcesPointer pointer ){
		if ( pointer.eContainer() instanceof Column ){
			return true;
		}else{
			if (pointer.getSourcePointer() == null )
				return false;
			else
				return true;
		}
	}

	public boolean validateValuePointer(SourcesPointer pointer ){
		if ( pointer instanceof Tree || pointer instanceof Table){
			return true;
		}else{
			if (pointer.getValuePointer() == null )
				return false;
			else
				return true;
		}
	}
	
	
	public boolean validateOptionSelectionSourcesPointer(OptionSelection pointer ){
		if (pointer.getOptionPointer() == null )
			return false;
		else
			return true;
	}

	public boolean validateOptionSelectionSelection(DropDownSelection pointer ){
		if (pointer.getSelection() == null )
			return false;
		else
			return true;
	}	
	
	
	public boolean validateSelectionValuePointer(Selection pointer ){
		if(pointer.getDisplayOptionPointer() == null)
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
	
}


