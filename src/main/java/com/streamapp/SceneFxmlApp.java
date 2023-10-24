package com.streamapp;

import com.streamapp.model.SceneName;
import com.streamapp.util.FxmlInfo;
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
    protected static final String HOME_FXML = "ihm/home-view.fxml";
    protected static final String ALL_MOVIES_FXML = "ihm/movies-view.fxml";
    protected static final String SOURCES_FXML = "ihm/media-view.fxml";
    private static final String PROFIL_FXML = "";
    private static final String FAVORITES_FXML = "";
    private static final String CARROUSEL_FXML = "ihm/carrousel-view.fxml";
    private static final String ALL_SERIES_FXML = "";
    private static final String SETTING_FXML = "";
    /**
     * The information for various scenes to switch between
     */
    protected static Map<SceneName, FxmlInfo> scenes = new HashMap<>();

    /**
     * @return a Map of the {@link FxmlInfo} by {@link SceneName}
     */
    public static Map<SceneName, FxmlInfo> getScenes() {
        return scenes;
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
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        scenes.put(SceneName.HOME, new FxmlInfo(HOME_FXML, SceneName.HOME, stage));
        scenes.put(SceneName.ALL_MOVIES, new FxmlInfo(ALL_MOVIES_FXML, SceneName.ALL_MOVIES, stage));
        scenes.put(SceneName.MEDIA_SOURCES, new FxmlInfo(SOURCES_FXML, SceneName.MEDIA_SOURCES, stage));

        stage.setScene(scenes.get(SceneName.HOME).getScene());
        stage.setTitle("Streaming App");
//        stage.setFullScreen(true);
        stage.show();
    }
}