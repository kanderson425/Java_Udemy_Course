package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Model.Album;
import sample.Model.Artist;
import sample.Model.Datasource;

public class Controller {
    @FXML
    private TableView<Artist> artistTable;

    public void listArtists() {
        Task<ObservableList<Artist>> task = new GetAllArtistsTask();
        artistTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }

    @FXML
    public void listAlbumsForArtists() {
        final Artist artist = (Artist) artistTable.getSelectionModel().getSelectedItem();
        if(artist == null) {
            System.out.println("No artist selected");
            return;
        }
        Task<ObservableList<Album>> task = new Task<ObservableList<Album>>() {
            @Override
            protected ObservableList<Album> call() throws Exception {
                return FXCollections.observableArrayList(
                        Datasource.getInstance().queryAlbumsForArtistId(artist.getId()));
            }
        };
        artistTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();

    }

}

class GetAllArtistsTask extends Task {

    @Override
    public ObservableList<Artist> call() {
        return FXCollections.observableArrayList
                (Datasource.getInstance().queryArtists(Datasource.ORDER_BY_ASC));
    }

}
