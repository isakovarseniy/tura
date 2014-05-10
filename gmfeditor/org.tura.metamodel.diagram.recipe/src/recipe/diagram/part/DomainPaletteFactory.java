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
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createConfiguration2CreationTool());
		paletteContainer.add(createDeploymentSequence3CreationTool());
		paletteContainer.add(createInfrastructure4CreationTool());
		paletteContainer.add(createIngredient5CreationTool());
		paletteContainer.add(createJavaComponent6CreationTool());
		paletteContainer.add(createJavaScriptMapper7CreationTool());
		paletteContainer.add(createModelMapper8CreationTool());
		paletteContainer.add(createProperty9CreationTool());
		paletteContainer.add(createQuery10CreationTool());
		paletteContainer.add(createRecipe11CreationTool());
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
		paletteContainer.add(createDeployment1CreationTool());
		paletteContainer.add(createInfrastructures2CreationTool());
		paletteContainer.add(createRecipeConfig3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper1CreationTool_title,
				Messages.CSSMapper1CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper1CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createDeploymentSequence3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeploymentSequence3CreationTool_title,
				Messages.DeploymentSequence3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentSequence_302004));
		entry.setId("createDeploymentSequence3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentSequence_302004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructure4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Infrastructure4CreationTool_title,
				Messages.Infrastructure4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Infrastructure_302003));
		entry.setId("createInfrastructure4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Infrastructure_302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIngredient5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ingredient5CreationTool_title,
				Messages.Ingredient5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Ingredient_303001));
		entry.setId("createIngredient5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Ingredient_303001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaComponent6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaComponent6CreationTool_title,
				Messages.JavaComponent6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaComponent_303002));
		entry.setId("createJavaComponent6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaComponent_303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper7CreationTool_title,
				Messages.JavaScriptMapper7CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelMapper8CreationTool_title,
				Messages.ModelMapper8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ModelMapper_303003));
		entry.setId("createModelMapper8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelMapper_303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property9CreationTool_title,
				Messages.Property9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Property_303005));
		entry.setId("createProperty9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Property_303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuery10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Query10CreationTool_title,
				Messages.Query10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Query_303004));
		entry.setId("createQuery10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Query_303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Recipe11CreationTool_title,
				Messages.Recipe11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Recipe_302001));
		entry.setId("createRecipe11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Recipe_302001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeployment1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deployment1CreationTool_title,
				Messages.Deployment1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeployment_304013));
		entry.setId("createDeployment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeployment_304013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures2CreationTool_title,
				Messages.Infrastructures2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setId("createInfrastructures2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig3CreationTool_title,
				Messages.RecipeConfig3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_304006));
		entry.setId("createRecipeConfig3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_304006));
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
