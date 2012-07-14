package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDataLink2DataLinkDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2DataLink;

public class LinkReader extends Reader {

	private String masterField;
	private String detailField;
	private String dstControllUid = UUID.randomUUID().toString();

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		masterField = xmlReader.getAttributeValue(null, "masterField");
		detailField = xmlReader.getAttributeValue(null, "detailField");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		if (Reader.idMAP == null)
			Reader.idMAP = new HashMap<String, String>();

		String name = ((RelationReader) parent).getDstDataControl();
		if (Reader.idMAP.get(name) != null)
			dstControllUid = Reader.idMAP.get(name);
		else
			Reader.idMAP.put(name, dstControllUid);

		CreateDataLink2DataLinkDAO createDataLink2DataLink = new CreateDataLink2DataLinkDAO();
		createDataLink2DataLink
				.setCommandExecutor(CreateDataLink2DataLink.class.getName());
		createDataLink2DataLink
				.setParentUUID(((DataControlReader) ((RelationReader) parent)
						.getParent()).getDatacontrolUid());
		createDataLink2DataLink.setDstUUID(dstControllUid);
		createDataLink2DataLink
				.setRelationName(((DataControlReader) ((RelationReader) parent)
						.getParent()).getName()
						+ "2"
						+ ((RelationReader) parent).getDstDataControl());
		createDataLink2DataLink.setMasterField(masterField);
		createDataLink2DataLink.setDetailField(detailField);
		createDataLink2DataLink.setTreeRelation(((RelationReader) parent).getTreeRelation());
		program.add(createDataLink2DataLink);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
