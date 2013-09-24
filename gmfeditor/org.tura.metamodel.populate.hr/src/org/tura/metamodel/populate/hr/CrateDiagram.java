package org.tura.metamodel.populate.hr;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

import domain.Domain;
import domain.DomainPackage;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;
import domain.diagram.providers.DomainViewProvider;

public class CrateDiagram {

	public static void main(String[] args) {
	    // Initialize the model
	    DomainPackage.eINSTANCE.eClass();
	    // Retrieve the default factory singleton

	    
	    // Register the XMI resource factory for the .website extension
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("domain", new XMIResourceFactoryImpl());
	    m.put("domain_diagram", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Obtain a new resource set
	    ResourceSet diagresSet = new ResourceSetImpl();

	    
	    // Create a resource
	    Resource resource = resSet.createResource(URI
	        .createURI("employee.domain"));
	    
	    Resource diagramresource = diagresSet.createResource(URI
		        .createURI("employee.domain_diagram"));
	    
	    
	    // Create the content of the model via this program
	    Domain model = InitDiagram.initDomainDiagram(resource);
	    new PopulateTypes().execute(model,resource);
	    new PopulateTypesMapping().execute(model, resource);
	    
	    // As of here we preparing to save the model content
		IAdaptable viewModel = (model != null) ? new EObjectAdapter(model): null;
        DomainViewProvider prvider = new  DomainViewProvider();
        Diagram diagram = prvider.createDiagram(viewModel, DomainEditPart.MODEL_ID, DomainDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(model);
	    
	    diagramresource.getContents().add(diagram);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Map options = new HashMap(
				GMFResourceFactory.getDefaultLoadOptions());

	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	      diagramresource.save(options);
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
}
