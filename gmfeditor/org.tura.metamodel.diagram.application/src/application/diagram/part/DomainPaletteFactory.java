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
		paletteContainer.add(createApplicationUILayer6CreationTool());
		paletteContainer.add(createApplicationUIPackage7CreationTool());
		paletteContainer.add(createCanvas8CreationTool());
		paletteContainer.add(createTabCanvas9CreationTool());
		paletteContainer.add(createTabPage10CreationTool());
		paletteContainer.add(createViewPort11CreationTool());
		paletteContainer.add(createViewPortTrigger12CreationTool());
		paletteContainer.add(createWindow13CreationTool());
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
	private ToolEntry createApplicationUILayer6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUILayer6CreationTool_title,
				Messages.ApplicationUILayer6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUILayer_802003));
		entry.setId("createApplicationUILayer6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUILayer_802003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUIPackage7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUIPackage7CreationTool_title,
				Messages.ApplicationUIPackage7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setId("createApplicationUIPackage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas8CreationTool_title,
				Messages.Canvas8CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas9CreationTool_title,
				Messages.TabCanvas9CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage10CreationTool_title,
				Messages.TabPage10CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort11CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort11CreationTool_title,
				Messages.ViewPort11CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger12CreationTool_title,
				Messages.ViewPortTrigger12CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow13CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window13CreationTool_title,
				Messages.Window13CreationTool_desc, null, null) {
		};
		entry.setId("createWindow13CreationTool"); //$NON-NLS-1$
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
