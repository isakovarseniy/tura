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


}
