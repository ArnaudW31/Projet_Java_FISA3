package model;

import javafx.scene.Scene;

public class Traction extends ExercicePoidsDuCorps {

    //constructeur
    public Traction(int id, String nom) {
        super(id, nom,
              java.util.Arrays.asList(
                  new Muscle("Grand dorsal", "path/to/grand_dorsal_image.png"),
                  new Muscle("Biceps brachial", "path/to/biceps_brachial_image.png")
              ),
              "1. Saisissez la barre avec une prise en supination (paumes vers vous), les mains écartées à la largeur des épaules.\n" +
               "2. Suspendez-vous à la barre avec les bras complètement tendus et les jambes croisées derrière vous.\n" +
               "3. Tirez votre corps vers le haut en fléchissant les coudes jusqu'à ce que votre menton dépasse la barre.\n" +
               "4. Redescendez lentement à la position de départ avec un contrôle total.\n" +
               "5. Répétez pour le nombre de répétitions souhaité.", true);
    }

    public Scene showExplanation() {
        return new Scene(null);
    }
    
}
