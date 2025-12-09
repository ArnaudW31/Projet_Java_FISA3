package model;

import java.util.List;

public abstract class ExerciceAvecHalteres extends Exercice {
    private boolean banc;
    private int inclinaisonBanc;

    public ExerciceAvecHalteres(int id, String nom, List<Muscle> muscles, String description, boolean banc, int inclinaisonBanc) {
        super(id, nom, muscles, description);
        this.banc = banc;
        this.inclinaisonBanc = inclinaisonBanc;
    }

    public boolean hasBanc() { return banc; }
    public void setBanc(boolean nvBanc) { this.banc = nvBanc; }

    public int getInclinaisonBanc() { return inclinaisonBanc; }
    public void setInclinaisonBanc(int nvInclinaisonBanc) { this.inclinaisonBanc = nvInclinaisonBanc; }
}
