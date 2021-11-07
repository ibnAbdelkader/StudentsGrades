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
public class University {
    private
            String uniName;
            String uniCity;
            int numCourses;//setters get
            Course[] uniCourse = new Course[numCourses];
            
    
    public 
    
    University()
    {
        
    }
     University(String uniName, String uniCity)
    {
        this.uniName=uniName;
        this.uniCity=uniCity;
        //this.numCourses = numCourses;
    }
    String getUniName()
    {
      return this.uniName;  
    }
    String getUniCity()
    {
        return this.uniCity;
    }
    /*Course GetUniCourse()
    {
        //return this.uniCourse;
    }*/
    Course[] getAllCourses()
    {
        return this.uniCourse;
    }
    void setUniName (String uniName)
    {
        this.uniName=uniName;
    }
    void SetUniCity(String uniCity)
    {
        this.uniCity=uniCity;
    }
    void setNumCourses(int numCourses)
    {
        this.numCourses = numCourses;
    }
    int getNumCourses()
    {
        return this.numCourses;
    }
    void addCourse(Course uniCourse, int index)
    {
        this.uniCourse[index]=uniCourse;
    }
}
