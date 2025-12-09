package app;

import dao.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Créer la BDD si nécessaire : exécuter le script init.sql embarqué (optionnel)
        initDatabaseIfNeeded();

        FXMLLoader loader = new FXMLLoader(getResource("view/main.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Suivi Musculation");
        stage.show();
    }

    private static java.net.URL getResource(String path) {
        return Main.class.getClassLoader().getResource(path);
    }

    private void initDatabaseIfNeeded() {
        // Tente de créer les tables si elles n'existent pas
        try (Connection conn = Database.getConnection();
            Statement st = conn.createStatement()) {

            String createExercice = "CREATE TABLE IF NOT EXISTS exercice (" +
                    "id_exercice INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom TEXT NOT NULL" +
                    ");";

            String createPerf = "CREATE TABLE IF NOT EXISTS performance (" +
                    "id_perf INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "id_exercice INTEGER," +
                    "date TEXT," +
                    "poids REAL," +
                    "repetitions INTEGER," +
                    "FOREIGN KEY (id_exercice) REFERENCES exercice(id_exercice)" +
                    ");";

            String sql = "SELECT id_exercice, nom FROM exercice ORDER BY nom";

            st.execute(createExercice);
            st.execute(createPerf);

            ResultSet rs = st.executeQuery(sql);

            // si on a pas au moins 1 ligne
            if (!rs.next()){
                String fillExercice = "INSERT INTO exercice (nom) VALUES ('adducteur');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('arriereepaulepoulie');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('curlbicepshaltere');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('curlmarteaupoulie');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('deadlift');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('developpecouche');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('developpeincline');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('developpemilitaire');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('elevationlateral');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('extensionmollet');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('extentiontricepspoulie');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('legcurl');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('legextension');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('presse');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('squat');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('tiragehorizontal');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('tiragepouliebasse');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('tiragepouliehaute');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('tirageverticalpriseserre');";
                st.execute(fillExercice);
                fillExercice = "INSERT INTO exercice (nom) VALUES ('traction');";

                st.execute(fillExercice);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}