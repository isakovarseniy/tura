package org.tura.platform.repository.test.spa;

import org.tura.platform.object.persistence.operation.RelEnum;
import org.tura.platform.repository.core.RepoObjectKey;

public class DisconnectOperation {

	public void execute(DisconnectData data) throws Exception {
		RepoObjectKey key = data.getMasterPk().getPath().get(0);
		Long objId = new Long(key.getKey().get(0).getValue());
		String toStrPk = objId.toString() + key.getType();

		Object storedObject = SPARepository.objectBase.get(toStrPk);
		if (storedObject == null) {
			throw new Exception("Object not found");
		}
		Object masterObject = PathHelper.buildPath(data.getMasterPk(), 1, storedObject);
		if (masterObject == null) {
			throw new Exception("Internal object not found");
		}

		key = data.getDetailPk().getPath().get(0);
		objId = new Long(key.getKey().get(0).getValue());
		toStrPk = objId.toString() + key.getType();

		Object detailObject = SPARepository.objectBase.get(toStrPk);
		if (detailObject == null) {
			throw new Exception("Object not found");
		}

		RelEnum relation = RelationBuilder.build(masterObject.getClass(), data.getMasterProperty(),
				detailObject.getClass(), data.getDetailProperty());
		relation.getOperation().disconnect(masterObject, detailObject, data.getMasterProperty());
	}

}
