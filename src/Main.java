import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bancoteste";
        String user = "developer";
        String password = "12345678";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
