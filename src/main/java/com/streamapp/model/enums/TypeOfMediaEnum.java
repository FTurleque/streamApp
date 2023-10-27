package com.streamapp.model.enums;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public enum TypeOfMediaEnum {
    ACTION("Action",1),
    ANIMATION("Animation",2),
    ADVENTURE("Aventure",3),
    DOCUMENTARY("Documentaire",4),
    DRAMA("Drame",5),
    FAMILY("Famille",6),
    FANTASTIC("Fantastique",7),
    WAR("Guerre",8),
    HISTORY("Histoire",9),
    MYSTERY("Mystère",10),
    ROMANCE("Romance",11),
    SCI_FI("Science-Fiction",12),
    TV_SHOW("Téléfilm",13),
    THRILLER("Thriller",14),
    WESTERN("Western",15);
    public final String label;
    public final Integer initOrder;

    private TypeOfMediaEnum(String label, int initOrder) {
        this.label = label;
        this.initOrder = initOrder;
    }
}
