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
	private ToolEntry createDatacenter1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Datacenter1CreationTool_title,
				Messages.Datacenter1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Datacenter_1202002));
		entry.setId("createDatacenter1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/datacenter.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Hub2CreationTool_title,
				Messages.Hub2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Hub_1203005));
		entry.setId("createHub2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/hub.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfrastructureLayer3CreationTool_title,
				Messages.InfrastructureLayer3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setId("createInfrastructureLayer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/infra.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Router4CreationTool_title,
				Messages.Router4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Router_1203004));
		entry.setId("createRouter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/router.png")); //$NON-NLS-1$
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
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Server5CreationTool_title,
				Messages.Server5CreationTool_desc, types);
		entry.setId("createServer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/server.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServerClaster6CreationTool_title,
				Messages.ServerClaster6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ServerClaster_1203007));
		entry.setId("createServerClaster6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/serverclaster.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Storage7CreationTool_title,
				Messages.Storage7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Storage_1203006));
		entry.setId("createStorage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subsystem8CreationTool_title,
				Messages.Subsystem8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Subsystem_1203001));
		entry.setId("createSubsystem8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/subsystem.png")); //$NON-NLS-1$
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
	private ToolEntry createInfrastructureConnection5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InfrastructureConnection5CreationTool_title,
				Messages.InfrastructureConnection5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setId("createInfrastructureConnection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureConnection_1204009));
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
						.singletonList(DomainElementTypes.RecipeInfrastructures_1204005));
		entry.setId("createInfrastructures6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_1204005));
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
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_1204007));
		entry.setId("createRecipeConfig7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_1204007));
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
				Collections.singletonList(DomainElementTypes.Relation_1204002));
		entry.setId("createRelation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_1204002));
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
						.singletonList(DomainElementTypes.TypeExtension_1204001));
		entry.setId("createTypeExtension9CreationTool"); //$NON-NLS-1$
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
