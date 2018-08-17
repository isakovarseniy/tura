package org.sales.analyzer.process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.arquillian.core.api.annotation.Observes;

import org.jboss.arquillian.container.spi.event.DeployManagedDeployments;

public class LifecycleExecuter {

	private String query1 = "create unique index  on KIESERVER.MAPPEDVARIABLE (PROCESSINSTANCEID )";
	private String query2 = "create unique index  on KIESERVER.MAPPEDVARIABLE (VARIABLEID  )";
	private String query3 = "create unique index  on KIESERVER.PROCESSINSTANCELOG (PROCESSINSTANCEID  )";
	private String query4 = "create unique index  on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID  )";
	private String query5 = "create unique index  on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID  )";
	
	
	public void executeAfterDeployment(@Observes DeployManagedDeployments event) throws Exception {
		
		new TestCommons().buildAndDeployArtifacts();
		new TestCommons().setupUsers();

		
		Connection conn= null;
		Statement stmt = null;
		try {
			   Class.forName("org.h2.jdbcx.JdbcDataSource");
			   conn = DriverManager.getConnection("jdbc:h2:~/SalesAnalyzerDB;AUTO_SERVER=TRUE;MULTI_THREADED=TRUE","sa","sa");
			   stmt = conn.createStatement();
			   stmt.execute(query1);
			   stmt.execute(query2);
			   stmt.execute(query3);
			   stmt.execute(query4);
			   stmt.execute(query5);
		
		}finally {
			    if (stmt != null) {
			    	    stmt.close();
			    }
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
					}
				}
			}
	}	
}
