package org.tura.metamodel.sirius.diagram.designer.service;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import application.Application;
import application.ApplicationGroup;
import application.ApplicationInfrastructureLayer;
import application.ApplicationInfrastructureLayers;
import artifact.ArtifactGroup;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.DomainTypesRepository;
import infrastructure.EnterpriseInfrastructure;
import message.Language;
import message.Message;
import message.MessageLibrary;
import message.Translation;
import type.TypeGroup;
import application.ApplicationLanguages;
import application.ApplicationMessageLibrary;
import application.ApplicationRealm;
import application.ApplicationRealms;

public class DiagramService {

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


}
