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
/*
 * 
 */
package canvas.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.Column2EditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.Date2EditPart;
import canvas.diagram.edit.parts.DateEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.Image2EditPart;
import canvas.diagram.edit.parts.ImageEditPart;
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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

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
	public static final IElementType InputText_1603004 = getElementType("org.tura.metamodel.diagram.canvas.InputText_1603004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputText_1603006 = getElementType("org.tura.metamodel.diagram.canvas.OutputText_1603006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropDownSelection_1603002 = getElementType("org.tura.metamodel.diagram.canvas.DropDownSelection_1603002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Date_1603029 = getElementType("org.tura.metamodel.diagram.canvas.Date_1603029"); //$NON-NLS-1$
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
	public static final IElementType InputText_1603012 = getElementType("org.tura.metamodel.diagram.canvas.InputText_1603012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputText_1603014 = getElementType("org.tura.metamodel.diagram.canvas.OutputText_1603014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropDownSelection_1603010 = getElementType("org.tura.metamodel.diagram.canvas.DropDownSelection_1603010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Date_1603031 = getElementType("org.tura.metamodel.diagram.canvas.Date_1603031"); //$NON-NLS-1$
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
	public static final IElementType Column_1603026 = getElementType("org.tura.metamodel.diagram.canvas.Column_1603026"); //$NON-NLS-1$
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
	public static final IElementType LayerHolder_1603019 = getElementType("org.tura.metamodel.diagram.canvas.LayerHolder_1603019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckBox_1603007 = getElementType("org.tura.metamodel.diagram.canvas.CheckBox_1603007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_1603028 = getElementType("org.tura.metamodel.diagram.canvas.Image_1603028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Label_1603005 = getElementType("org.tura.metamodel.diagram.canvas.Label_1603005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_1603017 = getElementType("org.tura.metamodel.diagram.canvas.Button_1603017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckBox_1603015 = getElementType("org.tura.metamodel.diagram.canvas.CheckBox_1603015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_1603030 = getElementType("org.tura.metamodel.diagram.canvas.Image_1603030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Label_1603013 = getElementType("org.tura.metamodel.diagram.canvas.Label_1603013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_1603023 = getElementType("org.tura.metamodel.diagram.canvas.Button_1603023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
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

			elements.put(InputText_1603004,
					DomainPackage.eINSTANCE.getInputText());

			elements.put(OutputText_1603006,
					DomainPackage.eINSTANCE.getOutputText());

			elements.put(DropDownSelection_1603002,
					DomainPackage.eINSTANCE.getDropDownSelection());

			elements.put(Date_1603029, DomainPackage.eINSTANCE.getDate());

			elements.put(Table_1603008, DomainPackage.eINSTANCE.getTable());

			elements.put(Column_1603024, DomainPackage.eINSTANCE.getColumn());

			elements.put(InputText_1603012,
					DomainPackage.eINSTANCE.getInputText());

			elements.put(OutputText_1603014,
					DomainPackage.eINSTANCE.getOutputText());

			elements.put(DropDownSelection_1603010,
					DomainPackage.eINSTANCE.getDropDownSelection());

			elements.put(Date_1603031, DomainPackage.eINSTANCE.getDate());

			elements.put(Table_1603021, DomainPackage.eINSTANCE.getTable());

			elements.put(Tree_1603022, DomainPackage.eINSTANCE.getTree());

			elements.put(Column_1603026, DomainPackage.eINSTANCE.getColumn());

			elements.put(LayerHolder_1603020,
					DomainPackage.eINSTANCE.getLayerHolder());

			elements.put(Tree_1603016, DomainPackage.eINSTANCE.getTree());

			elements.put(LayerHolder_1603019,
					DomainPackage.eINSTANCE.getLayerHolder());

			elements.put(CheckBox_1603007,
					DomainPackage.eINSTANCE.getCheckBox());

			elements.put(Image_1603028, DomainPackage.eINSTANCE.getImage());

			elements.put(Label_1603005, DomainPackage.eINSTANCE.getLabel());

			elements.put(Button_1603017, DomainPackage.eINSTANCE.getButton());

			elements.put(CheckBox_1603015,
					DomainPackage.eINSTANCE.getCheckBox());

			elements.put(Image_1603030, DomainPackage.eINSTANCE.getImage());

			elements.put(Label_1603013, DomainPackage.eINSTANCE.getLabel());

			elements.put(Button_1603023, DomainPackage.eINSTANCE.getButton());
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
			KNOWN_ELEMENT_TYPES.add(InputText_1603004);
			KNOWN_ELEMENT_TYPES.add(OutputText_1603006);
			KNOWN_ELEMENT_TYPES.add(DropDownSelection_1603002);
			KNOWN_ELEMENT_TYPES.add(Date_1603029);
			KNOWN_ELEMENT_TYPES.add(Table_1603008);
			KNOWN_ELEMENT_TYPES.add(Column_1603024);
			KNOWN_ELEMENT_TYPES.add(InputText_1603012);
			KNOWN_ELEMENT_TYPES.add(OutputText_1603014);
			KNOWN_ELEMENT_TYPES.add(DropDownSelection_1603010);
			KNOWN_ELEMENT_TYPES.add(Date_1603031);
			KNOWN_ELEMENT_TYPES.add(Table_1603021);
			KNOWN_ELEMENT_TYPES.add(Tree_1603022);
			KNOWN_ELEMENT_TYPES.add(Column_1603026);
			KNOWN_ELEMENT_TYPES.add(LayerHolder_1603020);
			KNOWN_ELEMENT_TYPES.add(Tree_1603016);
			KNOWN_ELEMENT_TYPES.add(LayerHolder_1603019);
			KNOWN_ELEMENT_TYPES.add(CheckBox_1603007);
			KNOWN_ELEMENT_TYPES.add(Image_1603028);
			KNOWN_ELEMENT_TYPES.add(Label_1603005);
			KNOWN_ELEMENT_TYPES.add(Button_1603017);
			KNOWN_ELEMENT_TYPES.add(CheckBox_1603015);
			KNOWN_ELEMENT_TYPES.add(Image_1603030);
			KNOWN_ELEMENT_TYPES.add(Label_1603013);
			KNOWN_ELEMENT_TYPES.add(Button_1603023);
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
		case InputTextEditPart.VISUAL_ID:
			return InputText_1603004;
		case OutputTextEditPart.VISUAL_ID:
			return OutputText_1603006;
		case DropDownSelectionEditPart.VISUAL_ID:
			return DropDownSelection_1603002;
		case DateEditPart.VISUAL_ID:
			return Date_1603029;
		case TableEditPart.VISUAL_ID:
			return Table_1603008;
		case ColumnEditPart.VISUAL_ID:
			return Column_1603024;
		case InputText2EditPart.VISUAL_ID:
			return InputText_1603012;
		case OutputText2EditPart.VISUAL_ID:
			return OutputText_1603014;
		case DropDownSelection2EditPart.VISUAL_ID:
			return DropDownSelection_1603010;
		case Date2EditPart.VISUAL_ID:
			return Date_1603031;
		case Table2EditPart.VISUAL_ID:
			return Table_1603021;
		case TreeEditPart.VISUAL_ID:
			return Tree_1603022;
		case Column2EditPart.VISUAL_ID:
			return Column_1603026;
		case LayerHolder2EditPart.VISUAL_ID:
			return LayerHolder_1603020;
		case Tree2EditPart.VISUAL_ID:
			return Tree_1603016;
		case LayerHolder3EditPart.VISUAL_ID:
			return LayerHolder_1603019;
		case CheckBoxEditPart.VISUAL_ID:
			return CheckBox_1603007;
		case ImageEditPart.VISUAL_ID:
			return Image_1603028;
		case LabelEditPart.VISUAL_ID:
			return Label_1603005;
		case ButtonEditPart.VISUAL_ID:
			return Button_1603017;
		case CheckBox2EditPart.VISUAL_ID:
			return CheckBox_1603015;
		case Image2EditPart.VISUAL_ID:
			return Image_1603030;
		case Label2EditPart.VISUAL_ID:
			return Label_1603013;
		case Button2EditPart.VISUAL_ID:
			return Button_1603023;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return canvas.diagram.providers.DomainElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return canvas.diagram.providers.DomainElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return canvas.diagram.providers.DomainElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
