/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRIE
 */
import java.util.Scanner;

public class Stumanagement {
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = input.nextLine();
        
        System.out.print("the year the student is : ");
        int YearOfStudent =input.nextInt();
        
       System.out.print("Enter grade course c1:");
            double c1 = input.nextDouble();
            
             System.out.print("Enter grade for course c2:");
            double c2 = input.nextDouble();
       
       
             System.out.print("Enter grade course c3:");
            double c3 = input.nextDouble();
            double sum = c1 + c2 + c3;
        System.out.println("the sum of grades is "+ sum);
        
        double averageGrade = sum/3;
        
        System.out.println("The average grade of the student is "+ averageGrade);
       double GPA = sum / averageGrade;
          System.out.println("The GPA of the student is "+ GPA);  
        Stuman student = new Stuman();
        student.setName(name);
        student.getGrades();
        student.setYearOfStudent(YearOfStudent);
        System.out.println("The student name is "+ name + ", the average grade is " + averageGrade +" and the student is in "+ YearOfStudent +" year. The GPA is " + GPA);
    
       
       
    }

   
    }
    

    

