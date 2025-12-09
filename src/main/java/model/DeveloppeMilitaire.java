package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class DeveloppeMilitaire extends ExerciceAvecHalteres {
    
    //constructeur
    public DeveloppeMilitaire(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Deltoide", DeveloppeMilitaire.class.getResource("/images/muscles/deltoides.png").toExternalForm()),
            new Muscle("Triceps", DeveloppeMilitaire.class.getResource("/images/muscles/triceps.jpg").toExternalForm())
        ),
        "Pareil que l'autre mais que pour les militaires", true,  2);
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Asseyez-vous sur un banc avec un dossier, les pieds à plat sur le sol.\n" +
        "2. Tenez une haltère dans chaque main au niveau des épaules, les paumes vers l'avant.\n" +
        "3. Poussez les haltères vers le haut jusqu'à ce que vos bras soient complètement étendus au-dessus de votre tête.\n" +
        "4. Abaissez lentement les haltères jusqu'à la position de départ au niveau des épaules.\n" +
        "5. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }
}
