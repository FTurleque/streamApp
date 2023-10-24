package com.streamapp.model.projects;

import com.streamapp.model.enums.TypeOfMediaEnum;

import java.util.*;

public class TypeOfMedia {

    private List<Media> medias = new ArrayList<>();
    private TypeOfMediaEnum type;
    private String name;

    public List<Media> getMedias() {
        return medias;
    }

    public TypeOfMedia(TypeOfMediaEnum type) {
        this.type = type;
        this.name = type.label;
    }
}
