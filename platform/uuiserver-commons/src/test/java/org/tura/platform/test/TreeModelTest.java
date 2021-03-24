/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.uuiclient.model.tree.DataExtractor;
import org.tura.platform.uuiclient.model.tree.TreeNode;
import org.tura.platform.uuiclient.model.tree.TreeProcessor;

public class TreeModelTest {

	private TreeNode initTree() {
		TreeNode root = new TreeNode(null);

		TreeNode t0 = new TreeNode("0");
		root.addChild("re1", t0);

		TreeNode t1 = new TreeNode("1");
		root.addChild("re1", t1);

		TreeNode t2 = new TreeNode("2");
		root.addChild("re1", t2);

		TreeNode t00 = new TreeNode("00");
		t0.addChild("re1-re2", t00);

		TreeNode t01 = new TreeNode("01");
		t0.addChild("re1-re2", t01);

		TreeNode t02 = new TreeNode("02");
		t0.addChild("re1-re2", t02);

		TreeNode t10 = new TreeNode("10");
		t1.addChild("re1-re2", t10);

		TreeNode t11 = new TreeNode("11");
		t1.addChild("re1-re2", t11);

		TreeNode t12 = new TreeNode("12");
		t1.addChild("re1-re2", t12);

		return root;
	}

	@Test
	public void createTree() {

		try {
			TreeNode root = initTree();

			TreeNode node0 = root.getChildren("re1")[0];
			System.out.println( TreeProcessor.stringify(node0.getPath()));
			assertEquals(TreeProcessor.stringify(node0.getPath()), "[{\"key\":0,\"relation\":\"re1\"}]");
			assertEquals( "0", node0.getData());
			
			TreeNode node1 = root.getChildren("re1")[1];
			System.out.println( TreeProcessor.stringify(node1.getPath()));
			assertEquals(TreeProcessor.stringify(node1.getPath()), "[{\"key\":1,\"relation\":\"re1\"}]");
			assertEquals( "1", node1.getData());
			
			
			TreeNode node11 = node1.getChildren("re1-re2")[1];
			System.out.println( TreeProcessor.stringify(node11.getPath()));
			assertEquals(TreeProcessor.stringify(node11.getPath()), "[{\"key\":1,\"relation\":\"re1\"},{\"key\":1,\"relation\":\"re1-re2\"}]");
			assertEquals( "11", node11.getData());
			
			TreeNode node12 = node1.getChildren("re1-re2")[2];
			System.out.println( TreeProcessor.stringify(node12.getPath()));
			assertEquals(TreeProcessor.stringify(node12.getPath()), "[{\"key\":1,\"relation\":\"re1\"},{\"key\":2,\"relation\":\"re1-re2\"}]");
			assertEquals( "12", node12.getData());

			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void addNodeToTreeOnPosition() {

		try {
			TreeNode root = initTree();
			
			TreeNode newNode = new TreeNode("new");
			
			TreeNode node1 = root.getChildren("re1")[1];
			List<TreePath> path = node1.getPath();
			path.add( new TreePath("re1-re2",1));
			
			TreeProcessor.addNodeOnPosition(path, root, newNode);
			System.out.println( TreeProcessor.stringify(newNode.getPath()));
			assertEquals(TreeProcessor.stringify(newNode.getPath()), "[{\"key\":1,\"relation\":\"re1\"},{\"key\":1,\"relation\":\"re1-re2\"}]");

			
			assertEquals( "10", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[3].getData());


			path = node1.getPath();
			path.add( new TreePath("re1-re2",4));

			TreeNode newNode1 = new TreeNode("new1");
			TreeProcessor.addNodeOnPosition (path, root, newNode1);

			assertEquals( "10", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[3].getData());
			assertEquals( "new1", node1.getChildren("re1-re2")[4].getData());

			
			path = node1.getPath();
			path.add( new TreePath("re1-re2",0));

			TreeNode newNode0 = new TreeNode("new0");
			TreeProcessor.addNodeOnPosition (path, root, newNode0);

			assertEquals( "new0", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "10", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[3].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[4].getData());
			assertEquals( "new1", node1.getChildren("re1-re2")[5].getData());
			
			
			path = node1.getPath();
			TreeNode newNode2 = new TreeNode("new2");
			TreeProcessor.addNodeToParent(path, root, newNode2, "re1-re2");

			assertEquals( "new0", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "10", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[3].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[4].getData());
			assertEquals( "new1", node1.getChildren("re1-re2")[5].getData());
			assertEquals( "new2", node1.getChildren("re1-re2")[6].getData());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}


	@Test
	public void addNodeToParenOnPosition() {

		try {
			TreeNode root = initTree();
			
			TreeNode newNode = new TreeNode("new");
			
			TreeNode node1 = root.getChildren("re1")[1];
			List<TreePath> path = node1.getPath();
			
			TreeProcessor.addNodeToParentOnPosition (path, root, newNode, "re1-re2",1);
			assertEquals(TreeProcessor.stringify(newNode.getPath()), "[{\"key\":1,\"relation\":\"re1\"},{\"key\":1,\"relation\":\"re1-re2\"}]");

			
			assertEquals( "10", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[3].getData());
			
			TreeNode newNode1 = new TreeNode("new1");
			TreeProcessor.addNodeToParentOnPosition (path, root, newNode1, "re1-re2",4);

			assertEquals( "10", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[3].getData());
			assertEquals( "new1", node1.getChildren("re1-re2")[4].getData());

			

			TreeNode newNode2 = new TreeNode("new0");
			TreeProcessor.addNodeToParentOnPosition (path, root, newNode2, "re1-re2",0);
			
			assertEquals( "new0", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "10", node1.getChildren("re1-re2")[1].getData());
			assertEquals( "new", node1.getChildren("re1-re2")[2].getData());
			assertEquals( "11", node1.getChildren("re1-re2")[3].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[4].getData());
			assertEquals( "new1", node1.getChildren("re1-re2")[5].getData());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void addToRootOnPosition() {
		
		try {
			TreeNode root = initTree();
			List<TreePath> path = root.getPath();
			
			TreeNode newNode = new TreeNode("new");
			TreeProcessor.addNodeToParentOnPosition (path, root, newNode, "re1",1);

			assertEquals( "0", root.getChildren("re1")[0].getData());
			assertEquals( "new", root.getChildren("re1")[1].getData());
			assertEquals( "1", root.getChildren("re1")[2].getData());

			
			TreeNode newNode0 = new TreeNode("new0");
			TreeProcessor.addNodeToParentOnPosition (path, root, newNode0, "re1",0);

			assertEquals( "new0", root.getChildren("re1")[0].getData());
			assertEquals( "0", root.getChildren("re1")[1].getData());
			assertEquals( "new", root.getChildren("re1")[2].getData());
			assertEquals( "1", root.getChildren("re1")[3].getData());
			
			TreeNode newNode1 = new TreeNode("new1");
			TreeProcessor.addNodeToParent(path, root, newNode1, "re1");

			assertEquals( "new0", root.getChildren("re1")[0].getData());
			assertEquals( "0", root.getChildren("re1")[1].getData());
			assertEquals( "new", root.getChildren("re1")[2].getData());
			assertEquals( "1", root.getChildren("re1")[3].getData());
			assertEquals( "2", root.getChildren("re1")[4].getData());
			assertEquals( "new1", root.getChildren("re1")[5].getData());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	
	@Test
	public void remove() {
		
		try {
			TreeNode root = initTree();
			TreeNode node1 = root.getChildren("re1")[1];
			List<TreePath> path = node1.getPath();
			
			boolean result = TreeProcessor.removeNodeFromParent(path, root, "11" ,new DataExtractor() {
				@Override
				public Object extract(Object data) {
					return data;
				}
			});

			assertTrue(result);
			
			 result = TreeProcessor.removeNodeFromParent(path, root, "qqq" ,new DataExtractor() {
				@Override
				public Object extract(Object data) {
					return data;
				}
			});

			assertFalse(result);
			
			assertEquals(2, node1.getChildren("re1-re2").length);
			assertEquals( "10", node1.getChildren("re1-re2")[0].getData());
			assertEquals( "12", node1.getChildren("re1-re2")[1].getData());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void removeFromRoot() {
		
		try {
			TreeNode root = initTree();
			List<TreePath> path = root.getPath();

			 boolean result = TreeProcessor.removeNodeFromParent(path, root, "0" ,new DataExtractor() {
				@Override
				public Object extract(Object data) {
					return data;
				}
			});

			assertTrue(result);

			
			root = initTree();
			path = root.getPath();

			 result = TreeProcessor.removeNodeFromParent(path, root, "2" ,new DataExtractor() {
				@Override
				public Object extract(Object data) {
					return data;
				}
			});

			assertTrue(result);

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void findNodeTest() {
		try {
			TreeNode root = initTree();
			List<TreePath> path = root.getPath();
			path.add( new TreePath("re1",0));
			
			TreeNode node = TreeProcessor.findNode(path, root, 0, path.size());
			assertEquals("0", node.getData());

			path = root.getPath();
			path.add( new TreePath("re1",0));
			path.add( new TreePath("re1-re2",2));
			
			node = TreeProcessor.findNode(path, root, 0, path.size());
			assertEquals("02", node.getData());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
