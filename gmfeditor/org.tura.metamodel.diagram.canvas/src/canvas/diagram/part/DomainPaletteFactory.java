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

import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActionTrigger1CreationTool());
		paletteContainer.add(createButton2CreationTool());
		paletteContainer.add(createCheckBox3CreationTool());
		paletteContainer.add(createColumn4CreationTool());
		paletteContainer.add(createDate5CreationTool());
		paletteContainer.add(createDropDownSelection6CreationTool());
		paletteContainer.add(createImage7CreationTool());
		paletteContainer.add(createInputText8CreationTool());
		paletteContainer.add(createLabel9CreationTool());
		paletteContainer.add(createLayerHolder10CreationTool());
		paletteContainer.add(createOutputText11CreationTool());
		paletteContainer.add(createTable12CreationTool());
		paletteContainer.add(createTree13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionTrigger1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActionTrigger1CreationTool_title,
				Messages.ActionTrigger1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ActionTrigger_1603027));
		entry.setId("createActionTrigger1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ActionTrigger_1603027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Button_1603017);
		types.add(DomainElementTypes.Button_1603023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button2CreationTool_title,
				Messages.Button2CreationTool_desc, types);
		entry.setId("createButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/button.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.CheckBox_1603007);
		types.add(DomainElementTypes.CheckBox_1603015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckBox3CreationTool_title,
				Messages.CheckBox3CreationTool_desc, types);
		entry.setId("createCheckBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/checkbox.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Column_1603024);
		types.add(DomainElementTypes.Column_1603026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column4CreationTool_title,
				Messages.Column4CreationTool_desc, types);
		entry.setId("createColumn4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/column.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDate5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Date_1603029);
		types.add(DomainElementTypes.Date_1603031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Date5CreationTool_title,
				Messages.Date5CreationTool_desc, types);
		entry.setId("createDate5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/date.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropDownSelection6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.DropDownSelection_1603002);
		types.add(DomainElementTypes.DropDownSelection_1603010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DropDownSelection6CreationTool_title,
				Messages.DropDownSelection6CreationTool_desc, types);
		entry.setId("createDropDownSelection6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/dropdownselection.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImage7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Image_1603028);
		types.add(DomainElementTypes.Image_1603030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Image7CreationTool_title,
				Messages.Image7CreationTool_desc, types);
		entry.setId("createImage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/image.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputText8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.InputText_1603004);
		types.add(DomainElementTypes.InputText_1603012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputText8CreationTool_title,
				Messages.InputText8CreationTool_desc, types);
		entry.setId("createInputText8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/inputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabel9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Label_1603005);
		types.add(DomainElementTypes.Label_1603013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label9CreationTool_title,
				Messages.Label9CreationTool_desc, types);
		entry.setId("createLabel9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/label.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayerHolder10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.LayerHolder_1602003);
		types.add(DomainElementTypes.LayerHolder_1603020);
		types.add(DomainElementTypes.LayerHolder_1603019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LayerHolder10CreationTool_title,
				Messages.LayerHolder10CreationTool_desc, types);
		entry.setId("createLayerHolder10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/layerholder.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputText11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.OutputText_1603006);
		types.add(DomainElementTypes.OutputText_1603014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputText11CreationTool_title,
				Messages.OutputText11CreationTool_desc, types);
		entry.setId("createOutputText11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/outputtext.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Table_1603008);
		types.add(DomainElementTypes.Table_1603021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table12CreationTool_title,
				Messages.Table12CreationTool_desc, types);
		entry.setId("createTable12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/table.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTree13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Tree_1603022);
		types.add(DomainElementTypes.Tree_1603016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tree13CreationTool_title,
				Messages.Tree13CreationTool_desc, types);
		entry.setId("createTree13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin.findImageDescriptor("/org.tura.metamodel.commons/icons/tree.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
