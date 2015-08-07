
/*
 * 
 */
package deployment.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDeploymentComponent1CreationTool());
		paletteContainer.add(createDeploymentStarStep2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDeployment1CreationTool());
		paletteContainer.add(createDeploymentComponentLink2CreationTool());
		paletteContainer.add(createFirstStep3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeploymentComponent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DeploymentComponent1CreationTool_title,
				Messages.DeploymentComponent1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DeploymentComponent_902001));
		entry.setId("createDeploymentComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DeploymentComponent_902001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeploymentStarStep2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DeploymentStarStep2CreationTool_title,
				Messages.DeploymentStarStep2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DeploymentStarStep_902002));
		entry.setId("createDeploymentStarStep2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DeploymentStarStep_902002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeployment1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Deployment1CreationTool_title,
				Messages.Deployment1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.RecipeDeployment_904013));
		entry.setId("createDeployment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.RecipeDeployment_904013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeploymentComponentLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DeploymentComponentLink2CreationTool_title,
				Messages.DeploymentComponentLink2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014));
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
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FirstStep3CreationTool_title,
				Messages.FirstStep3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_904008));
		entry.setId("createFirstStep3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainElementTypes.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_904008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
