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

package org.tura.test.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.felix.gogo.jline.command.TuraCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.metamodel.commons.MappersRoot;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;

import artifact.TechLeaf;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainPackage;
import domain.DomainTypes;
import form.CanvasFrame;
import form.DataControl;
import form.Form;
import form.MenuExtensionPoint;
import form.MenuFolder;
import form.NickNamed;
import form.Relation;
import form.Uielement;
import mapper.Mapper;
import mapper.MappingLayer;
import mapper.Version;
import objectmapper.ObjectMapper;
import objectmapper.ObjectMapperGroup;
import objectmapper.OmRelation;
import objectmapper.OperationConnector;
import objectmapper.ProcessingStage;
import objectmapper.AttributeConnector;
import recipe.Component;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Query;
import recipe.Recipe;
import type.Assosiation;
import type.Attribute;
import type.Generalization;
import type.Type;
import type.TypeElement;
import type.impl.PrimitiveImpl;

public class QueryTest {

	private static EmfModel model = null;
	private static String modelFile = "../hr-manager/org.tura.metamodel.example.sirius.hr-react/model/hr.domain";
	private static String infraId = "bccf72ea-0b51-4146-b77b-7fb7dcc338b9";
	private static String recipeId = "70f0e0f3-fba8-42a5-a54b-791f9360af8e";
	private static String ingredientId = "d70eb66c-4ba4-47b4-8891-06df8a479df9";
	private static String componentId = "67ce2c4f-bcb8-4c3c-b8c3-e70f371d40fb";
	private static String mapperId = "68c21b2c-4430-4ce9-8981-b5f13fc32b78";
	private static String formId = "5985e87a-f9a6-456d-8075-b5fc2dcf5a37";
	private static String objectGroupId = "d198b911-371a-472a-a154-dd6d569d2838";
	private static String objectMapperId = "53262142-53d5-452e-8652-26448cac3ce3";
	private static String attributeConnectorId = "8077a103-6125-4ec1-8d3f-48e60a748c82";
	private static String menuExtensionPoindId = "1716a1aa-9acb-47c7-a2e1-a03e54a1c36f";
	private static String canvasId = "a29ed4f1-c30e-4673-8642-04fb7f5260b6";

	private static String mapperId1 = "1ef3b046-283d-445e-bb8c-c970cd1feca1";
	private static String departmentTypeId = "bba5bca8-79c4-4856-a307-acc056d2ba90";
	private static String department2Id = "9b91071f-187e-4004-a179-6fe8ac932a3f";
	private static String  employeeid = "51d86fec-2e8f-46b7-a07e-409d6dab9a4f";

