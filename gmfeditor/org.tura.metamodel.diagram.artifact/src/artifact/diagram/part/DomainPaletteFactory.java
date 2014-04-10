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
		paletteContainer.add(createCanvas2CreationTool());
		paletteContainer.add(createConfigVariable3CreationTool());
		paletteContainer.add(createModelQuery4CreationTool());
		paletteContainer.add(createSpecifier5CreationTool());
		paletteContainer.add(createTabCanvas6CreationTool());
		paletteContainer.add(createTabPage7CreationTool());
		paletteContainer.add(createViewPort8CreationTool());
		paletteContainer.add(createViewPortTrigger9CreationTool());
		paletteContainer.add(createWindow10CreationTool());
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
	private ToolEntry createCanvas2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas2CreationTool_title,
				Messages.Canvas2CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas2CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createModelQuery4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelQuery4CreationTool_title,
				Messages.ModelQuery4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ModelQuery_703005));
		entry.setId("createModelQuery4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelQuery_703005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecifier5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Specifier5CreationTool_title,
				Messages.Specifier5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Specifier_703003));
		entry.setId("createSpecifier5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Specifier_703003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas6CreationTool_title,
				Messages.TabCanvas6CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage7CreationTool_title,
				Messages.TabPage7CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort8CreationTool_title,
				Messages.ViewPort8CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger9CreationTool_title,
				Messages.ViewPortTrigger9CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window10CreationTool_title,
				Messages.Window10CreationTool_desc, null, null) {
		};
		entry.setId("createWindow10CreationTool"); //$NON-NLS-1$
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
