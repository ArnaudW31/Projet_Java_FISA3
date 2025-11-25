package model;

import javafx.scene.layout.VBox;

public class CurlMarteauPoulie extends ExercicePoulie {
    
    //constructeur
    public CurlMarteauPoulie(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Biceps", CurlMarteauPoulie.class.getResource("/images/muscles/biceps.png").toExternalForm()),
            new Muscle("Brachial", CurlMarteauPoulie.class.getResource("/images/muscles/brachial.png").toExternalForm()),
            new Muscle("Avant-bras", CurlMarteauPoulie.class.getResource("/images/muscles/avant_bras.png").toExternalForm())
        ),
        "1. Saisir la poignée de la poulie avec une prise marteau (paume de main face à soi).\n" +
        "2. Garder le coude près du corps et fléchir l'avant-bras pour amener la poignée vers l'épaule.\n" +
        "3. Redescendre lentement à la position de départ en contrôlant le mouvement.\n" +
        "4. Répéter pour le nombre de répétitions souhaité.", "prise marteau",  0);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
