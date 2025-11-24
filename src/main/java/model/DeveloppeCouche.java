package model;

import javafx.scene.layout.VBox;

public class DeveloppeCouche extends ExerciceAvecHalteres {
    
    //constructeur
    public DeveloppeCouche(int id, String nom) {
        super(id, nom,
        java.util.Arrays.asList(
            new Muscle("Pectoraux", "path/to/pectoraux_image.png"),
            new Muscle("Triceps", "path/to/triceps_image.png"),
            new Muscle("Deltoides", "path/to/deltoides_image.png")
        ),
        "1. Allongez-vous sur le dos sur un banc plat avec une haltère dans chaque main.\n" +
        "2. Tenez les haltères au niveau de la poitrine, les paumes vers l'avant.\n" +
        "3. Poussez les haltères vers le haut jusqu'à ce que vos bras soient complètement étendus au-dessus de votre poitrine.\n" +
        "4. Abaissez lentement les haltères jusqu'à la position de départ au niveau de la poitrine.\n" +
        "5. Répétez pour le nombre de répétitions souhaité.", true,  0);
    }

    public VBox showExplanation() {
        return new VBox();
    }
}
