package com.kyleanderson.contactapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    @FXML
    private BorderPane mainBorderPane;




    @FXML
    public void showNewItemDialog() {
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.initOwner(mainBorderPane.getScene().getWindow());
            dialog.setTitle("Add New Contact");
            dialog.setHeaderText("Use this dialog to create a new contact");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("newContactDialog.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load());
            } catch(IOException e) {
                System.out.println("Couldn't load the dialog");
                e.printStackTrace();
                return;
            }

            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
            if(result.isPresent() && result.get() == ButtonType.OK) {
                DialogController controller = fxmlLoader.getController();
                Contact newContact = controller.processResults();
                contactListView.getSelectionModel().select(newContact);
            }
}

