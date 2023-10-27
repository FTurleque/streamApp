package com.streamapp.controllers.fxml;

import com.jfoenix.controls.JFXButton;
import com.streamapp.model.enums.MediaTypeEnum;
import com.streamapp.model.enums.TypeOfMediaEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CarrouselController implements Initializable {
    @FXML
    public JFXButton btnRightSlide;
    @FXML
    public JFXButton btnLeftSlide;
    @FXML
    public HBox sliderMedia;
    @FXML
    public Label carrouselName;
    @FXML
    public GridPane gridCarrousel;
    TypeOfMediaEnum type;
    MediaTypeEnum mediaType;

    @FXML
    public void rightSlide(ActionEvent actionEvent) {
    }

    @FXML
    public void leftSlide(ActionEvent actionEvent) {
    }

    public void setCarrouselName(String carrouselName) {
        this.carrouselName.setText(carrouselName);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Récupération des films (mediaType) ou séries selon le genre (type). Object Movie & Series
        // TODO: Création des images.
        // TODO: Association des images dans sliderMedia.
    }
}
