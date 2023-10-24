package com.streamapp.model.media_info;

import com.streamapp.model.enums.TypeOfMediaEnum;
import com.streamapp.model.interfaces.Media;

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
