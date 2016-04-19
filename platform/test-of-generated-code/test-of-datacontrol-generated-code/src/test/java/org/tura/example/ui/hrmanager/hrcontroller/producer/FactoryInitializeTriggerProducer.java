package org.tura.example.ui.hrmanager.hrcontroller.producer;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;

import javax.annotation.Priority;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@Alternative
@Priority(0)
public class FactoryInitializeTriggerProducer {
    @Produces
    @Selector("hrmanager.hrcontroller")
    public FactoryInitializeTrigger produceFactoryInitializeTrigger(
        InjectionPoint injectionPoint) {
        return null;
    }
}
