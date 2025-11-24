package model;

import javafx.scene.layout.VBox;

public class CurlBicepsHalteres extends ExerciceAvecHalteres {
    
    //constructeur
    public CurlBicepsHalteres(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Biceps brachial", "Bras"),
            new Muscle("Brachial antérieur", "Bras")
        ),
        "1. Tenez une haltère dans chaque main, les paumes tournées vers votre corps.\n" +
        "2. Gardez les coudes près du corps et fléchissez les avant-bras pour amener les haltères vers vos épaules.\n" +
        "3. Redescendez lentement à la position de départ en contrôlant le mouvement.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.", false, 0);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
