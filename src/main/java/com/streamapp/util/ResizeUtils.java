package com.streamapp.util;

import com.streamapp.controllers.ihmControls.HomeViewController;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

import java.awt.*;

public class ResizeUtils {
    // TODO: Récupérer la taille de la fenetre, la taille de l'element.
    public static Dimension getScreenSize() {
        return dimension;
    }
    private static Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private static int dimension2 = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
    private static Rectangle2D rect = Screen.getPrimary().getVisualBounds();
    public static final int APP_LEFT_MENU_WIDTH_MINI = 72;
    public static final int APP_LEFT_MENU_WIDTH_MAX = 210;

    /**
     * @return la résolution de l'écran.
     */
    public static int getScreenResolution() {
        return dimension2;
    }

    /**
     * @return la largueur de l'écran.
     */
    public static int getScreenWidth() {
        return (int)dimension.getWidth();
    }

    /**
     * @return la hauteur de l'écran.
     */
    public static int getScreenHeight() {
        return (int)dimension.getHeight();
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
    public static int getVisualScreenHeight() {
        return (int)rect.getHeight();
    }

    /**
     * Permet de calculer la largueur du contenaire contenant les médias en fonction de la taille de la barre de menu.
     * @param sideBarWidth
     * @return la largueur du contenaire médias.
     */
    public static int getMediaContainerWidth(int sideBarWidth) {
        // TODO: Vérification sideBarWidth
        int i = 0;
        if(sideBarWidth != 0) {
            i = HomeViewController.isIsOpenGlobalMenu() ? APP_LEFT_MENU_WIDTH_MAX : APP_LEFT_MENU_WIDTH_MINI;
        }
        return sideBarWidth - i;
    }
}
