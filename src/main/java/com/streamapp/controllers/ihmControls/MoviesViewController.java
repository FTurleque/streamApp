package com.streamapp.controllers.ihmControls;

import com.streamapp.model.Stageable;
import com.streamapp.model.TypeOfMovie;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MoviesView  implements Stageable, Initializable {

    @FXML
    public ScrollPane scrollView;
    @FXML
    public VBox slidersContainer;
    Stage stage;

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Parcourir enum TypeOfMovies et construir les carrousels.
        for(TypeOfMovie type : TypeOfMovie.values()) {

        }
    }
}
