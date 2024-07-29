import java.sql.*;

public class A4Data{
    public static void main(String[] args) throws SQLException {
        Connection con;
        Statement stm = null;
        ResultSet rss = null;


        con = DriverManager.getConnection("jdbc:ucanaccess://C:\\connect Database\\A4Database.accdb");
    }
}