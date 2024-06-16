/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author janaka jayasri
 */
public class CourseController {

   public static void Form(String CourseName, String CourseID, String TeacherName, String Grade,String Year) {
         new Model.AddCourseDetails().Form(CourseName, CourseID, TeacherName, Grade,Year); 
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
        JOptionPane.INFORMATION_MESSAGE); 
   }
    
}
