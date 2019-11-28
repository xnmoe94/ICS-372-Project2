package edu.metrostate.ics372.project2.states;

public class DoorClosedRefrigeratorOnCoolingOffState extends RefrigeratorState {
    private static DoorClosedRefrigeratorOnCoolingOffState instance;

    /**
     * Private constructor for the singleton pattern
     */
    private DoorClosedRefrigeratorOnCoolingOffState() {}

    /**
     * returns the instance
     *
     * @return this object
     */
    public static DoorClosedRefrigeratorOnCoolingOffState instance() {
        if (instance == null) {
            instance = new DoorClosedRefrigeratorOnCoolingOffState();
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
