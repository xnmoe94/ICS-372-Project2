package edu.metrostate.ics372.project2.states;

import edu.metrostate.ics372.project2.events.DoorCloseEvent;
import edu.metrostate.ics372.project2.events.DoorOpenEvent;



public abstract class RefrigeratorState {

    /**
     * Initializes the state
     */
    public abstract void enter();

    /**
     * Performs any necessary clean up while leaving the state
     */
    public abstract void leave();

//    public void handleEvent(CoolingEnabledEvent event) {
//
//    }

    /**
     * Process door open request
     */
    public void handleEvent(DoorOpenEvent event) {

    }

    /**
     * Process door close request
     */
    public void handleEvent(DoorCloseEvent event) {

    }

}
