package edu.metrostate.ics372.project2.display;

/**
 * Interface for what should be displayed to the user for the Refrigerator application
 * 
 * */

public interface RefrigeratorDisplay {

	
    /**
     * Indicate that the light is on
     */
    public void showLightOn();

    /**
     * Indicate that the light is off
     */
    public void showLightOff();
    
    /**
     * Indicate that the door is now closed
     */
    public void showDoorClosed();

    /**
     * Indicate that the door is now open
     */
    public void showDoorOpened();
    
    /**
     * Indicate that the refrigerator is on
     */
    public void showFridgeOn();

    /**
     * Indicate that the refrigerator is off
     */
    public void showFridgeOff();
    
    /**
     * Indicate that the refrigerator cooling unit is on
     */
    public void showCoolingUnitOn();

    /**
     * Indicate that the refrigerator is off
     */
    public void showCoolingUnitOff();
}
