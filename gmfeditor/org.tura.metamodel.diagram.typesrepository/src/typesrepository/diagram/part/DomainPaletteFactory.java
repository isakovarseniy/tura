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
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createJavaScriptMapper2CreationTool());
		paletteContainer.add(createPackage3CreationTool());
		paletteContainer.add(createRoleMapper4CreationTool());
		paletteContainer.add(createTypes5CreationTool());
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
	private ToolEntry createPackage3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package3CreationTool_title,
				Messages.Package3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Package_203002));
		entry.setId("createPackage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Package_203002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.RoleMapper4CreationTool_title,
				Messages.RoleMapper4CreationTool_desc, null, null) {
		};
		entry.setId("createRoleMapper4CreationTool"); //$NON-NLS-1$
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
