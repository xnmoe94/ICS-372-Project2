package edu.metrostate.ics372.project2.states;

public class DoorOpenRefrigeratorOnCoolingOffState extends RefrigeratorState{
	private static DoorOpenRefrigeratorOnCoolingOffState instance;
	
    /**
     * Private constructor for the singleton pattern
     */
	private DoorOpenRefrigeratorOnCoolingOffState() {}
	
    /**
     * returns the instance
     * 
     * @return this object
     */
	public static DoorOpenRefrigeratorOnCoolingOffState instance() {
		if (instance == null) {
			instance = new DoorOpenRefrigeratorOnCoolingOffState();
		}
		
		return instance;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}
}
