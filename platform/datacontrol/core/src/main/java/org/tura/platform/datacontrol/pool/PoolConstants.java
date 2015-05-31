package org.tura.platform.datacontrol.pool;

public class PoolConstants {
	
	public static String SELECT_OBJECTS_SORTED_DESC = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId != :shifterId and createDate > :beginTimeStamp  and createDate <= :endTimeStamp ORDER BY createDate DESC";

	public static String SELECT_OBJECTS_SORTED_DESC_FOR_KEY = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId != :shifterId and key = :key and createDate > :beginTimeStamp  and createDate <= :endTimeStamp ORDER BY createDate DESC";
	
	public static String SELECT_OBJECTS_BY_SHIFTER_ID = 
			"SELECT * FROM org.tura.platform.datacontrol.pool.PoolElement WHERE  shifterId = :shifterId";

	
	
	
}
