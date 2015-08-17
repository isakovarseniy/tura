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
package org.tura.metamodel.wizard.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.validatioin.TuraCompositeEValidator;
import org.tura.metamodel.validatioin.TuraDiagnostician;
import org.tura.metamodel.validatioin.TuraValidator;

import recipe.diagram.part.DomainDiagramEditorPlugin;
import recipe.diagram.providers.DomainMarkerNavigationProvider;
import domain.Ingredient;
import domain.Recipes;

public class GMFValidation {

	private IProgressMonitor monitor;

	private boolean validationError = false;

	public GMFValidation(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	public boolean isValidationError() {
		return validationError;
	}

	public void setValidationError(boolean validationError) {
		this.validationError = validationError;
	}

	public void validate(DiagramEditPart diagramEditPart, View view) {
		IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
		if (target != null) {
			DomainMarkerNavigationProvider.deleteMarkers(target);
		}
		Diagnostic[] diagnostic = runGMFValidator(view);
		for (int i = 0; i < diagnostic.length; i++) {
			TuraValidator.createMarkers(target, diagnostic[i], diagramEditPart);
		}
	}

	@SuppressWarnings("unchecked")
	private Diagnostic[] runGMFValidator(View target) {

		if (target.isSetElement() && target.getElement() != null) {

			TuraDiagnostician diagnostician = new TuraDiagnostician() {

				public String getObjectLabel(EObject eObject) {
					return EMFCoreUtil.getQualifiedName(eObject, true);
				}
			};
			ArrayList<Diagnostic> diag = new ArrayList<Diagnostic>();

			// Validate recipe
			monitor.beginTask("Recipe validation", 1);
			diag.add(diagnostician.validate(target));
			monitor.worked(1);
			monitor.done();

			for (Diagnostic d : diag) {
				if (d.getSeverity() == Diagnostic.ERROR) {
					validationError = true;
					return diag.toArray(new Diagnostic[diag.size()]);
				}
			}

			try {
				Indicator.clean();
				TuraCompositeEValidator.runTime = 1;

				domain.Recipes recipes = (Recipes) target.getElement();
				Indicator.currentRecipe = recipes.getRecipe();
				for (Iterator<Ingredient> itr = recipes.getRecipe().getIngredients().iterator(); itr.hasNext();) {
					Ingredient ingredient = itr.next();
					Indicator.currentIngredient = ingredient;
					for (Iterator<domain.Component> itrComp = ingredient.getComponents().iterator(); itrComp.hasNext();) {
						domain.Component comp = itrComp.next();
						Indicator.currentComponent = comp;
						monitor.beginTask("Component validation:" + comp.getName(), comp.getMappers().size());
						for (Iterator<domain.ModelMapper> itrMap = comp.getMappers().iterator(); itrMap.hasNext();) {
							domain.ModelMapper mapper = itrMap.next();
							Indicator.currentModelMapper = mapper;
							monitor.subTask("Mapper validetion :" + mapper.getName());
							for (Iterator<domain.Query> itrQuery = mapper.getQueries().iterator(); itrQuery.hasNext();) {
								domain.Query query = itrQuery.next();
								Indicator.currentQuery = query;
								if (query.getQueryRef() != null && query.getQueryRef().getQuery() != null
										&& query.getQueryRef().getQuery() != null) {
									try {
										Object result = Util.runQuery(query, mapper);
										if (result == null)
											continue;
										if (result instanceof Collection) {
											for (EObject obj : ((Collection<EObject>) result)) {
												diag.add(diagnostician.validateObject(obj));
											}
										}
										if (result instanceof EObject) {
											diag.add(diagnostician.validateObject((EObject) result));
										}

									} catch (Exception e) {
										DomainDiagramEditorPlugin.getInstance().logError("Validation action failed", e);
										validationError = true;
									}
								}

							}
							monitor.worked(1);
						}
					}
				}
			} finally {
				TuraCompositeEValidator.runTime = 0;
				TuraDiagnostician.cleanupResources();
			}

			for (Diagnostic d : diag) {
				if (d.getSeverity() == Diagnostic.ERROR)
					validationError = true;
			}
			return diag.toArray(new Diagnostic[diag.size()]);

		}
		return new Diagnostic[] { Diagnostic.OK_INSTANCE };
	}

}
