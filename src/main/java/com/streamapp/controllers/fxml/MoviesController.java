package com.streamapp.controllers.fxml;

import com.streamapp.model.enums.TypeOfMediaEnum;
import com.streamapp.model.interfaces.IStageable;
import com.streamapp.model.interfaces.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class MoviesController implements IStageable, Initializable {

    @FXML
    public ScrollPane scrollView;
    @FXML
    public VBox slidersContainer;
    Stage stage;

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    Dictionary<String, ArrayList<Media>> listMedia = new Hashtable<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Parcourir enum TypeOfMovies et construir les carrousels.
        // TODO: Creer des listes de types de films ou de types de séries selon ou on est.
        for(TypeOfMediaEnum type : TypeOfMediaEnum.values()) {
            // TODO: Vérifier si le genre de média possède des medias dans sa liste.
            // TODO: Créer les differents carrousels (et definir la position du bouton de droite).
            // TODO: Alimenter le carrousel avec les médias selon le type.
        }
    }

    @FXML
    public void actionMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void animationMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void adventureMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void comedyMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void documentaryMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void dramaMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void familyMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void fantastiqueMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void warMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void historyMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void mysteryMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void romanceMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void sciFiMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void tvShowMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void thrillerMoviesDisplay(ActionEvent actionEvent) {
    }

    @FXML
    public void westernMoviesDisplay(ActionEvent actionEvent) {
    }
}
