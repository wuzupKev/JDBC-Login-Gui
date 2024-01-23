
package loginclient.logic.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionDB {
    private Connection connection=null;
    
    public Connection connect(){
        String jdbc= "jdbc:mysql://localhost:3306/logindb";
        try {
           connection= DriverManager.getConnection(jdbc,"root","AdminDB123");
           
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public void disconnect (){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
