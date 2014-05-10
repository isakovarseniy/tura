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
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
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
		paletteContainer.add(createApplicationMapper2CreationTool());
		paletteContainer.add(createApplicationMappers3CreationTool());
		paletteContainer.add(createApplicationRecipe4CreationTool());
		paletteContainer.add(createApplicationRecipes5CreationTool());
		paletteContainer.add(createApplicationRole6CreationTool());
		paletteContainer.add(createApplicationStyle7CreationTool());
		paletteContainer.add(createApplicationUILayer8CreationTool());
		paletteContainer.add(createApplicationUIPackage9CreationTool());
		paletteContainer.add(createJavaScript10CreationTool());
		paletteContainer.add(createStylesPackage11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationInfrastructureLayer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationInfrastructureLayer1CreationTool_title,
				Messages.ApplicationInfrastructureLayer1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationInfrastructureLayer_802004));
		entry.setId("createApplicationInfrastructureLayer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationInfrastructureLayer_802004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMapper2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationMapper2CreationTool_title,
				Messages.ApplicationMapper2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationMapper_803002));
		entry.setId("createApplicationMapper2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationMapper_803002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMappers3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationMappers3CreationTool_title,
				Messages.ApplicationMappers3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationMappers_802002));
		entry.setId("createApplicationMappers3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationMappers_802002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipe4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRecipe4CreationTool_title,
				Messages.ApplicationRecipe4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationRecipe_803001));
		entry.setId("createApplicationRecipe4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationRecipe_803001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipes5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRecipes5CreationTool_title,
				Messages.ApplicationRecipes5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationRecipes_802001));
		entry.setId("createApplicationRecipes5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationRecipes_802001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRole6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRole6CreationTool_title,
				Messages.ApplicationRole6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationRole_802006));
		entry.setId("createApplicationRole6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationRole_802006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationStyle7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationStyle7CreationTool_title,
				Messages.ApplicationStyle7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationStyle_802005));
		entry.setId("createApplicationStyle7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationStyle_802005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUILayer8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUILayer8CreationTool_title,
				Messages.ApplicationUILayer8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUILayer_802003));
		entry.setId("createApplicationUILayer8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUILayer_802003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUIPackage9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUIPackage9CreationTool_title,
				Messages.ApplicationUIPackage9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setId("createApplicationUIPackage9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScript10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScript10CreationTool_title,
				Messages.JavaScript10CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScript10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStylesPackage11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StylesPackage11CreationTool_title,
				Messages.StylesPackage11CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.StylesPackage_803004));
		entry.setId("createStylesPackage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.StylesPackage_803004));
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
}
