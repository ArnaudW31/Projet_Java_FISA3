package model;

import java.util.List;

public abstract class ExerciceMachine extends Exercice {

    public ExerciceMachine(int id, String nom, List<Muscle> muscles, String description) {
        super(id, nom, muscles, description);
    }
    
}
