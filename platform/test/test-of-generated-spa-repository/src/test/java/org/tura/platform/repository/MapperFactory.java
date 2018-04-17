package org.tura.platform.repository;

import com.remondis.remap.Mapper;

public class MapperFactory {

	
	public   static  Mapper<?, ?> factory( Class<?> source ) throws Exception{
		if (source.getClass().getName().contains(".spa.")){
			return MapperFromSPAtoJPA.factory(source, MapperFromSPAtoJPA.c(source));
		}
		if (source.getClass().getName().contains(".jpa.")){
			return MapperFromJPAtoSPA.factory(source,MapperFromJPAtoSPA.c(source));
		}
		
		return null;
		
	}
	
}
