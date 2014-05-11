/*
 * 
 */
package canvas.diagram.part;

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

import canvas.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCSSMapper2CreationTool());
		paletteContainer.add(createCheckBox3CreationTool());
		paletteContainer.add(createColumn4CreationTool());
		paletteContainer.add(createDropDownSelection5CreationTool());
		paletteContainer.add(createInputText6CreationTool());
		paletteContainer.add(createJavaScriptMapper7CreationTool());
		paletteContainer.add(createLabel8CreationTool());
		paletteContainer.add(createLayerHolder9CreationTool());
		paletteContainer.add(createOutputText10CreationTool());
		paletteContainer.add(createRoleMapper11CreationTool());
		paletteContainer.add(createTable12CreationTool());
		paletteContainer.add(createTree13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Button_1603017);
		types.add(DomainElementTypes.Button_1603023);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/button.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CSSMapper2CreationTool_title,
				Messages.CSSMapper2CreationTool_desc, null, null) {
		};
		entry.setId("createCSSMapper2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.CheckBox_1603007);
		types.add(DomainElementTypes.CheckBox_1603015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CheckBox3CreationTool_title,
				Messages.CheckBox3CreationTool_desc, types);
		entry.setId("createCheckBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/checkbox.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Column4CreationTool_title,
				Messages.Column4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Column_1603024));
		entry.setId("createColumn4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/column.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropDownSelection5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.DropDownSelection_1603002);
		types.add(DomainElementTypes.DropDownSelection_1603010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropDownSelection5CreationTool_title,
				Messages.DropDownSelection5CreationTool_desc, types);
		entry.setId("createDropDownSelection5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/dropdownselection.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputText6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.InputText_1603004);
		types.add(DomainElementTypes.InputText_1603012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputText6CreationTool_title,
				Messages.InputText6CreationTool_desc, types);
		entry.setId("createInputText6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/inputtext.png")); //$NON-NLS-1$
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
	private ToolEntry createLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Label_1603005);
		types.add(DomainElementTypes.Label_1603013);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Label8CreationTool_title,
				Messages.Label8CreationTool_desc, types);
		entry.setId("createLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/label.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayerHolder9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.LayerHolder_1602003);
		types.add(DomainElementTypes.LayerHolder_1603019);
		types.add(DomainElementTypes.LayerHolder_1603020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LayerHolder9CreationTool_title,
				Messages.LayerHolder9CreationTool_desc, types);
		entry.setId("createLayerHolder9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/layerholder.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputText10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.OutputText_1603006);
		types.add(DomainElementTypes.OutputText_1603014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputText10CreationTool_title,
				Messages.OutputText10CreationTool_desc, types);
		entry.setId("createOutputText10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/outputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RoleMapper11CreationTool_title,
				Messages.RoleMapper11CreationTool_desc, null, null) {
		};
		entry.setId("createRoleMapper11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Table_1603008);
		types.add(DomainElementTypes.Table_1603021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Table12CreationTool_title,
				Messages.Table12CreationTool_desc, types);
		entry.setId("createTable12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/table.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTree13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Tree_1603016);
		types.add(DomainElementTypes.Tree_1603022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tree13CreationTool_title,
				Messages.Tree13CreationTool_desc, types);
		entry.setId("createTree13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/tree.png")); //$NON-NLS-1$
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
