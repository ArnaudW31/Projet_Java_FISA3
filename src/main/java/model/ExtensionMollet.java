package model;

import javafx.scene.Scene;

public class ExtensionMollet extends ExercicePoidsDuCorps {

    // constructeur
    public ExtensionMollet(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Mollets", "images/muscles/mollets.png")
        ),
        "1. Tenez-vous debout, les pieds écartés à la largeur des épaules.\n" +
        "2. Montez lentement sur la pointe des pieds en contractant les mollets.\n" +
        "3. Redescendez lentement à la position de départ.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.", false);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
    
}
