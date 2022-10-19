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

package org.tura.example.ui.hrcontroller.converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.tura.platform.uuiclient.annotations.TypeConverter;
import org.tura.platform.uuiclient.rest.client.commands.Converter;

@TypeConverter(clazz=Date.class)
public class DateConverter implements Converter{

	@Override
	public Object encode(Object obj) throws Exception{
		if (obj == null) {
			return null;
		}
		Date d = (Date) obj;
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(d);
	}

	@Override
	public Object decode(Object obj) throws Exception {
		if (obj == null) {
			return null;
		}
		String s = (String) obj;
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(s);
	}
	
	
}
