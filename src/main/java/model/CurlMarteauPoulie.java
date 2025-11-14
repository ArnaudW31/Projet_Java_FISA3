package model;

import javafx.scene.Scene;

public class CurlMarteauPoulie extends ExercicePoulie {
    
    //constructeur
    public CurlMarteauPoulie(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Biceps", "/images/muscles/biceps.png"),
            new Muscle("Brachial", "/images/muscles/brachial.png"),
            new Muscle("Avant-bras", "/images/muscles/avant_bras.png")
        ),
        "1. Saisir la poignée de la poulie avec une prise marteau (paume de main face à soi).\n" +
        "2. Garder le coude près du corps et fléchir l'avant-bras pour amener la poignée vers l'épaule.\n" +
        "3. Redescendre lentement à la position de départ en contrôlant le mouvement.\n" +
        "4. Répéter pour le nombre de répétitions souhaité.", "prise marteau",  0);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
}
