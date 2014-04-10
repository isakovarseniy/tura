/*
 * 
 */
package mapper.diagram.part;

import java.util.Collections;
import java.util.List;

import mapper.diagram.providers.DomainElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createJavaMapper2CreationTool());
		paletteContainer.add(createTabCanvas3CreationTool());
		paletteContainer.add(createTabPage4CreationTool());
		paletteContainer.add(createViewPort5CreationTool());
		paletteContainer.add(createViewPortTrigger6CreationTool());
		paletteContainer.add(createWindow7CreationTool());
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
	private ToolEntry createJavaMapper2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaMapper2CreationTool_title,
				Messages.JavaMapper2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JavaMapper_402001));
		entry.setId("createJavaMapper2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaMapper_402001));
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
	private ToolEntry createViewPort5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort5CreationTool_title,
				Messages.ViewPort5CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger6CreationTool_title,
				Messages.ViewPortTrigger6CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window7CreationTool_title,
				Messages.Window7CreationTool_desc, null, null) {
		};
		entry.setId("createWindow7CreationTool"); //$NON-NLS-1$
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
