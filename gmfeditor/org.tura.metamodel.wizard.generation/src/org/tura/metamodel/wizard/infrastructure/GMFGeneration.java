package org.tura.metamodel.wizard.infrastructure;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.validatioin.TuraCompositeEValidator;

import domain.Ingredient;
import domain.Recipes;

import recipe.diagram.part.DomainDiagramEditorPlugin;
import recipe.diagram.providers.DomainMarkerNavigationProvider;

public class GMFGeneration {
	
	
	private IProgressMonitor monitor;	
	
	private boolean generationError = false;
	

	public GMFGeneration( IProgressMonitor monitor) {
		this.monitor = monitor;
	}	
	
	
	public boolean isGenerationError() {
		return generationError;
	}

	public void setGenerationError(boolean generationError) {
		this.generationError = generationError;
	}


	public  void generate(DiagramEditPart diagramEditPart, View view, domain.Infrastructure infrastructure) {
		IFile target = view.eResource() != null ? WorkspaceSynchronizer
				.getFile(view.eResource()) : null;
		if (target != null) {
			DomainMarkerNavigationProvider.deleteMarkers(target);
		}
				runGMFGeneration(view,infrastructure,diagramEditPart);
	}


	private void getConfiguratioin(domain.Configuration conf ,HashMap<String,String> configuration){
		
		if (conf != null){
  		   for (Iterator<domain.Property> itr = conf.getProperties().iterator(); itr.hasNext();){
			  domain.Property prop = itr.next();
			  configuration.put(prop.getConfVarRef().getName(), prop.getValue());
		   }
		   if (conf.getConfigExtension() != null)
			   getConfiguratioin(conf.getConfigExtension(),configuration);
		}
	}
	
	
	private  void runGMFGeneration(View target,domain.Infrastructure infrastructure,DiagramEditPart diagramEditPart) {
		
		if (target.isSetElement() && target.getElement() != null) {

			HashMap<String,String> configuration = new HashMap<>();
			getConfiguratioin(infrastructure.getRecipeConfig(),configuration);
			// Validate recipe
			domain.Recipes recipes = (Recipes) target.getElement();
			InMemoryEmfModel model = new InMemoryEmfModel(recipes.eResource());
			EditingDomain editingDomain= diagramEditPart.getEditingDomain();
			
			try {
				  for (Iterator<Ingredient> itr = recipes.getRecipe().getIngredients().iterator(); itr.hasNext();) {
					  Ingredient ingredient = itr.next();
					  for (Iterator<domain.Component> itrComp = ingredient.getComponents().iterator(); itrComp.hasNext();) {
						  domain.Component comp = itrComp.next();
						  monitor.beginTask("Component generation:"+comp.getName(), comp.getMappers().size());
						  for (Iterator<domain.ModelMapper> itrMap = comp.getMappers().iterator(); itrMap.hasNext();) {
							  domain.ModelMapper mapper = itrMap.next();
							  monitor.subTask("Mapper generation :" + mapper.getName() );
							  if (mapper.getArtifactRef().getTemplate() != null){
								  EglTemplate template=null;							  
 							      try{
							         String templatePath = mapper.getArtifactRef().getTemplate();

							          EglTemplateFactory factory = new EglTemplateFactory();

									  ModelRepository modelRepo = factory.getContext().getModelRepository();
							          factory.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
									  modelRepo.addModel(model);
									  
									  HashMap<String, Object> parameters = new HashMap<>();
									  parameters.put("recipe", recipes.getRecipe());
									  parameters.put("ingredient", ingredient);
									  parameters.put("component", comp);
									  parameters.put("model_mapper", mapper);
									  parameters.put("configuration",configuration);
									  
									  template=Util.loadTemplate(templatePath, parameters, factory);
									  
									   if (template != null && template.getParseProblems().isEmpty() ){
                                       
										   editingDomain.getCommandStack().execute( new EGLCommand(factory, template));
										   
									  }else{
										  DomainDiagramEditorPlugin.getInstance().logError("Generation action failed. Template parsing problem :" +templatePath); 
										  generationError=true;
									  }
							     }catch(Exception e){
								     DomainDiagramEditorPlugin.getInstance().logError("Generation action failed. Ingredient -> {"+ingredient.getName()+ "} Component -> {" + comp.getName()+"} Mapper -> {"+mapper.getName()+"}", e); 
									 generationError = true;
							     }
							  }
						      monitor.worked(1);
						  }
					  }
				  }
			}finally{
				TuraCompositeEValidator.runTime = 0;
			}
		}
	}
	
	
	
}
