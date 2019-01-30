package org.apache.felix.gogo.jline;

import org.apache.felix.service.command.CommandSession;

public interface SessionAware {

    void setSession(CommandSession session);
    
}

