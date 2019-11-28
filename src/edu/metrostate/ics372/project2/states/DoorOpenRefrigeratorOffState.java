package edu.metrostate.ics372.project2.states;

public class DoorOpenRefrigeratorOffState extends RefrigeratorState {
    private static DoorOpenRefrigeratorOffState instance;

    /**
     * Private constructor for the singleton pattern
     */
    private DoorOpenRefrigeratorOffState() {}

    /**
     * returns the instance
     *
     * @return this object
     */
    public static DoorOpenRefrigeratorOffState instance() {
        if (instance == null) {
            instance = new DoorOpenRefrigeratorOffState();
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
