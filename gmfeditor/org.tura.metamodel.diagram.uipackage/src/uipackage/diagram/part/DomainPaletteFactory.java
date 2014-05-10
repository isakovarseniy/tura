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
		paletteContainer.add(createApplicationRole1CreationTool());
		paletteContainer.add(createApplicationStyle2CreationTool());
		paletteContainer.add(createCSSMapper3CreationTool());
		paletteContainer.add(createForm4CreationTool());
		paletteContainer.add(createFormDataControls5CreationTool());
		paletteContainer.add(createFormView6CreationTool());
		paletteContainer.add(createJavaScriptMapper7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRole1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRole1CreationTool_title,
				Messages.ApplicationRole1CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRole1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationStyle2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationStyle2CreationTool_title,
				Messages.ApplicationStyle2CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationStyle2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper3CreationTool_title,
				Messages.CSSMapper3CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Form4CreationTool_title,
				Messages.Form4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Form_1002002));
		entry.setId("createForm4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Form_1002002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormDataControls5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FormDataControls5CreationTool_title,
				Messages.FormDataControls5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.FormDataControls_1003002));
		entry.setId("createFormDataControls5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.FormDataControls_1003002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormView6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FormView6CreationTool_title,
				Messages.FormView6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.FormView_1003001));
		entry.setId("createFormView6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.FormView_1003001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.JavaScriptMapper7CreationTool_title,
				Messages.JavaScriptMapper7CreationTool_desc, null, null) {
		};
		entry.setId("createJavaScriptMapper7CreationTool"); //$NON-NLS-1$
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
