package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.w3c.dom.events.Event;

public class Controller {

    @FXML
    private Button clickMeButton;

        public void initialize() {
            clickMeButton.setOnAction(event -> System.out.println("You Clicked me!"));
        }
}
