package dao;

import model.Performance;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PerformanceDAO {

    public static List<Performance> getByExerciceId(int idExercice) {
        List<Performance> list = new ArrayList<>();
        String sql = "SELECT id_perf, id_exercice, date, poids, repetitions FROM performance WHERE id_exercice = ? ORDER BY date";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idExercice);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    LocalDate date = LocalDate.parse(rs.getString("date"));
                    Performance p = new Performance(
                            rs.getInt("id_perf"),
                            rs.getInt("id_exercice"),
                            date,
                            rs.getDouble("poids"),
                            rs.getInt("repetitions")
                    );
                    list.add(p);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static boolean insertPerformance(Performance perf) {
        String sql = "INSERT INTO performance (id_exercice, date, poids, repetitions) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perf.getIdExercice());
            ps.setString(2, perf.getDate().toString()); // ISO 8601
            ps.setDouble(3, perf.getPoids());
            ps.setInt(4, perf.getRepetitions());
            int affected = ps.executeUpdate();
            return affected == 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}