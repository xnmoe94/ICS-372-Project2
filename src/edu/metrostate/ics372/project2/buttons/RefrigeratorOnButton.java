package edu.metrostate.ics372.project2.buttons;

import edu.metrostate.ics372.project2.events.RefrigeratorOnEvent;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import javafx.scene.Node;

public class RefrigeratorOnButton extends GUIButton implements EventHandler<ActionEvent> {
    /**
     * Crates the button with the required label
     *
     * @param string
     *            the label
     */

    public RefrigeratorOnButton(String string) {
        super(string);
    }

    @Override
    public void handle(ActionEvent event) {
        RefrigeratorContext.instance().handleEvent(RefrigeratorOnEvent.instance());

    }


    @Override
    public Node getStyleableNode() {
        return null;
    }
}
