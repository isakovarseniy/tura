package org.tura.metamodel.wizard.recipe.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.ConfigVariable;
import domain.DomainPackage;

public class ConfigVarDialog {
	private HashSet<String> configVar = new HashSet<String>();

	public Collection<domain.Property> runDialog(domain.Configuration config) {

		ArrayList<domain.Property> available = new ArrayList<domain.Property>();
		available.addAll(config.getConfigExtension().getProperties());

		// go up
		domain.Configuration cnf = config;
		while (cnf.getConfigExtension() != null) {
			available.addAll(cnf.getConfigExtension().getProperties());
			cnf = cnf.getConfigExtension();
		}

		// go down
		cnf = config;
		while (cnf.getParent() != null) {
			available.addAll(cnf.getParent().getProperties());
			cnf = cnf.getParent();
		}

		// get recipe
		if (cnf.getRecipe() != null) {
			domain.Recipe recipe = cnf.getRecipe();
			searchConfigParameters(recipe.getComponents());
			configVar.removeAll( convert2Set(available));
		}

		return null;
	}

	private Set<String> convert2Set(List<domain.Property> list) {
		HashSet<String> set = new HashSet<String>();
		for (Iterator<domain.Property> itr = list.iterator(); itr.hasNext();) {
			domain.Property pr = itr.next();
			set.add(pr.getName());
		}
		return set;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void searchConfigParameters(List<domain.Component> components) {

		for (Iterator<domain.Component> itr = components.iterator(); itr
				.hasNext();) {
			domain.Component component = itr.next();
			searchConfigParameters(component.getComponents());

			for (Iterator<domain.ModelMapper> itrMp = component.getMappers()
					.iterator(); itrMp.hasNext();) {
				domain.ModelMapper mapper = itrMp.next();

				try {
					OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
					OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
							.createOCLHelper();
					helper.setContext(DomainPackage.eINSTANCE
							.getEClassifier("Domain"));

					OCLExpression<EClassifier> query = helper
							.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
									+ mapper.getDomainArtifact()
									+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
									+ mapper.getArtifactName()
									+ "').oclAsType(domain::Artifact).configVariables");

					Collection<domain.ConfigVariable> map = (Collection<domain.ConfigVariable>) ocl
							.evaluate(mapper, query);

					for (Iterator<ConfigVariable> itrCnf = map.iterator(); itrCnf
							.hasNext();) {
						domain.ConfigVariable cnfVar = itrCnf.next();
						this.configVar.add(cnfVar.getName());
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}

}
