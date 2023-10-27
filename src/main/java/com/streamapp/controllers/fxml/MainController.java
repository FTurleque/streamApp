package com.streamapp.controllers.fxml;

import com.jfoenix.controls.JFXButton;
import com.streamapp.SceneFxmlApp;
import com.streamapp.model.enums.MediaTypeEnum;
import com.streamapp.model.enums.SceneName;
import com.streamapp.model.interfaces.IStageable;
import com.streamapp.services.patterns.IObservable;
import com.streamapp.services.patterns.IObserver;
import com.streamapp.util.ResizeUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainController implements IStageable, Initializable, IObservable {
    public BorderPane firstContainer;
    public VBox sideBoxLeftMenu;
    private Stage stage;
    IObservable observable = this;

    private List<IObserver> observerList = new ArrayList<>();
    private Node nodeState;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Verifier si il y a déjà des sources renseignées si non on ouvre la géstions des sources.
        IObserver sliders = new SlidersContainerControlleur();
        observable.subscribe(sliders);
    }

    private static boolean isOpenGlobalMenu = true;

    /**
     * Vérifie si la barre de gauche est ouverte ou pas.
     * @return true ou false.
     */
    public static boolean isIsOpenGlobalMenu() {
        return isOpenGlobalMenu;
    }

    public Node getContainerState() {
        return nodeState;
    }

    private void setContainerState(Node firstContainer) {
        this.nodeState = firstContainer;
        this.notifySuscriber();
    }

    @Override
    @Deprecated
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void subscribe(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void RemoveObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySuscriber() {
        this.observerList.forEach(iObserver -> iObserver.Update(this));
    }

    @FXML
    public void burgerMenusClick(MouseEvent mouseEvent) {
        AtomicBoolean isOpen = new AtomicBoolean(true);
        sideBoxLeftMenu.getChildren().forEach(btn ->{
            if(btn.getClass() == JFXButton.class) {
                ((JFXButton) btn).setText(!((JFXButton) btn).getText().isEmpty() ? "" : btn.getAccessibleText());
                isOpen.set(!((JFXButton) btn).getText().isEmpty());
                ((JFXButton) btn).setPrefWidth(isOpen.get() ? 72 : ResizeUtils.APP_LEFT_MENU_WIDTH_MAX);
                isOpenGlobalMenu = !isIsOpenGlobalMenu();
            }
        });
        sideBoxLeftMenu.setPrefWidth(isOpenGlobalMenu ? ResizeUtils.APP_LEFT_MENU_WIDTH_MAX : ResizeUtils.APP_LEFT_MENU_WIDTH_MINI);
        setContainerState(firstContainer);
    }

    /**
     * Ouvre une popup pour rechercher un titre.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void search(ActionEvent actionEvent) {
    }

    /**
     * Ouvre la page de gestion des profils.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void manageProfils(ActionEvent actionEvent) {
    }

    /**
     * Ouvre la page home de l'application.
     * @param actionEvent L'événement sur le bouton.
     * @throws IOException
     */
    @FXML
    public void homeDisplay(ActionEvent actionEvent) throws IOException {
        /* Création du conteneur pour les Carrousels Films et serie */
        FXMLLoader scrollPaneLoader = new FXMLLoader(SceneFxmlApp.class.getResource("fxml/sliders-view.fxml"));
        scrollPaneLoader.load();
        SlidersContainerControlleur controller = scrollPaneLoader.getController();
        controller.setMediaType(MediaTypeEnum.MOVIE);
        controller.setMediaType(MediaTypeEnum.SERIE);
        ScrollPane scrollPane = controller.getScrollPaneSliders();
        if(firstContainer.getCenter() == null) {
            firstContainer.setCenter(scrollPane);
        }

        setContainerState(firstContainer);
    }

    /**
     * Ouvre la page des films classer par genres.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void moviesDisplay(ActionEvent actionEvent) throws IOException {
        /* Création du conteneur pour les Carrousels de films */
        FXMLLoader scrollPaneLoader = new FXMLLoader(SceneFxmlApp.class.getResource("fxml/sliders-view.fxml"));
        scrollPaneLoader.load();
        SlidersContainerControlleur controller = scrollPaneLoader.getController();
        controller.setMediaType(MediaTypeEnum.MOVIE);
        ScrollPane scrollPane = controller.getScrollPaneSliders();
        if(firstContainer.getCenter() == null) {
            firstContainer.setCenter(scrollPane);
        }
        setContainerState(firstContainer);
    }

    /**
     * Ouvre la page de toutes les séries organisé par genre.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void seriesDisplay(ActionEvent actionEvent) throws IOException {
        /* Création du conteneur pour les Carrousels de série*/
        FXMLLoader scrollPaneLoader = new FXMLLoader(SceneFxmlApp.class.getResource("fxml/sliders-view.fxml"));
        scrollPaneLoader.load();
        SlidersContainerControlleur controller = scrollPaneLoader.getController();
        controller.setMediaType(MediaTypeEnum.SERIE);
        ScrollPane scrollPane = controller.getScrollPaneSliders();
        if(firstContainer.getCenter() == null) {
            firstContainer.setCenter(scrollPane);
        }
        setContainerState(firstContainer);
    }

    /**
     * Ouvre la page des favoris en fonction de l'utilisateur.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void favoriteDisplay(ActionEvent actionEvent) {
        firstContainer.getChildren().add(SceneFxmlApp.getScenes().get(SceneName.SLIDERS).getScene().getRoot());
    }

    /**
     * Ouvre la page de setting pour la configuration de l'application.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void settingDisplay(ActionEvent actionEvent) {
    }

    /**
     * A intégrer dans le setting.
     * @param actionEvent
     * @throws IOException
     */
    @Deprecated
    @FXML
    public void mediaSourcesDisplay(ActionEvent actionEvent) throws IOException {
        Stage sta = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//        Scene s = SceneFxmlApp.getScenes().get(SceneName.MEDIA).getScene();
        firstContainer.getChildren().add(SceneFxmlApp.getScenes().get(SceneName.MFILES).getScene().getRoot());
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(SceneFxmlApp.class.getResource("fxml/media-view.fxml"));
//        Parent parent = loader.load();
    }

    /**
     * Fermeture de l'application.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void applicationClose(ActionEvent actionEvent) {
        System.exit(0);
    }
}
