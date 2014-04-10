/*
 * 
 */
package uipackage.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uipackage.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createCanvas1CreationTool());
		paletteContainer.add(createForm2CreationTool());
		paletteContainer.add(createFormDataControls3CreationTool());
		paletteContainer.add(createFormView4CreationTool());
		paletteContainer.add(createTabCanvas5CreationTool());
		paletteContainer.add(createTabPage6CreationTool());
		paletteContainer.add(createViewPort7CreationTool());
		paletteContainer.add(createViewPortTrigger8CreationTool());
		paletteContainer.add(createWindow9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvas1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Canvas1CreationTool_title,
				Messages.Canvas1CreationTool_desc, null, null) {
		};
		entry.setId("createCanvas1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Form2CreationTool_title,
				Messages.Form2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Form_1002002));
		entry.setId("createForm2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Form_1002002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormDataControls3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FormDataControls3CreationTool_title,
				Messages.FormDataControls3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.FormDataControls_1003002));
		entry.setId("createFormDataControls3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.FormDataControls_1003002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormView4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FormView4CreationTool_title,
				Messages.FormView4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.FormView_1003001));
		entry.setId("createFormView4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.FormView_1003001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabCanvas5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabCanvas5CreationTool_title,
				Messages.TabCanvas5CreationTool_desc, null, null) {
		};
		entry.setId("createTabCanvas5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTabPage6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TabPage6CreationTool_title,
				Messages.TabPage6CreationTool_desc, null, null) {
		};
		entry.setId("createTabPage6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPort7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ViewPort7CreationTool_title,
				Messages.ViewPort7CreationTool_desc, null, null) {
		};
		entry.setId("createViewPort7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewPortTrigger8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ViewPortTrigger8CreationTool_title,
				Messages.ViewPortTrigger8CreationTool_desc, null, null) {
		};
		entry.setId("createViewPortTrigger8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Window9CreationTool_title,
				Messages.Window9CreationTool_desc, null, null) {
		};
		entry.setId("createWindow9CreationTool"); //$NON-NLS-1$
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
