package com.streamapp.controllers.fxml;

import com.streamapp.controllers.ControllerFXML;
import com.streamapp.model.enums.MediaTypeEnum;
import com.streamapp.model.interfaces.IStageable;
import com.streamapp.services.ihm.ResizingServices;
import com.streamapp.services.patterns.IObservable;
import com.streamapp.services.patterns.IObserver;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SlidersContainerControlleur implements IStageable, Initializable, IObserver {
    @FXML
    public ScrollPane scrollPaneSliders;
    @FXML
    public VBox vbSlidersContainer;
    public GridPane gridSliders;
    List<MediaTypeEnum> mediaType;
    ControllerFXML controllerFXML;
    private ControllerFXML getControllerFXML() {
        if(controllerFXML == null) {
            controllerFXML = new ControllerFXML();
        }
        return controllerFXML;
    }


    Stage stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ResizingServices resizingServices = new ResizingServices();
        if(mediaType.size() != 1) {

        }
        resizingServices.resizeGridPaneSlidersWidth(gridSliders);
        // TODO: Récupération des films (mediaType) ou séries selon le genre (type). Object Movie & Series
        // TODO: Création des images.
        // TODO: Association des images dans sliderMedia.

    }
    private void rightMove(HBox sliderMedia) {
        if(sliderMedia.getChildren().size() > 5) {
        List<ImageView> newList = new ArrayList<>();
        newList.add((ImageView)sliderMedia.getChildren().get(sliderMedia.getChildren().size() - 1));
        ObservableList<Node> imgList = (sliderMedia.getChildren());
        List<Node> list = imgList.subList(0, sliderMedia.getChildren().size() - 1);
        list.forEach(node -> newList.add((ImageView)node));
        sliderMedia.getChildren().removeAll(sliderMedia.getChildren());
        newList.forEach(imageView -> sliderMedia.getChildren().addAll(imageView));
        }
    }

    private void leftMove(HBox sliderMedia) {
        if(sliderMedia.getChildren().size() > 5) {
            ImageView img = (ImageView) sliderMedia.getChildren().get(0);
            sliderMedia.getChildren().remove(0);
            sliderMedia.getChildren().add(img);
        }
    }

    @Override
    public void Update(IObservable observable) {
        ResizingServices resizingServices = new ResizingServices();
        resizingServices.resizingElements(observable);
    }

    @Deprecated
    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType.add(mediaType);
    }

    public ScrollPane getScrollPaneSliders() {
        return scrollPaneSliders;
    }

    @FXML
    public Label label1;
    @FXML
    public HBox sliderMedia1;
    @FXML
    public void rightSlide1(ActionEvent actionEvent) {
        rightMove(sliderMedia1);
    }
    @FXML
    public void leftSlide1(ActionEvent actionEvent) {
        leftMove(sliderMedia1);
    }

    @FXML
    public Label label2;
    @FXML
    public HBox sliderMedia2;
    @FXML
    public void rightSlide2(ActionEvent actionEvent) {
        rightMove(sliderMedia2);
    }
    @FXML
    public void leftSlide2(ActionEvent actionEvent) {
        leftMove(sliderMedia2);
    }

    @FXML
    public Label label3;
    @FXML
    public HBox sliderMedia3;
    @FXML
    public void rightSlide3(ActionEvent actionEvent) {
        rightMove(sliderMedia3);
    }
    @FXML
    public void leftSlide3(ActionEvent actionEvent) {
        leftMove(sliderMedia3);
    }

    @FXML
    public Label label4;
    @FXML
    public HBox sliderMedia4;
    @FXML
    public void rightSlide4(ActionEvent actionEvent) {
        rightMove(sliderMedia4);
    }
    @FXML
    public void leftSlide4(ActionEvent actionEvent) {
        leftMove(sliderMedia4);
    }

    @FXML
    public Label label5;
    @FXML
    public HBox sliderMedia5;
    @FXML
    public void rightSlide5(ActionEvent actionEvent) {
        rightMove(sliderMedia5);
    }
    @FXML
    public void leftSlide5(ActionEvent actionEvent) {
        leftMove(sliderMedia5);
    }

    @FXML
    public Label label6;
    @FXML
    public HBox sliderMedia6;
    @FXML
    public void rightSlide6(ActionEvent actionEvent) {
        rightMove(sliderMedia6);
    }
    @FXML
    public void leftSlide6(ActionEvent actionEvent) {
        leftMove(sliderMedia6);
    }

    @FXML
    public Label label7;
    @FXML
    public HBox sliderMedia7;
    @FXML
    public void rightSlide7(ActionEvent actionEvent) {
        rightMove(sliderMedia7);
    }
    @FXML
    public void leftSlide7(ActionEvent actionEvent) {
        leftMove(sliderMedia7);
    }

    @FXML
    public Label label8;
    @FXML
    public HBox sliderMedia8;
    @FXML
    public void rightSlide8(ActionEvent actionEvent) {
        rightMove(sliderMedia8);
    }
    @FXML
    public void leftSlide8(ActionEvent actionEvent) {
        leftMove(sliderMedia8);
    }

    @FXML
    public Label label9;
    @FXML
    public HBox sliderMedia9;
    @FXML
    public void rightSlide9(ActionEvent actionEvent) {
        rightMove(sliderMedia9);
    }
    @FXML
    public void leftSlide9(ActionEvent actionEvent) {
        leftMove(sliderMedia9);
    }

    @FXML
    public Label label10;
    @FXML
    public HBox sliderMedia10;
    @FXML
    public void rightSlide10(ActionEvent actionEvent) {
        rightMove(sliderMedia10);
    }
    @FXML
    public void leftSlide10(ActionEvent actionEvent) {
        leftMove(sliderMedia10);
    }

    @FXML
    public Label label11;
    @FXML
    public HBox sliderMedia11;
    @FXML
    public void rightSlide11(ActionEvent actionEvent) {
        rightMove(sliderMedia11);
    }
    @FXML
    public void leftSlide11(ActionEvent actionEvent) {
        leftMove(sliderMedia11);
    }

    @FXML
    public Label label12;
    @FXML
    public HBox liderMedia12;
    @FXML
    public void rightSlide12(ActionEvent actionEvent) {
        rightMove(liderMedia12);
    }
    @FXML
    public void leftSlide12(ActionEvent actionEvent) {
        leftMove(liderMedia12);
    }

    @FXML
    public Label label13;
    @FXML
    public HBox sliderMedia13;
    @FXML
    public void rightSlide13(ActionEvent actionEvent) {
        rightMove(sliderMedia13);
    }
    @FXML
    public void leftSlide13(ActionEvent actionEvent) {
        leftMove(sliderMedia13);
    }

    @FXML
    public Label label14;
    @FXML
    public HBox sliderMedia14;
    @FXML
    public void rightSlide14(ActionEvent actionEvent) {
        rightMove(sliderMedia14);
    }
    @FXML
    public void leftSlide14(ActionEvent actionEvent) {
        leftMove(sliderMedia14);
    }

    @FXML
    public Label label15;
    @FXML
    public HBox sliderMedia15;
    @FXML
    public void rightSlide15(ActionEvent actionEvent) {
        rightMove(sliderMedia15);
    }
    @FXML
    public void leftSlide15(ActionEvent actionEvent) {
        leftMove(sliderMedia15);
    }
}
