package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import sample.datamodel.Contact;

public class Controller {
    private ObservableList<Contact> contactList;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private TableView contactsTableView;

    @FXML
    private TableColumn firstName = new TableColumn<>("FirstName");

    @FXML
    private TableColumn lastName = new TableColumn<>("LastName");

    @FXML
    private TableColumn phoneNumber = new TableColumn<>("PhoneNumber");

    @FXML
    private TableColumn notes = new TableColumn<>("Notes");

    public void initialize() {
        ObservableList<Contact> contacts = FXCollections.observableArrayList(
                new Contact("Kyle", "Anderson", "123-456-7890", "He is cool."),
                new Contact("Sarah","Smith","123-456-7890","She is very cool.")
        );






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

