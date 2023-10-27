package com.streamapp.util;

import com.streamapp.controllers.fxml.MainController;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

import java.awt.*;

public class ResizeUtils {
    // TODO: Récupérer la taille de la fenetre, la taille de l'element.
    public static Dimension getScreenSize() {
        return dimension;
    }
    private static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    private static int dimension2 = Toolkit.getDefaultToolkit().getScreenResolution();
    private static Rectangle2D rect = Screen.getPrimary().getVisualBounds();
    public static final int APP_LEFT_MENU_WIDTH_MINI = 72;
    public static final int APP_LEFT_MENU_WIDTH_MAX = 215;

    /**
     * @return la résolution de l'écran.
     */
    public static double getScreenResolution() {
        return dimension2;
    }

    /**
     * @return la largueur de l'écran.
     */
    public static double getScreenWidth() {
        return dimension.getWidth();
    }

    /**
     * @return la hauteur de l'écran.
     */
    public static double getScreenHeight() {
        return dimension.getHeight();
    }

    @Deprecated
    public static Rectangle2D getVisualBounds() {
        return rect;
    }

    /**
     * @return la largueur visible de l'écran.
     */
    public static int getVisualScreenWidth() {
        return (int)rect.getWidth();
    }

    /**
     * @return Récupère la hauteur visible de l'écran. Attention au top de la fenêtre, à ajuster.
     */
    public static double getVisualScreenHeight() {
        return rect.getHeight();
    }

    /**
     * Permet de calculer la largueur du contenaire contenant les médias en fonction de la taille de la barre de menu.
     * @return la largueur du contenaire médias.
     */
    public static double getMediaContainerWidth() {
        int i = MainController.isIsOpenGlobalMenu() ? APP_LEFT_MENU_WIDTH_MAX : APP_LEFT_MENU_WIDTH_MINI;
        // TODO: Récupèrer la taille de la fenêtre plutôt que de l'écran
        return getVisualScreenWidth() - i;
    }
}
