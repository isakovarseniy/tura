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

package org.tura.platform.selenium.primereact;

public abstract class Repeater {

	public abstract void action();

	public void repeat(int times) {
		for (int i = 0; i < times; i++) {
			try {
				action();
				return;
			} catch (Throwable w) {
				if (times - i == 1) {
					throw w;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}

	}

	public void waitOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}

}