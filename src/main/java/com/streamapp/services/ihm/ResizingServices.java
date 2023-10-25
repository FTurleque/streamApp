package com.streamapp.services.ihm;

import com.streamapp.util.ResizeUtils;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.concurrent.atomic.AtomicReference;

public class ResizingServices {
    public void resizeScrollPaneSliders(Node parent, ScrollPane child)
    {
        if(parent != null) {
            if(parent instanceof BorderPane) {
                BorderPane container = (BorderPane) parent;
                AtomicReference<Double> x = new AtomicReference<>(container.getWidth());
                AtomicReference<Double> y = new AtomicReference<>(container.getHeight());

                container.getChildren().forEach(node -> {
                    /* Récupèration de l'espace disponible en fonction de l'état de la SideBar */
                    if (node instanceof VBox && node.getAccessibleText().equals("SideBar")) {
                        x.set(ResizeUtils.getMediaContainerWidth());
                    }
                });
                child.setPrefWidth(x.get());
                child.setPrefHeight(y.get());
                if(child.getContent() instanceof VBox) {
                    ((VBox) child.getContent()).getChildren().forEach(node -> {
                        if(node instanceof GridPane) {
                            resizeGridPaneSliders(x, y, (GridPane) node);
                        }
                    });
                }
            }
        }
    }

    private void resizeGridPaneSliders(AtomicReference<Double> x, AtomicReference<Double> y, GridPane child) {
        if(x != null && child != null) {
            child.getColumnConstraints().get(1).setPrefWidth(x.get() - 145);
            child.setPrefWidth(x.get());
        }
    }
}
