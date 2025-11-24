package controller;

import dao.ExerciceDAO;
import dao.PerformanceDAO;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.chart.*;
import model.Exercice;
import model.Performance;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class MainController {

    @FXML private ListView<Exercice> listExercices;
    @FXML private LineChart<String, Number> lineChart;
    @FXML private DatePicker datePicker;
    @FXML private TextField poidsField;
    @FXML private TextField repsField;
    @FXML private Label messageLabel;

    @FXML
    public void initialize() {
        // Charger les exercices depuis la BDD
        listExercices.getItems().setAll(ExerciceDAO.getAll());

        // Listener selection
        listExercices.getSelectionModel().selectedItemProperty().addListener((obs, oldEx, newEx) -> {
            if (newEx != null) {
                afficherCourbe(newEx);
            } else {
                lineChart.getData().clear();
            }
            messageLabel.setText("");
        });

        // Pré-sélection du premier si disponible
        if (!listExercices.getItems().isEmpty()) {
            Platform.runLater(() -> listExercices.getSelectionModel().selectFirst());
        }
    }

    private void afficherCourbe(Exercice ex) {
        lineChart.getData().clear();
        XYChart.Series<String, Number> serie = new XYChart.Series<>();
        serie.setName(ex.getNom());

        List<Performance> perfs = PerformanceDAO.getByExerciceId(ex.getId());
        perfs.sort(Comparator.comparing(Performance::getDate));

        for (Performance p : perfs) {
            // Format de date plus lisible
            String dateFormatee = p.getDate().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yy"));
            XYChart.Data<String, Number> data = new XYChart.Data<>(dateFormatee, p.getPoids());
            serie.getData().add(data);
        }

        lineChart.getData().add(serie);

        // Installer les tooltips après que le graphique soit rendu
        Platform.runLater(() -> {
            try {
                Thread.sleep(20); // Petite attente pour être sûr que les nodes sont créés
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            for (int i = 0; i < serie.getData().size(); i++) {
                XYChart.Data<String, Number> data = serie.getData().get(i);
                Performance p = perfs.get(i);
                
                if (data.getNode() != null) {
                    String dateFormatee = p.getDate().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    String txt = String.format("📅 %s\n💪 Poids: %.1f kg\n🔁 Reps: %d",
                                            dateFormatee,
                                            p.getPoids(),
                                            p.getRepetitions());
                    
                    Tooltip tt = new Tooltip(txt);
                    tt.setStyle("-fx-font-size: 13px; -fx-padding: 8px; -fx-background-color: rgba(0,0,0,0.75); -fx-text-fill: white; -fx-border-radius: 5px; -fx-background-radius: 5px; -fx-border-color: #ff6600; -fx-border-width: 1px;");
                    tt.setShowDelay(javafx.util.Duration.millis(50));
                    Tooltip.install(data.getNode(), tt);

                    data.getNode().getStyleClass().add("chart-line-symbol");
                    data.getNode().setOnMouseEntered(ev -> {
                        data.getNode().setScaleX(1.5);
                        data.getNode().setScaleY(1.5);
                    });
                    data.getNode().setOnMouseExited(ev -> {
                        data.getNode().setScaleX(1.0);
                        data.getNode().setScaleY(1.0);
                    });
                }
            }
        });
    }

    @FXML
    private void ajouterPerformance() {
        Exercice ex = listExercices.getSelectionModel().getSelectedItem();
        if (ex == null) {
            messageLabel.setText("Sélectionne d'abord un exercice.");
            return;
        }

        LocalDate date = datePicker.getValue();
        if (date == null) {
            messageLabel.setText("Choisis une date.");
            return;
        }

        double poids;
        int reps;
        try {
            poids = Double.parseDouble(poidsField.getText().trim());
        } catch (Exception e) {
            messageLabel.setText("Poids invalide.");
            return;
        }

        try {
            reps = Integer.parseInt(repsField.getText().trim());
        } catch (Exception e) {
            messageLabel.setText("Répétitions invalides.");
            return;
        }

        Performance perf = new Performance(ex.getId(), date, poids, reps);
        boolean ok = PerformanceDAO.insertPerformance(perf);
        if (ok) {
            messageLabel.setText("Performance ajoutée.");
            // Réinitialiser champs
            datePicker.setValue(null);
            poidsField.clear();
            repsField.clear();

            // Rafraîchir la courbe immédiatement
            afficherCourbe(ex);
        } else {
            messageLabel.setText("Erreur lors de l'ajout.");
        }
    }

    // // Méthodes supplémentaires : ajouter/supprimer exercice (optionnel)
    // @FXML
    // private void ouvrirDialogAjoutExercice() {
    //     // Implémentation minimale : ouvrir un dialog simple pour ajouter un exercice.
    //     TextInputDialog dialog = new TextInputDialog();
    //     dialog.setTitle("Ajouter exercice");
    //     dialog.setHeaderText("Nom de l'exercice:");
    //     dialog.setContentText("Nom:");
    //     dialog.showAndWait().ifPresent(name -> {
    //         if (name.trim().isEmpty()) return;
    //         // Insert minimal via DB
    //         try (var conn = dao.Database.getConnection();
    //              var ps = conn.prepareStatement("INSERT INTO exercice (nom) VALUES (?)")) {
    //             ps.setString(1, name.trim());
    //             ps.executeUpdate();
    //             // recharger la liste
    //             listExercices.getItems().setAll(ExerciceDAO.getAll());
    //         } catch (Exception e) {
    //             e.printStackTrace();
    //         }
    //     });
    // }

    // @FXML
    // private void supprimerExercice() {
    //     Exercice ex = listExercices.getSelectionModel().getSelectedItem();
    //     if (ex == null) return;
    //     Alert confirm = new Alert(Alert.AlertType.CONFIRMATION, "Supprimer " + ex.getNom() + " ?", ButtonType.YES, ButtonType.NO);
    //     confirm.showAndWait().ifPresent(bt -> {
    //         if (bt == ButtonType.YES) {
    //             try (var conn = dao.Database.getConnection();
    //                  var ps = conn.prepareStatement("DELETE FROM exercice WHERE id_exercice = ?")) {
    //                 ps.setInt(1, ex.getId());
    //                 ps.executeUpdate();
    //                 listExercices.getItems().setAll(ExerciceDAO.getAll());
    //             } catch (Exception e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     });
    // }
}