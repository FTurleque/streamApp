package com.streamapp.services.ihm;

import com.streamapp.controllers.fxml.MainController;
import com.streamapp.services.patterns.IObservable;
import com.streamapp.util.ResizeUtils;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ResizingServices {
    public void resizingElements(IObservable observable) {
        if(observable instanceof MainController) {
            MainController mainController = (MainController) observable;
            /* Récupération de l’élément parent et de ses enfants */
            BorderPane container = (BorderPane) mainController.getContainerState();
            ScrollPane scrollPane = (ScrollPane) container.getCenter();
            VBox vBox = (VBox) scrollPane.getContent();

            /* Redimenssionnement du ScrollPane contenant les sliders*/
            if (scrollPane != null) {
                resizeScrollPaneSliders(scrollPane);
            }
            /* Redimenssionnement de la VBox contenant les sliders*/
            if (vBox != null) {
                resizeVBoxSlidersContainerWidth(vBox);
            }
            vBox.getChildren().forEach(node -> {
                if (node instanceof GridPane) {
                    resizeGridPaneSlidersWidth((GridPane) node);
                }
            });
        }
    }

    public void resizeScrollPaneSliders(ScrollPane child) {
        if(child != null) {
            child.setPrefWidth(ResizeUtils.getMediaContainerWidth());
            child.setPrefHeight(ResizeUtils.getVisualScreenHeight());
        }
    }

    public void resizeGridPaneSlidersWidth(GridPane child) {
        if(child != null) {
            child.getColumnConstraints().get(1).setPrefWidth(ResizeUtils.getMediaContainerWidth() - 143.5);
        }
    }

    public void resizeVBoxSlidersContainerWidth(VBox child) {
        if(child != null) {
            child.setPrefWidth(ResizeUtils.getMediaContainerWidth());
        }
    }
}
