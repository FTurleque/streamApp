package com.streamapp.util;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

import java.awt.*;

public class HardwareUtility {
    private static Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private static int dimension2 = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
    private static Rectangle2D rect = Screen.getPrimary().getVisualBounds();

    // TODO: Récupérer la taille de la fenetre, la taille de l'element.
    public static Dimension getScreenSize() {
        return dimension;
    }

    public static int getScreenWidth() {
        return (int)dimension.getWidth();
    }

    @Deprecated
    public static int getScreenResolution() {
        return dimension2;
    }

    @Deprecated
    public static int getScreenHeight() {
        return (int)dimension.getHeight();
    }

    @Deprecated
    public static Rectangle2D getVisualBounds() {
        return rect;
    }

    public static int getVisualScreenWidth() {
        return (int)rect.getWidth();
    }

    public static int getVisualScreenHeight() {
        return (int)rect.getHeight();
    }
}
