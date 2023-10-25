package com.streamapp.controllers.ihmControls;

import com.jfoenix.controls.JFXButton;
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

    public void setCarrouselName(String carrouselName) {
        this.carrouselName.setText(carrouselName);
    }

    @FXML
    public GridPane gridCarrousel;

    @FXML
    public void rightSlide(ActionEvent actionEvent) {
    }

    @FXML
    public void leftSlide(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carrouselName.setText(gridCarrousel.getAccessibleText());
    }
}
