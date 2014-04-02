/*
 * 
 */
package typedefinition.diagram.part;

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

import typedefinition.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createArtificialField1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createEnumAttribute3CreationTool());
		paletteContainer.add(createEnumarator4CreationTool());
		paletteContainer.add(createOperation5CreationTool());
		paletteContainer.add(createPrimitive6CreationTool());
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
		paletteContainer.add(createConfigExtension1CreationTool());
		paletteContainer.add(createDeloyment2CreationTool());
		paletteContainer.add(createDeplymentComponent3CreationTool());
		paletteContainer.add(createFirstStep4CreationTool());
		paletteContainer.add(createInfrastructures5CreationTool());
		paletteContainer.add(createRecipeConfig6CreationTool());
		paletteContainer.add(createRelation7CreationTool());
		paletteContainer.add(createTypeExtension8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtificialField1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ArtificialField1CreationTool_title,
				Messages.ArtificialField1CreationTool_desc, null, null) {
		};
		entry.setId("createArtificialField1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute2CreationTool_title,
				Messages.Attribute2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Attribute_103001));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Attribute_103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnumAttribute3CreationTool_title,
				Messages.EnumAttribute3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.EnumAttribute_103005));
		entry.setId("createEnumAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EnumAttribute_103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enumarator4CreationTool_title,
				Messages.Enumarator4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Enumarator_102005));
		entry.setId("createEnumarator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Enumarator_102005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation5CreationTool_title,
				Messages.Operation5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Operation_103002));
		entry.setId("createOperation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Operation_103002));
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
				Collections.singletonList(DomainElementTypes.Primitive_102004));
		entry.setId("createPrimitive6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Primitive_102004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Type7CreationTool_title,
				Messages.Type7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Type_102002));
		entry.setId("createType7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Type_102002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TypeReference8CreationTool_title,
				Messages.TypeReference8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeReference_102001));
		entry.setId("createTypeReference8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeReference_102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfigExtension1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConfigExtension1CreationTool_title,
				Messages.ConfigExtension1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_104003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_104003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeloyment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deloyment2CreationTool_title,
				Messages.Deloyment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeloyment_104006));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_104006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeplymentComponent3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeplymentComponent3CreationTool_title,
				Messages.DeplymentComponent3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_104007));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_104007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFirstStep4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FirstStep4CreationTool_title,
				Messages.FirstStep4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_104009));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_104009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures5CreationTool_title,
				Messages.Infrastructures5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_104005));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_104005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig6CreationTool_title,
				Messages.RecipeConfig6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_104004));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_104004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation7CreationTool_title,
				Messages.Relation7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_104011));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_104011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension8CreationTool_title,
				Messages.TypeExtension8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_104001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_104001));
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
