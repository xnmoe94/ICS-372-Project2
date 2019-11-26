package edu.metrostate.ics372.project2.states;

import edu.metrostate.ics372.project2.events.DoorCloseEvent;
import edu.metrostate.ics372.project2.events.DoorOpenEvent;
import edu.metrostate.ics372.project2.events.RefrigeratorOffEvent;
import edu.metrostate.ics372.project2.events.RefrigeratorOnEvent;

/**
 * The context is an observer for the temperature and stores the context info for
 * states
 *
 */
public class RefrigeratorContext {
	private RefrigeratorState currentState;
	private static RefrigeratorContext instance;
	
	private RefrigeratorContext() {
		instance = this;
		currentState = DoorClosedRefrigeratorOffState.instance();
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
	
    /**
     * Process door open request
     */
	public void handleEvent(DoorOpenEvent event) {
		instance.handleEvent(event);
	}
	
    /**
     * Process door close request
     */
	public void handleEvent(DoorCloseEvent event) {
		instance.handleEvent(event);
	}
	
    /**
     * Process refrigerator on request
     */
	public void handleEvent(RefrigeratorOnEvent event) {
		instance.handleEvent(event);
	}
	
    /**
     * Process refrigerator off request
     */
	public void handleEvent(RefrigeratorOffEvent event) {
		instance.handleEvent(event);
	}
}
