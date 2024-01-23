/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginclient;

import loginclient.logic.connection.ConnectionDB;
import loginclient.logic.dao.UserDAOIMP;
import loginclient.logic.modelos.User;
import loginclient.view.LoginForm;

/**
 *
 * @author Kevin Chavarria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ConnectionDB con= new ConnectionDB();
      // UserDAOIMP us= new UserDAOIMP(con.connect());
       //us.create(new User ("Juan","Pedraza","pedraza"));
        //System.out.println(us.verifyAcc("Pedraza","Pedraza"));

       LoginForm login = new LoginForm();
       login.setVisible(true);
    }
    
}
