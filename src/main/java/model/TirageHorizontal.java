package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TirageHorizontal extends ExerciceMachine {

    //constructeur
    public TirageHorizontal(int id, String nom) {
        super(id, nom,
            java.util.Arrays.asList(
                new Muscle("Grand dorsal", TirageHorizontal.class.getResource("/images/muscles/grand_dorsal.png").toExternalForm()),
                new Muscle("Biceps brachial", TirageHorizontal.class.getResource("/images/muscles/biceps_brachial.png").toExternalForm()),
                new Muscle("Trapèze moyen", TirageHorizontal.class.getResource("/images/muscles/trapeze_moyen.png").toExternalForm())
            ),
            "Tu tires à l'horizontale");
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Asseyez-vous devant la machine de tirage horizontal avec une prise en pronation (paumes vers le bas) sur la barre.\n" +
            "2. Tirez la barre vers votre abdomen en gardant le dos droit et les coudes près du corps.\n" +
            "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }
    
}
