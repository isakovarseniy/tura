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
package org.tura.platform.datacontrol.pool;

public class PoolConstants {
	
	public static String SELECT_OBJECTS_SORTED_ASC = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId != :shifterId and createDate >= :beginTimeStamp  and createDate < :endTimeStamp ORDER BY createDate ASC";

	public static String SELECT_OBJECTS_SORTED_DESC_FOR_KEY = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId != :shifterId and key = :key and createDate >= :beginTimeStamp  and createDate < :endTimeStamp ORDER BY createDate DESC";
	
	public static String SELECT_OBJECTS_BY_SHIFTER_ID = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId = :shifterId";

	
	
	
}
