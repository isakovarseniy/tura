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
		paletteContainer.add(createMenuExtensionPoint1CreationTool());
		paletteContainer.add(createMenuFolder2CreationTool());
		paletteContainer.add(createMenuItem3CreationTool());
		paletteContainer.add(createMenuSeparator4CreationTool());
		paletteContainer.add(createSubMenu5CreationTool());
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
	private ToolEntry createMenuExtensionPoint1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuExtensionPoint1CreationTool_title,
				Messages.MenuExtensionPoint1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MenuExtensionPoint_1803005));
		entry.setId("createMenuExtensionPoint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuExtensionPoint_1803005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuFolder2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuFolder2CreationTool_title,
				Messages.MenuFolder2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MenuFolder_1802001));
		entry.setId("createMenuFolder2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuFolder_1802001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuItem3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuItem3CreationTool_title,
				Messages.MenuItem3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.MenuItem_1803002));
		entry.setId("createMenuItem3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuItem_1803002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenuSeparator4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MenuSeparator4CreationTool_title,
				Messages.MenuSeparator4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.MenuSeparator_1803003));
		entry.setId("createMenuSeparator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.MenuSeparator_1803003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubMenu5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SubMenu5CreationTool_title,
				Messages.SubMenu5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.SubMenu_1803004));
		entry.setId("createSubMenu5CreationTool"); //$NON-NLS-1$
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
