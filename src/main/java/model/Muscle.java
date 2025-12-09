package model;

import javafx.scene.image.Image;

public class Muscle {
    private String nom;
    private Image illustrationImage;

    public Muscle(String nom, String imagePath){
        this.nom = nom;
        this.illustrationImage = new Image(imagePath);
    }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Image getIllustrationImage() { return illustrationImage; }
    public void setIllustrationImage(Image image) { this.illustrationImage = image; }
}
