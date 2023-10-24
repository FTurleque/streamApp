package com.streamapp.controllers.ihmControls;

import com.jfoenix.controls.JFXButton;
import com.streamapp.SceneFxmlApp;
import com.streamapp.model.SceneName;
import com.streamapp.model.interfaces.Stageable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeViewController implements Stageable, Initializable {
    @FXML
    public BorderPane firstContainer;
    private Stage stage;
    @FXML
    VBox sideBoxLeftMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Verifier si il y a déjà des sources renseignées si non on ouvre la géstions des sources
//        firstContainer.setCenter(SceneFxmlApp.getScenes().get(SceneName.SOURCES).getScene().getRoot());
//        try {
//            Parent loader = FXMLLoader.load(SceneFxmlApp.class.getResource("ihm/msources-view.fxml"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static boolean isIsOpenGlobalMenu() {
        return isOpenGlobalMenu;
    }

    private static boolean isOpenGlobalMenu = true;

    public void burgerMenusClick(MouseEvent mouseEvent) {
        sideBoxLeftMenu.getChildren().forEach(btn ->{
            if(btn.getClass() == JFXButton.class) {
                ((JFXButton) btn).setText(((JFXButton) btn).getText().isEmpty()? btn.getAccessibleText(): "");
                isOpenGlobalMenu = !isIsOpenGlobalMenu();
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

    @FXML
    public void mediaSourcesDisplay(ActionEvent actionEvent) {
//        Scene s = SceneFxmlApp.getScenes().get(SceneName.SOURCES).getScene();
        firstContainer.setCenter(SceneFxmlApp.getScenes().get(SceneName.MEDIA_SOURCES).getScene().getRoot());
    }

    @FXML
    public void moviesDisplay(ActionEvent actionEvent) {
        Scene s = SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene();
        firstContainer.setCenter(SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene().getRoot());
//        stage.setScene(SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene());
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void applicationClose(ActionEvent actionEvent) {
    }
}
