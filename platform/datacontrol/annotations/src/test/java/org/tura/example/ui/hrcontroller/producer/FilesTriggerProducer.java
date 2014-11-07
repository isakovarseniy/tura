package org.tura.example.ui.hrcontroller.producer;

import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.PreInsertTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.command.PreUpdateTrigger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class FilesTriggerProducer {
    @Produces
    @PreQuery("files")
    public PreQueryTrigger getPreQueryTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @PostQuery("files")
    public PostQueryTrigger getPostQueryTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @PostCreate("files")
    public PostCreateTrigger getPostCreateTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @PreDelete("files")
    public PreDeleteTrigger getPreDeleteTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @PreInsert("files")
    public PreInsertTrigger getPreInsertTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @PreUpdate("files")
    public PreUpdateTrigger getPreUpdateTrigger(InjectionPoint injectionPoint) {
        return null;

    }
}