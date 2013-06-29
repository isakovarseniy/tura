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
		paletteContainer.add(createPackage1CreationTool());
		paletteContainer.add(createPrimitive2CreationTool());
		paletteContainer.add(createTypes3CreationTool());
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
	private ToolEntry createPackage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package1CreationTool_title,
				Messages.Package1CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Package_3001));
		entry.setId("createPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.Package_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Primitive2CreationTool_title,
				Messages.Primitive2CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Primitive_3002));
		entry.setId("createPrimitive2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TuraElementTypes
				.getImageDescriptor(TuraElementTypes.Primitive_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Types3CreationTool_title,
				Messages.Types3CreationTool_desc,
				Collections.singletonList(TuraElementTypes.Types_2001));
		entry.setId("createTypes3CreationTool"); //$NON-NLS-1$
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
