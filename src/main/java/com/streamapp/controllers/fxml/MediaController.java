package com.streamapp.controllers.fxml;

import com.streamapp.model.interfaces.IStageable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MediaController implements IStageable, Initializable {
    @FXML
    public Pane sourcesContainer;
    @FXML
    public TableView grdSources;
    @FXML
    public TableColumn path;
    @FXML
    public TableColumn fileName;
    @FXML
    public TableColumn mediaType;
    @FXML
    public TableColumn fileOrigine;
    private Stage stage;

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void fileSelected(ActionEvent actionEvent) {
    }

    @FXML
    public void addSource(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteSource(ActionEvent actionEvent) {
    }
}
