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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createApplicationInfrastructureLayer1CreationTool());
		paletteContainer.add(createApplicationMapper2CreationTool());
		paletteContainer.add(createApplicationMappers3CreationTool());
		paletteContainer.add(createApplicationMessages4CreationTool());
		paletteContainer.add(createApplicationRecipe5CreationTool());
		paletteContainer.add(createApplicationRecipes6CreationTool());
		paletteContainer.add(createApplicationRole7CreationTool());
		paletteContainer.add(createApplicationStyle8CreationTool());
		paletteContainer.add(createApplicationUILayer9CreationTool());
		paletteContainer.add(createApplicationUIPackage10CreationTool());
		paletteContainer.add(createStylesPackage11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationInfrastructureLayer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationInfrastructureLayer1CreationTool_title,
				Messages.ApplicationInfrastructureLayer1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationInfrastructureLayer_802004));
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
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationMapper2CreationTool_title,
				Messages.ApplicationMapper2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationMapper_803002));
		entry.setId("createApplicationMapper2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationMapper_803002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMappers3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationMappers3CreationTool_title,
				Messages.ApplicationMappers3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationMappers_802002));
		entry.setId("createApplicationMappers3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationMappers_802002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMessages4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationMessages4CreationTool_title,
				Messages.ApplicationMessages4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationMessages_802007));
		entry.setId("createApplicationMessages4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationMessages_802007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipe5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationRecipe5CreationTool_title,
				Messages.ApplicationRecipe5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationRecipe_803001));
		entry.setId("createApplicationRecipe5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationRecipe_803001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipes6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationRecipes6CreationTool_title,
				Messages.ApplicationRecipes6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationRecipes_802001));
		entry.setId("createApplicationRecipes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationRecipes_802001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRole7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationRole7CreationTool_title,
				Messages.ApplicationRole7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationRole_802006));
		entry.setId("createApplicationRole7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationRole_802006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationStyle8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationStyle8CreationTool_title,
				Messages.ApplicationStyle8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationStyle_802005));
		entry.setId("createApplicationStyle8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationStyle_802005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUILayer9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationUILayer9CreationTool_title,
				Messages.ApplicationUILayer9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationUILayer_802003));
		entry.setId("createApplicationUILayer9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationUILayer_802003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUIPackage10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ApplicationUIPackage10CreationTool_title,
				Messages.ApplicationUIPackage10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setId("createApplicationUIPackage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStylesPackage11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.StylesPackage11CreationTool_title,
				Messages.StylesPackage11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.StylesPackage_803004));
		entry.setId("createStylesPackage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.StylesPackage_803004));
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
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
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
