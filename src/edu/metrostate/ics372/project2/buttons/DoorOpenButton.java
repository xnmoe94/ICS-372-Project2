package edu.metrostate.ics372.project2.buttons;

import edu.metrostate.ics372.project2.buttons.GUIButton;
import edu.metrostate.ics372.project2.events.DoorOpenEvent;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;




public class DoorOpenButton extends GUIButton implements EventHandler<ActionEvent> {
    /**
     * Crates the button with the required label
     *
     * @param string
     *            the label
     */

    public DoorOpenButton(String string) {
        super(string);
    }

    @Override
    public void handle(ActionEvent event) {
        RefrigeratorContext.instance().handleEvent(DoorOpenEvent.instance());
    }

}
