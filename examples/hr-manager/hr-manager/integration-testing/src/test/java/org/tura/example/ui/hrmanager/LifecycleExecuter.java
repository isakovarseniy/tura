package org.tura.example.ui.hrmanager;

import java.io.File;
import java.io.IOException;

import org.jboss.arquillian.container.spi.event.SetupContainer;
import org.jboss.arquillian.container.spi.event.StopContainer;
import org.jboss.arquillian.core.api.annotation.Observes;
import org.tura.comfiguration.artifacts.ConfigConstants;

import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;
import ru.yandex.qatools.embed.postgresql.distribution.Version.Main;

public class LifecycleExecuter {
	EmbeddedPostgres postgres ;

	public void executeBeforeStart(@Observes SetupContainer event) {
		
       	try {
    		postgres = new EmbeddedPostgres(Main.V9_6);
			postgres.start("localhost", 5432, "arseniy", "arseniy", "postgres");
			postgres.getProcess().get().importFromFile( new File( ConfigConstants.RESOURCE_HOME+"/hrschema.sql")  );
			postgres.getProcess().get().importFromFile( new File( ConfigConstants.RESOURCE_HOME+"/hrcontroller.sql")  );
			
		} catch (IOException e) {
			e.printStackTrace();
		}    	

	}

	public void executeBeforeStop(@Observes StopContainer event) {
		postgres.stop();
	}

	
	
}
