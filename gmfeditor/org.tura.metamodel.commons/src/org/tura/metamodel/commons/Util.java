package org.tura.metamodel.commons;

import java.util.Iterator;
import java.util.Set;

public class Util {

	public static boolean mapperRecognizer(Set<domain.Mapper> mappers,
			domain.Ingredient ingredient) {

		for (Iterator<domain.Mapper> itr = mappers.iterator(); itr.hasNext();) {
			domain.Mapper mapper = itr.next();

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();
			
			if ((((ui << 2) + s) & ingr) != 0)
				return true;
		}
		return false;
	}

}
