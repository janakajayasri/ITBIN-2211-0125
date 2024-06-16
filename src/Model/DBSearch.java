/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement; 

/**
 *
 * @author janaka jayasri
 */
public class DBSearch {
    Statement stmt; 
    ResultSet rs;
    
    
public ResultSet searchLogin(String userNameTF) {
    try { 
        stmt = DBConnection.getStatementConnection(); 
        String name = userNameTF; 
        
        
        //Execute the Query 
        rs = stmt.executeQuery("SELECT * FROM login where Username='"+ name +"'"); 
}   catch (SQLException e) { 
        e.printStackTrace(); 
    } 
        return rs; 
    } 
public ResultSet searchStudents(){ 
     try{ 
        stmt = DBConnection.getStatementConnection(); 
        rs = stmt.executeQuery("SELECT * FROM student"); 
} 
     catch(SQLException e){ 
} 
        return rs; 
    }
public ResultSet searchCourse(){ 
     try{ 
        stmt = DBConnection.getStatementConnection(); 
        rs = stmt.executeQuery("SELECT * FROM course"); 
} 
     catch(SQLException e){ 
} 
        return rs; 
    } 
}
        
    
    
    

