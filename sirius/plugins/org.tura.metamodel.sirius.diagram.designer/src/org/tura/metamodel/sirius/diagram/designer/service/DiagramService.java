package org.tura.metamodel.sirius.diagram.designer.service;

import java.util.ArrayList;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import application.Application;
import application.ApplicationGroup;
import application.ApplicationInfrastructureLayer;
import application.ApplicationInfrastructureLayers;
import application.ApplicationLanguages;
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
import form.DataControl;
import form.Form;
import form.FormParameter;
import form.LayerHolder;
import form.ViewArea;
import infrastructure.EnterpriseInfrastructure;
import message.Language;
import message.Message;
import message.MessageLibrary;
import message.Translation;
import recipe.Recipes;
import style.StyleLibrary;
import style.StyleSet;
import type.TypeGroup;

public class DiagramService {

	
	
	public Object getContextForLink( EObject eobject ){
		EObject obj = eobject.eContainer();
		if (obj instanceof ViewArea){
			return obj;
		}else{
			return getContextForLink(obj);
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
		return "Key  "+ ((MessageLibrary)(message.eContainer())).getMessages().size();
	}


	public String generateName(Translation translation ){
		return "Translation  "+ ((Message)(translation.eContainer())).getTranslatioins().size();
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
	
}
