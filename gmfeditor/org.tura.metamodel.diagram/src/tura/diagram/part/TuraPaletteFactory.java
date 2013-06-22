/*
 * 
 */
package tura.diagram.part;

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

import tura.diagram.providers.TuraElementTypes;

/**
 * @generated
 */
public class TuraPaletteFactory {

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
		paletteContainer.add(createOperation2CreationTool());
		paletteContainer.add(createPackage3CreationTool());
		paletteContainer.add(createPrimitive4CreationTool());
		paletteContainer.add(createReturnValue5CreationTool());
		paletteContainer.add(createType6CreationTool());
		paletteContainer.add(createTypeReference7CreationTool());
		paletteContainer.add(createTypes8CreationTool());
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
	private ToolEntry createOperation2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Operation2CreationTool_title,
				Messages.Operation2CreationTool_desc, null, null) {
		};
		entry.setId("createOperation2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package3CreationTool_title,
				Messages.Package3CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Package_3001));
		entry.setId("createPackage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.Package_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Primitive4CreationTool_title,
				Messages.Primitive4CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Primitive_3002));
		entry.setId("createPrimitive4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.Primitive_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ReturnValue5CreationTool_title,
				Messages.ReturnValue5CreationTool_desc, null, null) {
		};
		entry.setId("createReturnValue5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Type6CreationTool_title,
				Messages.Type6CreationTool_desc, null, null) {
		};
		entry.setId("createType6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.TypeReference7CreationTool_title,
				Messages.TypeReference7CreationTool_desc, null, null) {
		};
		entry.setId("createTypeReference7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Types8CreationTool_title,
				Messages.Types8CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Types_2001));
		entry.setId("createTypes8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.Types_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension1CreationTool_title,
				Messages.TypeExtension1CreationTool_desc,
				Collections.singletonList(TuraElementTypes.TypeExtension_4001));
		entry.setId("createTypeExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.TypeExtension_4001));
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
