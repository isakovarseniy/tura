/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class RequestScopeStorage implements ScopeStorage {

	private transient byte[] buffer;
	private transient SecretKey secretKey;
	
	@Override
	public void write(Scope scopeId, BeanStorage map) throws Exception {
		ByteArrayOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(fos);
			oos.writeObject(map);
			oos.flush();
			buffer = fos.toByteArray();

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
		ByteArrayInputStream fos = null;
		ObjectInputStream oos = null;
		try {
			
			fos = new ByteArrayInputStream(buffer);
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
		if (buffer != null) {
			return true;
		}
		return false;
	}

	@Override
	public void destroyStorage(String session) {

	}


	@Override
	public byte[] getState() throws Exception {
		return  encrypt(compress (buffer)) ;
	}

	@Override
	public void setState(byte[] state) throws Exception {
		if ( state != null) {
			this.buffer=  decompress(decrypt(state)) ;
			System.out.println("zip langht = "+state.length +" unzip langht =  "+buffer.length);
		}
	}

	public static byte[] compress(byte[] in) {
	    try {
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        DeflaterOutputStream defl = new DeflaterOutputStream(out);
	        defl.write(in);
	        defl.flush();
	        defl.close();

	        return out.toByteArray();
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.exit(150);
	        return null;
	    }
	}

	public static byte[] decompress(byte[] in) {
	    try {
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        InflaterOutputStream infl = new InflaterOutputStream(out);
	        infl.write(in);
	        infl.flush();
	        infl.close();

	        return out.toByteArray();
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.exit(150);
	        return null;
	    }
	}	
	
	
	
    public  byte[] encrypt(byte[] byteArray) throws Exception {
    	Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] cipherText = cipher.doFinal(byteArray);

        return cipherText;
    }

    public  byte[] decrypt(byte[]  cipherBytes) throws Exception {
    	Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        return cipher.doFinal(cipherBytes);
    }

	@Override
	public void setSecretKey(SecretKey secretKey) {
		this.secretKey =secretKey;
	}    
    	
	
}
