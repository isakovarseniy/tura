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

package org.tura.platform.test;

import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.CreateTrigger;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.DeleteTrigger;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.InsertTrigger;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Link;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.SearchTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.annotations.UpdateTrigger;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;

import com.octo.java.sql.query.SelectQuery.Order;

public class CDIImplementationDataControlStructureUtil {

	public static void checkDependency(Method method,List<String> expectedDependency){
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Dependencies) {
					Dependency[] dependency = ((Dependencies) annotation).dependency();
					checkDependencies(dependency, expectedDependency);
					noselector = false;
					break;
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Default Search annotation");
		
	}
	
	private static void checkDependencies(Dependency[] dependency, List<String> expectedDependency) {
		if (dependency.length != expectedDependency.size())
			fail("Wrong number of order criterias");

		int i = 0;
		for (Dependency ds : dependency) {
			String expectedDep = expectedDependency.get(i);
			if (     ds.expression().equals(expectedDep)  ) {
				i++;
			} else {
				fail("Missmatch  in dependency " + ds.expression());
			}
		}
	}
	
	
	
	public static void checkDefaultOrderCriteria(Method method, List<OrderCriteria> expectedCriteria) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof DefaultOrderBys) {
					DefaultOrderBy[] order = ((DefaultOrderBys) annotation).orders();
					checkOrderCriterias(order, expectedCriteria);
					noselector = false;
					break;
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Default Search annotation");
	}
	
	private static void checkOrderCriterias(DefaultOrderBy[] order, List<OrderCriteria> expectedCriterias) {
		if (order.length != expectedCriterias.size())
			fail("Wrong number of order criterias");

		int i = 0;
		for (DefaultOrderBy ds : order) {
			OrderCriteria expectedCriteria = expectedCriterias.get(i);
			if (     ds.field().equals(expectedCriteria.getName()) && 
					  ds.order().equals( Order.valueOf( expectedCriteria.getOrder()) ) 
					) {
				i++;
			} else {
				fail("Missmatch  in order criterias " + ds.field());
			}
		}
	}
	

	
	public static void checkDefaultSearchCriteria(Method method, List<SearchCriteria> expectedCriteria) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof DefaultSearchCriterias) {
					DefaultSearchCriteria[] search = ((DefaultSearchCriterias) annotation).criterias();
					checkSearchCriterias(search, expectedCriteria);
					noselector = false;
					break;
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Default Search annotation");
	}

	
	private static void checkSearchCriterias(DefaultSearchCriteria[] search, List<SearchCriteria> expectedCriterias) {
		if (search.length != expectedCriterias.size())
			fail("Wrong number of search criterias");

		int i = 0;
		for (DefaultSearchCriteria ds : search) {
			SearchCriteria expectedCriteria = expectedCriterias.get(i);
			if (     ds.field().equals(expectedCriteria.getName()) && 
					 ds.expression().equals(expectedCriteria.getValue()) &&
					 ds.comparator().name().equals(expectedCriteria.getComparator()) &&
					 ds.type().getName().equals(expectedCriteria.getClassName()) 
					) {
				i++;
			} else {
				fail("Missmatch  in search criterias " + ds.field());
			}
		}
	}
	
	
	
	public static void checkConnection(Method method, String connectionName, List<PropertyLink> expectedParameters) {
		boolean noselector = true;
		for (Annotation annotation : method.getAnnotations()) {
			if (annotation instanceof Connection) {
				if (!((Connection) annotation).connectionName().equals(connectionName)) {
					fail("Wrong connection name annotation");
				}
				Link[] links = ((Connection) annotation).links();
				checkConnectionLinks(links, expectedParameters);
				noselector = false;
				break;
			} else
				noselector = true;
		}
		if (noselector)
			fail("No Connection annotation");
	}

	private static void checkConnectionLinks(Link[] links, List<PropertyLink> expectedLinks) {
		if (links.length != expectedLinks.size())
			fail("Wrong number of links");

		int i = 0;
		for (Link lnk : links) {
			PropertyLink expectedLnk = expectedLinks.get(i);
			if (lnk.field1().equals(expectedLnk.getParent()) && lnk.field2().equals(expectedLnk.getChild())) {
				i++;
			} else {
				fail("Missmatch  in link " + lnk.field1());
			}
		}
	}

	public static void checkPreUpdateTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PreUpdate) {
					if (((PreUpdate) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkPreInsertTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PreInsert) {
					if (((PreInsert) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkPreDeleteTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PreDelete) {
					if (((PreDelete) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkPostCreateTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PostCreate) {
					if (((PostCreate) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkPostQueryTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PostQuery) {
					if (((PostQuery) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkPreQueryTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof PreQuery) {
					if (((PreQuery) annotation).value().equals(named)) {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkSearchTriggerParameters(Method method, List<CallParameter> expectedParameters) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Search) {
					Parameters params = ((Search) annotation).parameters();
					checkTriggerParameters(params, expectedParameters);
					noselector = false;
					break;

				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkSearchTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof SearchTrigger) {
					if (!((SearchTrigger) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkDeleteTriggerParameters(Method method, List<CallParameter> expectedParameters) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Delete) {
					Parameters params = ((Delete) annotation).parameters();
					checkTriggerParameters(params, expectedParameters);
					noselector = false;
					break;

				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");

	}

	public static void checkDeleteTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof DeleteTrigger) {
					if (!((DeleteTrigger) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkUpdateTriggerParameters(Method method, List<CallParameter> expectedParameters) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Update) {
					Parameters params = ((Update) annotation).parameters();
					checkTriggerParameters(params, expectedParameters);
					noselector = false;
					break;

				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");

	}

	public static void checkUpdateTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof UpdateTrigger) {
					if (!((UpdateTrigger) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkInsertTriggerParameters(Method method, List<CallParameter> expectedParameters) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Insert) {
					Parameters params = ((Insert) annotation).parameters();
					checkTriggerParameters(params, expectedParameters);
					noselector = false;
					break;

				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");

	}

	public static void checkInsertTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof InsertTrigger) {
					if (!((InsertTrigger) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkCreateTriggerParameters(Method method, List<CallParameter> expectedParameters) {
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Create) {
					Parameters params = ((Create) annotation).parameters();
					checkTriggerParameters(params, expectedParameters);
					noselector = false;
					break;

				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkTriggerParameters(Parameters parameters, List<CallParameter> expectedParameters) {
		if (parameters.value().length != expectedParameters.size())
			fail("Wrong number of parameters");

		int i = 0;
		for (Parameter param : parameters.value()) {
			CallParameter expectedPrm = expectedParameters.get(i);
			if (param.name().equals(expectedPrm.getName()) && param.expression().equals(expectedPrm.getExpression())
					&& param.type().equals(expectedPrm.getClazz())) {
				i++;
			} else {
				fail("Missmatch  in parameter " + param.name());
			}
		}
	}

	public static void checkCreateTrigger(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof CreateTrigger) {
					if (!((CreateTrigger) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkSelector(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");
		boolean noselector = true;
		for (Annotation[] annotations : method.getParameterAnnotations()) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Selector) {
					if (!((Selector) annotation).value().equals(named)) {
						fail("Wrong annotation");
					} else {
						noselector = false;
						break;
					}
				} else
					noselector = true;
			}
		}
		if (noselector)
			fail("No Selector annotation");
	}

	public static void checkCommandStack(Method method, String named) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		for (Annotation[] annotations : method.getParameterAnnotations()) {
			if (annotations.length != 1)
				fail("Wrong number of annotations");
			for (Annotation annotation : annotations) {
				if (annotation instanceof Named) {
					if (!((Named) annotation).value().equals(named)) {
						fail("Wrong annotation");
					}
				} else
					fail("Wrong annotation");
			}
		}
	}

	public static void checkArtificialProperties(Method method, Map<String, Class<?>> fields) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		for (Annotation[] annotations : method.getParameterAnnotations()) {
			if (annotations.length != 1)
				fail("Wrong number of annotations");
			for (Annotation annotation : annotations) {
				if (annotation instanceof ArtificialFields) {
					if (((ArtificialFields) annotation).fields().length !=  fields.size()){
						fail("Wrong type of arftficial field");
					}
					for (ArtificialField field : ((ArtificialFields) annotation).fields()) {
						Class<?> clazz = fields.get(field.field());
						if (clazz == null) {
							fail("Wrong arftficial field");
						}
						if (!clazz.equals(field.type())) {
							fail("Wrong type of arftficial field");
						}
					}
				} else
					fail("Wrong annotation");
			}
		}
	}

	public static void checkKeys(Method method, String... keys) {
		if (method.getParameterAnnotations().length != 1)
			fail("Wrong number of parameters");

		for (Annotation[] annotations : method.getParameterAnnotations()) {
			if (annotations.length != 1)
				fail("Wrong number of annotations");
			for (Annotation annotation : annotations) {
				if (annotation instanceof Keys) {
					if (((Keys) annotation).fields().length !=  keys.length){
						fail("Wrong type of arftficial field");
					}
					List<String> ls = Arrays.asList(keys);
					for (Key key : ((Keys) annotation).fields()) {
						if (!ls.contains(key.field())) {
							fail("Wrong key");
						}
					}
				} else
					fail("Wrong annotation");
			}
		}
	}
	
}
