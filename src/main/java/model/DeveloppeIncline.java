package model;

import javafx.scene.Scene;

public class DeveloppeIncline extends ExerciceAvecHalteres {
    
    // constructeur
    public DeveloppeIncline(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Deltoide antérieur", "path/to/deltoide_anterieur_image.png"),
            new Muscle("Triceps brachial", "path/to/triceps_brachial_image.png"),
            new Muscle("Pectoraux", "path/to/pectoraux_image.png")
        ),
        "1. Asseyez-vous sur un banc incliné à environ 45 degrés avec un haltère dans chaque main.\n" +
        "2. Tenez les haltères au niveau des épaules, les paumes vers l'avant.\n" +
        "3. Poussez les haltères vers le haut jusqu'à ce que vos bras soient complètement étendus au-dessus de votre tête.\n" +
        "4. Abaissez lentement les haltères jusqu'à la position de départ au niveau des épaules.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", true,  3);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
}
