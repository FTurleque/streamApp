package com.streamapp.controllers.ihmControls;

import com.streamapp.model.interfaces.Stageable;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MediaViewController implements Stageable {
    public Pane sourcesContainer;
    public TableView grdSources;
    public TableColumn path;
    public TableColumn fileName;
    public TableColumn mediaType;
    public TableColumn fileOrigine;
    private Stage stage;

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void fileSelected(ActionEvent actionEvent) {
    }

    public void addSource(ActionEvent actionEvent) {
    }

    public void deleteSource(ActionEvent actionEvent) {
    }
}
