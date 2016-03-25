package org.tura.metamodel.wizard.datacontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import domain.DomainPackage;

public class DataControlCommandSelector {

	
	public List<?> runDialog(Object obj) {

		List<domain.Type> set = propertiesList(obj);
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent().getActiveShell(), set, new ArrayContentProvider(),
				new TypeLabelProvider(), "Select command for initialization:");
		dlg.setTitle("Variables Selection");
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());
		}

		return result;
	}
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<domain.Type> propertiesList(Object obj){
		List<domain.Type> array = new ArrayList<domain.Type>();

		try {
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE
					.getEClassifier("Domain"));

			
			String query_str="domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type ) ) )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}' and c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name = '${Artifact}' and  c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name = '${ArtifactLib}' )->collect(c|c.oclAsType(ecore::EObject).eContainer())";
			query_str = query_str.replaceAll("\\$\\{Package name\\}", "DataControl command").replaceAll("\\$\\{Artifact\\}", "Data control").replaceAll("\\$\\{Hint\\}", "datacontrol.command").replaceAll("\\$\\{ArtifactLib\\}", "UIGeneration");
			
			OCLExpression<EClassifier> query = helper.createQuery(query_str);

			Collection<domain.Type> map = (Collection<domain.Type>) ocl.evaluate(obj, query);

			array = new ArrayList<domain.Type>();
			array.addAll(map);

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return array;
		
	}
	
	
	class TypeLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((domain.Type) element).getName();//$NON-NLS-1$
		}

	}
	
	
}
