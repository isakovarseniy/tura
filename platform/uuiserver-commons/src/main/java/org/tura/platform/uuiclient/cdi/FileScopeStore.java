/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.cdi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.crypto.SecretKey;

public class FileScopeStore implements ScopeStorage {

	private String dir;

	public FileScopeStore(String dir) {
		this.dir = dir;
	}

	@Override
	public void write(Scope scopeId, BeanStorage map) throws Exception {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File scopeFile = getScopeFile(scopeId);
			fos = new FileOutputStream(scopeFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(map);
			oos.flush();
		} finally {
			if (oos != null) {
				oos.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

	@Override
	public BeanStorage load(Scope scopeId) throws Exception {
		FileInputStream fos = null;
		ObjectInputStream oos = null;
		try {
			File scopeFile = getScopeFile(scopeId);
			fos = new FileInputStream(scopeFile);
			oos = new ObjectInputStream(fos);
			BeanStorage map = (BeanStorage) oos.readObject();
			return map;
		} finally {
			if (oos != null) {
				oos.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

	@Override
	public boolean findScope(Scope scopeId) {
		File scopeFile = getScopeFile(scopeId);
		return scopeFile.exists();
	}
	
	private File getScopeFile(Scope scopeId) {
		File scopeFile = new File(dir,  "tura_"+scopeId.getUid());
		if (!scopeFile.exists()) {
			scopeFile.mkdir();
		}
		scopeFile = new File(scopeFile , scopeId.getFormName());
		return scopeFile;
	}

	@Override
	public void destroyStorage(String session) {
		File scopeFile = new File(dir,  "tura_"+session);
		if (scopeFile.exists()) {
			for ( File f : scopeFile.listFiles()) {
				f.delete();
			}
			scopeFile.delete();
		}
	}


	@Override
	public byte[] getState() {
		return null;
	}

	@Override
	public void setState(byte[] state) {
	}

	@Override
	public void setSecretKey(SecretKey secretKey) {
		
	}


}
