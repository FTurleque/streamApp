package com.streamapp.model.enums;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public enum TypeOfMediaEnum {
    ACTION("Action"),
    ANIMATION("Animation"),
    ADVENTURE("Aventure"),
    DOCUMENTARY("Documentaire"),
    DRAMA("Drame"),
    FAMILY("Famille"),
    FANTASTIC("Fantastique"),
    WAR("Guerre"),
    HISTORY("Histoire"),
    MYSTERY("Mystère"),
    ROMANCE("Romance"),
    SCI_FI("Science-Fiction"),
    TV_SHOW("Téléfilm"),
    THRILLER("Thriller"),
    WESTERN("Western");
    public final String label;

    private TypeOfMediaEnum(String label) {
        this.label = label;
    }
}
