/*
 * 
 */
package recipe.diagram.part;

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

import recipe.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createConfiguration1CreationTool());
		paletteContainer.add(createDeploymentSequence2CreationTool());
		paletteContainer.add(createInfrastructure3CreationTool());
		paletteContainer.add(createIngredient4CreationTool());
		paletteContainer.add(createJavaComponent5CreationTool());
		paletteContainer.add(createModelMapper6CreationTool());
		paletteContainer.add(createProperty7CreationTool());
		paletteContainer.add(createQuery8CreationTool());
		paletteContainer.add(createRecipe9CreationTool());
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
		paletteContainer.add(createDeployment2CreationTool());
		paletteContainer.add(createDeploymentComponent3CreationTool());
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
	private ToolEntry createConfiguration1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Configuration1CreationTool_title,
				Messages.Configuration1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Configuration_302002));
		entry.setId("createConfiguration1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Configuration_302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentSequence2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeploymentSequence2CreationTool_title,
				Messages.DeploymentSequence2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentSequence_302004));
		entry.setId("createDeploymentSequence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentSequence_302004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructure3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Infrastructure3CreationTool_title,
				Messages.Infrastructure3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Infrastructure_302003));
		entry.setId("createInfrastructure3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Infrastructure_302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIngredient4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ingredient4CreationTool_title,
				Messages.Ingredient4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Ingredient_303001));
		entry.setId("createIngredient4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Ingredient_303001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaComponent5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaComponent5CreationTool_title,
				Messages.JavaComponent5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaComponent_303002));
		entry.setId("createJavaComponent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaComponent_303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelMapper6CreationTool_title,
				Messages.ModelMapper6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ModelMapper_303003));
		entry.setId("createModelMapper6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelMapper_303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property7CreationTool_title,
				Messages.Property7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Property_303005));
		entry.setId("createProperty7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Property_303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuery8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Query8CreationTool_title,
				Messages.Query8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Query_303004));
		entry.setId("createQuery8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Query_303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Recipe9CreationTool_title,
				Messages.Recipe9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Recipe_302001));
		entry.setId("createRecipe9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Recipe_302001));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_304007));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_304007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeployment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deployment2CreationTool_title,
				Messages.Deployment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeployment_304013));
		entry.setId("createDeployment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeployment_304013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentComponent3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeploymentComponent3CreationTool_title,
				Messages.DeploymentComponent3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponentDeploymentComponent_304012));
		entry.setId("createDeploymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeploymentComponent_304012));
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
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_304008));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_304008));
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
						.singletonList(DomainElementTypes.InfrastructureConnection_304011));
		entry.setId("createInfrastructureConnection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureConnection_304011));
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
						.singletonList(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setId("createInfrastructures6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_304004));
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
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_304006));
		entry.setId("createRecipeConfig7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_304006));
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
				Collections.singletonList(DomainElementTypes.Relation_304010));
		entry.setId("createRelation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_304010));
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
						.singletonList(DomainElementTypes.TypeExtension_304001));
		entry.setId("createTypeExtension9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_304001));
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
