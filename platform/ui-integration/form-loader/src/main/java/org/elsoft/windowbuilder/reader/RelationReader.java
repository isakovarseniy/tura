package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;

public class RelationReader extends Reader {

	private String dstDataControl;
	private Reader parent;
	private Boolean treeRelation = new Boolean(false); 

	public Boolean getTreeRelation() {
		return treeRelation;
	}

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		dstDataControl = xmlReader.getAttributeValue(null, "dstDataControl");
		String treeRel = xmlReader.getAttributeValue(null, "treeRelation");
		if ((treeRel != null)&&(treeRel.equals("true")))
			treeRelation = new Boolean(true);

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {
		this.parent=parent;
	}

	public String getDstDataControl() {
		return dstDataControl;
	}

	public Reader getParent() {
		return parent;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
