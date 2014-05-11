/*
 * 
 */
package roles.diagram.part;

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

import roles.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

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
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createGroup2CreationTool());
		paletteContainer.add(createJavaScriptMapper3CreationTool());
		paletteContainer.add(createRole4CreationTool());
		paletteContainer.add(createRoleMapper5CreationTool());
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
		paletteContainer.add(createGroup2Group1CreationTool());
		paletteContainer.add(createGroup2Role2CreationTool());
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
	private ToolEntry createGroup2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Group2CreationTool_title,
				Messages.Group2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Group_1402002));
		entry.setId("createGroup2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/group.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper3CreationTool_title,
				Messages.JavaScriptMapper3CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role4CreationTool_title,
				Messages.Role4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Role_1402001));
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/role.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.RoleMapper5CreationTool_title,
				Messages.RoleMapper5CreationTool_desc, null, null) {
		};
		entry.setId("createRoleMapper5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup2Group1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Group2Group1CreationTool_title,
				Messages.Group2Group1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.GroupGroup2Group_1404003));
		entry.setId("createGroup2Group1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.GroupGroup2Group_1404003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup2Role2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Group2Role2CreationTool_title,
				Messages.Group2Role2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.GroupGroup2Role_1404005));
		entry.setId("createGroup2Role2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.GroupGroup2Role_1404005));
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
