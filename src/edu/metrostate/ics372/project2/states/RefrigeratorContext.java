package edu.metrostate.ics372.project2.states;

import edu.metrostate.ics372.project2.display.RefrigeratorDisplay;
import edu.metrostate.ics372.project2.events.DoorCloseEvent;
import edu.metrostate.ics372.project2.events.DoorOpenEvent;
import edu.metrostate.ics372.project2.events.OutsideTempSetEvent;
import edu.metrostate.ics372.project2.events.RefrigeratorOffEvent;
import edu.metrostate.ics372.project2.events.RefrigeratorOnEvent;
import edu.metrostate.ics372.project2.events.RefrigeratorTempSetEvent;
/**
 * The context is an observer for the temperature and stores the context info for
 * states
 *
 */


public class RefrigeratorContext {
    private RefrigeratorDisplay display;
    private RefrigeratorState currentState;
    private boolean doorOpen;
    private static RefrigeratorContext instance;

    private RefrigeratorContext() {
        instance = this;
        currentState = DoorClosedRefrigeratorOffState.instance();
        doorOpen = false;
    }

    /**
     * returns the instance
     *
     * @return this object
     */
    public static RefrigeratorContext instance() {
        if (instance == null) {
            instance = new RefrigeratorContext();
        }

        return instance;
    }

    public void setDisplay(RefrigeratorDisplay display) {
        this.display = display;
    }

    /**
     * Process door open request
     */
    public void handleEvent(DoorOpenEvent event) {
        doorOpen = true;
        instance.handleEvent(event);
    }

    /**
     * Process door close request
     */
    public void handleEvent(DoorCloseEvent event) {
        doorOpen = false;
        instance.handleEvent(event);
    }

    /**
     * Process refrigerator on request
     */
    public void handleEvent(RefrigeratorOnEvent event) {
        if (!doorOpen) {
            instance.handleEvent(event);
        }
    }

    /**
     * Process refrigerator off request
     */
    public void handleEvent(RefrigeratorOffEvent event) {
        instance.handleEvent(event);
    }

    /**
     * Process the set outside temperature request
     */
    public void handleEvent(OutsideTempSetEvent event) {
        instance.handleEvent(event);
    }

    /**
     * Process the set fridge temperature request
     */
    public void handleEvent(RefrigeratorTempSetEvent event) {
        instance.handleEvent(event);
    }
}