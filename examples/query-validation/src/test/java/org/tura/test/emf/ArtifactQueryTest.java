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
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.felix.gogo.jline.command.TuraCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.metamodel.commons.QueryHelper;

import application.Application;
import application.ApplicationMessageLibrary;
import artifact.Artifact;
import artifact.GenerationHintWithNickName;
import artifact.ModelQuery;
import domain.DomainPackage;
import form.Form;
import objectmapper.ObjectMapperGroup;
import recipe.Component;
import type.Enumerator;
import type.Type;

public class ArtifactQueryTest {

	private static EmfModel model = null;
	private static String modelFile = "../hr-manager/org.tura.metamodel.example.sirius.hr-react/model/hr.domain";

	@BeforeClass
	public static void beforeClass() throws Exception {
		TuraCommand tc = new TuraCommand();
		EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);
		model = tc.createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void t001_Model_objects_Domain_model_generation() {
		try {
			String  artifactId = "591cd55f-d3ac-4074-85b3-7578e37c6aad";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
				
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","Domain model test package");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(3,result.size());
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				query  = artifact.getModelQuery().get(1);
				assertEquals("Query model interfaces", query.getName());
				params = new HashMap<>();
				params.put("Repository", "HR domain");
				params.put("Package","Model Interface");
				result  = (Collection<Type>)runQuery(artifact,query,params,obj);
				assertEquals(11,result.size());
				t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t002_Model_objects_Enumiration() {
		try {
			String  artifactId = "902fea93-de0a-4951-923a-45c23168e4d3";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model enum", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Enumerator> result  = (Collection<Enumerator>) runQuery(artifact,query,params,obj);
				assertEquals(2,result.size());
				@SuppressWarnings("unused")
				Enumerator  t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t003_Model_objects_AdapterGeneration() {
		try {
			String  artifactId = "68246b4d-fccf-4565-a0c6-df4c18a8f205";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(6,result.size());
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}	
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t004_PersistenceModelRepository_PersistenceModelGenerator() {
		try {
			String  artifactId = "bb896d3f-e7d0-4114-9bfc-83a2e775bcdf";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query Entity Objects", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(58,result.size());
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t005_PersistenceModelRepository_persistencexml() {
		try {
			String  artifactId = "59533f28-588d-4996-8f8c-e34bd233ff47";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query persistance classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(58,result.size());
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query type", query.getName());
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				params.put("Type","JPAObject1");
				result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());				
				t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	@SuppressWarnings("unchecked")
	@Test
	public void t006_PersistenceModelRepository_PersistenceModelRepository() {
		try {
			String  artifactId = "2b04954c-cf6c-46b7-a448-b97377be6839";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(87,result.size());
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t007_PersistenceModelRepository_RepositoryProfile() {
		try {
			String  artifactId = "ef5f6969-7ef4-495f-a526-6b900a48c7a3";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form> result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());
				@SuppressWarnings("unused")
				Form  t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	@SuppressWarnings("unchecked")
	@Test
	public void t008_PersistenceModelRepository_EnumeratorConverters() {
		try {
			String  artifactId = "3fffa2e2-c9c1-409c-96da-d679b61f6798";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Enumerator> result  = (Collection<Enumerator>) runQuery(artifact,query,params,obj);
				assertEquals(2,result.size());
				@SuppressWarnings("unused")
				Enumerator  t = result.iterator().next();

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t008_PersistenceModelRepository_ObjectTransformationGenerator() {
		try {
			String  artifactId = "6d6c8bd3-7175-43d8-9414-1c1372160e34";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query transformation group", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Mapper", "Test model transformation");
				params.put("Group","Charges transformation");
				Collection<ObjectMapperGroup> result  = (Collection<ObjectMapperGroup>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());
				@SuppressWarnings("unused")
				ObjectMapperGroup  t = result.iterator().next();

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t009_ArtifactBuilders_BuildJar() {
		try {
			String  artifactId = "c8972d92-123c-49f8-bf5d-1f44cd2f5371";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query type", query.getName());
				Map<String, String>  params = new HashMap<>();
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				params.put("Type","JPAObject1");
				Collection<Type>result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());				
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query package", query.getName());
				params = new HashMap<>();
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(95,result.size());				
				t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t010_ArtifactBuilders_BuildMVCapplication() {
		try {
			String  artifactId = "e7d86967-d594-4f25-8b34-5211665bf367";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query type", query.getName());
				Map<String, String>  params = new HashMap<>();
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				params.put("Type","JPAObject1");
				Collection<Type>result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());				
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query package", query.getName());
				params = new HashMap<>();
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(95,result.size());				
				t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t011_ArtifactBuilders_ClientBuild() {
		try {
			String  artifactId = "3c163ca1-6fd4-46ef-a1bb-59eaf497296c";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query type", query.getName());
				Map<String, String>  params = new HashMap<>();
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				params.put("Type","JPAObject1");
				Collection<Type>result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());	
				@SuppressWarnings("unused")
				Type  t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t012_UIApplication_DataControl() {
		try {
			String  artifactId = "54d7fea9-d143-4f4e-a894-7c2314f7cf42";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());		
				@SuppressWarnings("unused")
				Form  t = result.iterator().next();
				
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query repository proxy component", query.getName());
				params = new HashMap<>();
				params.put("Component uuid", "c4c76ac7-2592-426a-a9e6-520014fd6a06");
				
				Collection<Component>  cresult  = (Collection<Component>) runQuery(artifact,query,params,obj);
				assertEquals(1,cresult.size());		
				@SuppressWarnings("unused")
				Component cc = cresult.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(2);
				assertEquals("Query one form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());	
				 t = result.iterator().next();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t013_UIApplication_View() {
		try {
			String  artifactId = "1c3f7252-7e43-4b8e-b64c-4c764a20898a";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());	
				@SuppressWarnings("unused")
                Form t = result.iterator().next();
				
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query one form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());						
				t = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t014_UIApplication_MessageProvider() {
		try {
			String  artifactId = "26a52323-6c5e-4973-8d5e-11f03a394ced";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query message library", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				
				Collection<ApplicationMessageLibrary> result  = (Collection<ApplicationMessageLibrary>) runQuery(artifact,query,params,obj);
				assertEquals(1, result.size());
				@SuppressWarnings("unused")
				ApplicationMessageLibrary a = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}			
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t015_UIApplication_Client() {
		try {
			String  artifactId = "04a111c5-75f9-4b7d-911f-b3c5704f645d";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());		
				@SuppressWarnings("unused")
				Form f = result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query one form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());						
				f = result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(2);
				assertEquals("Query server component", query.getName());
				params = new HashMap<>();
				params.put("Component uuid", "c4c76ac7-2592-426a-a9e6-520014fd6a06");
				
				Collection<Component> cresult  = (Collection<Component>) runQuery(artifact,query,params,obj);
				assertEquals(1,cresult.size());		
				@SuppressWarnings("unused")
				Component cc = cresult.iterator().next();
				
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(3);
				assertEquals("Query tura lib", query.getName());
				params = new HashMap<>();
				params.put("Component uuid", "65cc4406-6921-4316-a762-ecfb6b934e14");
				
				cresult  = (Collection<Component>) runQuery(artifact,query,params,obj);
				assertEquals(1,cresult.size());						
				cc = cresult.iterator().next();
				
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(4);
				assertEquals("Querty triggers", query.getName());
				params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				params.put("Type","JPAObject1");
				
				Collection<Type> tresult  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(1,tresult.size());	
				@SuppressWarnings("unused")
				Type t = tresult.iterator().next();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t016_UIApplication_Webxml() {
		try {
			String  artifactId = "840d10b4-046c-4b14-91d3-3e7f7710324e";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query application", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				
				Collection<Application>aresult  = (Collection<Application>) runQuery(artifact,query,params,obj);
				assertEquals(1,aresult.size());		
				@SuppressWarnings("unused")
				Application a =   aresult.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form> fresult  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,fresult.size());		
				@SuppressWarnings("unused")
				Form f  = fresult.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		

	
	@SuppressWarnings("unchecked")
	@Test
	public void t018_UIApplication_AllPagers() {
		try {
			String  artifactId = "c2c2a8d3-4b1e-410a-9ade-0971d5a0bef3";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				
				Collection<Type>result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(58,result.size());		
				@SuppressWarnings("unused")
				Type t  = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t019_UIApplicationInterfac_DataControlnterface() {
		try {
			String  artifactId = "159597f8-6998-4947-9a0c-be08e02260a5";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());		
				@SuppressWarnings("unused")
				Form f =  result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query one form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());	
				f =  result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t020_UIApplicationInterfac_ViewportInterface() {
		try {
			String  artifactId = "c36f9706-6b7f-41e2-82da-01fb1088e8cb";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());		
				@SuppressWarnings("unused")
				Form  f =  result.iterator().next();
				
				artifact = getArtifact(artifactId,obj);
				query =  artifact.getModelQuery().get(1);
				assertEquals("Query one form", query.getName());
				params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());	
				f =  result.iterator().next();

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t021_TestingArtifact_SeleniumPageObject() {
		try {
			String  artifactId = "c406774c-40ae-4395-97b2-34f9e87eeac1";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(5,result.size());		
				@SuppressWarnings("unused")
				Form  f = result.iterator().next();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t022_TestingArtifact_CDITest() {
		try {
			String  artifactId = "3f8ae5c6-f199-4109-a693-28616e2b3201";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query form", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Domain Application", "ERP");
				params.put("Group","HR domain");
				params.put("Application","HR application");
				params.put("Package","Hr manager");
				params.put("Form","HR controller");
				
				Collection<Form>result  = (Collection<Form>) runQuery(artifact,query,params,obj);
				assertEquals(1,result.size());	
				@SuppressWarnings("unused")
				Form f  = result.iterator().next(); 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t023_RepositoryProxy_RepositoryProxy() {
		try {
			String  artifactId = "65fb1b82-2f31-4727-b90e-0fc346ff3cc9";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(87,result.size());
				@SuppressWarnings("unused")
				Type t  = result.iterator().next();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t024_RepositoryProxy_XSDserializableObjects() {
		try {
			String  artifactId = "01788d3b-cb04-49a4-ac90-fe9863806de4";
			
			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {
				EObject obj = c.iterator().next();
	
				Artifact artifact = getArtifact(artifactId,obj);
				ModelQuery  query =  artifact.getModelQuery().get(0);
				assertEquals("Query model classes", query.getName());
				Map<String, String>  params = new HashMap<>();
				params.put("Repository", "Testing repository");
				params.put("Package","JPA test package Lazy");
				Collection<Type> result  = (Collection<Type>) runQuery(artifact,query,params,obj);
				assertEquals(89,result.size());
				@SuppressWarnings("unused")
				Type t  = result.iterator().next();

			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}		
	
	
	
	@SuppressWarnings("rawtypes")
	private Artifact getArtifact(String  artifactId, EObject obj) throws Exception {
		QueryHelper queryHelper = new QueryHelper();
		String  query = "var r  = artifact::Artifact.allInstances()->select(r|r.uid ='" + artifactId + "'); return  r;";
		List array = (List) queryHelper.executeQuery(query, obj);
		Artifact artifact = (Artifact) array.iterator().next();
		return  artifact;
	}
	
	private  Object runQuery( Artifact  artifact ,  ModelQuery query, Map<String, String> params, EObject eobj) throws Exception {
		QueryHelper queryHelper = new QueryHelper();
		String strQuery = query.getQuery();
		for (Entry<String, String> var : params.entrySet()) {
			strQuery = strQuery.replaceAll("\\$\\{" + var.getKey() + "\\}",  var.getValue());
		}

		for (GenerationHintWithNickName hintRef : artifact.getHints()) {
			strQuery = strQuery.replaceAll("\\@\\{" + hintRef.getName() + "\\}", hintRef.getHint().getUid());
		}
		return queryHelper.executeQuery(strQuery, eobj);
	}	
	
}
