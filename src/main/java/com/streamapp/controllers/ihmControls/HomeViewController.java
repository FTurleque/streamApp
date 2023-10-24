package com.streamapp.controllers.ihmControls;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.streamapp.SceneFxmlApp;
import com.streamapp.model.SceneName;
import com.streamapp.model.Stageable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeView implements Stageable {
    @FXML
    public BorderPane firstContainer;
    private Stage stage;
    @FXML
    VBox sideBoxLeftMenu;

    public void burgerMenusClick(MouseEvent mouseEvent) {
        sideBoxLeftMenu.getChildren().forEach(btn ->{
            if(btn.getClass() == JFXButton.class) {
                ((JFXButton) btn).setText(((JFXButton) btn).getText().isEmpty()? btn.getAccessibleText(): "");
            }
        });
    }

    public void search(ActionEvent actionEvent) {
    }

    public void manageProfils(ActionEvent actionEvent) {
    }

    public void homeDisplay(ActionEvent actionEvent) {
    }

    public void favoriteDisplay(ActionEvent actionEvent) {
    }

    public void seriesDisplay(ActionEvent actionEvent) {
    }

    public void settingDisplay(ActionEvent actionEvent) {
    }

    public void sourcesDisplay(ActionEvent actionEvent) {
    }

    public void moviesDisplay(ActionEvent actionEvent) {
//        firstContainer.setCenter(SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene().getRoot());
        stage.setScene(SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene());
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

//    public void moviesDisplay(MouseEvent mouseEvent) throws IOException {
//        try {
//            URL root = getClass().getResource("all-gender-movies-view22.fxml");
//            actionContainer = FXMLLoader.load(root);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////        stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
//    }
}
