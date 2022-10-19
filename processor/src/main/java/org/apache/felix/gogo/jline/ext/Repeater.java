/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.ext;

public abstract class Repeater {
	
	private long timeout = 500;
	private String message = "Error";
	
	public Repeater() {
		
	}
	
	public Repeater(long timeout, String message) {
		this.timeout = timeout;
		this.message = message;
	}
	

	public abstract void action() ;

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
					Thread.sleep(timeout);
				} catch (InterruptedException e) {
				}
			}
			System.out.println(message+" repeat .."+i);
		}

	}

	public void waitOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}

}