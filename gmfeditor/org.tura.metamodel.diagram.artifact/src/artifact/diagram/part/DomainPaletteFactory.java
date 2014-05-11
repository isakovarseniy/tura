/*
 * 
 */
package artifact.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import artifact.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createArtifact1CreationTool());
		paletteContainer.add(createCSSMapper2CreationTool());
		paletteContainer.add(createConfigVariable3CreationTool());
		paletteContainer.add(createJavaScriptMapper4CreationTool());
		paletteContainer.add(createModelQuery5CreationTool());
		paletteContainer.add(createRoleMapper6CreationTool());
		paletteContainer.add(createSpecifier7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtifact1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artifact1CreationTool_title,
				Messages.Artifact1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Artifact_702001));
		entry.setId("createArtifact1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Artifact_702001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper2CreationTool_title,
				Messages.CSSMapper2CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfigVariable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConfigVariable3CreationTool_title,
				Messages.ConfigVariable3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ConfigVariable_703004));
		entry.setId("createConfigVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigVariable_703004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper4CreationTool_title,
				Messages.JavaScriptMapper4CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelQuery5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelQuery5CreationTool_title,
				Messages.ModelQuery5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ModelQuery_703005));
		entry.setId("createModelQuery5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelQuery_703005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.RoleMapper6CreationTool_title,
				Messages.RoleMapper6CreationTool_desc, null, null) {
		};
		entry.setId("createRoleMapper6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecifier7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Specifier7CreationTool_title,
				Messages.Specifier7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Specifier_703003));
		entry.setId("createSpecifier7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Specifier_703003));
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
