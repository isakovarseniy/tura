/*
 * 
 */
package domain.diagram.part;

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

import domain.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createApplicationMapper1CreationTool());
		paletteContainer.add(createApplicationMappers2CreationTool());
		paletteContainer.add(createApplicationRecipe3CreationTool());
		paletteContainer.add(createApplicationRecipes4CreationTool());
		paletteContainer.add(createArtifact5CreationTool());
		paletteContainer.add(createAttribute6CreationTool());
		paletteContainer.add(createBusinessObject7CreationTool());
		paletteContainer.add(createBusinessPackage8CreationTool());
		paletteContainer.add(createComponent9CreationTool());
		paletteContainer.add(createConfiguration10CreationTool());
		paletteContainer.add(createCreateMethod11CreationTool());
		paletteContainer.add(createDomainApplication12CreationTool());
		paletteContainer.add(createDomainApplications13CreationTool());
		paletteContainer.add(createDomainArtifact14CreationTool());
		paletteContainer.add(createDomainArtifacts15CreationTool());
		paletteContainer.add(createDomainTypes16CreationTool());
		paletteContainer.add(createEnumAttribute17CreationTool());
		paletteContainer.add(createEnumarator18CreationTool());
		paletteContainer.add(createInsertMethod19CreationTool());
		paletteContainer.add(createJavaMapper20CreationTool());
		paletteContainer.add(createModelMapper21CreationTool());
		paletteContainer.add(createOperation22CreationTool());
		paletteContainer.add(createOption23CreationTool());
		paletteContainer.add(createOtherMethod24CreationTool());
		paletteContainer.add(createPackage25CreationTool());
		paletteContainer.add(createPrimitive26CreationTool());
		paletteContainer.add(createProperty27CreationTool());
		paletteContainer.add(createRecipe28CreationTool());
		paletteContainer.add(createRemoveMethod29CreationTool());
		paletteContainer.add(createReturnValue30CreationTool());
		paletteContainer.add(createSearchMethod31CreationTool());
		paletteContainer.add(createSpecifier32CreationTool());
		paletteContainer.add(createType33CreationTool());
		paletteContainer.add(createTypeReference34CreationTool());
		paletteContainer.add(createTypes35CreationTool());
		paletteContainer.add(createUpdateMethod36CreationTool());
		paletteContainer.add(createVariable37CreationTool());
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
		paletteContainer.add(createRecipeConfig2CreationTool());
		paletteContainer.add(createTypeExtension3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMapper1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationMapper1CreationTool_title,
				Messages.ApplicationMapper1CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationMapper1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMappers2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationMappers2CreationTool_title,
				Messages.ApplicationMappers2CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationMappers2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipe3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRecipe3CreationTool_title,
				Messages.ApplicationRecipe3CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRecipe3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipes4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRecipes4CreationTool_title,
				Messages.ApplicationRecipes4CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRecipes4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtifact5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Artifact5CreationTool_title,
				Messages.Artifact5CreationTool_desc, null, null) {
		};
		entry.setId("createArtifact5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Attribute_3001);
		types.add(DomainElementTypes.Attribute_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute6CreationTool_title,
				Messages.Attribute6CreationTool_desc, types);
		entry.setId("createAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusinessObject7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BusinessObject7CreationTool_title,
				Messages.BusinessObject7CreationTool_desc, null, null) {
		};
		entry.setId("createBusinessObject7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusinessPackage8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BusinessPackage8CreationTool_title,
				Messages.BusinessPackage8CreationTool_desc, null, null) {
		};
		entry.setId("createBusinessPackage8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Component9CreationTool_title,
				Messages.Component9CreationTool_desc, null, null) {
		};
		entry.setId("createComponent9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfiguration10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Configuration10CreationTool_title,
				Messages.Configuration10CreationTool_desc, null, null) {
		};
		entry.setId("createConfiguration10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateMethod11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CreateMethod11CreationTool_title,
				Messages.CreateMethod11CreationTool_desc, null, null) {
		};
		entry.setId("createCreateMethod11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplication12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainApplication12CreationTool_title,
				Messages.DomainApplication12CreationTool_desc, null, null) {
		};
		entry.setId("createDomainApplication12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplications13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainApplications13CreationTool_title,
				Messages.DomainApplications13CreationTool_desc, null, null) {
		};
		entry.setId("createDomainApplications13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifact14CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainArtifact14CreationTool_title,
				Messages.DomainArtifact14CreationTool_desc, null, null) {
		};
		entry.setId("createDomainArtifact14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifacts15CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainArtifacts15CreationTool_title,
				Messages.DomainArtifacts15CreationTool_desc, null, null) {
		};
		entry.setId("createDomainArtifacts15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainTypes16CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainTypes16CreationTool_title,
				Messages.DomainTypes16CreationTool_desc, null, null) {
		};
		entry.setId("createDomainTypes16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnumAttribute17CreationTool_title,
				Messages.EnumAttribute17CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.EnumAttribute_3005));
		entry.setId("createEnumAttribute17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EnumAttribute_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enumarator18CreationTool_title,
				Messages.Enumarator18CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Enumarator_2006));
		entry.setId("createEnumarator18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Enumarator_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertMethod19CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InsertMethod19CreationTool_title,
				Messages.InsertMethod19CreationTool_desc, null, null) {
		};
		entry.setId("createInsertMethod19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaMapper20CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaMapper20CreationTool_title,
				Messages.JavaMapper20CreationTool_desc, null, null) {
		};
		entry.setId("createJavaMapper20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper21CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ModelMapper21CreationTool_title,
				Messages.ModelMapper21CreationTool_desc, null, null) {
		};
		entry.setId("createModelMapper21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation22CreationTool_title,
				Messages.Operation22CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Operation_3002));
		entry.setId("createOperation22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Operation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOption23CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Option23CreationTool_title,
				Messages.Option23CreationTool_desc, null, null) {
		};
		entry.setId("createOption23CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOtherMethod24CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OtherMethod24CreationTool_title,
				Messages.OtherMethod24CreationTool_desc, null, null) {
		};
		entry.setId("createOtherMethod24CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage25CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Package25CreationTool_title,
				Messages.Package25CreationTool_desc, null, null) {
		};
		entry.setId("createPackage25CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive26CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Primitive26CreationTool_title,
				Messages.Primitive26CreationTool_desc, null, null) {
		};
		entry.setId("createPrimitive26CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty27CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Property27CreationTool_title,
				Messages.Property27CreationTool_desc, null, null) {
		};
		entry.setId("createProperty27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe28CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Recipe28CreationTool_title,
				Messages.Recipe28CreationTool_desc, null, null) {
		};
		entry.setId("createRecipe28CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRemoveMethod29CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RemoveMethod29CreationTool_title,
				Messages.RemoveMethod29CreationTool_desc, null, null) {
		};
		entry.setId("createRemoveMethod29CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue30CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReturnValue30CreationTool_title,
				Messages.ReturnValue30CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ReturnValue_3004));
		entry.setId("createReturnValue30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ReturnValue_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchMethod31CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SearchMethod31CreationTool_title,
				Messages.SearchMethod31CreationTool_desc, null, null) {
		};
		entry.setId("createSearchMethod31CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecifier32CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Specifier32CreationTool_title,
				Messages.Specifier32CreationTool_desc, null, null) {
		};
		entry.setId("createSpecifier32CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType33CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Type33CreationTool_title,
				Messages.Type33CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Type_2005));
		entry.setId("createType33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Type_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference34CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TypeReference34CreationTool_title,
				Messages.TypeReference34CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeReference_2004));
		entry.setId("createTypeReference34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeReference_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypes35CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Types35CreationTool_title,
				Messages.Types35CreationTool_desc, null, null) {
		};
		entry.setId("createTypes35CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateMethod36CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.UpdateMethod36CreationTool_title,
				Messages.UpdateMethod36CreationTool_desc, null, null) {
		};
		entry.setId("createUpdateMethod36CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable37CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Variable37CreationTool_title,
				Messages.Variable37CreationTool_desc, null, null) {
		};
		entry.setId("createVariable37CreationTool"); //$NON-NLS-1$
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_4003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig2CreationTool_title,
				Messages.RecipeConfig2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeRecipeConfig_4002));
		entry.setId("createRecipeConfig2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeRecipeConfig_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension3CreationTool_title,
				Messages.TypeExtension3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_4001));
		entry.setId("createTypeExtension3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_4001));
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
