/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import application.Application;
import application.ApplicationUIPackage;
import form.ContextParameter;
import form.ContextParameters;
import form.ContextValue;
import form.Controls;
import form.Form;
import form.FormFactory;
import form.FormPackage;
import form.MenuDefinition;
import form.ViewArea;
import form.Views;
import type.Operation;
import type.Parameter;

public class QueryHelper1 {
	
	public Object getRootControl(DiagramImpl root) throws Exception {
		Form frm = getForm(root);
		return frm.getDatacontrols().getRoot();
	}
	
	public Object getDomainApplications(DiagramImpl root) {
		Form frm = getForm(root);
		ApplicationUIPackage pkg = (ApplicationUIPackage) frm.eContainer();
		return pkg.eContainer().eContainer().eContainer().eContainer();
	}	
	
	public List<?> getControlsList(DiagramImpl root) throws Exception {

		Form frm = getForm(root);
		return new  QueryHelper().getControlsList(frm);
	}	
	
	public Form getForm(DiagramImpl root) {
		Form frm = null;

		DSemanticDecorator element = (DSemanticDecorator) root.getElement();
		EObject obj = element.getTarget();

		if (obj instanceof Views) {
			frm = (Form) ((Views) obj).eContainer();
		}

		if (obj instanceof ViewArea) {
			frm = (Form) ((ViewArea) obj).eContainer().eContainer().eContainer();
		}

		if (obj instanceof Controls) {
			frm = (Form) ((Controls) obj).eContainer();
		}

		if (obj instanceof MenuDefinition) {
			Views views = (Views) (((MenuDefinition) obj).eContainer());
			frm = (Form) views.eContainer();
		}

		return frm;
	}
	
	public Object getApplicationStyle(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationStyle() != null) {
			return app.getApplicationStyle();
		}
		return null;
	}
	
	public Object getMessages(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationMessages() != null) {
			return app.getApplicationMessages().getMessageLibraries();
		}
		return null;
	}
	
	public Object getApplicationRoles(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationRole() != null) {
			return app.getApplicationRole();
		}
		return null;
	}	
	
	public List<Object> findTriggerParameters(Operation method, ContextParameters trg, EObject types,
			EditingDomain editingDomain) throws Exception {

		ArrayList<ContextParameter> removeParameters = new ArrayList<ContextParameter>();
		ArrayList<ContextParameter> addParameters = new ArrayList<ContextParameter>();

		Collection<Parameter> map = method.getParameters();

		ArrayList<Parameter> parameters = new ArrayList<Parameter>();
		parameters.addAll(map);

		Collections.sort(parameters, new ParameterComparator());

		ArrayList<ContextParameter> trgParameters = new ArrayList<ContextParameter>();
		trgParameters.addAll(trg.getParameters());

		Collections.sort(trgParameters, new ContextParameterComparator());

		boolean renewParameters = false;
		if (trgParameters.size() != parameters.size()) {
			removeParameters.addAll(trgParameters);
			renewParameters = true;
		} else {

			for (int i = 0; i < trgParameters.size(); i++) {
				ContextParameter trgParam = trgParameters.get(i);
				Parameter param = parameters.get(i);
				if (trgParam.getRefObj() == null
						|| !((Parameter) trgParam.getRefObj()).getUid().equals(param.getUid())) {
					removeParameters.addAll(trgParameters);
					renewParameters = true;
					break;
				}
			}
		}
		if (renewParameters) {
			for (int i = 0; i < parameters.size(); i++) {
				ContextParameter trgParam = FormFactory.eINSTANCE.createContextParameter();
				trgParam.setRefObj(parameters.get(i));
				trgParam.setUid(UUID.randomUUID().toString());
				addParameters.add(trgParam);
				ContextValue value = FormFactory.eINSTANCE.createContextValue();
				value.setUid(UUID.randomUUID().toString());
				trgParam.setValue(value);
			}
		}
		if (removeParameters.size() != 0) {
			editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, trg,
					FormPackage.eINSTANCE.getContextParameters_Parameters(), removeParameters));
		}

		if (addParameters.size() != 0) {
			editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, trg,
					FormPackage.eINSTANCE.getContextParameters_Parameters(), addParameters));
		}

		trgParameters = new ArrayList<ContextParameter>();
		trgParameters.addAll(trg.getParameters());

		Collections.sort(trgParameters, new ContextParameterComparator());

		ArrayList<Object> rows = new ArrayList<>();
		rows.addAll(trgParameters);
		return rows;
	}
	
	class ParameterComparator implements Comparator<Parameter> {
		@Override
		public int compare(Parameter o1, Parameter o2) {
			return new Integer(o1.getOrder()).compareTo(new Integer(o2.getOrder()));
		}
	}

	class ContextParameterComparator implements Comparator<ContextParameter> {

		@Override
		public int compare(ContextParameter o1, ContextParameter o2) {
			if (o1.getRefObj() == null || o2.getRefObj() == null)
				return -1;
			return new Integer(((Parameter) o1.getRefObj()).getOrder())
					.compareTo(new Integer(((Parameter) o2.getRefObj()).getOrder()));
		}

	}	
	
}
