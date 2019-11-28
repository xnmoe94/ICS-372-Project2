package edu.metrostate.ics372.project2.application;


import edu.metrostate.ics372.project2.display.GUIDisplay;
import edu.metrostate.ics372.project2.display.RefrigeratorDisplay;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.application.Application;

import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
//        Clock.instance();
        new Thread() {
            @Override
            public void run() {
                Application.launch(GUIDisplay.class, null);
            }
        }.start();
        try {
            while (GUIDisplay.getInstance() == null) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
        }
        RefrigeratorDisplay display = GUIDisplay.getInstance();
        RefrigeratorContext.instance().setDisplay(display);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}