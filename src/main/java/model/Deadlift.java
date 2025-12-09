package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Deadlift extends ExerciceAvecHalteres{

    // constructeur
    public Deadlift(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Dos", Deadlift.class.getResource("/images/muscles/dos.png").toExternalForm()),
            new Muscle("Jambes", Deadlift.class.getResource("/images/muscles/jambes.jpg").toExternalForm()),
            new Muscle("Fessiers", Deadlift.class.getResource("/images/muscles/fessiers.png").toExternalForm())
        ),
        "La baaaaaaaaaaaaaaaase", false, 0);
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Tenez-vous debout, les pieds écartés à la largeur des hanches, en tenant une barre devant vous.\n" +
        "2. Fléchissez les hanches et les genoux pour abaisser votre corps et saisir la barre avec une prise en pronation (paumes vers vous).\n" +
        "3. Gardez le dos droit et les abdominaux engagés, puis poussez sur vos talons pour soulever la barre en redressant votre corps.\n" +
        "4. Abaissez lentement la barre en fléchissant les hanches et les genoux jusqu'à ce qu'elle touche le sol.\n" +
        "5. Répétez pour le nombre de répétitions souhaité."));
        return box;
    }    
}
