package model;

import javafx.scene.layout.VBox;

public class LegExtension extends ExerciceMachine {

    //constructeur
    public LegExtension(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Quadriceps", LegExtension.class.getResource("/images/muscles/quadriceps.png").toExternalForm())
        ),
        "1. Asseyez-vous sur la machine d'extension des jambes, les pieds sous les coussins prévus à cet effet.\n" +
        "2. Poussez les coussins avec vos jambes en étendant complètement vos genoux.\n" +
        "3. Contrôlez la descente des coussins jusqu'à la position de départ.\n" +
        "4. Répétez pour le nombre de répétitions souhaité.");
    }

    public VBox showExplanation() {
        return new VBox();
    }
    
}
