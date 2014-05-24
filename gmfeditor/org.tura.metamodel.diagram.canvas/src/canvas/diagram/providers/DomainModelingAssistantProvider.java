/*
 * 
 */
package canvas.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment2EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment3EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartmentEditPart;
import canvas.diagram.edit.parts.TableTableColsCompartment2EditPart;
import canvas.diagram.edit.parts.TableTableColsCompartmentEditPart;
import canvas.diagram.part.DomainDiagramEditorPlugin;
import canvas.diagram.part.Messages;

/**
 * @generated
 */
public class DomainModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CanvasViewEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.LayerHolder_1602003);
			return types;
		}
		if (editPart instanceof ColumnEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(DomainElementTypes.Button_1603023);
			types.add(DomainElementTypes.Label_1603013);
			types.add(DomainElementTypes.DropDownSelection_1603010);
			types.add(DomainElementTypes.Table_1603021);
			types.add(DomainElementTypes.LayerHolder_1603020);
			types.add(DomainElementTypes.InputText_1603012);
			types.add(DomainElementTypes.OutputText_1603014);
			types.add(DomainElementTypes.CheckBox_1603015);
			types.add(DomainElementTypes.Tree_1603022);
			return types;
		}
		if (editPart instanceof LayerHolderLayerHolderChildrenCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(DomainElementTypes.Button_1603017);
			types.add(DomainElementTypes.Label_1603005);
			types.add(DomainElementTypes.DropDownSelection_1603002);
			types.add(DomainElementTypes.Table_1603008);
			types.add(DomainElementTypes.LayerHolder_1603019);
			types.add(DomainElementTypes.InputText_1603004);
			types.add(DomainElementTypes.OutputText_1603006);
			types.add(DomainElementTypes.CheckBox_1603007);
			types.add(DomainElementTypes.Tree_1603016);
			return types;
		}
		if (editPart instanceof TableTableColsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.Column_1603024);
			return types;
		}
		if (editPart instanceof TableTableColsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.Column_1603024);
			return types;
		}
		if (editPart instanceof LayerHolderLayerHolderChildrenCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(DomainElementTypes.Button_1603017);
			types.add(DomainElementTypes.Label_1603005);
			types.add(DomainElementTypes.DropDownSelection_1603002);
			types.add(DomainElementTypes.Table_1603008);
			types.add(DomainElementTypes.LayerHolder_1603019);
			types.add(DomainElementTypes.InputText_1603004);
			types.add(DomainElementTypes.OutputText_1603006);
			types.add(DomainElementTypes.CheckBox_1603007);
			types.add(DomainElementTypes.Tree_1603016);
			return types;
		}
		if (editPart instanceof LayerHolderLayerHolderChildrenCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(DomainElementTypes.Button_1603017);
			types.add(DomainElementTypes.Label_1603005);
			types.add(DomainElementTypes.DropDownSelection_1603002);
			types.add(DomainElementTypes.Table_1603008);
			types.add(DomainElementTypes.LayerHolder_1603019);
			types.add(DomainElementTypes.InputText_1603004);
			types.add(DomainElementTypes.OutputText_1603006);
			types.add(DomainElementTypes.CheckBox_1603007);
			types.add(DomainElementTypes.Tree_1603016);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				DomainDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.DomainModelingAssistantProviderMessage);
		dialog.setTitle(Messages.DomainModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
