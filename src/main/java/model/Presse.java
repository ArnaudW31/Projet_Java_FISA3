package model;

import javafx.scene.layout.VBox;

public class Presse extends ExerciceMachine {

    //constructeur
    public Presse(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Quadriceps", "images/muscles/quadriceps.png"),
            new Muscle("Ischio-jambiers", "images/muscles/ischio_jambiers.png"),
            new Muscle("Fessiers", "images/muscles/fessiers.png")
        ),
        "1. Asseyez-vous sur la machine à presse, les pieds placés sur la plateforme à la largeur des épaules.\n" +
        "2. Poussez la plateforme avec vos pieds en étendant vos jambes, sans verrouiller les genoux.\n" +
        "3. Contrôlez la descente de la plateforme jusqu'à ce que vos genoux soient à un angle de 90 degrés.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.");
    }

    public VBox showExplanation() {
        return new VBox();
    }
    
}
