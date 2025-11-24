package model;

import javafx.scene.layout.VBox;

public class TirageVerticalPriseSerre extends ExerciceMachine {

    //constructeur
    public TirageVerticalPriseSerre(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Grand dorsal", "images/muscles/grand_dorsal.png"),
            new Muscle("Biceps brachial", "images/muscles/biceps_brachial.png"),
            new Muscle("Trapèze moyen", "images/muscles/trapeze_moyen.png")
        ), 
        "1. Asseyez-vous sur la machine de tirage vertical avec une prise serrée (paumes vers vous) sur la barre.\n" +
        "2. Tirez la barre vers le bas jusqu'à ce qu'elle atteigne le haut de votre poitrine, en gardant le dos droit.\n" +
        "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.");
    }

    public VBox showExplanation() {
        return new VBox();
    }
    
}
