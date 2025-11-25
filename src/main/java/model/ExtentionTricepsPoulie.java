package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ExtentionTricepsPoulie extends ExercicePoulie {

    //constructeur
    public ExtentionTricepsPoulie(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Triceps", ExtentionTricepsPoulie.class.getResource("/images/muscles/triceps.png").toExternalForm())
        ),
        "Tu étends les tricpes sur une poulie fin pas compliqué", "prise pronation",  18);
    }

    public VBox showExplanation() {
                VBox box = new VBox(new Label("1. Placez-vous debout face à la poulie haute, les pieds écartés à la largeur des épaules.\n" +
        "2. Saisissez la poignée de la poulie avec une prise en pronation (paumes vers le bas).\n" +
        "3. Gardez les coudes près du corps et poussez la poignée vers le bas jusqu'à ce que vos bras soient complètement étendus.\n" +
        "4. Revenez lentement à la position de départ en contrôlant le mouvement.\n" +
        "5. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }
    
}
