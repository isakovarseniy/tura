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
		paletteContainer.add(createCanvas1CreationTool());
		paletteContainer.add(createTabCanvas2CreationTool());
		paletteContainer.add(createTabPage3CreationTool());
		paletteContainer.add(createViewPort4CreationTool());
		paletteContainer.add(createViewPortTrigger5CreationTool());
		paletteContainer.add(createWindow6CreationTool());
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
	private ToolEntry createCanvas1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Canvas1CreationTool_title,
				Messages.Canvas1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Canvas_1302003));
		entry.setId("createCanvas1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Canvas_1302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabCanvas2CreationTool_title,
				Messages.TabCanvas2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabCanvas_1302008));
		entry.setId("createTabCanvas2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabCanvas_1302008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabPage3CreationTool_title,
				Messages.TabPage3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabPage_1302002));
		entry.setId("createTabPage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabPage_1302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewPort4CreationTool_title,
				Messages.ViewPort4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ViewPort_1303003));
		entry.setId("createViewPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewPort_1303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewPortTrigger5CreationTool_title,
				Messages.ViewPortTrigger5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ViewPortTrigger_1303002));
		entry.setId("createViewPortTrigger5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ViewPortTrigger_1303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Window6CreationTool_title,
				Messages.Window6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Window_1302007));
		entry.setId("createWindow6CreationTool"); //$NON-NLS-1$
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
