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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createLanguage1CreationTool());
		paletteContainer.add(createMessage2CreationTool());
		paletteContainer.add(createMessageLibrary3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLanguage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Language1CreationTool_title,
				Messages.Language1CreationTool_desc, Collections.singletonList(DomainElementTypes.Language_1702002));
		entry.setId("createLanguage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Language_1702002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Message2CreationTool_title,
				Messages.Message2CreationTool_desc, Collections.singletonList(DomainElementTypes.Message_1703004));
		entry.setId("createMessage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Message_1703004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageLibrary3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.MessageLibrary3CreationTool_title,
				Messages.MessageLibrary3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.MessageLibrary_1702001));
		entry.setId("createMessageLibrary3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.MessageLibrary_1702001));
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
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
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
