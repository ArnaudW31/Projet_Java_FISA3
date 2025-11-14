package model;

public abstract class ExercicePoidsDuCorps extends Exercice {
    private boolean leste;

    public boolean isLeste() { return leste; }
    public void setLeste(boolean nvLeste) { this.leste = nvLeste; }

    public ExercicePoidsDuCorps(int id, String nom, String categorie, String description, boolean leste) {
        super(id, nom, categorie, description);
        this.leste = leste;
    }
}
