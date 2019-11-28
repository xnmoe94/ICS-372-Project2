package edu.metrostate.ics372.project2.buttons;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;

public class SetFridgeTempButton  extends GUIButton implements EventHandler<ActionEvent> {


    /**
     * Create the button with the proper text. Makes the button a listener to
     * clicks on itself.
     *
     * @param string the text
     */
    public SetFridgeTempButton(String string) {
        super(string);
    }

    @Override
    public void handle(ActionEvent event) {

    }

    @Override
    public Node getStyleableNode() {
        return null;
    }
}
