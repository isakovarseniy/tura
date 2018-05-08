package org.tura.platform.object.persistence.operation;

public interface RelOperation {
	void connect (Object master, Object detail , String property) throws Exception;
	void disconnect (Object master, Object detail , String property) throws Exception;

}
