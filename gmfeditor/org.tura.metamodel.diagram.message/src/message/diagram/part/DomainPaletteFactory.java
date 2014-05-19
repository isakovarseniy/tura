/*
 * 
 */
package message.diagram.part;

import java.util.Collections;
import java.util.List;

import message.diagram.providers.DomainElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

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
		paletteContainer.add(createMessage1CreationTool());
		paletteContainer.add(createMessageLibrary2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Message1CreationTool_title,
				Messages.Message1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Message_1703001));
		entry.setId("createMessage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Message_1703001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageLibrary2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageLibrary2CreationTool_title,
				Messages.MessageLibrary2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MessageLibrary_1702001));
		entry.setId("createMessageLibrary2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MessageLibrary_1702001));
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
