package edu.metrostate.ics372.project2.events;

public class DoorCloseEvent {
    private static DoorCloseEvent instance;

    /**
     * Private constructor to create new DoorCloseEvent if instance field is null
     *
     */
    private DoorCloseEvent() {}

    /**
     * Singleton pattern to return instance of DoorCloseEvent
     *
     * @return the only instance
     */
    public static DoorCloseEvent instance() {
        if (instance == null) {
            instance = new DoorCloseEvent();
        }

        return instance;
    }
}
