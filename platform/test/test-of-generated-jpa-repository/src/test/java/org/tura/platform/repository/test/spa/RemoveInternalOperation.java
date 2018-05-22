package org.tura.platform.repository.test.spa;

import org.tura.platform.object.persistence.operation.RelEnum;
import org.tura.platform.repository.core.RepoObjectKey;

import com.rits.cloning.Cloner;

public class RemoveInternalOperation {

	public void execute(RemoveInternalData data) throws Exception {
		RepoObjectKey key = data.getMasterPk().getPath().get(0);
		Long objId = new Long(key.getKey().get(0).getValue());
		String toStrPk = objId.toString() + key.getType();

		Object storedObject = SPARepository.objectBase.get(toStrPk);
		if (storedObject == null) {
			throw new Exception("Object not found");
		}
		Object masterObject =  PathHelper.buildPath(data.getMasterPk(), 1, storedObject);
		if (masterObject == null) {
			throw new Exception("Internal object not found");
		}
		Cloner c = new Cloner();
		Object detailObject = c.deepClone(data.getDetailObject());

		RelEnum relation =  RelationBuilder.build(masterObject.getClass(), data.getMasterProperty(), data.getDetailObject().getClass(), data.getDetailProperty());
		relation.getOperation().disconnect(masterObject, detailObject, data.getMasterProperty());
	}
	
	
}
