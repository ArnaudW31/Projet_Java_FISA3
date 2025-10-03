package app;

import dao.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Créer la BDD si nécessaire : exécuter le script init.sql embarqué (optionnel)
        initDatabaseIfNeeded();

        FXMLLoader loader = new FXMLLoader(getResource("view/main.fxml"));
        Scene scene = new Scene(loader.load());
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
                    "nom TEXT NOT NULL," +
                    "categorie TEXT," +
                    "description TEXT" +
                    ");";

            String createPerf = "CREATE TABLE IF NOT EXISTS performance (" +
                    "id_perf INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "id_exercice INTEGER," +
                    "date TEXT," +
                    "poids REAL," +
                    "repetitions INTEGER," +
                    "FOREIGN KEY (id_exercice) REFERENCES exercice(id_exercice)" +
                    ");";

            st.execute(createExercice);
            st.execute(createPerf);

            // Optionnel: si tu veux initialiser depuis sql/init.sql placé dans resources/sql/init.sql
            InputStream is = getClass().getResourceAsStream("/sql/init.sql");
            if (is != null) {
                String sql = new Scanner(is).useDelimiter("\\A").next();
                // split par ; et exécuter statements simples
                for (String stmt : sql.split(";")) {
                    String t = stmt.trim();
                    if (!t.isEmpty()) {
                        st.execute(t);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}