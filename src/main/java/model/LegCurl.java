package model;

import javafx.scene.Scene;

public class LegCurl extends ExerciceMachine {
    
    //constructeur
    public LegCurl(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Ischio-jambiers", "images/muscles/ischio_jambiers.png")
        ),
        "1. Asseyez-vous sur la machine Leg Curl, en plaçant vos jambes sous les coussins rembourrés.\n" +
        "2. Saisissez les poignées latérales pour vous stabiliser.\n" +
        "3. Pliez les genoux pour ramener les coussins vers vos fessiers.\n" +
        "4. Contrôlez la descente des coussins jusqu'à la position de départ.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.");
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
}
