package model;

import java.util.List;

public abstract class ExercicePoidsDuCorps extends Exercice {
    private boolean leste;

    public boolean isLeste() { return leste; }
    public void setLeste(boolean nvLeste) { this.leste = nvLeste; }

    public ExercicePoidsDuCorps(int id, String nom, List<Muscle> muscles, String description, boolean leste) {
        super(id, nom, muscles, description);
        this.leste = leste;
    }
}
