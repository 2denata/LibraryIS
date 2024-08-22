package Perpustakaan;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class DataHandler {
    // string ‘localhost’ anda ganti dengan IP server yang
    String jdbcURL  = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    String user = "hr";
    String password = "hr";
    Connection conn;

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // dari Driver class
            conn = DriverManager.getConnection(jdbcURL, user,
                    password);
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Maaf, koneksi ke database gagal");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }

    public Connection getCon() {
        return conn;
    }
}
