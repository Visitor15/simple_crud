package controllers;

/**
 * Created by nchampagne on 2/23/15.
 */
public interface LoggedController {
    void logCall();

    void logCallReturned();

    void logCallError();
}
