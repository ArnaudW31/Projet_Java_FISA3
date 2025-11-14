package dao;

import model.Exercice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExerciceDAO {

    public static List<Exercice> getAll() {
        List<Exercice> list = new ArrayList<>();
        String sql = "SELECT id_exercice, nom, categorie, description FROM exercice ORDER BY nom";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Exercice e = new Exercice(
                        rs.getInt("id_exercice"),
                        rs.getString("nom"),
                        rs.getString("categorie"),
                        rs.getString("description")
                );
                list.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static Exercice findById(int id) {
        String sql = "SELECT id_exercice, nom, categorie, description FROM exercice WHERE id_exercice = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Exercice(
                            rs.getInt("id_exercice"),
                            rs.getString("nom"),
                            rs.getString("categorie"),
                            rs.getString("description")
                    );
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}