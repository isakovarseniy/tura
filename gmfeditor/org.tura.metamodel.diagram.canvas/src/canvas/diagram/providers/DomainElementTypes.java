/*
 * 
 */
package canvas.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.InputText2EditPart;
import canvas.diagram.edit.parts.InputTextEditPart;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.edit.parts.LabelEditPart;
import canvas.diagram.edit.parts.LayerHolder2EditPart;
import canvas.diagram.edit.parts.LayerHolder3EditPart;
import canvas.diagram.edit.parts.LayerHolderEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import canvas.diagram.part.DomainDiagramEditorPlugin;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CanvasView_1601000 = getElementType("org.tura.metamodel.diagram.canvas.CanvasView_1601000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayerHolder_1602003 = getElementType("org.tura.metamodel.diagram.canvas.LayerHolder_1602003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_1603017 = getElementType("org.tura.metamodel.diagram.canvas.Button_1603017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropDownSelection_1603002 = getElementType("org.tura.metamodel.diagram.canvas.DropDownSelection_1603002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayerHolder_1603019 = getElementType("org.tura.metamodel.diagram.canvas.LayerHolder_1603019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputText_1603004 = getElementType("org.tura.metamodel.diagram.canvas.InputText_1603004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Label_1603005 = getElementType("org.tura.metamodel.diagram.canvas.Label_1603005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputText_1603006 = getElementType("org.tura.metamodel.diagram.canvas.OutputText_1603006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckBox_1603007 = getElementType("org.tura.metamodel.diagram.canvas.CheckBox_1603007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Table_1603008 = getElementType("org.tura.metamodel.diagram.canvas.Table_1603008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Column_1603024 = getElementType("org.tura.metamodel.diagram.canvas.Column_1603024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_1603023 = getElementType("org.tura.metamodel.diagram.canvas.Button_1603023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropDownSelection_1603010 = getElementType("org.tura.metamodel.diagram.canvas.DropDownSelection_1603010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayerHolder_1603020 = getElementType("org.tura.metamodel.diagram.canvas.LayerHolder_1603020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tree_1603016 = getElementType("org.tura.metamodel.diagram.canvas.Tree_1603016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputText_1603012 = getElementType("org.tura.metamodel.diagram.canvas.InputText_1603012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Label_1603013 = getElementType("org.tura.metamodel.diagram.canvas.Label_1603013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputText_1603014 = getElementType("org.tura.metamodel.diagram.canvas.OutputText_1603014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckBox_1603015 = getElementType("org.tura.metamodel.diagram.canvas.CheckBox_1603015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Table_1603021 = getElementType("org.tura.metamodel.diagram.canvas.Table_1603021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tree_1603022 = getElementType("org.tura.metamodel.diagram.canvas.Tree_1603022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return DomainDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CanvasView_1601000,
					DomainPackage.eINSTANCE.getCanvasView());

			elements.put(LayerHolder_1602003,
					DomainPackage.eINSTANCE.getLayerHolder());

			elements.put(Button_1603017, DomainPackage.eINSTANCE.getButton());

			elements.put(Label_1603005, DomainPackage.eINSTANCE.getLabel());

			elements.put(DropDownSelection_1603002,
					DomainPackage.eINSTANCE.getDropDownSelection());

			elements.put(Table_1603008, DomainPackage.eINSTANCE.getTable());

			elements.put(Column_1603024, DomainPackage.eINSTANCE.getColumn());

			elements.put(Button_1603023, DomainPackage.eINSTANCE.getButton());

			elements.put(Label_1603013, DomainPackage.eINSTANCE.getLabel());

			elements.put(DropDownSelection_1603010,
					DomainPackage.eINSTANCE.getDropDownSelection());

			elements.put(Table_1603021, DomainPackage.eINSTANCE.getTable());

			elements.put(LayerHolder_1603020,
					DomainPackage.eINSTANCE.getLayerHolder());

			elements.put(LayerHolder_1603019,
					DomainPackage.eINSTANCE.getLayerHolder());

			elements.put(InputText_1603004,
					DomainPackage.eINSTANCE.getInputText());

			elements.put(OutputText_1603006,
					DomainPackage.eINSTANCE.getOutputText());

			elements.put(CheckBox_1603007,
					DomainPackage.eINSTANCE.getCheckBox());

			elements.put(Tree_1603016, DomainPackage.eINSTANCE.getTree());

			elements.put(InputText_1603012,
					DomainPackage.eINSTANCE.getInputText());

			elements.put(OutputText_1603014,
					DomainPackage.eINSTANCE.getOutputText());

			elements.put(CheckBox_1603015,
					DomainPackage.eINSTANCE.getCheckBox());

			elements.put(Tree_1603022, DomainPackage.eINSTANCE.getTree());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CanvasView_1601000);
			KNOWN_ELEMENT_TYPES.add(LayerHolder_1602003);
			KNOWN_ELEMENT_TYPES.add(Button_1603017);
			KNOWN_ELEMENT_TYPES.add(Label_1603005);
			KNOWN_ELEMENT_TYPES.add(DropDownSelection_1603002);
			KNOWN_ELEMENT_TYPES.add(Table_1603008);
			KNOWN_ELEMENT_TYPES.add(Column_1603024);
			KNOWN_ELEMENT_TYPES.add(Button_1603023);
			KNOWN_ELEMENT_TYPES.add(Label_1603013);
			KNOWN_ELEMENT_TYPES.add(DropDownSelection_1603010);
			KNOWN_ELEMENT_TYPES.add(Table_1603021);
			KNOWN_ELEMENT_TYPES.add(LayerHolder_1603020);
			KNOWN_ELEMENT_TYPES.add(LayerHolder_1603019);
			KNOWN_ELEMENT_TYPES.add(InputText_1603004);
			KNOWN_ELEMENT_TYPES.add(OutputText_1603006);
			KNOWN_ELEMENT_TYPES.add(CheckBox_1603007);
			KNOWN_ELEMENT_TYPES.add(Tree_1603016);
			KNOWN_ELEMENT_TYPES.add(InputText_1603012);
			KNOWN_ELEMENT_TYPES.add(OutputText_1603014);
			KNOWN_ELEMENT_TYPES.add(CheckBox_1603015);
			KNOWN_ELEMENT_TYPES.add(Tree_1603022);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CanvasViewEditPart.VISUAL_ID:
			return CanvasView_1601000;
		case LayerHolderEditPart.VISUAL_ID:
			return LayerHolder_1602003;
		case ButtonEditPart.VISUAL_ID:
			return Button_1603017;
		case LabelEditPart.VISUAL_ID:
			return Label_1603005;
		case DropDownSelectionEditPart.VISUAL_ID:
			return DropDownSelection_1603002;
		case TableEditPart.VISUAL_ID:
			return Table_1603008;
		case ColumnEditPart.VISUAL_ID:
			return Column_1603024;
		case Button2EditPart.VISUAL_ID:
			return Button_1603023;
		case Label2EditPart.VISUAL_ID:
			return Label_1603013;
		case DropDownSelection2EditPart.VISUAL_ID:
			return DropDownSelection_1603010;
		case Table2EditPart.VISUAL_ID:
			return Table_1603021;
		case LayerHolder2EditPart.VISUAL_ID:
			return LayerHolder_1603020;
		case LayerHolder3EditPart.VISUAL_ID:
			return LayerHolder_1603019;
		case InputTextEditPart.VISUAL_ID:
			return InputText_1603004;
		case OutputTextEditPart.VISUAL_ID:
			return OutputText_1603006;
		case CheckBoxEditPart.VISUAL_ID:
			return CheckBox_1603007;
		case TreeEditPart.VISUAL_ID:
			return Tree_1603016;
		case InputText2EditPart.VISUAL_ID:
			return InputText_1603012;
		case OutputText2EditPart.VISUAL_ID:
			return OutputText_1603014;
		case CheckBox2EditPart.VISUAL_ID:
			return CheckBox_1603015;
		case Tree2EditPart.VISUAL_ID:
			return Tree_1603022;
		}
		return null;
	}

}
