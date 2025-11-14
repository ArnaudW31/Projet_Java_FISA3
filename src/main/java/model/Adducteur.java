package model;

import javafx.scene.Scene;

public class Adducteur extends ExerciceMachine {
    
    //constructeur
    public Adducteur(int id, String nom, String categorie, String description) {
        super(id, nom, categorie, description);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
}
