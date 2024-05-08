package service;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;


public class UserService {
        public static boolean insertUser(String firstname, String lastname, String password) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO user (firstname, lastname, password) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, firstname);
                pstmt.setString(2, lastname);
                pstmt.setString(3, password);
                pstmt.executeUpdate();
                return true; // Insertion successful
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // Insertion failed
        }
    }
}
