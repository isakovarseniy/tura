package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateFieldSetDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateFieldSet;

public class FieldSetReader extends Reader {

	private String cssStyle;
	private String cssStyleClass;
	private String idObject; 
	private String label;
	private String fieldSetType;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		cssStyle = xmlReader.getAttributeValue(null, "cssStyle");
		cssStyleClass = xmlReader.getAttributeValue(null, "cssStyleClass");
		idObject = xmlReader.getAttributeValue(null, "idObject");
		label = xmlReader.getAttributeValue(null, "label");
		fieldSetType = xmlReader.getAttributeValue(null, "fieldSet");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent,List<CommandDAO> program) throws Exception {

		if ((idObject != null) && (!idObject.equals(""))) {
			setUuid( idObject);
		}
		CreateFieldSetDAO fieldSet = new CreateFieldSetDAO();
		fieldSet.setCommandExecutor(CreateFieldSet.class.getName());
		fieldSet.setParentUUID(parent.getUuid());
		fieldSet.setUUID(getUuid());
		fieldSet.setCss(cssStyle);
		fieldSet.setCssClass(cssStyleClass);
		fieldSet.setLabel(label);
		fieldSet.setFieldSetType(fieldSetType);
		program.add(fieldSet);
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
