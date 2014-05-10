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
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createContinuousIintegration2CreationTool());
		paletteContainer.add(createDomainApplication3CreationTool());
		paletteContainer.add(createDomainApplications4CreationTool());
		paletteContainer.add(createDomainArtifact5CreationTool());
		paletteContainer.add(createDomainArtifacts6CreationTool());
		paletteContainer.add(createDomainTypes7CreationTool());
		paletteContainer.add(createEJBService8CreationTool());
		paletteContainer.add(createJPAService9CreationTool());
		paletteContainer.add(createJavaScriptMapper10CreationTool());
		paletteContainer.add(createORMEntity11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper1CreationTool_title,
				Messages.CSSMapper1CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousIintegration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContinuousIintegration2CreationTool_title,
				Messages.ContinuousIintegration2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ContinuousIintegration_503006));
		entry.setId("createContinuousIintegration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ContinuousIintegration_503006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplication3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplication3CreationTool_title,
				Messages.DomainApplication3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplication_503001));
		entry.setId("createDomainApplication3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplication_503001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainApplications4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainApplications4CreationTool_title,
				Messages.DomainApplications4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainApplications_502003));
		entry.setId("createDomainApplications4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainApplications_502003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifact5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifact5CreationTool_title,
				Messages.DomainArtifact5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifact_503002));
		entry.setId("createDomainArtifact5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifact_503002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifacts6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainArtifacts6CreationTool_title,
				Messages.DomainArtifacts6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainArtifacts_502001));
		entry.setId("createDomainArtifacts6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainArtifacts_502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainTypes7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DomainTypes7CreationTool_title,
				Messages.DomainTypes7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DomainTypes_502002));
		entry.setId("createDomainTypes7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DomainTypes_502002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEJBService8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EJBService8CreationTool_title,
				Messages.EJBService8CreationTool_desc,
				Collections.singletonList(DomainElementTypes.EJBService_503005));
		entry.setId("createEJBService8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EJBService_503005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJPAService9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JPAService9CreationTool_title,
				Messages.JPAService9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JPAService_503004));
		entry.setId("createJPAService9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JPAService_503004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper10CreationTool_title,
				Messages.JavaScriptMapper10CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createORMEntity11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ORMEntity11CreationTool_title,
				Messages.ORMEntity11CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ORMEntity_503003));
		entry.setId("createORMEntity11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ORMEntity_503003));
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
}
