
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Student
{
    int stuID;
    double stuGPA;
    String stuName;
    public Student(int id, double gpa, String name)
    {
        int stuID = id;
        double stuGPA = gpa;
        String stuName = name;
    }

    public int getID()
    {
        return stuID;
    }
    
    public double getGPA()
    {
        return stuGPA;
    }
    
    public String getName()
    {
        return stuName;
    }
    
    public void setID(int id)
    {
        stuID = id;
    }
    
    public void setGPA(double gpa)
    {
        stuGPA = gpa;
    }
    
    public void setName(String name)
    {
        stuName = name;
    }
}
