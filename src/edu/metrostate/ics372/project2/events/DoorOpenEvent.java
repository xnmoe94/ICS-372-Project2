package edu.metrostate.ics372.project2.events;

public class DoorOpenEvent {
    private static DoorOpenEvent instance;

    /**
     * Private constructor to create new DoorOpenEvent if instance field is null
     *
     */
    private DoorOpenEvent() {}

    /**
     * Singleton pattern to return instance of DoorOpenEvent
     *
     * @return the only instance
     */
    public static DoorOpenEvent instance() {
        if (instance == null) {
            instance = new DoorOpenEvent();
        }

        return instance;
    }

}
