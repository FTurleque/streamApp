package com.streamapp.util;

import com.streamapp.SceneFxmlApp;
import com.streamapp.model.interfaces.Stageable;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Loading FXML files and updating the scenes MAP in {@link SceneFxmlApp}.
 * @author Turleque Fabrice
 * @version 2023-10-14
 */
public class FxmlLoad {
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Builds the scene from {@link FxmlInfo} or loads the built scene.
     *
     * Uses this class's ClassLoader to find the URL of the FXML file.  If the URL
     * is {@code null} then the FXML file could not be found.
     *
     * @param fxmlInfo the FXML file info to load the scene with
     * @return the built scene, or {@code null} if there was an error
     */
    public Scene load(FxmlInfo fxmlInfo) {

        if (fxmlInfo.hasScene()) {
            return fxmlInfo.getScene();
        }

        URL url = SceneFxmlApp.class.getResource(fxmlInfo.getResourceName());

        if (url == null) {
            logger.log(Level.WARNING,"The URL for the resource \"{}\" was not found", fxmlInfo.getResourceName());
            debugInfo(fxmlInfo.getResourceName()); // not required
            Platform.exit();
            return null;
        }

        FXMLLoader loader = new FXMLLoader(url);
        Scene scene;

        Parent p = loader.getRoot();
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
            Platform.exit();
            return null;
        }

        // Write back the updated FxmlInfo to the scenes Map in Main
        fxmlInfo.setScene(scene);
        SceneFxmlApp.updateScenes(fxmlInfo.getSceneName(), fxmlInfo);

        Stageable controller = loader.getController();
        if (controller != null) {
            controller.setStage(fxmlInfo.getStage());
        }

        return scene;
    }

    // This method isn't required, but it can help figure out why an FXML file isn't loading
    private void debugInfo(String resourceName) {
        logger.log(Level.WARNING,"Working Directory = {}", System.getProperty("user.dir"));
        logger.log(Level.WARNING,"Resources for {}", resourceName);
        try {
            Enumeration<URL> urls = ClassLoader.getSystemClassLoader().getResources(resourceName);
            while (urls.hasMoreElements()) {
                logger.log(Level.WARNING,urls.nextElement().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
