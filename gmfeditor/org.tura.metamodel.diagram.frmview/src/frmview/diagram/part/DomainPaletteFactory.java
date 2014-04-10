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
		paletteContainer.add(createArtificialField1CreationTool());
		paletteContainer.add(createCanvas2CreationTool());
		paletteContainer.add(createCreateTrigger3CreationTool());
		paletteContainer.add(createDataControl4CreationTool());
		paletteContainer.add(createDeleteTrigger5CreationTool());
		paletteContainer.add(createInsertTrigger6CreationTool());
		paletteContainer.add(createPOSTCreateTrigger7CreationTool());
		paletteContainer.add(createPOSTQueryTrigger8CreationTool());
		paletteContainer.add(createPREDeleteTrigger9CreationTool());
		paletteContainer.add(createPREFormTrigger10CreationTool());
		paletteContainer.add(createPREInsertTrigger11CreationTool());
		paletteContainer.add(createPREQueryTrigger12CreationTool());
		paletteContainer.add(createPREUpdateTrigger13CreationTool());
		paletteContainer.add(createRoot14CreationTool());
		paletteContainer.add(createSearchTrigger15CreationTool());
		paletteContainer.add(createTabCanvas16CreationTool());
		paletteContainer.add(createTabPage17CreationTool());
		paletteContainer.add(createUpdateTrigger18CreationTool());
		paletteContainer.add(createViewPort19CreationTool());
		paletteContainer.add(createViewPortTrigger20CreationTool());
		paletteContainer.add(createWindow21CreationTool());
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
		paletteContainer.add(createMainCanvas1CreationTool());
		paletteContainer.add(createRelation2CreationTool());
		paletteContainer.add(createTabPagesInheritance3CreationTool());
		paletteContainer.add(createViewInheritance4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtificialField1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ArtificialField1CreationTool_title,
				Messages.ArtificialField1CreationTool_desc, null, null) {
		};
		entry.setId("createArtificialField1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Canvas2CreationTool_title,
				Messages.Canvas2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Canvas_1302003));
		entry.setId("createCanvas2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Canvas_1302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateTrigger3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CreateTrigger3CreationTool_title,
				Messages.CreateTrigger3CreationTool_desc, null, null) {
		};
		entry.setId("createCreateTrigger3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataControl4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DataControl4CreationTool_title,
				Messages.DataControl4CreationTool_desc, null, null) {
		};
		entry.setId("createDataControl4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteTrigger5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DeleteTrigger5CreationTool_title,
				Messages.DeleteTrigger5CreationTool_desc, null, null) {
		};
		entry.setId("createDeleteTrigger5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertTrigger6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InsertTrigger6CreationTool_title,
				Messages.InsertTrigger6CreationTool_desc, null, null) {
		};
		entry.setId("createInsertTrigger6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTCreateTrigger7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.POSTCreateTrigger7CreationTool_title,
				Messages.POSTCreateTrigger7CreationTool_desc, null, null) {
		};
		entry.setId("createPOSTCreateTrigger7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTQueryTrigger8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.POSTQueryTrigger8CreationTool_title,
				Messages.POSTQueryTrigger8CreationTool_desc, null, null) {
		};
		entry.setId("createPOSTQueryTrigger8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREDeleteTrigger9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PREDeleteTrigger9CreationTool_title,
				Messages.PREDeleteTrigger9CreationTool_desc, null, null) {
		};
		entry.setId("createPREDeleteTrigger9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREFormTrigger10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PREFormTrigger10CreationTool_title,
				Messages.PREFormTrigger10CreationTool_desc, null, null) {
		};
		entry.setId("createPREFormTrigger10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREInsertTrigger11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PREInsertTrigger11CreationTool_title,
				Messages.PREInsertTrigger11CreationTool_desc, null, null) {
		};
		entry.setId("createPREInsertTrigger11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREQueryTrigger12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PREQueryTrigger12CreationTool_title,
				Messages.PREQueryTrigger12CreationTool_desc, null, null) {
		};
		entry.setId("createPREQueryTrigger12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREUpdateTrigger13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PREUpdateTrigger13CreationTool_title,
				Messages.PREUpdateTrigger13CreationTool_desc, null, null) {
		};
		entry.setId("createPREUpdateTrigger13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoot14CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Root14CreationTool_title,
				Messages.Root14CreationTool_desc, null, null) {
		};
		entry.setId("createRoot14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchTrigger15CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SearchTrigger15CreationTool_title,
				Messages.SearchTrigger15CreationTool_desc, null, null) {
		};
		entry.setId("createSearchTrigger15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabCanvas16CreationTool_title,
				Messages.TabCanvas16CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabCanvas_1302001));
		entry.setId("createTabCanvas16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabCanvas_1302001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TabPage17CreationTool_title,
				Messages.TabPage17CreationTool_desc,
				Collections.singletonList(DomainElementTypes.TabPage_1302002));
		entry.setId("createTabPage17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabPage_1302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateTrigger18CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.UpdateTrigger18CreationTool_title,
				Messages.UpdateTrigger18CreationTool_desc, null, null) {
		};
		entry.setId("createUpdateTrigger18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort19CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort19CreationTool_title,
				Messages.ViewPort19CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger20CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger20CreationTool_title,
				Messages.ViewPortTrigger20CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Window21CreationTool_title,
				Messages.Window21CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Window_1302004));
		entry.setId("createWindow21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Window_1302004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMainCanvas1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MainCanvas1CreationTool_title,
				Messages.MainCanvas1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.WindowMainCanvas_1304004));
		entry.setId("createMainCanvas1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.WindowMainCanvas_1304004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation2CreationTool_title,
				Messages.Relation2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_1304003));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_1304003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPagesInheritance3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TabPagesInheritance3CreationTool_title,
				Messages.TabPagesInheritance3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TabPagesInheritance_1304002));
		entry.setId("createTabPagesInheritance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TabPagesInheritance_1304002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewInheritance4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ViewInheritance4CreationTool_title,
				Messages.ViewInheritance4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ViewInheritance_1304001));
		entry.setId("createViewInheritance4CreationTool"); //$NON-NLS-1$
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
