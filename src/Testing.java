
import java.sql.*;
import java.util.*;


public class Testing {

    
    public static void main(String[] args) {
        ResultSet rset;
        Statement stmt;
        Connection conn;
        String query;
        ArrayList result = null;
        int i = 0;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // dari Driver class
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "hr","hr");
            System.out.println("Koneksi berhasil");
            
            result = new ArrayList();
            
            query = "SELECT * FROM koleksi";
            System.out.println("Executing query : " + query);
            
            stmt = conn.createStatement();
            rset = stmt.executeQuery(query);
            
            while (rset.next()) {
                
            }
            
            
        } catch (Exception e) {
            // perform error handling here
            System.out.println("Masih belum konek");
        }
        
        
    }
    
}
