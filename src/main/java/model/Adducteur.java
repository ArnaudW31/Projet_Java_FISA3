package model;

import javafx.scene.layout.VBox;

public class Adducteur extends ExerciceMachine {
    
    //constructeur
    public Adducteur(int id, String nom) {
        super(id, nom,
            java.util.Arrays.asList(
                new Muscle("Grand dorsal", "images/muscles/grand_dorsal.png"),
                new Muscle("Biceps brachial", "images/muscles/biceps_brachial.png"),
                new Muscle("Trapèze moyen", "images/muscles/trapeze_moyen.png")
            ),
            "1. Asseyez-vous devant la machine de tirage horizontal avec une prise en pronation (paumes vers le bas) sur la barre.\n" +
            "2. Tirez la barre vers votre abdomen en gardant le dos droit et les coudes près du corps.\n" +
            "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité.");
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
