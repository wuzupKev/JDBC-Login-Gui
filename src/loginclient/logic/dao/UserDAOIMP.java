
package loginclient.logic.dao;

import com.mysql.cj.protocol.Resultset;
import java.util.List;
import java.util.Optional;
import loginclient.logic.connection.ConnectionDB;
import loginclient.logic.modelos.User;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
public class UserDAOIMP  implements UserDAO{
    final String INSERT="INSERT INTO user (fullname,username,password) values (?,?,?)";
    final String UPDATE="UPDATE user set password=? where username=?" ;
    final String SELECTONE="SELECT * FROM user where username=? and password=?";
    final String SELECTALL="SELECT * FROM user";
    private PreparedStatement ps = null;
    private ResultSet r=null;
    
    
    private Connection con;

    public UserDAOIMP(Connection con) {
        this.con = con;
    }
    
    
    @Override
    public void create(User u) {
        try {
            ps=con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
         
            ps.setString(1, u.getFullname());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            if (ps.executeUpdate()==0){
                throw new Exception("cant be save");
            }
            r= ps.getGeneratedKeys();
            while(r.next()){
                u.setId(r.getInt(1));
            }
                
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally{
            if(r!=null){
                try {
                   r.close();
                }catch (SQLException ex) {
                  Logger.getLogger(UserDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(ps!=null){
                try {
                   ps.close();
                }catch (SQLException ex) {
                  Logger.getLogger(UserDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }
    }

    @Override
    public List<User> allUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<User> userById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateUser(User u) {
        try {
            ps=con.prepareStatement(UPDATE);
            ps.setString(1, u.getPassword());
            ps.setString(2,u.getUsername());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Boolean verifyAcc(String user, String pass) {
        boolean flag =false;
        try {
            ps=con.prepareStatement(SELECTONE);
            ps.setString(1, user);
            ps.setString(2, pass);
            r=ps.executeQuery();
            
            if(r.next()){
                return flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
        
    }
    
}
