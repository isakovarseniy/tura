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
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typesrepository.diagram.providers.TypesrepositoryElementTypes;

/**
 * @generated
 */
public class TypesrepositoryPaletteFactory {

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
		paletteContainer.add(createBusinessPackage1CreationTool());
		paletteContainer.add(createPackage2CreationTool());
		paletteContainer.add(createPrimitive3CreationTool());
		paletteContainer.add(createTypes4CreationTool());
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
	private ToolEntry createBusinessPackage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BusinessPackage1CreationTool_title,
				Messages.BusinessPackage1CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.BusinessPackage_203002));
		entry.setId("createBusinessPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.BusinessPackage_203002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package2CreationTool_title,
				Messages.Package2CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Package_203001));
		entry.setId("createPackage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Package_203001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Primitive3CreationTool_title,
				Messages.Primitive3CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Primitive_203003));
		entry.setId("createPrimitive3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Primitive_203003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Types4CreationTool_title,
				Messages.Types4CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Types_202001));
		entry.setId("createTypes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Types_202001));
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
				Collections
						.singletonList(TypesrepositoryElementTypes.TypeExtension_204001));
		entry.setId("createTypeExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.TypeExtension_204001));
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
