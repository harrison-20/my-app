/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARRIE
 */
public class Stuman {

    private String name;
    private double[] grades;
    private int YearOfStudent;
    private double GPA;
    
    public Stuman(){
    }
    public Stuman(String name, double[] grades, int YearOfStudent){
        this.grades = grades;
        this.name = name;
        this.YearOfStudent = YearOfStudent;
        
    } 
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGrades(double[] grades){
        this.grades = grades;
    }
    public double[] getGrades(){
      
        return grades;
    }
    public void setYearOfStudent(int YearOfStudent){
        this.YearOfStudent = YearOfStudent;
       
    }
    public int getYearOfStudent(){
        return YearOfStudent;
    }
    public double getAverageGrade(int Grades){
      int sum = 0;
        double AverageGrade = sum / Grades;
        return AverageGrade;
        
    }
    public double getGPA(){
        return GPA;
    }
}

    

