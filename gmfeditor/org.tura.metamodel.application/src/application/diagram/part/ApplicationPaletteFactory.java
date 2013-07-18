/*
 * 
 */
package application.diagram.part;

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

import application.diagram.providers.ApplicationElementTypes;

/**
 * @generated
 */
public class ApplicationPaletteFactory {

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
		paletteContainer.add(createApplicationMapper1CreationTool());
		paletteContainer.add(createApplicationMappers2CreationTool());
		paletteContainer.add(createApplicationRecipe3CreationTool());
		paletteContainer.add(createApplicationRecipes4CreationTool());
		paletteContainer.add(createComponent5CreationTool());
		paletteContainer.add(createConfiguration6CreationTool());
		paletteContainer.add(createJavaMapper7CreationTool());
		paletteContainer.add(createModelMapper8CreationTool());
		paletteContainer.add(createProperty9CreationTool());
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
	private ToolEntry createApplicationMapper1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationMapper1CreationTool_title,
				Messages.ApplicationMapper1CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationMapper1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMappers2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationMappers2CreationTool_title,
				Messages.ApplicationMappers2CreationTool_desc,
				Collections
						.singletonList(ApplicationElementTypes.ApplicationMappers_2002));
		entry.setId("createApplicationMappers2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ApplicationElementTypes
				.getImageDescriptor(ApplicationElementTypes.ApplicationMappers_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipe3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRecipe3CreationTool_title,
				Messages.ApplicationRecipe3CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRecipe3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipes4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRecipes4CreationTool_title,
				Messages.ApplicationRecipes4CreationTool_desc,
				Collections
						.singletonList(ApplicationElementTypes.ApplicationRecipes_2001));
		entry.setId("createApplicationRecipes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ApplicationElementTypes
				.getImageDescriptor(ApplicationElementTypes.ApplicationRecipes_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Component5CreationTool_title,
				Messages.Component5CreationTool_desc, null, null) {
		};
		entry.setId("createComponent5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfiguration6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Configuration6CreationTool_title,
				Messages.Configuration6CreationTool_desc, null, null) {
		};
		entry.setId("createConfiguration6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaMapper7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.JavaMapper7CreationTool_title,
				Messages.JavaMapper7CreationTool_desc, null, null) {
		};
		entry.setId("createJavaMapper7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ModelMapper8CreationTool_title,
				Messages.ModelMapper8CreationTool_desc, null, null) {
		};
		entry.setId("createModelMapper8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Property9CreationTool_title,
				Messages.Property9CreationTool_desc, null, null) {
		};
		entry.setId("createProperty9CreationTool"); //$NON-NLS-1$
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
						.singletonList(ApplicationElementTypes.ConfigurationConfigExtension_4002));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ApplicationElementTypes
				.getImageDescriptor(ApplicationElementTypes.ConfigurationConfigExtension_4002));
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
						.singletonList(ApplicationElementTypes.RecipeRecipeConfig_4001));
		entry.setId("createRecipeConfig2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ApplicationElementTypes
				.getImageDescriptor(ApplicationElementTypes.RecipeRecipeConfig_4001));
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
