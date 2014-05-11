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
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createJavaMapper2CreationTool());
		paletteContainer.add(createJavaScriptMapper3CreationTool());
		paletteContainer.add(createRoleMapper4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CSSMapper1CreationTool_title,
				Messages.CSSMapper1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.CSSMapper_402004));
		entry.setId("createCSSMapper1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.CSSMapper_402004));
		entry.setLargeIcon(entry.getSmallIcon());
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
	private ToolEntry createJavaScriptMapper3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaScriptMapper3CreationTool_title,
				Messages.JavaScriptMapper3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaScriptMapper_402003));
		entry.setId("createJavaScriptMapper3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaScriptMapper_402003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RoleMapper4CreationTool_title,
				Messages.RoleMapper4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.RoleMapper_402005));
		entry.setId("createRoleMapper4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RoleMapper_402005));
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
