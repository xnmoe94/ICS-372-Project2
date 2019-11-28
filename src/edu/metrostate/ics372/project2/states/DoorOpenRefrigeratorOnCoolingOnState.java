package edu.metrostate.ics372.project2.states;

public class DoorOpenRefrigeratorOnCoolingOnState extends RefrigeratorState {
    private static DoorOpenRefrigeratorOnCoolingOnState instance;

    /**
     * Private constructor for the singleton pattern
     */
    private DoorOpenRefrigeratorOnCoolingOnState() {}

    /**
     * returns the instance
     *
     * @return this object
     */
    public static DoorOpenRefrigeratorOnCoolingOnState instance() {
        if (instance == null) {
            instance = new DoorOpenRefrigeratorOnCoolingOnState();
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
