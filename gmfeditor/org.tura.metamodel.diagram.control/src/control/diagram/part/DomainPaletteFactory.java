/*
 * 
 */
package control.diagram.part;

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

import control.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createRelation1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtificialField1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArtificialField1CreationTool_title,
				Messages.ArtificialField1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ArtificialField_1103008));
		entry.setId("createArtificialField1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ArtificialField_1103008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas2CreationTool_title,
				Messages.Canvas2CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateTrigger3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateTrigger3CreationTool_title,
				Messages.CreateTrigger3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.CreateTrigger_1103012));
		entry.setId("createCreateTrigger3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.CreateTrigger_1103012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataControl4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataControl4CreationTool_title,
				Messages.DataControl4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DataControl_1102002));
		entry.setId("createDataControl4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DataControl_1102002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteTrigger5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeleteTrigger5CreationTool_title,
				Messages.DeleteTrigger5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeleteTrigger_1103015));
		entry.setId("createDeleteTrigger5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeleteTrigger_1103015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertTrigger6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InsertTrigger6CreationTool_title,
				Messages.InsertTrigger6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InsertTrigger_1103013));
		entry.setId("createInsertTrigger6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InsertTrigger_1103013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTCreateTrigger7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTCreateTrigger7CreationTool_title,
				Messages.POSTCreateTrigger7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setId("createPOSTCreateTrigger7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTQueryTrigger8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTQueryTrigger8CreationTool_title,
				Messages.POSTQueryTrigger8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setId("createPOSTQueryTrigger8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREDeleteTrigger9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREDeleteTrigger9CreationTool_title,
				Messages.PREDeleteTrigger9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setId("createPREDeleteTrigger9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREFormTrigger10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREFormTrigger10CreationTool_title,
				Messages.PREFormTrigger10CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREFormTrigger_1103001));
		entry.setId("createPREFormTrigger10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREFormTrigger_1103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREInsertTrigger11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREInsertTrigger11CreationTool_title,
				Messages.PREInsertTrigger11CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setId("createPREInsertTrigger11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREQueryTrigger12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREQueryTrigger12CreationTool_title,
				Messages.PREQueryTrigger12CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setId("createPREQueryTrigger12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREUpdateTrigger13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREUpdateTrigger13CreationTool_title,
				Messages.PREUpdateTrigger13CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setId("createPREUpdateTrigger13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoot14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Root14CreationTool_title,
				Messages.Root14CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Root_1102001));
		entry.setId("createRoot14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Root_1102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchTrigger15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SearchTrigger15CreationTool_title,
				Messages.SearchTrigger15CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.SearchTrigger_1103016));
		entry.setId("createSearchTrigger15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SearchTrigger_1103016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas16CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas16CreationTool_title,
				Messages.TabCanvas16CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage17CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage17CreationTool_title,
				Messages.TabPage17CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateTrigger18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UpdateTrigger18CreationTool_title,
				Messages.UpdateTrigger18CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.UpdateTrigger_1103014));
		entry.setId("createUpdateTrigger18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.UpdateTrigger_1103014));
		entry.setLargeIcon(entry.getSmallIcon());
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
		ToolEntry entry = new ToolEntry(Messages.Window21CreationTool_title,
				Messages.Window21CreationTool_desc, null, null) {
		};
		entry.setId("createWindow21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation1CreationTool_title,
				Messages.Relation1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_1104009));
		entry.setId("createRelation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_1104009));
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
