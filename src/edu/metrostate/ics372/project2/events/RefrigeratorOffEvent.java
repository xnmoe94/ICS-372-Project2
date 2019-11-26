package edu.metrostate.ics372.project2.events;

public class RefrigeratorOffEvent {
	private static RefrigeratorOffEvent instance;
	
	/**
	 * Private constructor to create new RefrigeratorOffEvent if instance field is null
	 * 
	 */
	private RefrigeratorOffEvent() {}
	
    /**
     * Singleton pattern to return instance of RefrigeratorOffEvent
     * 
     * @return the only instance
     */
	public static RefrigeratorOffEvent instance() {
		if (instance == null) {
			instance = new RefrigeratorOffEvent();
		}
		
		return instance;
	}

}