	@BeforeClass
	public static void beforeClass() throws Exception {
		TuraCommand tc = new TuraCommand();
		EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);
		model = tc.createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
	}

	@Test
	public void t001_queryRecipe() {
		try {
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();

				Configuration configuration = queryHelper.getConfiguration(obj, infraId);
				assertNotNull(configuration);

				Recipe recipe = queryHelper.getRecipe(obj, recipeId);
				assertNotNull(recipe);

				Infrastructure infra = queryHelper.getInfrastructure(recipe);
				assertNotNull(infra);

				recipe = queryHelper.getRecipe(infra);
				assertNotNull(recipe);

				configuration = queryHelper.getConfiguration(infra);
				assertNotNull(configuration);

				infra = queryHelper.findInfrastructure(configuration);
				assertNotNull(infra);

				queryHelper.getConfigExtensionUp(configuration);

				queryHelper.getConfigExtensionDown(configuration);

				queryHelper.getConfigExtensionGard(configuration);

				recipe = queryHelper.findRecipe(infra);
				assertNotNull(recipe);

				Component component = queryHelper.getComponent(obj, componentId);
				assertNotNull(component);

				List<Version> vers = queryHelper.getVersions(component);
				assertNotNull(vers);
				assertNotEquals(0, vers.size());

				Ingredient ingredient = queryHelper.getIngredient(obj, ingredientId);
				assertNotNull(ingredient);

				ModelMapper mapper = queryHelper.getModelMapper(obj, mapperId);
				assertNotNull(mapper);

				Collection<Recipe> recipes = queryHelper.getRecipes(obj);
				assertEquals(8, recipes.size());

				TechLeaf leaf = queryHelper.findTech(obj, 0, "JEE", "JPA");
				assertEquals("JPA", leaf.getName());

				List<Type> commandList = queryHelper.queryTypesByHint(obj, "Model.Form.DataControl.Command");
				assertNotEquals(0, commandList.size());

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t002_queryTypes() {
		try {
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();

				TypeElement type = queryHelper.findMessageType(obj);
				assertEquals("Message", ((Type) type).getName());

				type = queryHelper.findStyleType(obj);
				assertEquals("Style", ((Type) type).getName());

				type = queryHelper.findRoleType(obj);
				assertEquals("Role", ((Type) type).getName());

				type = queryHelper.findGroupType(obj);
				assertEquals("Group", ((Type) type).getName());

				type = queryHelper.findIconType(obj);
				assertEquals("Icon", ((Type) type).getName());

				type = queryHelper.findNullType(obj);
				assertEquals("Null", ((PrimitiveImpl) type).getName());

//				type = queryHelper.findSearchCriteriaType(obj);
//				assertEquals("SearchCriteria", ((Type) type).getName());

//				type = queryHelper.findStringType(obj);
//				assertEquals("String", ((PrimitiveImpl) type).getName());

//				type = queryHelper.findIntegerType(obj);
//				assertEquals("Integer", ((PrimitiveImpl) type).getName());

				type = queryHelper.findBooleanType(obj);
				assertEquals("Boolean", ((PrimitiveImpl) type).getName());

				type = queryHelper.findBaseType(obj);
				assertEquals("Base type", ((Type) type).getName());

				type = queryHelper.findAnyObjectType(obj);
				assertEquals("Any type", ((Type) type).getName());

				type = queryHelper.findDataControlType(obj);
				assertEquals("Data control", ((Type) type).getName());

				type = queryHelper.findGenerationHintType(obj);
				assertEquals("Generation hint", ((Type) type).getName());

				type = queryHelper.findTreeDataControlType(obj);
				assertEquals("Tree data control", ((Type) type).getName());

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void t003_queryForms() {
		try {
			Collection<EObject> c = model.getAllOfType("form::Form");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				String query = "var r =form::Form.allInstances()->select(r|r.uid ='" + formId + "'); return r;";
				List array = (List) queryHelper.executeQuery(query, obj);
				Form form = (Form) array.iterator().next();
				assertNotNull(form);

				List<?> controls = queryHelper.getControlsList(form);
				assertEquals(2, controls.size());

				@SuppressWarnings("unused")
				TreeRootDataControlHolder th = (TreeRootDataControlHolder) controls.get(0);
				@SuppressWarnings("unused")
				DataControlHolder dh = (DataControlHolder) controls.get(1);

				DataControl dc = dh.getControls().get(0);
				form = queryHelper.getForm(dc);
				assertNotNull(form);

				TreeDataControl tdc = th.getControls().get(0);
				List<Object> leafs = new ArrayList<Object>();
				queryHelper.getTreeLeafs(leafs, tdc.getDc());
				assertNotEquals(0, leafs.size());

				Collection<TreeDataControl> tdcs = queryHelper.findTreeRootControls(form);
				assertEquals(2, tdcs.size());

				Collection<DataControl> dcs = queryHelper.findMasterControls(form);
				assertEquals(2, dcs.size());
				DataControl d1 = dcs.iterator().next();

				dcs = queryHelper.findDetailAndDependencyControls(form);
				assertEquals(3, dcs.size());

				query =  "var r  = form::DataControl.allInstances()->select(r|r.uid ='" + employeeid + "').first(); return r;";
				DataControl d3 = (DataControl) queryHelper.executeQuery(query, form);
				
				DataControl d2 = queryHelper.findDataControlForRelation(d3);
				assertEquals("Department", d2.getName());

				List<Relation> ls = queryHelper.findRelation(d1);
				assertNotEquals(0, ls.size());

				List<MenuFolder> mf = queryHelper.findMenus(form);
				assertEquals(9, mf.size());

				Object[] refArias = queryHelper.findRefreshedAeas(form.getView(), obj);
				List<NickNamed> nickNamed = (List<NickNamed>) refArias[0];
				assertEquals(31, nickNamed.size());

				nickNamed = queryHelper.collectRefreshedAeas(form.getView());
				assertEquals(31, nickNamed.size());

				query = "var r =form::MenuExtensionPoint.allInstances()->select(r|r.uid ='" + menuExtensionPoindId + "'); return r;";
				array = (List) queryHelper.executeQuery(query, obj);
				MenuExtensionPoint menuExtensionPoint = (MenuExtensionPoint) array.iterator().next();
				assertNotNull(menuExtensionPoint);

				List<MenuFolder> mfs = queryHelper.findExtensionPoints(menuExtensionPoint);
				assertNotEquals(0, mfs.size());

				query = "var r =form::CanvasFrame.allInstances()->select(r|r.uid ='" + canvasId + "'); return r;";
				array = (List) queryHelper.executeQuery(query, obj);
				CanvasFrame canvasFrame = (CanvasFrame) array.iterator().next();

				List<Uielement> uis = queryHelper.findUIElementsForPage(canvasFrame);
				assertNotEquals(0, uis.size());

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t004_queryDomain() {
		try {
			Collection<EObject> c = model.getAllOfType("form::Form");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();

				DomainApplications domainApplications = (DomainApplications) queryHelper.getDomainApplications(obj);
				assertNotNull(domainApplications);

				DomainTypes domainTypes = queryHelper.getTypesRepository(obj);
				assertNotNull(domainTypes);

				DomainArtifacts domainArtifacts = queryHelper.getDomainArtifact(obj);
				assertNotNull(domainArtifacts);

				List<MappingLayer> ls = queryHelper.findApplicationLayers(obj);
				assertNotEquals(0, ls.size());

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t005_queryRecipe() {
		try {
			Collection<EObject> c = model.getAllOfType("form::Form");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();

				ModelMapper mapper = queryHelper.getModelMapper(obj, mapperId1);
				assertNotNull(mapper);

				Object[] techs = queryHelper.findMappingTechnologies(mapper, null);
				assertNotNull(techs);

				mapper = queryHelper.getModelMapper(obj, mapperId);
				assertNotNull(mapper);

				Query query = mapper.getQueries().iterator().next();

				techs = queryHelper.findMappingVariable(query, null);
				assertNotNull(techs);

				MappersRoot mr = queryHelper.getMappers(mapper.eContainer());
				assertNotNull(mr);

				Mapper mp = mr.getChildren().iterator().next().getMappers().iterator().next();
				assertNotNull(mp);

				List<Version> lv = queryHelper.getVersions(mp);
				assertNotNull(lv);
				assertNotEquals(0, lv.size());

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void t006_queryType() {
		try {
			Collection<EObject> c = model.getAllOfType("form::Form");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				String query = "var r =type::TypeElement.allInstances()->select(r|r.uid ='" + departmentTypeId + "');return r;";
				List array = (List) queryHelper.executeQuery(query, obj);
				Type type = (Type) array.iterator().next();
				assertNotNull(type);

				List<Type> lt = new ArrayList<>();
				queryHelper.getInheritTypes(lt, type);
				assertNotEquals(0, lt.size());

				query = "var r =type::TypeElement.allInstances()->select(r|r.uid ='" + department2Id + "'); return r;";
				array = (List) queryHelper.executeQuery(query, obj);
				type = (Type) array.iterator().next();
				assertNotNull(type);

				Collection<Generalization> gens = queryHelper.getTypeExtension(type);
				assertNotEquals(0, gens.size());

				Collection<Assosiation>[] assosiation = queryHelper.getAssosiation(type);
				Collection<Assosiation> srcAssosiation = assosiation[0];
				assertNotEquals(0, srcAssosiation.size());

				Assosiation a = srcAssosiation.iterator().next();
				a = queryHelper.getAssosiation((Type) (a.getSource()), (Type) (a.getTarget()));
				assertNotNull(a);

				List<Attribute> attrs = queryHelper.getAttributesForType(type);
				assertNotEquals(0, attrs.size());

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void t007_queryObject() {
		try {
			Collection<EObject> c = model.getAllOfType("form::Form");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				String query = "var r =objectmapper::ObjectMapperGroup.allInstances()->select(r|r.uid ='" + objectGroupId
						+ "'); return r;";
				List array = (List) queryHelper.executeQuery(query, obj);
				ObjectMapperGroup objectMapperGroup = (ObjectMapperGroup) array.iterator().next();
				assertNotNull(objectMapperGroup);

				List<ProcessingStage> stagess = queryHelper
						.getProcessingStage2ProcessingStageRelationship(objectMapperGroup);
				assertEquals(2, stagess.size());

				List<ObjectMapper> mappers = queryHelper.getProcessingStage2ObjectMapperRelationship(objectMapperGroup);
				assertEquals(3, mappers.size());

				List<OmRelation> rel = queryHelper.getOmRelation(objectMapperGroup);
				assertEquals(7, rel.size());

				query = "var r = objectmapper::ObjectMapper.allInstances()->select(r|r.uid ='" + objectMapperId + "'); return r;";
				array = (List) queryHelper.executeQuery(query, obj);
				ObjectMapper objectMapper = (ObjectMapper) array.iterator().next();

				List<OperationConnector> operations = queryHelper.findOperationConnectorByTarget(objectMapper);
				assertEquals(2, operations.size());
				OperationConnector operationConnector = operations.iterator().next();

				operations = queryHelper.findOperationConnectorByTarget(operationConnector);
				assertEquals(1, operations.size());

				query = "var r =objectmapper::AttributeConnector.allInstances()->select(r|r.uid ='" + attributeConnectorId
						+ "');  return r;";
				array = (List) queryHelper.executeQuery(query, obj);
				AttributeConnector attributeConnector = (AttributeConnector) array.iterator().next();

				operations = queryHelper.findOperationConnectorByTarget(attributeConnector);
				assertEquals(2, operations.size());

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
