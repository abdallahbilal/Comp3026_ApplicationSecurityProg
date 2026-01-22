package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Register;


public class RegisterDao {

    private static final String DB_URL =
    		"jdbc:mysql://localhost:3306/userdb?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "Password@123";

    // 🔍 Check if user already exists
    public boolean userExists(String userId, String email) {

        String sql = "SELECT 1 FROM tbluser WHERE userId = ? OR email = ?";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, userId);
            stmt.setString(2, email);

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ➕ Insert new user
    public boolean registerUser(Register r) {

        String sql = "INSERT INTO tbluser " +
                "(userId, password, name, address, country, zipcode, email, sex, language, about) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        // Load the MySQL driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8 driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false; // driver not found
        }

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, r.getUserId());
            stmt.setString(2, r.getPassword());
            stmt.setString(3, r.getName());
            stmt.setString(4, r.getAddress());
            stmt.setString(5, r.getCountry());
            stmt.setString(6, r.getZipcode());
            stmt.setString(7, r.getEmail());
            stmt.setString(8, r.getSex());
            stmt.setString(9, r.getLanguage());
            stmt.setString(10, r.getAbout());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
