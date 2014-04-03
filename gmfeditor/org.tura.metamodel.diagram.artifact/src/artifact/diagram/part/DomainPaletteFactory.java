/*
 * 
 */
package artifact.diagram.part;

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

import artifact.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createArtifact1CreationTool());
		paletteContainer.add(createConfigVariable2CreationTool());
		paletteContainer.add(createModelQuery3CreationTool());
		paletteContainer.add(createSpecifier4CreationTool());
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
		paletteContainer.add(createInfrastructureConnection5CreationTool());
		paletteContainer.add(createInfrastructures6CreationTool());
		paletteContainer.add(createRecipeConfig7CreationTool());
		paletteContainer.add(createRelation8CreationTool());
		paletteContainer.add(createTypeExtension9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtifact1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artifact1CreationTool_title,
				Messages.Artifact1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Artifact_702001));
		entry.setId("createArtifact1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Artifact_702001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfigVariable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConfigVariable2CreationTool_title,
				Messages.ConfigVariable2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ConfigVariable_703004));
		entry.setId("createConfigVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigVariable_703004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelQuery3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelQuery3CreationTool_title,
				Messages.ModelQuery3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ModelQuery_703005));
		entry.setId("createModelQuery3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelQuery_703005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecifier4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Specifier4CreationTool_title,
				Messages.Specifier4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Specifier_703003));
		entry.setId("createSpecifier4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Specifier_703003));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_704003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_704003));
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
						.singletonList(DomainElementTypes.RecipeDeloyment_704006));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_704006));
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
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_704007));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_704007));
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
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_704009));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_704009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureConnection5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InfrastructureConnection5CreationTool_title,
				Messages.InfrastructureConnection5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureConnection_704012));
		entry.setId("createInfrastructureConnection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureConnection_704012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures6CreationTool_title,
				Messages.Infrastructures6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_704005));
		entry.setId("createInfrastructures6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_704005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig7CreationTool_title,
				Messages.RecipeConfig7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_704004));
		entry.setId("createRecipeConfig7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_704004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation8CreationTool_title,
				Messages.Relation8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_704011));
		entry.setId("createRelation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_704011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension9CreationTool_title,
				Messages.TypeExtension9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_704001));
		entry.setId("createTypeExtension9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_704001));
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
