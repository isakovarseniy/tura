/*
 * 
 */
package recipe.diagram.part;

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

import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipePaletteFactory {

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
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createConfiguration2CreationTool());
		paletteContainer.add(createModelMapper3CreationTool());
		paletteContainer.add(createProperty4CreationTool());
		paletteContainer.add(createRecipe5CreationTool());
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
		paletteContainer.add(createRecipeConfig2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RecipeElementTypes.Component_3004);
		types.add(RecipeElementTypes.Component_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc, types);
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes
				.getImageDescriptor(RecipeElementTypes.Component_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfiguration2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Configuration2CreationTool_title,
				Messages.Configuration2CreationTool_desc, null, null) {
		};
		entry.setId("createConfiguration2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelMapper3CreationTool_title,
				Messages.ModelMapper3CreationTool_desc,
				Collections.singletonList(RecipeElementTypes.ModelMapper_3003));
		entry.setId("createModelMapper3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes
				.getImageDescriptor(RecipeElementTypes.ModelMapper_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Property4CreationTool_title,
				Messages.Property4CreationTool_desc, null, null) {
		};
		entry.setId("createProperty4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Recipe5CreationTool_title,
				Messages.Recipe5CreationTool_desc,
				Collections.singletonList(RecipeElementTypes.Recipe_2004));
		entry.setId("createRecipe5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes
				.getImageDescriptor(RecipeElementTypes.Recipe_2004));
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
						.singletonList(RecipeElementTypes.ConfigurationConfigExtension_4002));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes
				.getImageDescriptor(RecipeElementTypes.ConfigurationConfigExtension_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig2CreationTool_title,
				Messages.RecipeConfig2CreationTool_desc,
				Collections
						.singletonList(RecipeElementTypes.RecipeRecipeConfig_4001));
		entry.setId("createRecipeConfig2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RecipeElementTypes
				.getImageDescriptor(RecipeElementTypes.RecipeRecipeConfig_4001));
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
