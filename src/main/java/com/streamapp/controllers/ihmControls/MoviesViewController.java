package com.streamapp.controllers.ihmControls;

import com.streamapp.model.interfaces.Media;
import com.streamapp.model.interfaces.Stageable;
import com.streamapp.model.enums.TypeOfMediaEnum;
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

public class MoviesViewController implements Stageable, Initializable {

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

    public void actionMoviesDisplay(ActionEvent actionEvent) {
    }

    public void animationMoviesDisplay(ActionEvent actionEvent) {
    }

    public void adventureMoviesDisplay(ActionEvent actionEvent) {
    }

    public void comedyMoviesDisplay(ActionEvent actionEvent) {
    }

    public void documentaryMoviesDisplay(ActionEvent actionEvent) {
    }

    public void dramaMoviesDisplay(ActionEvent actionEvent) {
    }

    public void familyMoviesDisplay(ActionEvent actionEvent) {
    }

    public void fantastiqueMoviesDisplay(ActionEvent actionEvent) {
    }

    public void warMoviesDisplay(ActionEvent actionEvent) {
    }

    public void historyMoviesDisplay(ActionEvent actionEvent) {
    }

    public void mysteryMoviesDisplay(ActionEvent actionEvent) {
    }

    public void romanceMoviesDisplay(ActionEvent actionEvent) {
    }

    public void sciFiMoviesDisplay(ActionEvent actionEvent) {
    }

    public void tvShowMoviesDisplay(ActionEvent actionEvent) {
    }

    public void thrillerMoviesDisplay(ActionEvent actionEvent) {
    }

    public void westernMoviesDisplay(ActionEvent actionEvent) {
    }
}
