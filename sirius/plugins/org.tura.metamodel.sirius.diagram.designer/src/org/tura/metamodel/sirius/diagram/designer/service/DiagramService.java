package org.tura.metamodel.sirius.diagram.designer.service;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import tura.application.Application;
import tura.application.ApplicationGroup;
import tura.artifact.ArtifactGroup;
import tura.domain.DomainApplication;
import tura.domain.DomainApplications;
import tura.domain.DomainArtifact;
import tura.domain.DomainArtifacts;
import tura.domain.DomainTypes;
import tura.domain.DomainTypesRepository;
import tura.message.Language;
import tura.message.Message;
import tura.message.MessageLibrary;
import tura.message.Translation;
import tura.type.TypeGroup;
import tura.application.ApplicationLanguages;
import tura.application.ApplicationMessageLibrary;

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


}
