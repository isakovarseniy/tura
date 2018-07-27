/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.object;

import java.util.Date;

public interface  TuraObject {

	public String getObjType() ;

	public void setObjType(String objType) ;

	public String getObjStatus() ;

	public void setObjStatus(String objStatus) ;
	
	public Date getCreateDate() ;

	public void setCreateDate(Date createDate) ;

	public Date getUpdateDate() ;

	public void setUpdateDate(Date updateDate) ;

	public Date getActiveDate() ;

	public void setActiveDate(Date activeDate) ;

	public Date getExpiredDate() ;

	public void setExpiredDate(Date expiredDate);

	public Long getObjId() ;

	public void setObjId(Long objId);
	
	
}
