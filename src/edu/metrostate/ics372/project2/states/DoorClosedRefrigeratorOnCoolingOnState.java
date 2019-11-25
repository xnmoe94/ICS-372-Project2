package edu.metrostate.ics372.project2.states;

public class DoorClosedRefrigeratorOnCoolingOnState extends RefrigeratorState {
	private static DoorClosedRefrigeratorOnCoolingOnState instance;
	
    /**
     * Private constructor for the singleton pattern
     */
	private DoorClosedRefrigeratorOnCoolingOnState() {}

    /**
     * returns the instance
     * 
     * @return this object
     */
	public static DoorClosedRefrigeratorOnCoolingOnState instance() {
		if (instance == null) {
			instance = new DoorClosedRefrigeratorOnCoolingOnState();
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
