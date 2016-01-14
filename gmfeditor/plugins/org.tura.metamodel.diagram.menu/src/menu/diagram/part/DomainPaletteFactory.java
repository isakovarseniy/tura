/*
 * 
 */
package menu.diagram.part;

import java.util.Collections;

import menu.diagram.providers.DomainElementTypes;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		paletteContainer.add(createMenuFolder1CreationTool());
		paletteContainer.add(createMenuItem2CreationTool());
		paletteContainer.add(createMenuSeparator3CreationTool());
		paletteContainer.add(createSubMenu4CreationTool());
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
		paletteContainer.add(createToSubmenu1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuFolder1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuFolder1CreationTool_title,
				Messages.MenuFolder1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MenuFolder_1802001));
		entry.setId("createMenuFolder1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuFolder_1802001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuItem2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuItem2CreationTool_title,
				Messages.MenuItem2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.MenuItem_1803002));
		entry.setId("createMenuItem2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuItem_1803002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuSeparator3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuSeparator3CreationTool_title,
				Messages.MenuSeparator3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MenuSeparator_1803003));
		entry.setId("createMenuSeparator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuSeparator_1803003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubMenu4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SubMenu4CreationTool_title,
				Messages.SubMenu4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.SubMenu_1803004));
		entry.setId("createSubMenu4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SubMenu_1803004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToSubmenu1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ToSubmenu1CreationTool_title,
				Messages.ToSubmenu1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.SubMenuToSubmenu_1804018));
		entry.setId("createToSubmenu1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SubMenuToSubmenu_1804018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
