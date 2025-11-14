package model;

import javafx.scene.Scene;
import java.util.List;

public class Traction extends ExercicePoidsDuCorps {

    //constructeur
    public Traction(int id, String nom, List<Muscle> muscles, String description, boolean leste) {
        super(id, nom, muscles, description, leste);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }

    //Description de l'exercice
    public String getDescription() {
        return "1. Saisissez la barre avec une prise en supination (paumes vers vous), les mains écartées à la largeur des épaules.\n" +
               "2. Suspendez-vous à la barre avec les bras complètement tendus et les jambes croisées derrière vous.\n" +
               "3. Tirez votre corps vers le haut en fléchissant les coudes jusqu'à ce que votre menton dépasse la barre.\n" +
               "4. Redescendez lentement à la position de départ avec un contrôle total.\n" +
               "5. Répétez pour le nombre de répétitions souhaité.";
    }
    
}
