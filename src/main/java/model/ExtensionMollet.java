package model;

import javafx.scene.layout.VBox;

public class ExtensionMollet extends ExercicePoidsDuCorps {

    // constructeur
    public ExtensionMollet(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Mollets", ExtensionMollet.class.getResource("/images/muscles/mollets.png").toExternalForm())
        ),
        "1. Tenez-vous debout, les pieds écartés à la largeur des épaules.\n" +
        "2. Montez lentement sur la pointe des pieds en contractant les mollets.\n" +
        "3. Redescendez lentement à la position de départ.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.", false);
    }

    public VBox showExplanation() {
        return new VBox();
    }
    
}
