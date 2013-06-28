/*
 * 
 */
package typedefinition.diagram.part;

import java.util.ArrayList;
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

import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypedefinitionPaletteFactory {

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
		paletteContainer.add(createOperation4CreationTool());
		paletteContainer.add(createReturnValue5CreationTool());
		paletteContainer.add(createType6CreationTool());
		paletteContainer.add(createTypeReference7CreationTool());
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TypedefinitionElementTypes.Attribute_3001);
		types.add(TypedefinitionElementTypes.Attribute_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnumAttribute2CreationTool_title,
				Messages.EnumAttribute2CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.EnumAttribute_3005));
		entry.setId("createEnumAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.EnumAttribute_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enumarator3CreationTool_title,
				Messages.Enumarator3CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.Enumarator_2003));
		entry.setId("createEnumarator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Enumarator_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation4CreationTool_title,
				Messages.Operation4CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.Operation_3002));
		entry.setId("createOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Operation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReturnValue5CreationTool_title,
				Messages.ReturnValue5CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.ReturnValue_3004));
		entry.setId("createReturnValue5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.ReturnValue_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Type6CreationTool_title,
				Messages.Type6CreationTool_desc,
				Collections.singletonList(TypedefinitionElementTypes.Type_2001));
		entry.setId("createType6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Type_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TypeReference7CreationTool_title,
				Messages.TypeReference7CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.TypeReference_2004));
		entry.setId("createTypeReference7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.TypeReference_2004));
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
						.singletonList(TypedefinitionElementTypes.TypeExtension_4001));
		entry.setId("createTypeExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.TypeExtension_4001));
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
