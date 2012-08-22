/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipse.wb.elsoft.menucontribution.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.wb.elsoft.propertyeditor.Activator;
import org.eclipse.wb.elsoft.propertyeditor.TreeModel;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO;
import org.elsoft.platform.metamodel.objects.recipe.RecipeDAO;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.objects.suite.DomainDAO;
import org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.DomainServiceDC;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;
import org.elsoft.platform.metamodel.suite.ServerZoneHandler;

public class GenerateFormHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);

		CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(
				shell, new MethodLabelProvider(), new MyContentProvider());

		dialog.setTitle("Tree Selection");

		dialog.setMessage("Select the elements from the tree:");

		dialog.setInput(buildModel());

		if (dialog.open() == Window.OK) {

			Object result = dialog.getResult();

			Object[] obj = (Object[]) result;

			if (obj.length != 2) {
				IStatus status = new Status(IStatus.ERROR, "Explorer",
						IStatus.OK,
						"Infrastructure or recipe has not selected", null);

				ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
						"An unexpectedexception has ocurred.", status,
						IStatus.ERROR);
				error.open();
				return null;

			}

			
			if (!((TreeModel)obj[0]).parent.nodeName.equals("infrastructure")) {
				IStatus status = new Status(IStatus.ERROR, "Explorer",
						IStatus.OK, "Infrastructure  has not been selected",
						null);

				ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
						"An unexpectedexception has ocurred.", status,
						IStatus.ERROR);
				error.open();
				return null;

			}

			if (!((TreeModel)obj[1]).parent.nodeName.equals("recipe")) {
				IStatus status = new Status(IStatus.ERROR, "Explorer",
						IStatus.OK, "Recipe  has not been selected", null);

				ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
						"An unexpectedexception has ocurred.", status,
						IStatus.ERROR);
				error.open();
				return null;

			}

			GenarateFormJob job = new GenarateFormJob();
			job.infrastructure = ((TreeModel)obj[0]).nodeName;
			job.recipe = ((TreeModel)obj[1]).nodeName;
			job.application = ((TreeModel)obj[0]).parent.parent.nodeName;
			job.functionalDomain = ((TreeModel)obj[0]).parent.parent.parent.nodeName;
			job.domain = ((TreeModel)obj[0]).parent.parent.parent.parent.nodeName;


			Thread t = new Thread(job);
		    t.start();
		}

		return null;
	}

	private TreeModel buildModel() {
		DomainServiceDC dh = Activator.rf.getRoot();
		Iterator<DomainDAO> itr = dh.clean().getList();
		TreeModel root = new TreeModel("root", null);

		while (itr.hasNext()) {
			DomainDAO domain = itr.next();
			TreeModel domainNode = new TreeModel(domain.getDomainName(), root);
			FunctionalDomainHandler fd = dh.getFunctionalDomain();
			Iterator<FunctionalDomainDAO> itrFD = fd.clean().getList();
			while (itrFD.hasNext()) {
				FunctionalDomainDAO functionalDomain = itrFD.next();
				TreeModel functionalDomainNode = new TreeModel(
						functionalDomain.getFunctionalDomainName(), domainNode);
				ApplicationHandler aph = fd.getApplicationHandler();
				Iterator<ApplicationDAO> itrAO = aph.clean().getList();
				while (itrAO.hasNext()) {
					ApplicationDAO busObj = itrAO.next();
					TreeModel applicationNode = new TreeModel(
							busObj.getApplicationName(), functionalDomainNode);

					TreeModel infra = new TreeModel("infrastructure",
							applicationNode);
					ServerZoneHandler ih = aph.getInfrastructureLayer();
					Iterator<ServerZoneDAO> itrSZ = ih.getList();

					while (itrSZ.hasNext()) {
						ServerZoneDAO sz = itrSZ.next();
						new TreeModel(sz.getZoneName(), infra);
					}

					TreeModel recipe = new TreeModel("recipe", applicationNode);
					RecipeHandler rh = aph.getRecipeHandler().clean();
					Iterator<RecipeDAO> itrRH = rh.getList();
					while (itrRH.hasNext()) {
						RecipeDAO sz = itrRH.next();
						new TreeModel(sz.getRecipeName(), recipe);
					}

				}

			}

		}
		return root;
	}

	private class MethodLabelProvider extends BaseLabelProvider implements
			ILabelProvider {
		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			return ((TreeModel) element).nodeName;
		}
	}

	private class MyContentProvider implements ITreeContentProvider {

		public Object[] getElements(Object inputElement) {
			return ((TreeModel) inputElement).child.toArray();
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getChildren(Object parentElement) {
			return getElements(parentElement);
		}

		public Object getParent(Object element) {
			if (element == null) {
				return null;
			}
			return ((TreeModel) element).parent;
		}

		public boolean hasChildren(Object element) {
			return ((TreeModel) element).child.size() > 0;
		}

	}

}
