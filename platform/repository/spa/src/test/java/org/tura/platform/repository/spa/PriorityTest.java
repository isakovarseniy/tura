/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.tura.platform.repository.core.ObjectGraph;
import org.tura.platform.repository.spa.priority.PriorityManager;
import org.tura.platform.repository.spa.priority.RelationNode;

public class PriorityTest {
	
	@Test
	public void sequenceTest() {
		
		RelationNode n1 =  createNode("1",OperationLevel.UPDATE );
		
		RelationNode n2 = createNode("2",OperationLevel.INSERT );
		n1.addOutcoming(n2,null, "");
		
		RelationNode n3 = createNode("3",OperationLevel.UPDATE );
		n2.addOutcoming(n3,null, "");
		
		RelationNode n5 = createNode("5",OperationLevel.INSERT);
		n2.addOutcoming(n5,null, "");
		
		RelationNode n4 = createNode("4",OperationLevel.INSERT );
		n3.addOutcoming(n4,null, "");

		RelationNode n6 = createNode("6",OperationLevel.INSERT);
		n5.addOutcoming(n6,null, "");
		
		RelationNode n7 = createNode("7",OperationLevel.INSERT);
		n5.addIncoming(n7,null, "");
		
		RelationNode n8 = createNode("8",OperationLevel.INSERT);
		n7.addIncoming(n8,null, "");
		
		ObjectGraph graph = new ObjectGraph();
		List<RelationNode> sequence = new ArrayList<>();

		
	   new PriorityManager().walk(graph, sequence, n1);
		
	   List<String> actual = new ArrayList<String>();

	   for ( RelationNode n : sequence) {
		   actual.add(n.getId());
//		   System.out.println(n.getId());
	   }
	   
	   List<String> exp = Arrays.asList("2" ,"4","8","7","5","6");
	   
	   assertEquals(actual, exp);
	   
		assertTrue(graph.exists("8"));
		assertTrue(graph.exists("6"));
		assertTrue(graph.exists("1"));

	}
	
	@Test
	public void sequence2Test() {
		
		RelationNode n1 =  createNode("1",OperationLevel.UPDATE );
		
		RelationNode n2 = createNode("2",OperationLevel.INSERT );
		n1.addOutcoming(n2,null, "");
		
		RelationNode n3 = createNode("3",OperationLevel.UPDATE );
		n2.addOutcoming(n3,null, "");
		
		RelationNode n5 = createNode("5",OperationLevel.INSERT);
		n2.addOutcoming(n5,null, "");
		
		RelationNode n4 = createNode("4",OperationLevel.INSERT );
		n3.addOutcoming(n4,null, "");

		RelationNode n6 = createNode("6",OperationLevel.INSERT);
		n5.addOutcoming(n6,null, "");
		
		RelationNode n7 = createNode("7",OperationLevel.INSERT);
		n5.addOutcoming(n7,null, "");
		
		RelationNode n8 = createNode("8",OperationLevel.INSERT);
		n7.addOutcoming(n8,null, "");
		
		ObjectGraph graph = new ObjectGraph();
		List<RelationNode> sequence = new ArrayList<>();

		
	   new PriorityManager().walk(graph, sequence, n1);
		
	   List<String> actual = new ArrayList<String>();

	   for ( RelationNode n : sequence) {
		   actual.add(n.getId());
//		   System.out.println(n.getId());
	   }
	   List<String> exp = Arrays.asList("2" ,"4","5","6","7","8");
	   
	   assertEquals(actual, exp);

	   assertTrue(graph.exists("8"));
	   assertTrue(graph.exists("6"));
	   assertTrue(graph.exists("1"));
		
	}
	
	
	private RelationNode createNode(String id, OperationLevel level) {
		RelationNode node = new RelationNode(null);
		node.setId(id);
		node.setCommand(new SpaControl(this, null, level, ""));
		return node;
	}

}
