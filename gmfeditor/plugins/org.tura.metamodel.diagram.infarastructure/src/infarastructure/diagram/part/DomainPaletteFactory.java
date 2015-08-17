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
package infarastructure.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import infarastructure.diagram.providers.DomainElementTypes;

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDatacenter1CreationTool());
		paletteContainer.add(createHub2CreationTool());
		paletteContainer.add(createInfrastructureLayer3CreationTool());
		paletteContainer.add(createRouter4CreationTool());
		paletteContainer.add(createServer5CreationTool());
		paletteContainer.add(createServerClaster6CreationTool());
		paletteContainer.add(createStorage7CreationTool());
		paletteContainer.add(createSubsystem8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInfrastructureConnection1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatacenter1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datacenter1CreationTool_title,
				Messages.Datacenter1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Datacenter_1202002));
		entry.setId("createDatacenter1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/datacenter.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHub2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Hub2CreationTool_title,
				Messages.Hub2CreationTool_desc, Collections.singletonList(DomainElementTypes.Hub_1203005));
		entry.setId("createHub2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/hub.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInfrastructureLayer3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InfrastructureLayer3CreationTool_title,
				Messages.InfrastructureLayer3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setId("createInfrastructureLayer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/infra.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRouter4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Router4CreationTool_title,
				Messages.Router4CreationTool_desc, Collections.singletonList(DomainElementTypes.Router_1203004));
		entry.setId("createRouter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/router.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServer5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Server_1203003);
		types.add(DomainElementTypes.Server_1203008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Server5CreationTool_title,
				Messages.Server5CreationTool_desc, types);
		entry.setId("createServer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/server.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServerClaster6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ServerClaster6CreationTool_title,
				Messages.ServerClaster6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ServerClaster_1203007));
		entry.setId("createServerClaster6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/serverclaster.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStorage7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Storage7CreationTool_title,
				Messages.Storage7CreationTool_desc, Collections.singletonList(DomainElementTypes.Storage_1203006));
		entry.setId("createStorage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSubsystem8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Subsystem8CreationTool_title,
				Messages.Subsystem8CreationTool_desc, Collections.singletonList(DomainElementTypes.Subsystem_1203001));
		entry.setId("createSubsystem8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/subsystem.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInfrastructureConnection1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InfrastructureConnection1CreationTool_title,
				Messages.InfrastructureConnection1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setId("createInfrastructureConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
