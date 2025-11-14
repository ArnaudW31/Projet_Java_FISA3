package model;

import javafx.scene.Scene;

public class TirageVerticalPriseSerré extends ExerciceMachine {

    //constructeur
    public TirageVerticalPriseSerré(int id, String nom, String categorie, String description) {
        super(id, nom, categorie, "1. Asseyez-vous sur la machine de tirage vertical avec une prise serrée (paumes vers vous) sur la barre.\n" +
                "2. Tirez la barre vers le bas jusqu'à ce qu'elle atteigne le haut de votre poitrine, en gardant le dos droit.\n" +
                "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
                "4. Répétez pour le nombre de répétitions souhaité.");
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
    
}
