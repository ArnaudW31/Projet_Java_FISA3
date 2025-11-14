package model;

public abstract class ExerciceAvecHalteres extends Exercice {
    private boolean banc;
    private int inclinaisonBanc;

    public boolean hasBanc() { return banc; }
    public void setBanc(boolean nvBanc) { this.banc = nvBanc; }

    public int getInclinaisonBanc() { return inclinaisonBanc; }
    public void setInclinaisonBanc(int nvInclinaisonBanc) { this.inclinaisonBanc = nvInclinaisonBanc; }
}
