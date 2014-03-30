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
		paletteContainer
				.add(createApplicationInfrastructureLayer1CreationTool());
		paletteContainer.add(createConfiguration2CreationTool());
		paletteContainer.add(createContinuousIintegration3CreationTool());
		paletteContainer.add(createDatacenter4CreationTool());
		paletteContainer.add(createDomainApplication5CreationTool());
		paletteContainer.add(createDomainApplications6CreationTool());
		paletteContainer.add(createDomainArtifact7CreationTool());
		paletteContainer.add(createDomainArtifacts8CreationTool());
		paletteContainer.add(createDomainTypes9CreationTool());
		paletteContainer.add(createEJBService10CreationTool());
		paletteContainer.add(createHub11CreationTool());
		paletteContainer.add(createInfrastructureLayer12CreationTool());
		paletteContainer.add(createJPAService13CreationTool());
		paletteContainer.add(createORMEntity14CreationTool());
		paletteContainer.add(createRouter15CreationTool());
		paletteContainer.add(createServer16CreationTool());
		paletteContainer.add(createServerClaster17CreationTool());
		paletteContainer.add(createStorage18CreationTool());
		paletteContainer.add(createSubsystem19CreationTool());
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
	private ToolEntry createApplicationInfrastructureLayer1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationInfrastructureLayer1CreationTool_title,
				Messages.ApplicationInfrastructureLayer1CreationTool_desc,
				null, null) {
		};
		entry.setId("createApplicationInfrastructureLayer1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfiguration2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Configuration2CreationTool_title,
				Messages.Configuration2CreationTool_desc, null, null) {
		};
		entry.setId("createConfiguration2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousIintegration3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContinuousIintegration3CreationTool_title,
				Messages.ContinuousIintegration3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ContinuousIintegration_503006));
		entry.setId("createContinuousIintegration3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ContinuousIintegration_503006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatacenter4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Datacenter4CreationTool_title,
				Messages.Datacenter4CreationTool_desc, null, null) {
		};
		entry.setId("createDatacenter4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplication5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplication5CreationTool_title,
				Messages.DomainApplication5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplication_503001));
		entry.setId("createDomainApplication5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplication_503001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplications6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplications6CreationTool_title,
				Messages.DomainApplications6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplications_502003));
		entry.setId("createDomainApplications6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplications_502003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifact7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifact7CreationTool_title,
				Messages.DomainArtifact7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifact_503002));
		entry.setId("createDomainArtifact7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifact_503002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifacts8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifacts8CreationTool_title,
				Messages.DomainArtifacts8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifacts_502001));
		entry.setId("createDomainArtifacts8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifacts_502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainTypes9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainTypes9CreationTool_title,
				Messages.DomainTypes9CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainTypes_502002));
		entry.setId("createDomainTypes9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainTypes_502002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEJBService10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EJBService10CreationTool_title,
				Messages.EJBService10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.EJBService_503005));
		entry.setId("createEJBService10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EJBService_503005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub11CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Hub11CreationTool_title,
				Messages.Hub11CreationTool_desc, null, null) {
		};
		entry.setId("createHub11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InfrastructureLayer12CreationTool_title,
				Messages.InfrastructureLayer12CreationTool_desc, null, null) {
		};
		entry.setId("createInfrastructureLayer12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJPAService13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JPAService13CreationTool_title,
				Messages.JPAService13CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JPAService_503004));
		entry.setId("createJPAService13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JPAService_503004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORMEntity14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ORMEntity14CreationTool_title,
				Messages.ORMEntity14CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ORMEntity_503003));
		entry.setId("createORMEntity14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ORMEntity_503003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter15CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Router15CreationTool_title,
				Messages.Router15CreationTool_desc, null, null) {
		};
		entry.setId("createRouter15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer16CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Server16CreationTool_title,
				Messages.Server16CreationTool_desc, null, null) {
		};
		entry.setId("createServer16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster17CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ServerClaster17CreationTool_title,
				Messages.ServerClaster17CreationTool_desc, null, null) {
		};
		entry.setId("createServerClaster17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage18CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Storage18CreationTool_title,
				Messages.Storage18CreationTool_desc, null, null) {
		};
		entry.setId("createStorage18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem19CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Subsystem19CreationTool_title,
				Messages.Subsystem19CreationTool_desc, null, null) {
		};
		entry.setId("createSubsystem19CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createDeloyment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deloyment2CreationTool_title,
				Messages.Deloyment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeloyment_504006));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_504006));
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
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_504007));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_504007));
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
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_504009));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_504009));
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
						.singletonList(DomainElementTypes.RecipeInfrastructures_504005));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_504005));
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
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_504004));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_504004));
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
				Collections.singletonList(DomainElementTypes.Relation_504011));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_504011));
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
						.singletonList(DomainElementTypes.TypeExtension_504001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
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
