package model;

import javafx.scene.layout.VBox;

public class TiragePoulieHaute extends ExercicePoulie {
    
    //constructeur
    public TiragePoulieHaute(int id, String nom) {
        super(id, nom, 
        java.util.Arrays.asList(
            new Muscle("Grand dorsal", TiragePoulieHaute.class.getResource("/images/muscles/grand_dorsal.png").toExternalForm()),
            new Muscle("Biceps brachial", TiragePoulieHaute.class.getResource("/images/muscles/biceps_brachial.png").toExternalForm())
        ), 
        "1. Asseyez-vous à la machine de tirage à la poulie haute, les pieds bien posés sur le sol.\n" +
        "2. Saisissez la barre avec une prise large, les paumes vers l'avant.\n" +
        "3. Tirez la barre vers le bas jusqu'à ce qu'elle atteigne le haut de votre poitrine, en gardant le dos droit.\n" +
        "4. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", "prise large",  18);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
