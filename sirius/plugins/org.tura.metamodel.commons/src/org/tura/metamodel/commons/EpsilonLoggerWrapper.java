package org.tura.metamodel.commons;

import org.eclipse.epsilon.common.dt.util.LogUtil;

public class EpsilonLoggerWrapper implements LoggerWrapper{

    @Override
    public void logInfo(String message) {
        LogUtil.logInfo(message);
        
    }

}

