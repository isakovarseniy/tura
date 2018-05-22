package org.tura.platform.repository.test.spa;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.object.persistence.operation.RelEnum;

public class RelationBuilder {

	public static RelEnum build(Class<?> masterClazz, String masterProperty, Class<?> detailClazz,
			String detailProperty) throws Exception {

		String masterMethodName = "get" + WordUtils.capitalize(masterProperty);
		Method masterMethod = masterClazz.getDeclaredMethod(masterMethodName);

		String detailMethodName = "get" + WordUtils.capitalize(detailProperty);
		Method detailMethod = masterClazz.getDeclaredMethod(detailMethodName);

		boolean masterIsListResult = false;
		Type returnType = masterMethod.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())) {
				masterIsListResult = true;
			}
		}

		boolean detailIsListResult = false;
		returnType = detailMethod.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())) {
				detailIsListResult = true;
			}
		}

		if (!masterIsListResult && !detailIsListResult) {
			return RelEnum.One2One;
		}

		if (!masterIsListResult && detailIsListResult) {
			return RelEnum.One2Many;
		}

		if (masterIsListResult && !detailIsListResult) {
			return RelEnum.Many2One;
		}

		if (masterIsListResult && detailIsListResult) {
			return RelEnum.Many2Many;
		}

		return null;

	}

}
