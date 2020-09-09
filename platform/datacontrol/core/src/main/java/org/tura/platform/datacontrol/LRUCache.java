/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.datacontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.tura.platform.datacontrol.shift.ShiftControl;

public class LRUCache implements Serializable {

	private static final long serialVersionUID = 942371366917316513L;

	Node head;
	Node tail;
	HashMap<String, Node> map = null;
	int cap = 0;

	public LRUCache(int capacity) {
		this.cap = capacity;
		this.map = new HashMap<>();
	}

	public LRUCache(LRUCache cache) {
		this.cap = cache.cap;
		this.map = new HashMap<>();

		if (cache.head != null) {
			Node currentOrigin = cache.head;
			Node prevNew = null;
			do {
				ShiftControl obj = currentOrigin.value;

				Node currentNew = new Node(currentOrigin.key, obj);
				this.map.put(currentOrigin.key, currentNew);
				currentNew.prev = prevNew;
				if (prevNew != null) {
					prevNew.next = currentNew;
				}

				if (cache.head != null && currentNew.key.equals(cache.head.key)) {
					this.head = currentNew;
				}
				if (cache.tail != null && currentNew.key.equals(cache.tail.key)) {
					this.tail = currentNew;
				}

				prevNew = currentNew;
				currentOrigin = currentOrigin.next;

			} while (currentOrigin != null);
		}
	}

	public ShiftControl get(String key) {
		if (map.get(key) == null) {
			return null;
		}
//move to tail
		Node t = map.get(key);
		removeNode(t);
		offerNode(t);
		return t.value;
	}
	
	public int size() {
		return map.size();
	}
	
	public void put(String key, ShiftControl value) {
		if (map.containsKey(key)) {
			Node t = map.get(key);
			t.value = value;
//move to tail
			removeNode(t);
			offerNode(t);
		} else {
			if (map.size() >= cap) {
//delete head
				Node nd = map.remove(head.key);
				removeNode(head);
				nd.value.removeShiftControlData();
			}
//add to tail
			Node node = new Node(key, value);
			offerNode(node);
			map.put(key, node);
		}
	}

	private void removeNode(Node n) {
		if (n.prev != null) {
			n.prev.next = n.next;
		} else {
			head = n.next;
		}
		if (n.next != null) {
			n.next.prev = n.prev;
		} else {
			tail = n.prev;
		}
	}

	public List<ShiftControl> values() {
		List<ShiftControl> values = new ArrayList<ShiftControl>();
		for (Node node : map.values()) {
			values.add(node.value);
		}
		return values;
	}

	public Set<String> keySet() {
		return map.keySet();
	}

	private void offerNode(Node n) {
		if (tail != null) {
			tail.next = n;
		}
		n.prev = tail;
		n.next = null;
		tail = n;
		if (head == null) {
			head = tail;
		}
	}

	class Node implements Serializable{
		private static final long serialVersionUID = -126079030106401624L;
		String key;
		ShiftControl value;
		Node prev;
		Node next;

		public Node(String key, ShiftControl value) {
			this.key = key;
			this.value = value;
		}
	}

}