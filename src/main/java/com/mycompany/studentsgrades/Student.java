/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentsgrades;

/**
 *
 * @author ahmed
 */
public class Student {
    private 
     String studID;
     String studName;
     float studGPA;
     double studGrade;
     int studentsCounter;
    
    public
    Student()
    {
        
    }
     Student(String studID, String studName, float studGPA,double studGrade)
    {
        this.studID=studID;
        this.studName=studName;
        this.studGPA=studGPA;
        this.studGrade=studGrade;
    }
     String getStudName()
    {
      return this.studName;
    }
     String getStudID()
    {
        return this.studID;
    }
     float getStudGPA()
    {
        return this.studGPA;
    }
     double getStudGrade()
    {
        return this.studGrade;
    }
     void setStudName(String studName)
    {
        this.studName=studName;
    }
     void setStudID(String studID)
    {
        this.studID=studID;
    }
     void setStudGPA(float studGPA)
    {
        this.studGPA=studGPA;
    }
     void setStudGrade(double studGrade)
    {
        this.studGrade=studGrade;
    }
}

