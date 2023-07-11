/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.proxy;

import java.io.Serializable;

public class CpaStorageEventListener implements Serializable{
	
	private static final long serialVersionUID = 3858899215641743118L;

	public  void objectCreated(Class<?> clazz, String source ) throws Exception{
	}
	
	
	public  void objectInserted(Class<?> clazz, String source) throws Exception{
	}
	
	public  void objectDelited(Class<?> clazz, String source) throws Exception{
	}
	
}
