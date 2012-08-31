package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateArtifitialFieldsDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateArtifitialFields;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class ArtifitialFieldReader extends Reader {

	private String name;
	private String defaultValue;
	private List<String> typeObject;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		name = xmlReader
				.getAttributeValue("http://www.eclipse.org/xwt", "Name");
		typeObject = this.expressionParser(xmlReader.getAttributeValue(
				null, "primitiveType"));
		defaultValue = xmlReader.getAttributeValue(null, "defaultValue");
		return this;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return false;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		TypeDefinitionHandler tdh = rf
				.getTypeDefinitionHandler().clean()
				.searchString("typeOfType",
						MetamodelTypeOfTypes.Primitive.name())
				.searchString("typeName", typeObject.get(3)).seek();

		CreateArtifitialFieldsDAO artifitialField = new CreateArtifitialFieldsDAO();
		artifitialField.setCommandExecutor(CreateArtifitialFields.class.getName());
		artifitialField.setParentUUID(((DataControlReader) parent)
				.getDatacontrolUid());
		artifitialField.setUUID(getUuid());
		artifitialField.setRefType(tdh.getObject().getObjId());
		artifitialField.setDefaultValue(defaultValue);
		artifitialField.setArtifitialFieldName(name);
		
		program.add(artifitialField);
		
	}

}
