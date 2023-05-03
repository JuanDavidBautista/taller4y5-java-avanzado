package co.edu.sena.proojectj2687350.util.conecction_test;

import java.sql.*;

public class BasicConnectionWithResources {

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/RICK?serverTimezone=America/Bogota";
        String username = "root";
        String password = "";
        String sql = "SELECT * FROM RICK.users_tbl";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                System.out.println(rs.getString("user_firstname"));
                System.out.print("|");
                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } // end try-catch
    } // main
} // BasicConnectionWithResources

