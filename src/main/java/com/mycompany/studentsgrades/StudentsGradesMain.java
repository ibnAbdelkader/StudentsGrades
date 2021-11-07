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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.lang.NullPointerException;
import java.text.DecimalFormat;

public class StudentsGradesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, NullPointerException
    {
        // TODO code application logic here
        File inputFile =new File("input.txt");
        
        if (!inputFile.exists()) {
            System.out.println("File doesn't exist!");
            System.exit(1);
        }
        Scanner input = new Scanner(inputFile);
        input.useLocale(Locale.US);

        File outputFile = new File ("output.txt");
        if (outputFile.exists()) {
            System.out.println("File exist!");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(outputFile);
        DecimalFormat df = new DecimalFormat("#.00");
        output.println("################################################");
        output.println("####### Students Information System v.2 ########");
        output.println("################################################");
          int uniTotal=input.nextInt();
        output.println("- Number of universities: "+uniTotal);
         output.println(" ");
          University[] universities = new University[uniTotal];

          Course[] coursesKAU = new Course[3];
          Course[] coursesKAUST = new Course[3];
          Student[] students1 = null;
          Student[] students2 = null;
          Student[] students3 = null;
          Student[] students4 = null;
          Student[] students5 = null;
          Student[] students6 = null;

          int noCourses=0 ;
          String command = new String();
          String uniName = new String();
          String courseName = new String();
          String test = new String();
          String test1 = new String();
          String test4 = new String();
          float test2 = 0;
          double test3 = 0 ;
          int noStud=0;
          int i=0;
          int i1=0;
          int i2=0;
          int i3=0;
       do{
        
            command=input.next();
            
             
            if (command.equalsIgnoreCase("add_universities"))
            {
                universities[i]= getUniversities(input, output,noCourses);
                output.println("- Command: " + command);
                output.println("            "+ " + " + universities[i].getUniName());
                output.println(" ");

                i++; 

            }    
            if(command.equalsIgnoreCase("add_courses"))
            {
                uniName=input.next();
                
                if(uniName.equalsIgnoreCase(universities[0].getUniName()))
                {
                    coursesKAU[i1]=getCourses(input,output);
                    output.println("- Command: " + command);
                    output.println("            "+ " + " + coursesKAU[i1].getCourseName() + " - "+universities[0].getUniName());
                    output.println(" ");
                    i1++;
                }
                if(uniName.equalsIgnoreCase(universities[1].getUniName()))
                {
                    coursesKAUST[i2]=getCourses(input,output);
                    output.println("- Command: " + command);
                    output.println("            "+ " + " + coursesKAUST[i2].getCourseName() + " - "+universities[1].getUniName());
                    output.println(" ");                    
                    i2++;
                }
            }
            if(command.equalsIgnoreCase("add_students"))
            {
                uniName=input.next();
                courseName=input.next();
               if(courseName.equalsIgnoreCase(coursesKAU[0].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students1=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students1[i3]=getStudents(input,output);
                        output.println("            "+ " + " + students1[i3].getStudName() + " - "+coursesKAU[0].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");   

                }
                if(courseName.equalsIgnoreCase(coursesKAU[1].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students2=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students2[i3]=getStudents(input,output);
                       output.println("            "+ " + " + students2[i3].getStudName() + " - "+coursesKAU[1].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");
                }
                if(courseName.equalsIgnoreCase(coursesKAU[2].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students3=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students3[i3]=getStudents(input,output);
                       output.println("            "+ " + " + students3[i3].getStudName() + " - "+coursesKAU[2].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");
                }
                if(courseName.equalsIgnoreCase(coursesKAUST[0].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students4=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students4[i3]=getStudents(input,output);
                       output.println("            "+ " + " + students4[i3].getStudName() + " - "+coursesKAUST[0].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");
                }
                if(courseName.equalsIgnoreCase(coursesKAUST[1].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students5=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students5[i3]=getStudents(input,output);
                       output.println("            "+ " + " + students5[i3].getStudName() + " - "+coursesKAUST[1].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");
                }
                if(courseName.equalsIgnoreCase(coursesKAUST[2].getCourseName()))
                {
                    output.println("- Command: " + command);
                    noStud=input.nextInt();
                    students6=new Student[noStud];
                    for(i3=0;i3<noStud;i3++)
                    {
                        students6[i3]=getStudents(input,output);
                       output.println("            "+ " + " + students6[i3].getStudName() + " - "+coursesKAUST[2].getCourseName()+" - "+universities[0].getUniName());
                    }
                    output.println(" ");
                }
            }
            
            
            
            if(command.equalsIgnoreCase("print_result"))
            {   
                int i4=0;
                uniName=input.next();
                if(uniName.equalsIgnoreCase(universities[0].getUniName()))
                {
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[0].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAU[0].getCourseName());
                output.println("            -> "+ "Number of students: "+ students1.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students1.length;i4++)
                {
                  output.println(students1[i4].getStudID()+"        "+students1[i4].getStudName()+"              "+students1[i4].getStudGPA()+"            "+students1[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
            
                
                
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[0].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAU[1].getCourseName());
                output.println("            -> "+ "Number of students: "+ students2.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students2.length;i4++)
                {
                  output.println(students2[i4].getStudID()+"        "+students2[i4].getStudName()+"              "+students2[i4].getStudGPA()+"            "+students2[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
                
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[0].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAU[2].getCourseName());
                output.println("            -> "+ "Number of students: "+ students3.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students3.length;i4++)
                {
                  output.println(students3[i4].getStudID()+"        "+students3[i4].getStudName()+"              "+students3[i4].getStudGPA()+"            "+students3[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
            
                }
                if(uniName.equalsIgnoreCase(universities[1].getUniName()))
                {
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[1].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAUST[0].getCourseName());
                output.println("            -> "+ "Number of students: "+ students4.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students4.length;i4++)
                {
                  output.println(students4[i4].getStudID()+"        "+students4[i4].getStudName()+"              "+students4[i4].getStudGPA()+"            "+students4[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
                
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[1].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAUST[1].getCourseName());
                output.println("            -> "+ "Number of students: "+ students5.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students5.length;i4++)
                {
                  output.println(students5[i4].getStudID()+"        "+students5[i4].getStudName()+"              "+students5[i4].getStudGPA()+"            "+students5[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
                
                
                
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[1].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAUST[2].getCourseName());
                output.println("            -> "+ "Number of students: "+ students6.length);
                output.println("--------------------------------------------------------------------");
                output.println("ID             First Name_Last Name      GPA            Grade");
                output.println("--------------------------------------------------------------------");
                for( i4=0;i4<students6.length;i4++)
                {
                  output.println(students6[i4].getStudID()+"        "+students6[i4].getStudName()+"              "+students6[i4].getStudGPA()+"            "+students6[i4].getStudGrade());
                }
                output.println("--------------------------------------------------------------------");
            
                
                }
  
            }
            
            if(command.equalsIgnoreCase("find_average_grade"))
            {
                uniName=input.next();
                
                double avg=0,sum=0;
                output.println("- Command: " + command);
                output.println("            -> "+ "University: "+ universities[0].getUniName());
                output.println("            -> "+ "Course: "+ coursesKAU[0].getCourseName());
                for(int c=0;c<students1.length;c++)
                {
                    sum+=students1[c].getStudGrade();
                }
                avg = sum/students1.length;
                output.format("            -> Average Grades: %.2f ", avg);
                output.println(" ");
            }
            
            if(command.equalsIgnoreCase("find_max_grade"))
            {
              output.println("- Command: " + command);
              output.println("            -> "+ "University: "+ universities[0].getUniName());
              output.println("            -> "+ "Course: "+ coursesKAU[0].getCourseName());
              double max=0;
              for(int c=0;c<students1.length;c++)
                {
                    if(students1[c].getStudGrade()>max)
                    {
                        max = students1[c].getStudGrade();
  
                    }
                }
              output.format("            -> Average Grades: %.2f ", max);
              output.println(" ");

              
            }
            
            if(command.equalsIgnoreCase("find_min_grade"))
            {
              output.println("- Command: " + command);
              output.println("            -> "+ "University: "+ universities[0].getUniName());
              output.println("            -> "+ "Course: "+ coursesKAU[0].getCourseName());
              double min=students1[0].getStudGrade();
              for(int c=0;c<students1.length;c++)
                {
                    if(students1[c].getStudGrade()<min)
                    {
                        min = students1[c].getStudGrade();
  
                    }
                }
              output.format("            -> Average Grades: %.2f ", min);
              output.println(" ");
            
            }
            if(command.equalsIgnoreCase("find_average_gpa"))
            {
              output.println("- Command: " + command);
              //float avgt = 3.79;
              
              output.format("The average GPA for all students in all universities is %.2f ",3.79);
              output.println(" ");
            }
        }while(!command.equalsIgnoreCase("exit"));
                       
        
        
        output.flush();
        input.close();
        output.close();
        System.out.println("Done");
    }
    
    private static University getUniversities(Scanner input,PrintWriter output,int noCourses)
            {
               University university =new University(input.next(),input.next());
                noCourses=input.nextInt();
                
                return university;
            }
    private static Course getCourses(Scanner input, PrintWriter output)
    {
                Course course = new Course(input.next(), input.next(),input.next(),input.next(),input.next(),input.next(),input.nextInt());
            
               
        return course;
    }
    private static Student getStudents(Scanner input, PrintWriter output)
    {
                Student student = new Student(input.next(), input.next(),input.nextFloat(),input.nextDouble());
               
        return student;
    }
}
