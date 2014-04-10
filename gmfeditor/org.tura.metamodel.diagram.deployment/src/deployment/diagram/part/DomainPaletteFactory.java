/*
 * 
 */
package deployment.diagram.part;

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

import deployment.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createCanvas1CreationTool());
		paletteContainer.add(createDeploymentComponent2CreationTool());
		paletteContainer.add(createDeploymentStarStep3CreationTool());
		paletteContainer.add(createTabCanvas4CreationTool());
		paletteContainer.add(createTabPage5CreationTool());
		paletteContainer.add(createViewPort6CreationTool());
		paletteContainer.add(createViewPortTrigger7CreationTool());
		paletteContainer.add(createWindow8CreationTool());
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
		paletteContainer.add(createDeployment1CreationTool());
		paletteContainer.add(createDeploymentComponentLink2CreationTool());
		paletteContainer.add(createFirstStep3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas1CreationTool_title,
				Messages.Canvas1CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentComponent2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeploymentComponent2CreationTool_title,
				Messages.DeploymentComponent2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponent_902001));
		entry.setId("createDeploymentComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponent_902001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentStarStep3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DeploymentStarStep3CreationTool_title,
				Messages.DeploymentStarStep3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentStarStep_902002));
		entry.setId("createDeploymentStarStep3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStep_902002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas4CreationTool_title,
				Messages.TabCanvas4CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage5CreationTool_title,
				Messages.TabPage5CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort6CreationTool_title,
				Messages.ViewPort6CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger7CreationTool_title,
				Messages.ViewPortTrigger7CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window8CreationTool_title,
				Messages.Window8CreationTool_desc, null, null) {
		};
		entry.setId("createWindow8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeployment1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deployment1CreationTool_title,
				Messages.Deployment1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeployment_904013));
		entry.setId("createDeployment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeployment_904013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentComponentLink2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeploymentComponentLink2CreationTool_title,
				Messages.DeploymentComponentLink2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014));
		entry.setId("createDeploymentComponentLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFirstStep3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FirstStep3CreationTool_title,
				Messages.FirstStep3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_904008));
		entry.setId("createFirstStep3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_904008));
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
