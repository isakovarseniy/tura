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
package org.tura.platform.datacontrol.shift;

public class ShiftConstants {
	
	public static String SELECT_FOR_SHIFT = 
			"SELECT * FROM org.tura.platform.datacontrol.shift.Element WHERE actualPosition >= :position ORDER BY actualPosition ";


	public static String SELECT_UPPER_ELEMENTS = 
			"SELECT * FROM org.tura.platform.datacontrol.shift.Element WHERE actualPosition < :position ORDER BY actualPosition DESC";

	
	public static String SELECT_ZERO_SHIFT = 
			"SELECT * FROM org.tura.platform.datacontrol.shift.Element WHERE shift = 0 and elementType = 'EXISTING'";
	
	
	public static String SELECT_ORDERBY_ACTUALPOSITION= 
			"SELECT * FROM org.tura.platform.datacontrol.shift.Element ORDER BY actualPosition";

	
	public static String SELECT_UPPER_EQ_ELEMENTS = 
			"SELECT * FROM org.tura.platform.datacontrol.shift.Element WHERE actualPosition <= :position ORDER BY actualPosition DESC";
	

}
