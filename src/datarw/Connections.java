package datarw;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connections {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-EKACP9K:1433;database=DataRw;user=DESKTOP-EKACP9K/Root;integratedSecurity=true;");
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null, "SQL Exception : " + sqle.getMessage());
        }catch (ClassNotFoundException ce){
            JOptionPane.showMessageDialog(null, "Class Not Found Exception : " + ce.getMessage());
        }
        return con;
    }
}
