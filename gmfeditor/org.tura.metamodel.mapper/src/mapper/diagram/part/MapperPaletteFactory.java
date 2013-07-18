/*
 * 
 */
package mapper.diagram.part;

import java.util.Collections;
import java.util.List;

import mapper.diagram.providers.MapperElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MapperPaletteFactory {

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
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createEnumAttribute2CreationTool());
		paletteContainer.add(createEnumarator3CreationTool());
		paletteContainer.add(createJavaMapper4CreationTool());
		paletteContainer.add(createOperation5CreationTool());
		paletteContainer.add(createReturnValue6CreationTool());
		paletteContainer.add(createType7CreationTool());
		paletteContainer.add(createTypeReference8CreationTool());
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
		paletteContainer.add(createTypeExtension1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, null, null) {
		};
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EnumAttribute2CreationTool_title,
				Messages.EnumAttribute2CreationTool_desc, null, null) {
		};
		entry.setId("createEnumAttribute2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Enumarator3CreationTool_title,
				Messages.Enumarator3CreationTool_desc, null, null) {
		};
		entry.setId("createEnumarator3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaMapper4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JavaMapper4CreationTool_title,
				Messages.JavaMapper4CreationTool_desc,
				Collections.singletonList(MapperElementTypes.JavaMapper_2002));
		entry.setId("createJavaMapper4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MapperElementTypes
				.getImageDescriptor(MapperElementTypes.JavaMapper_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Operation5CreationTool_title,
				Messages.Operation5CreationTool_desc, null, null) {
		};
		entry.setId("createOperation5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ReturnValue6CreationTool_title,
				Messages.ReturnValue6CreationTool_desc, null, null) {
		};
		entry.setId("createReturnValue6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Type7CreationTool_title,
				Messages.Type7CreationTool_desc, null, null) {
		};
		entry.setId("createType7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.TypeReference8CreationTool_title,
				Messages.TypeReference8CreationTool_desc, null, null) {
		};
		entry.setId("createTypeReference8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension1CreationTool_title,
				Messages.TypeExtension1CreationTool_desc,
				Collections
						.singletonList(MapperElementTypes.TypeExtension_4001));
		entry.setId("createTypeExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MapperElementTypes
				.getImageDescriptor(MapperElementTypes.TypeExtension_4001));
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
