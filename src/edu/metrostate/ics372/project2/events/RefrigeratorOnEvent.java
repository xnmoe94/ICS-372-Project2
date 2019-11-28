package edu.metrostate.ics372.project2.events;

public class RefrigeratorOnEvent {
    private static RefrigeratorOnEvent instance;

    /**
     * Private constructor to create new RefrigeratorOnEvent if instance field is null
     *
     */

    private RefrigeratorOnEvent() {}

    /**
     * Singleton pattern to return instance of RefrigeratorOnEvent
     *
     * @return the only instance
     */

    public static RefrigeratorOnEvent instance() {
        if (instance == null) {
            instance = new RefrigeratorOnEvent();
        }

        return instance;
    }

}
