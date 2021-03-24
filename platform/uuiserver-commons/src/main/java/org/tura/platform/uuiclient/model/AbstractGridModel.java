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

package org.tura.platform.uuiclient.model;

import java.util.List;

import org.tura.platform.uuiclient.rest.EventDescription;

public interface AbstractGridModel {

    public void onRowSelectionChange(EventDescription event);
    public void ajaxSelected(EventDescription event);
    public void ajaxUnSelected(EventDescription event);
    public void ajaxToggleSelect(EventDescription event);
    public void onPage(EventDescription event);
    
	public List<Object> load();
	public int getPageSize();
	public void setPageSize(int pageSize);
	public Long getTotalRows();
    public int getFirst();	
    
    public Object getSelected();
    public void setSelected(Object selected);
    
    public GridType getGridType();
	public GridModelTriggers getCallback();
	public void decodeAndSetSelected(Object obj) throws Exception;
    
	
}