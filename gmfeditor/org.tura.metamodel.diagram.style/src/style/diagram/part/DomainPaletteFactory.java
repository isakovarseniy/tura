/*
 * 
 */
package style.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import style.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createJavaScriptMapper2CreationTool());
		paletteContainer.add(createRoleMapper3CreationTool());
		paletteContainer.add(createStyleLibrary4CreationTool());
		paletteContainer.add(createStyleSet5CreationTool());
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
	private ToolEntry createJavaScriptMapper2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper2CreationTool_title,
				Messages.JavaScriptMapper2CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.RoleMapper3CreationTool_title,
				Messages.RoleMapper3CreationTool_desc, null, null) {
		};
		entry.setId("createRoleMapper3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStyleLibrary4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StyleLibrary4CreationTool_title,
				Messages.StyleLibrary4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.StyleLibrary_1502001));
		entry.setId("createStyleLibrary4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.StyleLibrary_1502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStyleSet5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StyleSet5CreationTool_title,
				Messages.StyleSet5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.StyleSet_1503001));
		entry.setId("createStyleSet5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.StyleSet_1503001));
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
