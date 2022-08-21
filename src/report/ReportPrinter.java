/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import model.Course;
import model.Student;


/**
 *
 * @author Lauretta
 */
public class ReportPrinter {
    public static void printReportCard (Student student){
        System.out.println("=================Report Card====================");
        System.out.println("Name: "+ student.getFirstname() + " "+ student.getLastname() + "      " + "Position: " +student.getPosition());
        System.out.println("=====================Courses=========================");
       for (Course c : student.getCourses()){
           System.out.println(c.getCourse_name() + " : " +c.getScore());
       }
        System.out.println("==================================================");
        System.out.println("Total :"+ student.getTotalScore() + "               " +" Average: " +student.getAverageScore());
        System.out.println("========================================================");
        
    }
}
