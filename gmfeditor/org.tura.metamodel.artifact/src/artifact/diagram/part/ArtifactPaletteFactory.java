/*
 * 
 */
package artifact.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactPaletteFactory {

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
		paletteContainer.add(createOption2CreationTool());
		paletteContainer.add(createSpecifier3CreationTool());
		paletteContainer.add(createVariable4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtifact1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artifact1CreationTool_title,
				Messages.Artifact1CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.Artifact_2001));
		entry.setId("createArtifact1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes
				.getImageDescriptor(ArtifactElementTypes.Artifact_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOption2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Option2CreationTool_title,
				Messages.Option2CreationTool_desc, null, null) {
		};
		entry.setId("createOption2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecifier3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Specifier3CreationTool_title,
				Messages.Specifier3CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.Specifier_3003));
		entry.setId("createSpecifier3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes
				.getImageDescriptor(ArtifactElementTypes.Specifier_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ArtifactElementTypes.Variable_3001);
		types.add(ArtifactElementTypes.Variable_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Variable4CreationTool_title,
				Messages.Variable4CreationTool_desc, types);
		entry.setId("createVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes
				.getImageDescriptor(ArtifactElementTypes.Variable_3001));
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
