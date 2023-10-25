package com.streamapp.controllers.ihmControls;

import com.jfoenix.controls.JFXButton;
import com.streamapp.model.interfaces.IStageable;
import com.streamapp.services.ihm.ResizingServices;
import com.streamapp.services.patterns.IObservable;
import com.streamapp.services.patterns.IObserver;
import com.streamapp.util.ResizeUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class SlidersContainerControlleur implements IStageable, Initializable, IObserver {
    @FXML
    public ScrollPane scrollPaneSliders;
    @FXML
    public VBox vbSlidersContainer;
    @FXML
    public GridPane gridCarrousel;
    @FXML
    public HBox sliderMedia;
    @FXML
    public JFXButton btnRightSlide;
    @FXML
    public Label carrouselName;

    public ScrollPane getScrollPaneSliders() {
        return scrollPaneSliders;
    }

    public GridPane getGridCarrousel() {
        return gridCarrousel;
    }

    Stage stage;
    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setSlidersContainer(List<Node> nodes) {
        this.vbSlidersContainer.getChildren().addAll(nodes);
    }

    @FXML
    public void rightSlide(ActionEvent actionEvent) {
    }

    @FXML
    public void leftSlide(ActionEvent actionEvent) {
    }

    @Override
    public void Update(IObservable observable) {
        if(observable instanceof MainController) {
            MainController mainController = (MainController) observable;
            /* Récupération de l'élément qui à bougé */
            BorderPane container = (BorderPane) mainController.getContainerState();

            /* Redimenssionnement des éléments du ScrollPane contenant les sliders*/
            if(container.getCenter()  instanceof ScrollPane) {
                ResizingServices resizingServices = new ResizingServices();
                resizingServices.resizeScrollPaneSliders(container, (ScrollPane) container.getCenter());
            }
        }
    }
}
