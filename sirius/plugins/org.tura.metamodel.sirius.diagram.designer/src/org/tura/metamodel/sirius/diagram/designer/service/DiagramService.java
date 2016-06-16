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
import tura.type.TypeGroup;

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

	
	
}
