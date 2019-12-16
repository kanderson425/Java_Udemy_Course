package com.kyleanderson.contactapplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    private ObservableList<Contact> contactList;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private TableView contactsTableView;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextArea notesField;

    public void initialize() {
        ObservableList<Contact> contacts = FXCollections.observableArrayList(
                new Contact("Kyle", "Anderson", "123-456-7890", "He is cool."),
                new Contact("Sarah","Smith","123-456-7890","She is very cool.")
        );

        contactsTableView.setItems(contacts);

    }




    //    public Contact processResults() {
//        SimpleStringProperty firstName = firstNameField.textProperty().bindBidirectional(new SimpleStringProperty(Contact.getFirstNameProperty()));
//        SimpleStringProperty lastName = lastNameField.getText().trim();
//        SimpleStringProperty phoneNumber = phoneNumberField.getText().trim();
//        SimpleStringProperty notes = notesField.getText().trim();
//
//        Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
//
//    }
//    @FXML
//    public void showNewItemDialog() {
//        Dialog<ButtonType> dialog = new Dialog<>();
//        dialog.initOwner(mainBorderPane.getScene().getWindow());
//        dialog.setTitle("Add New Contact");
//        dialog.setHeaderText("Use this dialog to create a new contact");
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("newContactDialog.fxml"));
//        try {
//            dialog.getDialogPane().setContent(fxmlLoader.load());
//        } catch (IOException e) {
//            System.out.println("Couldn't load the dialog");
//            e.printStackTrace();
//            return;
//        }
//
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
//
//        Optional<ButtonType> result = dialog.showAndWait();
//        if (result.isPresent() && result.get() == ButtonType.OK) {
////            DialogController controller = fxmlLoader.getController();
////            Contact newContact = controller.processResults();
////            contactListView.getSelectionModel().select(newContact);
//        }
//    }
}

