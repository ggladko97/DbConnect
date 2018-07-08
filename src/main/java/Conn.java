import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */
public class Conn {

    //private static final names are all UPPER_CASE
    private static final String url = "jdbc:mysql://localhost:3306/blink";
    private static final String user = "root";
    private static final String password = "password";

    // create class for creating connection, with 1 method:  getConnection()
    //use  it in main()block like lokal  variable  without static.  same with  stmt and rs
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query = "select count(*) from users";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //its OK.  but read about  the purpose of try-catches inside finally block
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}
