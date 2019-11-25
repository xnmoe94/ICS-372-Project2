package edu.metrostate.ics372.project2.display;

import edu.metrostate.ics372.project2.buttons.GUIButton;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIDisplay extends Application implements RefrigeratorDisplay {
	private GUIButton doorClose;
	private GUIButton doorOpen;
	private GUIButton refrigeratorOn;
	private GUIButton refrigeratorOff;
	private GUIButton setOutsideTemp;
	private GUIButton setRefrigeratorTemp;
	private Text doorStatus = new Text("Door closed");
	private Text lightStatus = new Text("Light off");
	private Text refrigeratorStatus = new Text("Refrigerator off");
	private static RefrigeratorDisplay display;
	private RefrigeratorContext refrigeratorContext;
	
	public static RefrigeratorDisplay getInstance() {
		return display;
	}

    /**
     * Indicate that the light is on
     */
	@Override
	public void showLightOn() {
		lightStatus.setText("Light on");		
	}
	
    /**
     * Indicate that the light is off
     */
	@Override
	public void showLightOff() {
		lightStatus.setText("Light off");
		
	}

    /**
     * Indicate that the door is closed
     */
	@Override
	public void showDoorClosed() {
		doorStatus.setText("Door closed");
		
	}

    /**
     * Indicate that the door is opened
     */
	@Override
	public void showDoorOpened() {
		doorStatus.setText("Door opened");
		
	}

    /**
     * Indicate that the refrigerator is on
     */
	@Override
	public void showFridgeOn() {
		lightStatus.setText("Refrigerator on");
		
	}

    /**
     * Indicate that the refrigerator is off
     */
	@Override
	public void showFridgeOff() {
		lightStatus.setText("Refrigerator off");
		
	}

    /**
     * Indicate that the cooling unit is on
     */
	@Override
	public void showCoolingUnitOn() {
		lightStatus.setText("Cooling unit on");
		
	}

    /**
     * Indicate that the cooling unit is off
     */
	@Override
	public void showCoolingUnitOff() {
		lightStatus.setText("Cooling unit off");
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
