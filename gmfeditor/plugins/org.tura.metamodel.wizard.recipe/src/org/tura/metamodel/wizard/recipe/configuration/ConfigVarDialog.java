/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.wizard.recipe.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
import org.tura.metamodel.commons.QueryHelper;

import domain.ConfigVariable;
import domain.DomainPackage;

public class ConfigVarDialog {
	private HashSet<ConfigVariable> configVar = new HashSet<ConfigVariable>();

	public List<?> runDialog(domain.Configuration config) {

		Set<ConfigVariable> set = propertiesList(config);
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent()
				.getActiveShell(), set, new ArrayContentProvider(),
				new ConfigVarLabelProvider(), "Select configuration variables:");
		dlg.setTitle("Variables Selection");
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());
		}

		return result;
	}

	public Set<ConfigVariable> propertiesList(domain.Configuration config) {
		try {
			ArrayList<domain.Property> available = new ArrayList<domain.Property>();
			QueryHelper helper = new QueryHelper();

			if (config == null)
				return configVar;
			available.addAll(config.getProperties());

			// go up
			domain.Configuration cnf = config;
			while (helper.getConfigExtensionUp(cnf) != null) {
				cnf = helper.getConfigExtensionUp(cnf);
				available.addAll(cnf.getProperties());

			}

			// go down
			cnf = config;
			while (helper.getConfigExtensionDown(cnf) != null) {
				cnf = helper.getConfigExtensionDown(cnf);
				available.addAll(cnf.getProperties());
			}

			// get recipe
			if (cnf.getInfrastructure() != null) {
				domain.Recipe recipe = cnf.getInfrastructure().getRecipe();
				for (Iterator<domain.Ingredient> itr = recipe.getIngredients()
						.iterator(); itr.hasNext();) {
					domain.Ingredient ingridient = itr.next();
					searchConfigParameters(ingridient.getComponents());
				}

				for (Iterator<domain.Property> itr = available.iterator(); itr
						.hasNext();) {
					configVar.remove(itr.next().getConfVarRef());
				}
			}
		} catch (Exception e) {

		}

		return configVar;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void searchConfigParameters(List<domain.Component> components) {

		for (Iterator<domain.Component> itr = components.iterator(); itr
				.hasNext();) {
			domain.Component component = itr.next();

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
							.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
									+ mapper.getDomainArtifactRef().getUid()
									+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid ='"
									+ mapper.getArtifactRef().getUid()
									+ "').oclAsType(domain::Artifact).configVariables");

					Collection<domain.ConfigVariable> map = (Collection<domain.ConfigVariable>) ocl
							.evaluate(mapper, query);

					for (Iterator<ConfigVariable> itrCnf = map.iterator(); itrCnf
							.hasNext();) {
						domain.ConfigVariable cnfVar = itrCnf.next();
						this.configVar.add(cnfVar);
					}

				} catch (Exception e) {
					LogUtil.log(e);
				}

			}
		}

	}

	class ConfigVarLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((domain.ConfigVariable) element).getName();//$NON-NLS-1$
		}

	}

}
