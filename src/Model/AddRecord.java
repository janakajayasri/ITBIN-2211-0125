/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.SQLException;
import java.sql.Statement; 
/**
 *
 * @author janaka jayasri
 */
public class AddRecord {
    Statement stmt;
        
public void Form(String name, String address, String gender,String age) { 
    try { 
stmt = DBConnection.getStatementConnection(); 
stmt.executeUpdate 
("INSERT INTO student VALUES('"+name+"','"+address+"','"+gender+"', '"+age+"')"); 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
}

    
}
