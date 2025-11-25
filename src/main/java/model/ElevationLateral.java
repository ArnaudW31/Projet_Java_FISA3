package model;

import javafx.scene.layout.VBox;

public class ElevationLateral extends ExercicePoulie {
    
    // constructeur
    public ElevationLateral(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Deltoide", ElevationLateral.class.getResource("/images/muscles/deltoides.png").toExternalForm()),
            new Muscle("Trapèze", ElevationLateral.class.getResource("/images/muscles/trapeze.png").toExternalForm())
        ),
        "1. Placez-vous debout, les pieds écartés à la largeur des épaules, " +
        "en tenant la poignée de la poulie avec une prise neutre (paume vers l'intérieur).\n" +
        "2. Gardez le dos droit et les abdominaux engagés.\n" +
        "3. Levez lentement la poignée sur le côté jusqu'à ce que votre bras soit parallèle au sol.\n" +
        "4. Redescendez lentement à la position de départ en contrôlant le mouvement.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", "prise neutre",  3);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
