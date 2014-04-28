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
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createDropDownSelection4CreationTool());
		paletteContainer.add(createInputText5CreationTool());
		paletteContainer.add(createLabel6CreationTool());
		paletteContainer.add(createLayerHolder7CreationTool());
		paletteContainer.add(createOutputText8CreationTool());
		paletteContainer.add(createTable9CreationTool());
		paletteContainer.add(createTree10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Button_1603017));
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/button.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.CheckBox_1603007);
		types.add(DomainElementTypes.CheckBox_1603015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/checkbox.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Column_1603009));
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/column.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropDownSelection4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.DropDownSelection_1603002);
		types.add(DomainElementTypes.DropDownSelection_1603010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropDownSelection4CreationTool_title,
				Messages.DropDownSelection4CreationTool_desc, types);
		entry.setId("createDropDownSelection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/dropdownselection.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputText5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.InputText_1603004);
		types.add(DomainElementTypes.InputText_1603012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputText5CreationTool_title,
				Messages.InputText5CreationTool_desc, types);
		entry.setId("createInputText5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/inputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabel6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Label_1603005);
		types.add(DomainElementTypes.Label_1603013);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Label6CreationTool_title,
				Messages.Label6CreationTool_desc, types);
		entry.setId("createLabel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/label.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayerHolder7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.LayerHolder_1602003);
		types.add(DomainElementTypes.LayerHolder_1603019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LayerHolder7CreationTool_title,
				Messages.LayerHolder7CreationTool_desc, types);
		entry.setId("createLayerHolder7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/layerholder.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputText8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.OutputText_1603006);
		types.add(DomainElementTypes.OutputText_1603014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputText8CreationTool_title,
				Messages.OutputText8CreationTool_desc, types);
		entry.setId("createOutputText8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/outputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Table9CreationTool_title,
				Messages.Table9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Table_1603008));
		entry.setId("createTable9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/table.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTree10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tree10CreationTool_title,
				Messages.Tree10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Tree_1603016));
		entry.setId("createTree10CreationTool"); //$NON-NLS-1$
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
