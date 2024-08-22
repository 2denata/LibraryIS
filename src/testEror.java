
import Perpustakaan.DataHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class testEror {

    public static void main(String[] args) throws SQLException {
        DataHandler test = new DataHandler();
        test.getDBConnection();
        Connection con = test.getCon();
        Statement stmt = con.createStatement();

        String query = "SELECT * FROM transaksi";
        System.out.println("Executing query " + query);
        ResultSet rset = stmt.executeQuery(query);
        while (rset.next()) {
            System.out.println(rset.getString("tglPinjam"));
        }
        
//        System.out.println(LocalDate.now().getMonthValue());
//        System.out.println(LocalDate.now().getYear());
//        System.out.println(LocalDate.now().getDayOfMonth());
//        String tglPinjam = String.valueOf(LocalDate.now().getDayOfMonth()) + String.valueOf(LocalDate.now().getMonthValue()) + String.valueOf(LocalDate.now().getYear());
//        System.out.println(tglPinjam);
    }

}
