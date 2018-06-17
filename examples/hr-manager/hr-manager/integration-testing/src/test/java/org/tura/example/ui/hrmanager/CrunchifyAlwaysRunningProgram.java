package org.tura.example.ui.hrmanager;

public class CrunchifyAlwaysRunningProgram {
	 
	public static void main(String args[]) {
 
		CrunchifyAlwaysRunningProgram object = new CrunchifyAlwaysRunningProgram();
		object.waitMethod();
 
	}
 
	public synchronized void waitMethod() {
 
		while (true) {
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
 			}
		}
 
	}
}