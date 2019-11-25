package edu.metrostate.ics372.project2.buttons;

import edu.metrostate.ics372.project2.buttons.GUIButton;
import edu.metrostate.ics372.project2.events.DoorCloseEvent;
import edu.metrostate.ics372.project2.states.RefrigeratorContext;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class DoorCloseButton extends GUIButton implements EventHandler<ActionEvent>{

	public DoorCloseButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		RefrigeratorContext.instance().handleEvent(DoorCloseEvent.instance());
	}

}
