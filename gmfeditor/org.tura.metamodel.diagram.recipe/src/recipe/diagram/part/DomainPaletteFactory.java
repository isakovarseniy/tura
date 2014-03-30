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
		paletteContainer
				.add(createApplicationInfrastructureLayer1CreationTool());
		paletteContainer.add(createConfiguration2CreationTool());
		paletteContainer.add(createDatacenter3CreationTool());
		paletteContainer.add(createDeploymentSequence4CreationTool());
		paletteContainer.add(createHub5CreationTool());
		paletteContainer.add(createInfrastructure6CreationTool());
		paletteContainer.add(createInfrastructureLayer7CreationTool());
		paletteContainer.add(createIngredient8CreationTool());
		paletteContainer.add(createJavaComponent9CreationTool());
		paletteContainer.add(createModelMapper10CreationTool());
		paletteContainer.add(createProperty11CreationTool());
		paletteContainer.add(createQuery12CreationTool());
		paletteContainer.add(createRecipe13CreationTool());
		paletteContainer.add(createRouter14CreationTool());
		paletteContainer.add(createServer15CreationTool());
		paletteContainer.add(createServerClaster16CreationTool());
		paletteContainer.add(createStorage17CreationTool());
		paletteContainer.add(createSubsystem18CreationTool());
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
	private ToolEntry createConfiguration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Configuration2CreationTool_title,
				Messages.Configuration2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Configuration_302002));
		entry.setId("createConfiguration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Configuration_302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatacenter3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Datacenter3CreationTool_title,
				Messages.Datacenter3CreationTool_desc, null, null) {
		};
		entry.setId("createDatacenter3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentSequence4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeploymentSequence4CreationTool_title,
				Messages.DeploymentSequence4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentSequence_302004));
		entry.setId("createDeploymentSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentSequence_302004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Hub5CreationTool_title,
				Messages.Hub5CreationTool_desc, null, null) {
		};
		entry.setId("createHub5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructure6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Infrastructure6CreationTool_title,
				Messages.Infrastructure6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Infrastructure_302003));
		entry.setId("createInfrastructure6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Infrastructure_302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InfrastructureLayer7CreationTool_title,
				Messages.InfrastructureLayer7CreationTool_desc, null, null) {
		};
		entry.setId("createInfrastructureLayer7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIngredient8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ingredient8CreationTool_title,
				Messages.Ingredient8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Ingredient_303001));
		entry.setId("createIngredient8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Ingredient_303001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaComponent9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaComponent9CreationTool_title,
				Messages.JavaComponent9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaComponent_303002));
		entry.setId("createJavaComponent9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaComponent_303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelMapper10CreationTool_title,
				Messages.ModelMapper10CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ModelMapper_303003));
		entry.setId("createModelMapper10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelMapper_303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property11CreationTool_title,
				Messages.Property11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Property_303005));
		entry.setId("createProperty11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Property_303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuery12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Query12CreationTool_title,
				Messages.Query12CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Query_303004));
		entry.setId("createQuery12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Query_303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Recipe13CreationTool_title,
				Messages.Recipe13CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Recipe_302001));
		entry.setId("createRecipe13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Recipe_302001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter14CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Router14CreationTool_title,
				Messages.Router14CreationTool_desc, null, null) {
		};
		entry.setId("createRouter14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer15CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Server15CreationTool_title,
				Messages.Server15CreationTool_desc, null, null) {
		};
		entry.setId("createServer15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster16CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ServerClaster16CreationTool_title,
				Messages.ServerClaster16CreationTool_desc, null, null) {
		};
		entry.setId("createServerClaster16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage17CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Storage17CreationTool_title,
				Messages.Storage17CreationTool_desc, null, null) {
		};
		entry.setId("createStorage17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem18CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Subsystem18CreationTool_title,
				Messages.Subsystem18CreationTool_desc, null, null) {
		};
		entry.setId("createSubsystem18CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createDeloyment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deloyment2CreationTool_title,
				Messages.Deloyment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeloyment_304005));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_304005));
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
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_304002));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_304002));
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
	private ToolEntry createInfrastructures5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures5CreationTool_title,
				Messages.Infrastructures5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_304004));
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
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_304006));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_304006));
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
				Collections.singletonList(DomainElementTypes.Relation_304010));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_304010));
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
						.singletonList(DomainElementTypes.TypeExtension_304001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
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
