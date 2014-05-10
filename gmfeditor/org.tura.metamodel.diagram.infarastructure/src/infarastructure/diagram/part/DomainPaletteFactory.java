/*
 * 
 */
package infarastructure.diagram.part;

import infarastructure.diagram.providers.DomainElementTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

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
		paletteContainer.add(createApplicationRole1CreationTool());
		paletteContainer.add(createApplicationStyle2CreationTool());
		paletteContainer.add(createCSSMapper3CreationTool());
		paletteContainer.add(createDatacenter4CreationTool());
		paletteContainer.add(createHub5CreationTool());
		paletteContainer.add(createInfrastructureLayer6CreationTool());
		paletteContainer.add(createJavaScriptMapper7CreationTool());
		paletteContainer.add(createRouter8CreationTool());
		paletteContainer.add(createServer9CreationTool());
		paletteContainer.add(createServerClaster10CreationTool());
		paletteContainer.add(createStorage11CreationTool());
		paletteContainer.add(createSubsystem12CreationTool());
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
		paletteContainer.add(createInfrastructureConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRole1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRole1CreationTool_title,
				Messages.ApplicationRole1CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRole1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationStyle2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationStyle2CreationTool_title,
				Messages.ApplicationStyle2CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationStyle2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper3CreationTool_title,
				Messages.CSSMapper3CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatacenter4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Datacenter4CreationTool_title,
				Messages.Datacenter4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Datacenter_1202002));
		entry.setId("createDatacenter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/datacenter.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Hub5CreationTool_title,
				Messages.Hub5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Hub_1203005));
		entry.setId("createHub5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/hub.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfrastructureLayer6CreationTool_title,
				Messages.InfrastructureLayer6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setId("createInfrastructureLayer6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/infra.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper7CreationTool_title,
				Messages.JavaScriptMapper7CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Router8CreationTool_title,
				Messages.Router8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Router_1203004));
		entry.setId("createRouter8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/router.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Server_1203003);
		types.add(DomainElementTypes.Server_1203008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Server9CreationTool_title,
				Messages.Server9CreationTool_desc, types);
		entry.setId("createServer9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/server.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServerClaster10CreationTool_title,
				Messages.ServerClaster10CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ServerClaster_1203007));
		entry.setId("createServerClaster10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/serverclaster.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Storage11CreationTool_title,
				Messages.Storage11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Storage_1203006));
		entry.setId("createStorage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subsystem12CreationTool_title,
				Messages.Subsystem12CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Subsystem_1203001));
		entry.setId("createSubsystem12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/subsystem.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InfrastructureConnection1CreationTool_title,
				Messages.InfrastructureConnection1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setId("createInfrastructureConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
