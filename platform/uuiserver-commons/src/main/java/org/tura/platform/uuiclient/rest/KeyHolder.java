/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.rest;

import java.util.Base64;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.enterprise.context.ApplicationScoped;

import org.apache.commons.lang.exception.ExceptionUtils;

@ApplicationScoped
public class KeyHolder {
	
	private SecretKey secretKey; 
	private Logger logger = Logger.getLogger(KeyHolder.class.getName());
	
	
    @PostConstruct
    public void init()   {
    	try {
    		String encodedKey = System.getProperty("aes_key");
    		byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
    		secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
    		
    	}catch (Exception e) {
    		logger.info(ExceptionUtils.getFullStackTrace(e));
		}
    }


	public SecretKey getSecretKey() {
		return secretKey;
	}



}
