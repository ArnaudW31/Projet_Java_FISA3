package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Presse extends ExerciceMachine {

    //constructeur
    public Presse(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Quadriceps", Presse.class.getResource("/images/muscles/quadriceps.png").toExternalForm()),
            new Muscle("Ischio-jambiers", Presse.class.getResource("/images/muscles/ischio_jambiers.png").toExternalForm()),
            new Muscle("Fessiers", Presse.class.getResource("/images/muscles/fessiers.png").toExternalForm())
        ),
        "Presse à jambe");
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Asseyez-vous sur la machine à presse, les pieds placés sur la plateforme à la largeur des épaules.\n" +
        "2. Poussez la plateforme avec vos pieds en étendant vos jambes, sans verrouiller les genoux.\n" +
        "3. Contrôlez la descente de la plateforme jusqu'à ce que vos genoux soient à un angle de 90 degrés.\n" +
        "4. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }
    
}
