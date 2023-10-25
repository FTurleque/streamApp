package com.streamapp.controllers.ihmControls;

import com.jfoenix.controls.JFXButton;
import com.streamapp.SceneFxmlApp;
import com.streamapp.model.enums.SceneName;
import com.streamapp.model.interfaces.IStageable;
import com.streamapp.services.ihm.ResizingServices;
import com.streamapp.services.patterns.IObservable;
import com.streamapp.services.patterns.IObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    @FXML
    BorderPane firstContainer;
    @FXML
    VBox sideBoxLeftMenu;
    private Stage stage;
    IObservable observable = this;

    //    Coordonate state = new Coordonate(firstContainer.getWidth(), firstContainer.getHeight());
    private List<IObserver> observerList = new ArrayList<>();
    private Node nodeState;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Verifier si il y a déjà des sources renseignées si non on ouvre la géstions des sources.
        IObserver sliders = new SlidersContainerControlleur();
        observable.subscribe(sliders);
//        firstContainer.setCenter(SceneFxmlApp.getScenes().get(SceneName.SOURCES).getScene().getRoot());
//        try {
//            Parent loader = FXMLLoader.load(SceneFxmlApp.class.getResource("ihm/msources-view.fxml"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static boolean isIsOpenGlobalMenu() {
        return isOpenGlobalMenu;
    }

    private static boolean isOpenGlobalMenu = true;

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void burgerMenusClick(MouseEvent mouseEvent) {
        AtomicBoolean isOpen = new AtomicBoolean(true);
        sideBoxLeftMenu.getChildren().forEach(btn ->{
            if(btn.getClass() == JFXButton.class) {
                ((JFXButton) btn).setText(!((JFXButton) btn).getText().isEmpty() ? "" : btn.getAccessibleText());
                isOpen.set(!((JFXButton) btn).getText().isEmpty());
                ((JFXButton) btn).setPrefWidth(isOpen.get() ? 40 : 210);
                isOpenGlobalMenu = !isIsOpenGlobalMenu();
            }
        });
        sideBoxLeftMenu.setPrefWidth(isOpen.get() ? 210 : 72);
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
        // TODO: Récupérer la liste de films contenu dans les sources.
        /* Recuperation du ScrollPane qui va contenir les Carrousels */
        FXMLLoader scrollPaneLoader = new FXMLLoader(SceneFxmlApp.class.getResource("fxml/container-sliders-view.fxml"));
        scrollPaneLoader.load();
        SlidersContainerControlleur slidersContainerControlleur = scrollPaneLoader.getController();
        ScrollPane scrollPane = slidersContainerControlleur.getScrollPaneSliders();
        if(firstContainer.getCenter() == null) {
            firstContainer.setCenter(scrollPane);
        }
//        AtomicReference<Double> x = new AtomicReference<>(firstContainer.getWidth());
//        Double y = firstContainer.getHeight();
//        firstContainer.getChildren().forEach(node -> {
//            if(node instanceof VBox) {
//                x.set(ResizeUtils.getMediaContainerWidth());
//            }
//        });
//        slidersContainerControlleur.scrollPaneSliders.setPrefWidth(x.get());
//        slidersContainerControlleur.scrollPaneSliders.setPrefHeight(y);
//        slidersContainerControlleur.gridCarrousel.getColumnConstraints().get(1).setPrefWidth(x.get() - 145);
//        slidersContainerControlleur.gridCarrousel.setPrefWidth(x.get());
        slidersContainerControlleur.gridCarrousel.getChildren().forEach(node -> {
            if (node instanceof Label)
            {
                ((Label) node).setText("Test");
            }
        });
        ResizingServices resizingServices = new ResizingServices();
        resizingServices.resizeScrollPaneSliders(firstContainer, scrollPane);
//        List<Node> carrousselList = new ArrayList<>();
        // Création des carrousels
//        for(TypeOfMediaEnum type : TypeOfMediaEnum.values())
//        {
//            // TODO: Si le type de film contient des films alors je créé le carrousel
//            URL url = SceneFxmlApp.class.getResource("fxml/carrousel-view.fxml");
//            FXMLLoader loader = new FXMLLoader(url);
//            loader.load();
//            CarrouselController carrouseController = loader.getController();
////            carrouseController.gridCarrousel.maxWidth(firstContainer.getMaxWidth());
//            carrouseController.setCarrouselName(type.label);
//            carrousselList.add((GridPane) loader.getRoot());
//        }
//        slidersContainerControlleur.setSlidersContainer(carrousselList);
    }

    /**
     * Ouvre la page des films classer par genres.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void moviesDisplay(ActionEvent actionEvent) {
        Scene s = SceneFxmlApp.getScenes().get(SceneName.MOVIES).getScene();
        firstContainer.getChildren().add(SceneFxmlApp.getScenes().get(SceneName.MOVIES).getScene().getRoot());
//        stage.setScene(SceneFxmlApp.getScenes().get(SceneName.ALL_MOVIES).getScene());
    }

    /**
     * Ouvre la page de toutes les séries organisé par genre.
     * @param actionEvent L'événement sur le bouton.
     */
    @FXML
    public void seriesDisplay(ActionEvent actionEvent) {
        firstContainer.getChildren().add(SceneFxmlApp.getScenes().get(SceneName.SLIDERS).getScene().getRoot());
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

    public Node getContainerState() {
        return nodeState;
    }

    private void setContainerState(Node firstContainer) {
        this.nodeState = firstContainer;
        this.notifySuscriber();
    }
}
