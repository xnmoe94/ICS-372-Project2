package edu.metrostate.ics372.project2.buttons;


import edu.metrostate.ics372.project2.display.RefrigeratorDisplay;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUIDisplay extends Application implements RefrigeratorDisplay {
    private GUIButton doorClose;
    private GUIButton doorOpen;
    private GUIButton refrigeratorOn;
    private GUIButton refrigeratorOff;
    private GUIButton setOutsideTemp;
    private GUIButton setRefrigeratorTemp;
    private TextField outsideTempTextField;
    private TextField fridgeTempTextField;
    private Text doorStatus = new Text("Door closed");
    private Text lightStatus = new Text("Light off");
    private Text refrigeratorStatus = new Text("Fridge off");
    private Text coolingStatus = new Text("Cooling on");
    //TODO: Alter text for fridge temp and outside temp to append value
    private Text fridgeTemp = new Text("Fridge temp");
    private Text outsideTemp = new Text("Outside temp");
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
        refrigeratorStatus.setText("Refrigerator on");

    }

    /**
     * Indicate that the refrigerator is off
     */
    @Override
    public void showFridgeOff() {
        refrigeratorStatus.setText("Refrigerator off");

    }

    /**
     * Indicate that the cooling unit is on
     */
    @Override
    public void showCoolingUnitOn() {
        coolingStatus.setText("Cooling on");
    }

    /**
     * Indicate that the cooling unit is off
     */
    @Override
    public void showCoolingUnitOff() {
        coolingStatus.setText("Cooling off");
    }

    @Override
    public void showOutsideTemp() {
        // TODO Auto-generated method stub

    }

    @Override
    public void showFridgeTemp() {
        // TODO Auto-generated method stub
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        refrigeratorContext = RefrigeratorContext.instance();
        refrigeratorContext.setDisplay(this);
        display = this;
        doorClose = new DoorCloseButton("Close door");
        doorOpen = new DoorOpenButton ("Open door");
        refrigeratorOn = new RefrigeratorOnButton("On");
        refrigeratorOff = new RefrigeratorOffButton("Off");
        setOutsideTemp = new SetOutsideTempButton("Set outside temp");
        setRefrigeratorTemp = new SetFridgeTempButton("Set desired refrigerator temp");
        outsideTempTextField = new TextField();
        fridgeTempTextField = new TextField();

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(7);
        pane.setPadding(new Insets(10, 10, 10, 10));

        //First row
        pane.add(coolingStatus, 0, 0);
        pane.add(fridgeTemp, 9, 0);
        pane.add(outsideTemp, 14, 0);
        pane.add(lightStatus, 22, 0);
        pane.add(refrigeratorStatus, 30, 0);
        pane.add(doorStatus, 34, 0);

        //Second row
        pane.add(doorClose, 0, 1);
        GridPane.setColumnSpan(doorClose, 3);
        pane.add(doorOpen, 9, 1);
        GridPane.setColumnSpan(doorOpen, 3);
        pane.add(refrigeratorOn, 14, 1);
        pane.add(refrigeratorOff, 22, 1);

        //Third row
        pane.add(outsideTempTextField, 0, 3);
        GridPane.setColumnSpan(outsideTempTextField, 9);
        pane.add(setOutsideTemp, 9, 3);
        GridPane.setColumnSpan(setOutsideTemp, 10);
        pane.add(fridgeTempTextField, 14, 3);
        GridPane.setColumnSpan(fridgeTempTextField, 8);
        pane.add(setRefrigeratorTemp, 22, 3);
        GridPane.setColumnSpan(setRefrigeratorTemp, 10);

    //     GridPane.setFillWidth(outsideTempTextField, true);

        showDoorClosed();
        showLightOff();

        Scene scene = new Scene(pane, 750, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ICS-372 Project 2: Refrigerator");

        try {
            while (refrigeratorContext == null) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }

        primaryStage.show();
        primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent window) {
                System.exit(0);
            }
        });

    }

}