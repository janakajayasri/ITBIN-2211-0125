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
public class AddCourseDetails {
     Statement stmt;
        
public void Form(String CourseName, String CourseID, String TeacherName,String Grade,String Year) { 
    try { 
stmt = DBConnection.getStatementConnection(); 
stmt.executeUpdate 
("INSERT INTO course VALUES('"+CourseName+"','"+CourseID+"','"+TeacherName+"', '"+Grade+"', '"+Year+"')"); 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
}
    
}
