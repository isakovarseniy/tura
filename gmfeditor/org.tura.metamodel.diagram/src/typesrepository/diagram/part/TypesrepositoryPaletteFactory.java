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
		paletteContainer.add(createCreateMethod2CreationTool());
		paletteContainer.add(createInsertMethod3CreationTool());
		paletteContainer.add(createOtherMethod4CreationTool());
		paletteContainer.add(createPackage5CreationTool());
		paletteContainer.add(createPrimitive6CreationTool());
		paletteContainer.add(createRemoveMethod7CreationTool());
		paletteContainer.add(createSearchMethod8CreationTool());
		paletteContainer.add(createTypes9CreationTool());
		paletteContainer.add(createUpdateMethod10CreationTool());
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
						.singletonList(TypesrepositoryElementTypes.BusinessPackage_3003));
		entry.setId("createBusinessPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.BusinessPackage_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateMethod2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CreateMethod2CreationTool_title,
				Messages.CreateMethod2CreationTool_desc, null, null) {
		};
		entry.setId("createCreateMethod2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertMethod3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InsertMethod3CreationTool_title,
				Messages.InsertMethod3CreationTool_desc, null, null) {
		};
		entry.setId("createInsertMethod3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOtherMethod4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OtherMethod4CreationTool_title,
				Messages.OtherMethod4CreationTool_desc, null, null) {
		};
		entry.setId("createOtherMethod4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package5CreationTool_title,
				Messages.Package5CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Package_3001));
		entry.setId("createPackage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Package_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Primitive6CreationTool_title,
				Messages.Primitive6CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Primitive_3002));
		entry.setId("createPrimitive6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Primitive_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRemoveMethod7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RemoveMethod7CreationTool_title,
				Messages.RemoveMethod7CreationTool_desc, null, null) {
		};
		entry.setId("createRemoveMethod7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchMethod8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SearchMethod8CreationTool_title,
				Messages.SearchMethod8CreationTool_desc, null, null) {
		};
		entry.setId("createSearchMethod8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Types9CreationTool_title,
				Messages.Types9CreationTool_desc,
				Collections
						.singletonList(TypesrepositoryElementTypes.Types_2001));
		entry.setId("createTypes9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.Types_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateMethod10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.UpdateMethod10CreationTool_title,
				Messages.UpdateMethod10CreationTool_desc, null, null) {
		};
		entry.setId("createUpdateMethod10CreationTool"); //$NON-NLS-1$
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
						.singletonList(TypesrepositoryElementTypes.TypeExtension_4001));
		entry.setId("createTypeExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypesrepositoryElementTypes
				.getImageDescriptor(TypesrepositoryElementTypes.TypeExtension_4001));
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
