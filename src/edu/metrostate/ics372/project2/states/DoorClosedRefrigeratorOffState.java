package edu.metrostate.ics372.project2.states;

public class DoorClosedRefrigeratorOffState extends RefrigeratorState{
    private static DoorClosedRefrigeratorOffState instance;

    /**
     * Private constructor for the singleton pattern
     */
    private DoorClosedRefrigeratorOffState() {}

    /**
     * returns the instance
     *
     * @return this object
     */
    public static DoorClosedRefrigeratorOffState instance() {
        if (instance == null) {
            instance = new DoorClosedRefrigeratorOffState();
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
