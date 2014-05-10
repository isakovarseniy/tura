/*
 * 
 */
package frmview.diagram.part;

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

import frmview.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createCanvas3CreationTool());
		paletteContainer.add(createJavaScript4CreationTool());
		paletteContainer.add(createTabCanvas5CreationTool());
		paletteContainer.add(createTabPage6CreationTool());
		paletteContainer.add(createViewArea7CreationTool());
		paletteContainer.add(createViewPort8CreationTool());
		paletteContainer.add(createViewPortTrigger9CreationTool());
		paletteContainer.add(createWindow10CreationTool());
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
		paletteContainer.add(createTabPagesInheritance1CreationTool());
		paletteContainer.add(createViewInheritance2CreationTool());
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
	private ToolEntry createCanvas3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Canvas3CreationTool_title,
				Messages.Canvas3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Canvas_1302003));
		entry.setId("createCanvas3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Canvas_1302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScript4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.JavaScript4CreationTool_title,
				Messages.JavaScript4CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScript4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabCanvas5CreationTool_title,
				Messages.TabCanvas5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabCanvas_1302008));
		entry.setId("createTabCanvas5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabCanvas_1302008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabPage6CreationTool_title,
				Messages.TabPage6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabPage_1302002));
		entry.setId("createTabPage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabPage_1302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewArea7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewArea7CreationTool_title,
				Messages.ViewArea7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ViewArea_1303005));
		entry.setId("createViewArea7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewArea_1303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewPort8CreationTool_title,
				Messages.ViewPort8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ViewPort_1303004));
		entry.setId("createViewPort8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewPort_1303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewPortTrigger9CreationTool_title,
				Messages.ViewPortTrigger9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ViewPortTrigger_1303002));
		entry.setId("createViewPortTrigger9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewPortTrigger_1303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Window10CreationTool_title,
				Messages.Window10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Window_1302007));
		entry.setId("createWindow10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Window_1302007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPagesInheritance1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TabPagesInheritance1CreationTool_title,
				Messages.TabPagesInheritance1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TabPagesInheritance_1304002));
		entry.setId("createTabPagesInheritance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabPagesInheritance_1304002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewInheritance2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ViewInheritance2CreationTool_title,
				Messages.ViewInheritance2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ViewInheritance_1304001));
		entry.setId("createViewInheritance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewInheritance_1304001));
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
