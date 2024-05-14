/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.actions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;

public class LayerHelper {

	public static void sort(List<MappingLayer> layersList) {

		Collections.sort(layersList, new Comparator<MappingLayer>() {
			@Override
			public int compare(MappingLayer o1, MappingLayer o2) {
				return -(o1.getOrder() - o2.getOrder());
			}
		});
	}

	public static int find(List<MappingLayer> layersList, MappingLayer currentPosition) {
		if (layersList == null || layersList.size() == 0 || currentPosition == null) {
			return -1;
		}
		ObjectControl oc = (ObjectControl) currentPosition;
		RepoKeyPath currentPath;
		try {
			currentPath = oc.getPath();
		} catch (Exception e) {
			return -1;
		}

		for (int i = 0; i < layersList.size(); i++) {
			oc = (ObjectControl) layersList.get(i);
			try {
				if (oc.getPath().equals(currentPath)) {
					return i;
				}
			} catch (Exception e) {
				return -1;
			}
		}
		return -1;
	}

	public static void shiftUp(List<MappingLayer> layersList, MappingLayer currentPosition) {
		sort(layersList);
		int i = find(layersList, currentPosition);
		if (i < 0) {
			return;
		}
		if (i == 0) {
			return;
		}

		MappingLayer prevPosition = layersList.get(i - 1);
		int prevOrder = prevPosition.getOrder();
		int curreOrder = currentPosition.getOrder();
		prevPosition.setOrder(curreOrder);
		currentPosition.setOrder(prevOrder);

	}

	public static void shiftDown(List<MappingLayer> layersList, MappingLayer currentPosition) {
		sort(layersList);
		int i = find(layersList, currentPosition);
		if (i < 0) {
			return;
		}
		if (i+1 == layersList.size()) {
			return;
		}

		MappingLayer nextPosition = layersList.get(i + 1);
		int nextOrder = nextPosition.getOrder();
		int curreOrder = currentPosition.getOrder();
		nextPosition.setOrder(curreOrder);
		currentPosition.setOrder(nextOrder);

	}

	public static void insertLayer(List<MappingLayer> layersList, MappingLayer currentPosition, MappingLayer newLayer) {
		sort(layersList);
		int i = find(layersList, currentPosition);
		if (i < 0) {
			newLayer.setOrder(0);
			return;
		}
		newLayer.setOrder(layersList.get(i).getOrder());
		for (int j=0; j <= i; j++) {
			int ord = layersList.get(j).getOrder();
			layersList.get(j).setOrder(ord+1);
		}
	}

	
	public static void removeLayer(List<MappingLayer> layersList, MappingLayer currentPosition) {
		sort(layersList);
		int i = find(layersList, currentPosition);
		if (i < 0) {
			return;
		}

		for (int j=0; j <= i; j++) {
			int ord = layersList.get(j).getOrder();
			layersList.get(j).setOrder(ord-1);
		}
	}	
	
}
