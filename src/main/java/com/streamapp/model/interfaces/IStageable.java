package com.streamapp.model.interfaces;

import com.streamapp.util.FxmlLoad;
import javafx.stage.Stage;

/**
 * Marks the ability of a controller to set a stage.
 * Utilisation : {@link FxmlLoad}
 * @author Turleque Fabrice
 * @version 2023-10-14
 */
public interface IStageable {
    /** @param stage the stage to set */
    void setStage(Stage stage);
}
