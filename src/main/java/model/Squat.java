package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Squat extends ExerciceAvecHalteres {

    //constructeur
    public Squat(int id, String nom) {
        super(id, nom,
            java.util.Arrays.asList(
                new Muscle("Quadriceps", Squat.class.getResource("/images/muscles/quadriceps.png").toExternalForm()),
                new Muscle("Fessiers", Squat.class.getResource("/images/muscles/fessiers.png").toExternalForm()),
                new Muscle("Ischio-jambiers", Squat.class.getResource("/images/muscles/ischio_jambiers.png").toExternalForm())
            ),
            "Squats :)))", false, 0);
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Placez-vous debout, les pieds écartés à la largeur des épaules, en tenant les haltères à vos côtés.\n" +
            "2. Fléchissez les genoux et les hanches pour descendre en position accroupie, en gardant le dos droit.\n" +
            "3. Poussez sur vos talons pour revenir à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }
    
}
