/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.Home; 
import Model.DBConnection; 
import Model.DBSearch; 
import java.awt.Frame; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import view.Login; 
/**
 *
 * @author janaka jayasri
 */
public class LoginController {
    public static void login(String userNameTF, String pWTF) { 
    try { 
           String Username = "janaka"; // initial value of the username 
           String Password = "123"; // initial value of the password 
           
                ResultSet rs = new DBSearch().searchLogin(Username); 
                
               while (rs.next()) { 
Username = rs.getString("Username"); 
 
 
Password = rs.getString("Password"); 
        }
         if (Username != null && Password != null) { 
                if (Password.equals(pWTF)) { 
         System.out.println("Login Successfull"); 
         Login.getFrames()[0].dispose(); 
         new Home().setVisible(true); 
                } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } else {
                
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            DBConnection.closeCon(); 
        } catch (SQLException ex) {
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    } 
}         
                
