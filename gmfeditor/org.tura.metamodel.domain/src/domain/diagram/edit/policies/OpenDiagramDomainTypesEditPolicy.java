/*
 * 
 */
package domain.diagram.edit.policies;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.tura.metamodel.commons.initdiagram.InitDiagram;
import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryFactory;
import domain.DomainTypes;
import domain.diagram.part.DomainDiagramEditorPlugin;
import domain.diagram.part.DomainDiagramEditorUtil;
import domain.diagram.part.Messages;

/**
 * @generated
 */
public class OpenDiagramDomainTypesEditPolicy extends OpenEditPolicy {

	/**
	 * @generated
	 */
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		View view = (View) targetEditPart.getModel();
		Style link = view.getStyle(NotationPackage.eINSTANCE
				.getHintedDiagramLinkStyle());
		if (false == link instanceof HintedDiagramLinkStyle) {
			return null;
		}
		return new ICommandProxy(new OpenDiagramCommand(
				(HintedDiagramLinkStyle) link));
	}

	/**
	 * @generated
	 */
	private static class OpenDiagramCommand extends
			AbstractTransactionalCommand {

		/**
		 * @generated
		 */
		private final HintedDiagramLinkStyle diagramFacet;

		/**
		 * @generated
		 */
		OpenDiagramCommand(HintedDiagramLinkStyle linkStyle) {
			// editing domain is taken for original diagram, 
			// if we open diagram from another file, we should use another editing domain
			super(TransactionUtil.getEditingDomain(linkStyle),
					Messages.CommandName_OpenDiagram, null);
			diagramFacet = linkStyle;
		}

		// FIXME canExecute if  !(readOnly && getDiagramToOpen == null), i.e. open works on ro diagrams only when there's associated diagram already

		/**
		 * @generated
		 */
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			try {
				Diagram diagram = getDiagramToOpen();
				if (diagram == null) {
					diagram = intializeNewDiagram();
				}
				URI uri = EcoreUtil.getURI(diagram);
				String editorName = uri.lastSegment() + '#'
						+ diagram.eResource().getContents().indexOf(diagram);
				IEditorInput editorInput = new URIEditorInput(uri, editorName);
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		/**
		 * @generated
		 */
		protected Diagram getDiagramToOpen() {
			return diagramFacet.getDiagramLink();
		}

		/**
		 * @generated
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {

			DomainTypes

			sourceObject = (DomainTypes

			) ((ShapeImpl) (diagramFacet.eContainer())).basicGetElement();
			if (sourceObject.getName() == null) {

				MessageDialog dialog = new MessageDialog(Display.getCurrent()
						.getActiveShell(), "Error", null, "Name is undefined",
						MessageDialog.ERROR, new String[] { "ok" }, 0);
				dialog.open();
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");

			}

			Diagram d = ViewService.createDiagram(

			InitDiagram.initTypesRepositoryDiagram()

			, getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");
			}

			String filename = sourceObject.getName();

			List<String> segments = diagramFacet.eResource().getURI()
					.segmentsList();
			String projectName = segments.get(1);
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);

			try {
				IFolder folder = project.getFolder("model");
				folder = folder.getFolder("typesrepository"

				);
				if (!folder.exists()) {
					folder.create(true, true, null);
				}

				IFile modelFile = folder.getFile(filename + "."
						+ "typesrepository"

				);
				IFile diagramFile = folder.getFile(filename + "."
						+ "typesrepository"

						+ "_diagram");

				URI modelURI = URI.createFileURI(modelFile.getLocation()
						.toOSString());
				URI diagramURI = URI.createFileURI(diagramFile.getLocation()
						.toOSString());
				Resource diagramResource = null;

				if (modelFile.exists())
					modelFile.delete(true, null);

				if (diagramFile.exists())
					diagramFile.delete(true, null);

				diagramResource = diagramFacet.eResource().getResourceSet()
						.createResource(diagramURI);
				String header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>";
				ByteArrayInputStream in = new ByteArrayInputStream(
						header.getBytes());
				modelFile.create(in, true, null);

				diagramFacet.setDiagramLink(d);
				diagramResource.getContents().add(d);

				TypesRepository

				targetObject = (TypesRepository

				) d.getElement();
				sourceObject.setTypesrepository

				(targetObject);
				final Resource modelResource = sourceObject.eResource()
						.getResourceSet().getResource(modelURI, true);
				modelResource.getContents().add(targetObject);

				EObject container = diagramFacet.eContainer();
				while (container instanceof View) {
					((View) container).persist();
					container = container.eContainer();
				}

			} catch (Exception e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);

			}

			try {
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
							for (Iterator it = diagramFacet.eResource()
									.getResourceSet().getResources().iterator(); it
									.hasNext();) {
								Resource nextResource = (Resource) it.next();
								if (nextResource.isLoaded()
										&& !getEditingDomain().isReadOnly(
												nextResource)) {
									nextResource.save(DomainDiagramEditorUtil
											.getSaveOptions());
								}
							}
						} catch (IOException ex) {
							throw new InvocationTargetException(ex,
									"Save operation failed");
						}
					}
				}.run(null);
			} catch (InvocationTargetException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			} catch (InterruptedException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			}
			return d;
		}

		/**
		 * @generated
		 */
		protected EObject getDiagramDomainElement() {
			// use same element as associated with EP
			return ((View) diagramFacet.eContainer()).getElement();
		}

		/**
		 * @generated
		 */
		protected PreferencesHint getPreferencesHint() {
			// XXX prefhint from target diagram's editor?
			return DomainDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		protected String getDiagramKind() {
			return "Typesrepository";
		}

		/**
		 * @generated
		 */
		protected String getEditorID() {
			return "typesrepository.diagram.part.TypesrepositoryDiagramEditorID";
		}
	}

}
