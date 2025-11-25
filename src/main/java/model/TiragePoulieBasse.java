package model;

import javafx.scene.layout.VBox;

public class TiragePoulieBasse extends ExercicePoulie {

    // Constructor
    public TiragePoulieBasse(int id, String nom) {
        super(id, nom, 
            java.util.Arrays.asList(
                new Muscle("Grand dorsal", TiragePoulieBasse.class.getResource("/images/muscles/grand_dorsal.png").toExternalForm()),
                new Muscle("Biceps brachial", TiragePoulieBasse.class.getResource("/images/muscles/biceps_brachial.png").toExternalForm())
            ),
            "1. Asseyez-vous devant la poulie basse avec une prise en supination (paumes vers le haut) sur la barre.\n" +
            "2. Tirez la barre vers votre abdomen en gardant le dos droit et les coudes près du corps.\n" +
            "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité.", "prise supination",  0);
    }

    public VBox showExplanation() {
        return new VBox();
    }   
    
}
