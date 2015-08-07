
/*
 * 
 */
package style.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import style.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createStyleLibrary1CreationTool());
		paletteContainer.add(createStyleSet2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createStyleLibrary1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StyleLibrary1CreationTool_title,
				Messages.StyleLibrary1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.StyleLibrary_1502001));
		entry.setId("createStyleLibrary1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.StyleLibrary_1502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStyleSet2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StyleSet2CreationTool_title,
				Messages.StyleSet2CreationTool_desc, Collections.singletonList(DomainElementTypes.StyleSet_1503001));
		entry.setId("createStyleSet2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.StyleSet_1503001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
