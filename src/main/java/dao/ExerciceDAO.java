package dao;

import model.Adducteur;
import model.ArriereEpaulePoulie;
import model.CurlBicepsHalteres;
import model.CurlMarteauPoulie;
import model.Deadlift;
import model.DeveloppeCouche;
import model.DeveloppeIncline;
import model.DeveloppeMilitaire;
import model.ElevationLateral;
import model.Exercice;
import model.ExtensionMollet;
import model.ExtentionTricepsPoulie;
import model.LegCurl;
import model.LegExtension;
import model.Presse;
import model.Squat;
import model.TirageHorizontal;
import model.TiragePoulieBasse;
import model.TiragePoulieHaute;
import model.TirageVerticalPriseSerre;
import model.Traction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExerciceDAO {

    public static List<Exercice> getAll() {
        List<Exercice> list = new ArrayList<>();
        String sql = "SELECT id_exercice, nom FROM exercice ORDER BY nom";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
             Exercice e;
            while (rs.next()) {
                switch (rs.getString("nom")) {
                    case "adducteur":
                        e = new Adducteur(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "arriereepaulepoulie":
                        e = new ArriereEpaulePoulie(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "curlbicepshaltere":
                        
                        e = new CurlBicepsHalteres(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "curlmarteaupoulie":
                        e = new CurlMarteauPoulie(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        
                        break;
                    case "deadlift":
                        e = new Deadlift(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        
                        break;
                    case "developpecouche":
                        e = new DeveloppeCouche(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "developpeincline":
                        e = new DeveloppeIncline(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "developpemilitaire":
                        e = new DeveloppeMilitaire(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    
                    case "elevationlateral":
                        e = new ElevationLateral(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "extensionmollet":
                        e = new ExtensionMollet(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "extentiontricepspoulie":
                        e = new ExtentionTricepsPoulie(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "legcurl":
                        e = new LegCurl(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "legextension":
                        e = new LegExtension(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "presse":
                        e = new Presse(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "squat":
                        e = new Squat(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "tiragehorizontal":
                        e = new TirageHorizontal(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "tiragepouliebasse":
                        e = new TiragePoulieBasse(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "tiragepouliehaute":
                        e = new TiragePoulieHaute(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "tirageverticalpriseserre":
                        e = new TirageVerticalPriseSerre(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                    case "traction":
                        e = new Traction(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                
                    default:
                        e = new Adducteur(
                            rs.getInt("id_exercice"),
                            rs.getString("nom")
                        );
                        break;
                }
                list.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static Exercice findById(int id) {
        String sql = "SELECT id_exercice, nom FROM exercice WHERE id_exercice = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Exercice e;
                    switch (rs.getString("nom")) {
                        case "adducteur":
                            e = new Adducteur(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "arriereepaulepoulie":
                            e = new ArriereEpaulePoulie(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "curlbicepshaltere":
                            
                            e = new CurlBicepsHalteres(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "curlmarteaupoulie":
                            e = new CurlMarteauPoulie(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            
                            break;
                        case "deadlift":
                            e = new Deadlift(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            
                            break;
                        case "developpecouche":
                            e = new DeveloppeCouche(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "developpeincline":
                            e = new DeveloppeIncline(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "developpemilitaire":
                            e = new DeveloppeMilitaire(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        
                        case "elevationlateral":
                            e = new ElevationLateral(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "extensionmollet":
                            e = new ExtensionMollet(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "extentiontricepspoulie":
                            e = new ExtentionTricepsPoulie(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "legcurl":
                            e = new LegCurl(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "legextension":
                            e = new LegExtension(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "presse":
                            e = new Presse(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "squat":
                            e = new Squat(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "tiragehorizontal":
                            e = new TirageHorizontal(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "tiragepouliebasse":
                            e = new TiragePoulieBasse(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "tiragepouliehaute":
                            e = new TiragePoulieHaute(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "tirageverticalpriseserre":
                            e = new TirageVerticalPriseSerre(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                        case "traction":
                            e = new Traction(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                    
                        default:
                            e = new Adducteur(
                                rs.getInt("id_exercice"),
                                rs.getString("nom")
                            );
                            break;
                    }
                    return e;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}