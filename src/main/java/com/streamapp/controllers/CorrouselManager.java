package com.streamapp.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class CorrouselManager {
    public HBox sliderMedia;
    public Label carrouselName;
    private List<ImageView> moviesCover;

    public CorrouselManager(HBox sliderMedia, String name) {
        this.sliderMedia = sliderMedia;
        this.carrouselName.setText(name);
        moviesCover = new ArrayList<>();
    }

    public Label getCarrouselName() {
        return carrouselName;
    }

    public HBox getSliderMedia() {
        return sliderMedia;
    }

    private void setMovieCover(ImageView cover) {
        this.sliderMedia.getChildren().add(cover);
    }
   public void setMoviesCover(List<String> urlMoviesCover) {
        urlMoviesCover.forEach(s -> setMovieCover(new ImageView(s)));
    }
}
