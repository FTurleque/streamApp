package com.streamapp;

import com.streamapp.model.enums.SceneName;
import com.streamapp.util.FxmlInfo;
import com.streamapp.util.ResizeUtils;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

import static javafx.application.Application.launch;

/**
 * Sets all scene info into a Map and displays the main scene.
 * Utilisation : {@link SceneFxmlAppLauncher}
 * @author Turleque Fabrice
 * @version 2023-10-14
 */
public class SceneFxmlApp extends Application {
    private static final String MAIN_FXML = "fxml/main-view.fxml";
    private static final String ALL_MOVIES_FXML = "fxml/movies-view.fxml";
    private static final String SOURCES_FXML = "fxml/media-view.fxml";
    private static final String PROFIL_FXML = "";
    private static final String SLIDERS_CONTAINER_FXML = "fxml/container-sliders-view.fxml";
    private static final String FAVORITES_FXML = "";
    private static final String CARROUSEL_FXML = "fxml/carrousel-view.fxml";
    private static final String ALL_SERIES_FXML = "";
    private static final String SETTING_FXML = "";
    /**
     * The information for various scenes to switch between
     */
    protected static Map<SceneName, FxmlInfo> scenes = new HashMap<>();


    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) {
        scenes.put(SceneName.MAIN, new FxmlInfo(MAIN_FXML, SceneName.MAIN, stage));
        scenes.put(SceneName.SLIDERS, new FxmlInfo(SLIDERS_CONTAINER_FXML, SceneName.SLIDERS, stage));
        scenes.put(SceneName.MOVIES, new FxmlInfo(ALL_MOVIES_FXML, SceneName.MOVIES, stage));
        scenes.put(SceneName.MFILES, new FxmlInfo(SOURCES_FXML, SceneName.MFILES, stage));

        stage.setScene(scenes.get(SceneName.MAIN).getScene());
        stage.setTitle("Streaming App");
//        stage.setFullScreen(true);
        stage.show();
    }

    /**
     * Update the scene Map with new FxmlInfo
     *
     * @param name the {@link SceneName} that is the key to update
     * @param info the {@link FxmlInfo} that is the data to update
     */
    public static void updateScenes(SceneName name, FxmlInfo info) {
        scenes.put(name, info);
    }

    /**
     * @return a Map of the {@link FxmlInfo} by {@link SceneName}
     */
    public static Map<SceneName, FxmlInfo> getScenes() {
        return scenes;
    }
}