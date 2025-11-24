package model;

import java.util.List;

public abstract class ExercicePoulie extends Exercice {
    private String prisePoulie;
    private int hauteurPoulie;

    public int getHauteurPoulie() { return hauteurPoulie; }
    public void setHauteurPoulie(int nvHauteurPoulie) { this.hauteurPoulie = nvHauteurPoulie; }

    public String getPrisePoulie() { return prisePoulie; }
    public void setNom(String nvPrisePoulie) { this.prisePoulie = nvPrisePoulie; }

    public ExercicePoulie(int id, String nom, List<Muscle> muscles, String description, String prisePoulie, int hauteurPoulie) {
        super(id, nom, muscles, description);
        this.prisePoulie = prisePoulie;
        this.hauteurPoulie = hauteurPoulie;
    }
}
