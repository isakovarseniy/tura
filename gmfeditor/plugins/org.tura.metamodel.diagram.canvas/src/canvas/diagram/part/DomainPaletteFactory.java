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
package canvas.diagram.part;

import java.util.ArrayList;

import java.util.Collections;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createDate4CreationTool());
		paletteContainer.add(createDropDownSelection5CreationTool());
		paletteContainer.add(createImage6CreationTool());
		paletteContainer.add(createInputText7CreationTool());
		paletteContainer.add(createLabel8CreationTool());
		paletteContainer.add(createLayerHolder9CreationTool());
		paletteContainer.add(createMenu10CreationTool());
		paletteContainer.add(createMessageElement11CreationTool());
		paletteContainer.add(createOutputText12CreationTool());
		paletteContainer.add(createPassword13CreationTool());
		paletteContainer.add(createTable14CreationTool());
		paletteContainer.add(createTree15CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createLinkToLabel1CreationTool());
		paletteContainer.add(createLinkToMessage2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Button_1603017);
		types.add(DomainElementTypes.Button_1603023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/button.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.CheckBox_1603007);
		types.add(DomainElementTypes.CheckBox_1603015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/checkbox.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Column_1603024);
		types.add(DomainElementTypes.Column_1603026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc, types);
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/column.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDate4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Date_1603029);
		types.add(DomainElementTypes.Date_1603031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Date4CreationTool_title,
				Messages.Date4CreationTool_desc, types);
		entry.setId("createDate4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/date.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropDownSelection5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.DropDownSelection_1603002);
		types.add(DomainElementTypes.DropDownSelection_1603010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.DropDownSelection5CreationTool_title,
				Messages.DropDownSelection5CreationTool_desc, types);
		entry.setId("createDropDownSelection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/dropdownselection.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImage6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Image_1603028);
		types.add(DomainElementTypes.Image_1603030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Image6CreationTool_title,
				Messages.Image6CreationTool_desc, types);
		entry.setId("createImage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/image.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputText7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.InputText_1603004);
		types.add(DomainElementTypes.InputText_1603012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InputText7CreationTool_title,
				Messages.InputText7CreationTool_desc, types);
		entry.setId("createInputText7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/inputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Label_1603005);
		types.add(DomainElementTypes.Label_1603013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Label8CreationTool_title,
				Messages.Label8CreationTool_desc, types);
		entry.setId("createLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/label.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayerHolder9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.LayerHolder_1602003);
		types.add(DomainElementTypes.LayerHolder_1603020);
		types.add(DomainElementTypes.LayerHolder_1603019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.LayerHolder9CreationTool_title,
				Messages.LayerHolder9CreationTool_desc, types);
		entry.setId("createLayerHolder9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/layerholder.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenu10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Menu_1603036);
		types.add(DomainElementTypes.Menu_1603037);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Menu10CreationTool_title,
				Messages.Menu10CreationTool_desc, types);
		entry.setId("createMenu10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/menu.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageElement11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.MessageElement_1603034);
		types.add(DomainElementTypes.MessageElement_1603035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MessageElement11CreationTool_title,
				Messages.MessageElement11CreationTool_desc, types);
		entry.setId("createMessageElement11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/label.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputText12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.OutputText_1603006);
		types.add(DomainElementTypes.OutputText_1603014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.OutputText12CreationTool_title,
				Messages.OutputText12CreationTool_desc, types);
		entry.setId("createOutputText12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/outputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassword13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Password_1603032);
		types.add(DomainElementTypes.Password_1603033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Password13CreationTool_title,
				Messages.Password13CreationTool_desc, types);
		entry.setId("createPassword13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/inputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Table_1603008);
		types.add(DomainElementTypes.Table_1603021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Table14CreationTool_title,
				Messages.Table14CreationTool_desc, types);
		entry.setId("createTable14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/table.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTree15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Tree_1603022);
		types.add(DomainElementTypes.Tree_1603016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Tree15CreationTool_title,
				Messages.Tree15CreationTool_desc, types);
		entry.setId("createTree15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/tree.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkToLabel1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.LinkToLabel1CreationTool_title,
				Messages.LinkToLabel1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.LinkToLabel_1604002));
		entry.setId("createLinkToLabel1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.LinkToLabel_1604002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkToMessage2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.LinkToMessage2CreationTool_title,
				Messages.LinkToMessage2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.LinkToMessage_1604001));
		entry.setId("createLinkToMessage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.LinkToMessage_1604001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
