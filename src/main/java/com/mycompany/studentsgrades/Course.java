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
public class Course {
    private
           // String uniName;
            String courseName;
            String courseDays;
            String courseTime;
            String courseRoom;
            String courseBuilding;
            String courseInstructor;
            int capacity;//
            Student[] registeredStudents;
    public
            Course()
            {
                
            }
            Course(String courseName, String courseDays, String courseTime,String courseRoom,String courseBuilding, String courseInstructor, int capacity)
            {
              //this.uniName = uniName;
              this.courseName=courseName;
              this.courseDays=courseDays;
              this.courseTime=courseTime;
              this.courseRoom=courseRoom;
              this.courseBuilding=courseBuilding;
              this.courseInstructor = courseInstructor;
              this.capacity=capacity;
            }
            String getCourseName()
            {
                return this.courseName;
            }
            String getCourseDays()
            {
                return this.courseDays;
            }
            String getCourseTime()
            {
                return this.courseTime;
            }
            String getCourseRoom()
            {
                return this.courseRoom;
            }
            String getCourseBuilding()
            {
                return this.courseBuilding;
            }
            String getCourseInstructor()
            {
                return this.courseInstructor;
            }
            Student getStudent(int index)
            {
                return this.registeredStudents[index];
            }
            Student[] getAllStudents()
            {
                return this.registeredStudents;
            }
            void setCourseName(String courseName)
            {
                this.courseName=courseName;
            }
            void setCourseDays(String courseDays)
            {
                this.courseDays=courseDays;
            }
            void setCourseTime(String courseTime)
            {
                this.courseTime=courseTime;
            }
            void setCourseRoom(String courseRoom)
            {
                this.courseRoom=courseRoom;
            }
            void setCourseBuilding(String courseBuilding)
            {
                this.courseBuilding=courseBuilding;
            }
            void setCourseInstructor(String courseInstructor)
            {
                this.courseInstructor=courseInstructor;
            }   
            void addStudent(Student stud, int index)
            {
                this.registeredStudents[index]=stud;
            }
           /* String getUniName()
            {
                return this.uniName;
            }
            void setUniName(String uniName)
            {
                this.uniName = uniName;

            }*/
}
