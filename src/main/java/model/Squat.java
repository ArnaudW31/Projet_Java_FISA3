package model;

import javafx.scene.layout.VBox;

public class Squat extends ExerciceAvecHalteres {

    //constructeur
    public Squat(int id, String nom) {
        super(id, nom,
            java.util.Arrays.asList(
                new Muscle("Quadriceps", "images/muscles/quadriceps.png"),
                new Muscle("Fessiers", "images/muscles/fessiers.png"),
                new Muscle("Ischio-jambiers", "images/muscles/ischio_jambiers.png")
            ),
            "1. Placez-vous debout, les pieds écartés à la largeur des épaules, en tenant les haltères à vos côtés.\n" +
            "2. Fléchissez les genoux et les hanches pour descendre en position accroupie, en gardant le dos droit.\n" +
            "3. Poussez sur vos talons pour revenir à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité.", false, 0);
    }

    public VBox showExplanation() {
        return new VBox();
    }
    
}
