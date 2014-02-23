/*
 * 
 */
package domain.diagram.part;

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
		paletteContainer.add(createContinuousIintegration1CreationTool());
		paletteContainer.add(createDomainApplication2CreationTool());
		paletteContainer.add(createDomainApplications3CreationTool());
		paletteContainer.add(createDomainArtifact4CreationTool());
		paletteContainer.add(createDomainArtifacts5CreationTool());
		paletteContainer.add(createDomainTypes6CreationTool());
		paletteContainer.add(createEJBService7CreationTool());
		paletteContainer.add(createJPAService8CreationTool());
		paletteContainer.add(createORMEntity9CreationTool());
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
		paletteContainer.add(createInfrastructures2CreationTool());
		paletteContainer.add(createRecipeConfig3CreationTool());
		paletteContainer.add(createTypeExtension4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousIintegration1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContinuousIintegration1CreationTool_title,
				Messages.ContinuousIintegration1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ContinuousIintegration_503006));
		entry.setId("createContinuousIintegration1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ContinuousIintegration_503006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplication2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplication2CreationTool_title,
				Messages.DomainApplication2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplication_503001));
		entry.setId("createDomainApplication2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplication_503001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplications3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplications3CreationTool_title,
				Messages.DomainApplications3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplications_502003));
		entry.setId("createDomainApplications3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplications_502003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifact4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifact4CreationTool_title,
				Messages.DomainArtifact4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifact_503002));
		entry.setId("createDomainArtifact4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifact_503002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifacts5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifacts5CreationTool_title,
				Messages.DomainArtifacts5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifacts_502001));
		entry.setId("createDomainArtifacts5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifacts_502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainTypes6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainTypes6CreationTool_title,
				Messages.DomainTypes6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainTypes_502002));
		entry.setId("createDomainTypes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainTypes_502002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEJBService7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EJBService7CreationTool_title,
				Messages.EJBService7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.EJBService_503005));
		entry.setId("createEJBService7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EJBService_503005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJPAService8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JPAService8CreationTool_title,
				Messages.JPAService8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JPAService_503004));
		entry.setId("createJPAService8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JPAService_503004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORMEntity9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ORMEntity9CreationTool_title,
				Messages.ORMEntity9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ORMEntity_503003));
		entry.setId("createORMEntity9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ORMEntity_503003));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_504003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_504003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures2CreationTool_title,
				Messages.Infrastructures2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_504005));
		entry.setId("createInfrastructures2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_504005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig3CreationTool_title,
				Messages.RecipeConfig3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_504004));
		entry.setId("createRecipeConfig3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_504004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension4CreationTool_title,
				Messages.TypeExtension4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_504001));
		entry.setId("createTypeExtension4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_504001));
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
