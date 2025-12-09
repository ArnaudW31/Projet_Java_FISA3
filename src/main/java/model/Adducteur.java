package model;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;

public class Adducteur extends ExerciceMachine {
    
    //constructeur
    public Adducteur(int id, String nom) { 
        super(id, nom,
            java.util.Arrays.asList(
                new Muscle("Grand dorsal", Adducteur.class.getResource("/images/muscles/grand_dorsal.png").toExternalForm()),
                new Muscle("Biceps brachial", Adducteur.class.getResource("/images/muscles/biceps_brachial.png").toExternalForm()),
                new Muscle("Trapèze moyen", Adducteur.class.getResource("/images/muscles/trapeze_moyen.png").toExternalForm())
            ),
            "Pour muscler les adducteurs");
    }

    public VBox showExplanation() {
        VBox box = new VBox(new Label("1. Asseyez-vous devant la machine de tirage horizontal avec une prise en pronation (paumes vers le bas) sur la barre.\n" +
            "2. Tirez la barre vers votre abdomen en gardant le dos droit et les coudes près du corps.\n" +
            "3. Contrôlez la montée de la barre jusqu'à la position de départ.\n" +
            "4. Répétez pour le nombre de répétitions souhaité."));
        // WebView web = new WebView();
        // web.setPrefHeight(500);

        // String html = """
        //     <html>
        //     <head>
        //         <meta name="referrer" content="strict-origin-when-cross-origin">
        //     </head>
        //     <body style="margin:0;">
        //         <iframe width="600" height="500" src="https://www.youtube-nocookie.com/embed/TqLTNdkiO_Y?si=AvkycasqxZSaLn2n&amp;controls=0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>            </body>
        //     </html>
        //     """;

        // web.getEngine().loadContent(html);
        
        // box.getChildren().add(web);
        box.setStyle("-fx-padding: 20;");
        return box;
    }
}
