package com.streamapp.model;

import com.streamapp.util.FxmlLoad;
import javafx.stage.Stage;

/**
 * Marks the ability of a controller to set a stage.
 * Utilisation : {@link FxmlLoad}
 * @author Turleque Fabrice
 * @version 2023-10-14
 */
public interface Stageable {
    /** @param stage the stage to set */
    void setStage(Stage stage);
}
