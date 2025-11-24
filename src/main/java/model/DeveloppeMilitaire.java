package model;

import javafx.scene.Scene;

public class DeveloppeMilitaire extends ExerciceAvecHalteres {
    
    //constructeur
    public DeveloppeMilitaire(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Deltoide", "path/to/deltoide_image"),
            new Muscle("Triceps", "path/to/triceps_image")
        ),
        "1. Asseyez-vous sur un banc avec un dossier, les pieds à plat sur le sol.\n" +
        "2. Tenez une haltère dans chaque main au niveau des épaules, les paumes vers l'avant.\n" +
        "3. Poussez les haltères vers le haut jusqu'à ce que vos bras soient complètement étendus au-dessus de votre tête.\n" +
        "4. Abaissez lentement les haltères jusqu'à la position de départ au niveau des épaules.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", true,  2);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
}
