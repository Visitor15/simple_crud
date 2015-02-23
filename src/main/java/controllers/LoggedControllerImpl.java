package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by nchampagne on 2/23/15.
 */
public class LoggedControllerImpl implements LoggedController {

    // SLF4J logger
    private static Logger LOGGER = LoggerFactory.getLogger(LoggedControllerImpl.class);

    @Override
    public void logCall() {
        LOGGER.debug(getClass().getName(), "Method 'helloWorldLogged is about to be called!");
    }

    @Override
    public void logCallReturned() {
        LOGGER.debug(getClass().getName(), "Method 'helloWorldLogged has been called!");
    }

    @Override
    public void logCallError() {
        LOGGER.error(getClass().getName(), "Method helloWorldLogged has thrown an error!");
    }
}
