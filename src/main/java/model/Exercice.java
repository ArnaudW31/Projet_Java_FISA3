package model;

public class Exercice {
    private int id;
    private String nom;
    private String categorie;
    private String description;

    public Exercice() {}

    public Exercice(int id, String nom, String categorie, String description) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        // utilisé pour ListView
        return nom + (categorie != null && !categorie.isEmpty() ? " (" + categorie + ")" : "");
    }
}