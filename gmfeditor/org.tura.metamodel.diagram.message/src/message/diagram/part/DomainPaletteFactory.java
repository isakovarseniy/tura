/*
 * 
 */
package message.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import message.diagram.providers.DomainElementTypes;

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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Language1CreationTool_title,
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Message2CreationTool_title,
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MessageLibrary3CreationTool_title,
				Messages.MessageLibrary3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.MessageLibrary_1702001));
		entry.setId("createMessageLibrary3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.MessageLibrary_1702001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
