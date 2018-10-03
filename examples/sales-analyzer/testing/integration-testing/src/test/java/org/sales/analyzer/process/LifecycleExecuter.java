package org.sales.analyzer.process;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.arquillian.core.api.annotation.Observes;

import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;
import ru.yandex.qatools.embed.postgresql.distribution.Version.Main;

import org.jboss.arquillian.container.spi.event.DeployManagedDeployments;
import org.jboss.arquillian.container.spi.event.SetupContainer;

public class LifecycleExecuter {

	private String query1 = "create unique index on KIESERVER.MAPPEDVARIABLE (PROCESSINSTANCEID )";
	private String query2 = "create unique index on KIESERVER.MAPPEDVARIABLE (VARIABLEID )";
	private String query3 = "create unique index on KIESERVER.PROCESSINSTANCELOG (PROCESSINSTANCEID )";
	private String query4 = "create unique index on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID )";
	private String query5 = "create unique index on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID )";
	public static boolean indicator = false;

	EmbeddedPostgres postgres;
	String url;

	public void executeBeforeStart(@Observes SetupContainer event) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				postgres.stop();
			}
		});

		try {
			postgres = new EmbeddedPostgres(Main.V9_6);
			url = postgres.start("localhost", 5432, "postgres", "postgres", "postgres");
// Create dump  pg_dump -Fc -U postgres postgres > ~/SalesAnalyzerDB.dump			
			postgres.getProcess().get().restoreFromFile(new File(System.getProperty("user.home") + "/SalesAnalyzerDB.dump"));
			postgres.getProcess().get().importFromFile(  new File(System.getProperty("user.home") +"/update_db.sql"  ));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void executeAfterDeployment(@Observes DeployManagedDeployments event) throws Exception {
	
		if (indicator) {
			return;
		}
		indicator = true;

		new TestCommons().buildAndDeployArtifacts();
//		new TestCommons().setupUsers();

		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			stmt.execute(query1);
			stmt.execute(query2);
			stmt.execute(query3);
			stmt.execute(query4);
			stmt.execute(query5);

		} finally {
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
