package model;

public abstract class ExercicePoulie extends Exercice {
    private String prisePoulie;
    private int hauteurPoulie;

    public int getHauteurPoulie() { return hauteurPoulie; }
    public void setHauteurPoulie(int nvHauteurPoulie) { this.hauteurPoulie = nvHauteurPoulie; }

    public String getPrisePoulie() { return prisePoulie; }
    public void setNom(String nvPrisePoulie) { this.prisePoulie = nvPrisePoulie; }
}
