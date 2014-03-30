/*
 * 
 */
package infarastructure.diagram.part;

import infarastructure.diagram.providers.DomainElementTypes;

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
		paletteContainer
				.add(createApplicationInfrastructureLayer1CreationTool());
		paletteContainer.add(createDatacenter2CreationTool());
		paletteContainer.add(createHub3CreationTool());
		paletteContainer.add(createInfrastructureLayer4CreationTool());
		paletteContainer.add(createIngredient5CreationTool());
		paletteContainer.add(createJavaMapper6CreationTool());
		paletteContainer.add(createRouter7CreationTool());
		paletteContainer.add(createServer8CreationTool());
		paletteContainer.add(createServerClaster9CreationTool());
		paletteContainer.add(createStorage10CreationTool());
		paletteContainer.add(createSubsystem11CreationTool());
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
	private ToolEntry createDatacenter2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Datacenter2CreationTool_title,
				Messages.Datacenter2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Datacenter_1202002));
		entry.setId("createDatacenter2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Datacenter_1202002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Hub3CreationTool_title,
				Messages.Hub3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Hub_1203005));
		entry.setId("createHub3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Hub_1203005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfrastructureLayer4CreationTool_title,
				Messages.InfrastructureLayer4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setId("createInfrastructureLayer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIngredient5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Ingredient5CreationTool_title,
				Messages.Ingredient5CreationTool_desc, null, null) {
		};
		entry.setId("createIngredient5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaMapper6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.JavaMapper6CreationTool_title,
				Messages.JavaMapper6CreationTool_desc, null, null) {
		};
		entry.setId("createJavaMapper6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Router7CreationTool_title,
				Messages.Router7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Router_1203004));
		entry.setId("createRouter7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Router_1203004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Server8CreationTool_title,
				Messages.Server8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Server_1203003));
		entry.setId("createServer8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Server_1203003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServerClaster9CreationTool_title,
				Messages.ServerClaster9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ServerClaster_1203007));
		entry.setId("createServerClaster9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ServerClaster_1203007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Storage10CreationTool_title,
				Messages.Storage10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Storage_1203006));
		entry.setId("createStorage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Storage_1203006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subsystem11CreationTool_title,
				Messages.Subsystem11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Subsystem_1203001));
		entry.setId("createSubsystem11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Subsystem_1203001));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_1204008));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_1204008));
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
						.singletonList(DomainElementTypes.RecipeDeloyment_1204006));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_1204006));
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
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_1204003));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_1204003));
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
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_1204004));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_1204004));
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
						.singletonList(DomainElementTypes.RecipeInfrastructures_1204005));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_1204005));
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
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_1204007));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_1204007));
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
				Collections.singletonList(DomainElementTypes.Relation_1204002));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_1204002));
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
						.singletonList(DomainElementTypes.TypeExtension_1204001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_1204001));
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
