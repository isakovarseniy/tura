/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
