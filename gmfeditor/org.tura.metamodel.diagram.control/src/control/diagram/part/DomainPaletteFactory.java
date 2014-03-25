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
		paletteContainer.add(createCreateTrigger2CreationTool());
		paletteContainer.add(createDataControl3CreationTool());
		paletteContainer.add(createDeleteTrigger4CreationTool());
		paletteContainer.add(createInsertTrigger5CreationTool());
		paletteContainer.add(createPOSTCreateTrigger6CreationTool());
		paletteContainer.add(createPOSTQueryTrigger7CreationTool());
		paletteContainer.add(createPREDeleteTrigger8CreationTool());
		paletteContainer.add(createPREFormTrigger9CreationTool());
		paletteContainer.add(createPREInsertTrigger10CreationTool());
		paletteContainer.add(createPREQueryTrigger11CreationTool());
		paletteContainer.add(createPREUpdateTrigger12CreationTool());
		paletteContainer.add(createRoot13CreationTool());
		paletteContainer.add(createSearchTrigger14CreationTool());
		paletteContainer.add(createUpdateTrigger15CreationTool());
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
		paletteContainer.add(createConfigExtension1CreationTool());
		paletteContainer.add(createDeloyment2CreationTool());
		paletteContainer.add(createDeplymentComponent3CreationTool());
		paletteContainer.add(createFirstStep4CreationTool());
		paletteContainer.add(createInfrastructures5CreationTool());
		paletteContainer.add(createRecipeConfig6CreationTool());
		paletteContainer.add(createRelation7CreationTool());
		paletteContainer.add(createTypeExtension8CreationTool());
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
	private ToolEntry createCreateTrigger2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateTrigger2CreationTool_title,
				Messages.CreateTrigger2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.CreateTrigger_1103012));
		entry.setId("createCreateTrigger2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.CreateTrigger_1103012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataControl3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataControl3CreationTool_title,
				Messages.DataControl3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DataControl_1102002));
		entry.setId("createDataControl3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DataControl_1102002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteTrigger4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeleteTrigger4CreationTool_title,
				Messages.DeleteTrigger4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeleteTrigger_1103015));
		entry.setId("createDeleteTrigger4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeleteTrigger_1103015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertTrigger5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InsertTrigger5CreationTool_title,
				Messages.InsertTrigger5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InsertTrigger_1103013));
		entry.setId("createInsertTrigger5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InsertTrigger_1103013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTCreateTrigger6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTCreateTrigger6CreationTool_title,
				Messages.POSTCreateTrigger6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setId("createPOSTCreateTrigger6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTQueryTrigger7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTQueryTrigger7CreationTool_title,
				Messages.POSTQueryTrigger7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setId("createPOSTQueryTrigger7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREDeleteTrigger8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREDeleteTrigger8CreationTool_title,
				Messages.PREDeleteTrigger8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setId("createPREDeleteTrigger8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREFormTrigger9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREFormTrigger9CreationTool_title,
				Messages.PREFormTrigger9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREFormTrigger_1103001));
		entry.setId("createPREFormTrigger9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREFormTrigger_1103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREInsertTrigger10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREInsertTrigger10CreationTool_title,
				Messages.PREInsertTrigger10CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setId("createPREInsertTrigger10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREQueryTrigger11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREQueryTrigger11CreationTool_title,
				Messages.PREQueryTrigger11CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setId("createPREQueryTrigger11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREUpdateTrigger12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREUpdateTrigger12CreationTool_title,
				Messages.PREUpdateTrigger12CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setId("createPREUpdateTrigger12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoot13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Root13CreationTool_title,
				Messages.Root13CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Root_1102001));
		entry.setId("createRoot13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Root_1102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchTrigger14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SearchTrigger14CreationTool_title,
				Messages.SearchTrigger14CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.SearchTrigger_1103016));
		entry.setId("createSearchTrigger14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SearchTrigger_1103016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateTrigger15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UpdateTrigger15CreationTool_title,
				Messages.UpdateTrigger15CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.UpdateTrigger_1103014));
		entry.setId("createUpdateTrigger15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.UpdateTrigger_1103014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfigExtension1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConfigExtension1CreationTool_title,
				Messages.ConfigExtension1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_1104007));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_1104007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeloyment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deloyment2CreationTool_title,
				Messages.Deloyment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeloyment_1104005));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_1104005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeplymentComponent3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeplymentComponent3CreationTool_title,
				Messages.DeplymentComponent3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_1104002));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_1104002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFirstStep4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FirstStep4CreationTool_title,
				Messages.FirstStep4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_1104003));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_1104003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures5CreationTool_title,
				Messages.Infrastructures5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_1104004));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_1104004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig6CreationTool_title,
				Messages.RecipeConfig6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_1104006));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_1104006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation7CreationTool_title,
				Messages.Relation7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_1104009));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_1104009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension8CreationTool_title,
				Messages.TypeExtension8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_1104001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_1104001));
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
