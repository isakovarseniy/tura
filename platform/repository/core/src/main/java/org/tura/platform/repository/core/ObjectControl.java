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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.Map;

import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider;
import org.tura.platform.repository.proxy.ProxyObjectUpdateListener;

public interface ObjectControl extends Serializable {

	Boolean getAttached();

	void setAttached(Boolean attached);

	String getKey();

	RepoObjectKey getPrimaryKey() throws Exception;

	Repository getRepository();
	
	Registry getRegistry();
	
	RepoKeyPath getPath() throws Exception;

	RepoKeyPath getCpaPath() throws Exception;

	String getCpaid();

	Map<String, Object> getObjectControlAttributes();

	void addListener(ProxyObjectUpdateListener listener);

	void addArtificialFieldWrapperProvider(ArtificialFieldWrapperProvider wapper);

	ArtificialFieldWrapperProvider getArtificialFieldWrapperProvider();

	Object clone();

	Object deepClone();

	Object deepClone(Map<Object, Object> context);

	Object getArtificialFieldWrapper();

	void setForcePKupdate(boolean forcePKupdate);

	void setLinkOperation(AddLinkOperation operation);

	AddLinkOperation getLinkOperation();

	boolean isRemoved();

	Class<?> getProxyClazz();

	public Object inMemory();

	public void add2Boundaries(Map<Object, Object> context);

	public void setViewModelId1(Integer id);
	
	public Integer getViewModelId1();
	
    public void set_SrcId( String _sourceId);
    
    public String get_SrcId();
    
}
