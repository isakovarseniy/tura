/*
 * 
 */
package typesrepository.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typesrepository.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createCanvas1CreationTool());
		paletteContainer.add(createPackage2CreationTool());
		paletteContainer.add(createTabCanvas3CreationTool());
		paletteContainer.add(createTabPage4CreationTool());
		paletteContainer.add(createTypes5CreationTool());
		paletteContainer.add(createViewPort6CreationTool());
		paletteContainer.add(createViewPortTrigger7CreationTool());
		paletteContainer.add(createWindow8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas1CreationTool_title,
				Messages.Canvas1CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package2CreationTool_title,
				Messages.Package2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Package_203002));
		entry.setId("createPackage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Package_203002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas3CreationTool_title,
				Messages.TabCanvas3CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage4CreationTool_title,
				Messages.TabPage4CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Types5CreationTool_title,
				Messages.Types5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Types_202001));
		entry.setId("createTypes5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Types_202001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort6CreationTool_title,
				Messages.ViewPort6CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger7CreationTool_title,
				Messages.ViewPortTrigger7CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window8CreationTool_title,
				Messages.Window8CreationTool_desc, null, null) {
		};
		entry.setId("createWindow8CreationTool"); //$NON-NLS-1$
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
