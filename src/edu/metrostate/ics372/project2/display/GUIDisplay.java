package edu.metrostate.ics372.project2.display;

import edu.metrostate.ics372.project2.buttons.GUIButton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
		
		AnchorPane pane = new AnchorPane();

        //Cooling Label
        Label label1 = new Label();
        label1.setLayoutX(22);
        label1.setLayoutY(14);
        label1.setText("Cooling on");

        //Fridge Temp
        Label label2 = new Label();
        label2.setLayoutX(188);
        label2.setLayoutY(14);
        label2.setText("Fridge Temp 31");


        Label label3 = new Label();
        label3.setLayoutX(335);
        label3.setLayoutY(14);
        label3.setText("Outside Temp 71");

        Label label4 = new Label();
        label4.setLayoutX(486);
        label4.setLayoutY(14);
        label4.setText("Light on");

        Label label5 = new Label();
        label5.setLayoutX(632);
        label5.setLayoutY(14);
        label5.setText("Frigde on");

        Label label6 = new Label();
        label6.setLayoutX(704);
        label6.setLayoutY(14);
        label6.setText("Door Closed");

        Button btn1 = new Button();
        btn1.setLayoutX(22);
        btn1.setLayoutY(37);
        btn1.setText("Close Door");

        Button btn2 = new Button();
        btn2.setLayoutX(188);
        btn2.setLayoutY(37);
        btn2.setText("Open Door");

        Button btn3 = new Button();
        btn3.setLayoutX(335);
        btn3.setLayoutY(37);
        btn3.setText("On");

        Button btn4 = new Button();
        btn4.setLayoutX(486);
        btn4.setLayoutY(37);
        btn4.setText("Off");

        TextField txtField1 = new TextField();
        txtField1.setLayoutX(22);
        txtField1.setLayoutY(77);
        txtField1.setText("70");

        Button btn5 = new Button();
        btn5.setLayoutX(195);
        btn5.setLayoutY(77);
        btn5.setText("Set Outside Temp");


        TextField txtField2 = new TextField();
        txtField2.setLayoutX(335);
        txtField2.setLayoutY(77);
        txtField2.setText("30");

        Button btn6 = new Button();
        btn6.setLayoutX(507);
        btn6.setLayoutY(77);
        btn6.setText("Set Desired Temp");
















        pane.getChildren().addAll(label1,label2,label3,
                label4,label5,label6, btn1, btn2,
                btn3,btn4, txtField1, btn5, txtField2, btn6);

        Scene scene;
        primaryStage.setScene(new Scene(pane, 799, 115));
        primaryStage.show();
        

		
	}

	@Override
	public void showOutsideTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showFridgeTemp() {
		// TODO Auto-generated method stub
		
	}

}
