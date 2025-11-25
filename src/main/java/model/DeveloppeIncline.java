package model;

import javafx.scene.layout.VBox;

public class DeveloppeIncline extends ExerciceAvecHalteres {
    
    // constructeur
    public DeveloppeIncline(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Deltoide antérieur", DeveloppeIncline.class.getResource("/images/muscles/deltoides.png").toExternalForm()),
            new Muscle("Triceps brachial", DeveloppeIncline.class.getResource("/images/muscles/triceps.png").toExternalForm()),
            new Muscle("Pectoraux", DeveloppeIncline.class.getResource("/images/muscles/pectoraux.png").toExternalForm())
        ),
        "1. Asseyez-vous sur un banc incliné à environ 45 degrés avec un haltère dans chaque main.\n" +
        "2. Tenez les haltères au niveau des épaules, les paumes vers l'avant.\n" +
        "3. Poussez les haltères vers le haut jusqu'à ce que vos bras soient complètement étendus au-dessus de votre tête.\n" +
        "4. Abaissez lentement les haltères jusqu'à la position de départ au niveau des épaules.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", true,  3);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
