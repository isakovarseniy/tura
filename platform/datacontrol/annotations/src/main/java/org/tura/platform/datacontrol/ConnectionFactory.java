package org.tura.platform.datacontrol;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Factory;
import org.tura.platform.datacontrol.metainfo.Relation;

@Interceptor
@Factory
public class ConnectionFactory {
	@AroundInvoke
	public Object registerConnection(InvocationContext ctx) throws Exception {
		Connection  connection = ctx.getMethod().getAnnotation(Connection.class);
		DataControl<?>  dc =  (DataControl<?>) ctx.getTarget();
		Relation relation = dc.getChild(connection.connectionName());
		if (relation.getChild() != null  )
			  return relation.getChild();
		
		IDataControl child  = (IDataControl ) ctx.proceed();
		relation.setChild(child);
		dc.addChildren(connection.connectionName(), relation);
		
		return relation.getChild();
	}

}
