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
		paletteContainer
				.add(createApplicationInfrastructureLayer1CreationTool());
		paletteContainer.add(createArtificialField2CreationTool());
		paletteContainer.add(createCreateTrigger3CreationTool());
		paletteContainer.add(createDataControl4CreationTool());
		paletteContainer.add(createDatacenter5CreationTool());
		paletteContainer.add(createDeleteTrigger6CreationTool());
		paletteContainer.add(createHub7CreationTool());
		paletteContainer.add(createInfrastructureLayer8CreationTool());
		paletteContainer.add(createInsertTrigger9CreationTool());
		paletteContainer.add(createPOSTCreateTrigger10CreationTool());
		paletteContainer.add(createPOSTQueryTrigger11CreationTool());
		paletteContainer.add(createPREDeleteTrigger12CreationTool());
		paletteContainer.add(createPREFormTrigger13CreationTool());
		paletteContainer.add(createPREInsertTrigger14CreationTool());
		paletteContainer.add(createPREQueryTrigger15CreationTool());
		paletteContainer.add(createPREUpdateTrigger16CreationTool());
		paletteContainer.add(createRoot17CreationTool());
		paletteContainer.add(createRouter18CreationTool());
		paletteContainer.add(createSearchTrigger19CreationTool());
		paletteContainer.add(createServer20CreationTool());
		paletteContainer.add(createServerClaster21CreationTool());
		paletteContainer.add(createStorage22CreationTool());
		paletteContainer.add(createSubsystem23CreationTool());
		paletteContainer.add(createUpdateTrigger24CreationTool());
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
	private ToolEntry createApplicationInfrastructureLayer1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationInfrastructureLayer1CreationTool_title,
				Messages.ApplicationInfrastructureLayer1CreationTool_desc,
				null, null) {
		};
		entry.setId("createApplicationInfrastructureLayer1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtificialField2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArtificialField2CreationTool_title,
				Messages.ArtificialField2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ArtificialField_1103008));
		entry.setId("createArtificialField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ArtificialField_1103008));
		entry.setLargeIcon(entry.getSmallIcon());
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
	private ToolEntry createDatacenter5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Datacenter5CreationTool_title,
				Messages.Datacenter5CreationTool_desc, null, null) {
		};
		entry.setId("createDatacenter5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteTrigger6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeleteTrigger6CreationTool_title,
				Messages.DeleteTrigger6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeleteTrigger_1103015));
		entry.setId("createDeleteTrigger6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeleteTrigger_1103015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Hub7CreationTool_title,
				Messages.Hub7CreationTool_desc, null, null) {
		};
		entry.setId("createHub7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InfrastructureLayer8CreationTool_title,
				Messages.InfrastructureLayer8CreationTool_desc, null, null) {
		};
		entry.setId("createInfrastructureLayer8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertTrigger9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InsertTrigger9CreationTool_title,
				Messages.InsertTrigger9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InsertTrigger_1103013));
		entry.setId("createInsertTrigger9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InsertTrigger_1103013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTCreateTrigger10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTCreateTrigger10CreationTool_title,
				Messages.POSTCreateTrigger10CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setId("createPOSTCreateTrigger10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTCreateTrigger_1103011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOSTQueryTrigger11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POSTQueryTrigger11CreationTool_title,
				Messages.POSTQueryTrigger11CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setId("createPOSTQueryTrigger11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.POSTQueryTrigger_1103003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREDeleteTrigger12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREDeleteTrigger12CreationTool_title,
				Messages.PREDeleteTrigger12CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setId("createPREDeleteTrigger12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREDeleteTrigger_1103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREFormTrigger13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREFormTrigger13CreationTool_title,
				Messages.PREFormTrigger13CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREFormTrigger_1103001));
		entry.setId("createPREFormTrigger13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREFormTrigger_1103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREInsertTrigger14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREInsertTrigger14CreationTool_title,
				Messages.PREInsertTrigger14CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setId("createPREInsertTrigger14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREInsertTrigger_1103004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREQueryTrigger15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREQueryTrigger15CreationTool_title,
				Messages.PREQueryTrigger15CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setId("createPREQueryTrigger15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREQueryTrigger_1103002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPREUpdateTrigger16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PREUpdateTrigger16CreationTool_title,
				Messages.PREUpdateTrigger16CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setId("createPREUpdateTrigger16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.PREUpdateTrigger_1103010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoot17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Root17CreationTool_title,
				Messages.Root17CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Root_1102001));
		entry.setId("createRoot17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Root_1102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter18CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Router18CreationTool_title,
				Messages.Router18CreationTool_desc, null, null) {
		};
		entry.setId("createRouter18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchTrigger19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SearchTrigger19CreationTool_title,
				Messages.SearchTrigger19CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.SearchTrigger_1103016));
		entry.setId("createSearchTrigger19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SearchTrigger_1103016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer20CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Server20CreationTool_title,
				Messages.Server20CreationTool_desc, null, null) {
		};
		entry.setId("createServer20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster21CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ServerClaster21CreationTool_title,
				Messages.ServerClaster21CreationTool_desc, null, null) {
		};
		entry.setId("createServerClaster21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage22CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Storage22CreationTool_title,
				Messages.Storage22CreationTool_desc, null, null) {
		};
		entry.setId("createStorage22CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem23CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Subsystem23CreationTool_title,
				Messages.Subsystem23CreationTool_desc, null, null) {
		};
		entry.setId("createSubsystem23CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateTrigger24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UpdateTrigger24CreationTool_title,
				Messages.UpdateTrigger24CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.UpdateTrigger_1103014));
		entry.setId("createUpdateTrigger24CreationTool"); //$NON-NLS-1$
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
