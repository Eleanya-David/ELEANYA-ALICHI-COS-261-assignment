/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos_261_tests;

/**
 *
 * @author Laptop
 */
//StudentGradeManager.java
import java.util.ArrayList;
import java.util.Scanner;
   //Class To Store Student Data
class Student{
 String name;
 String grade;
//Class Constructor
public Student(String name, String grade){
this.name = name;
this.grade=grade;
}
public class StudentGradeManager{
}
    static ArrayList<Student> students = new ArrayList<>(); //List to store students
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
     while(true){
     //Menu
     System.out.println("\n--- Student Grades Manager");
     System.out.println("1. Add Student");
     System.out.println("2. Update Student");
     System.out.println("3. View Students");
     System.out.println("4. Exit");
     System.out.println("Enter your choice(1-4): ");
             String choice= scanner.nextLine();
             switch (choice){
                 case "1":
                     addStudent();
                     break;
                 case "2":
                     updateStudent();
                     break;
                 case "3":
                     viewStudents();
                     break;
                 case "4":
                     System.out.println("Done!");
                 default:
                     System.out.println("Invalid choice, Try again.");
                     
             }
     }
    }
// Function To Add Students
    static void addStudent(){
    System.out.println("Enter Student Name");
    String name = scanner.nextLine();
    System.out.println("Enter Student Grade");
    String grade = scanner.nextLine();
    students.add(new Student(name,grade)); //Add to List
    System.out.println("Student Added Successfully");
    }
// Function To Update Students
    static void updateStudent(){
    System.out.println("Enter Student Name To Update");
    String name = scanner.nextLine();
        for (Student i : students) {
            System.out.println("Enter A New Grade");
            if (i.name.equalsIgnoreCase(name)){// Find match in the list ignoring case
                System.out.println("Enter A New Grade");
            i.grade = scanner.nextLine();// Update Grade
            System.out.println("Student Grade Updated.");
            return;
        }
        }
        System.out.println("StudentNotFound");// If no match found
    }
 // Functions to display all students
    static void viewStudents(){
    if (students.isEmpty()){
    System.out.println("No Students found.");
    }
    System.out.println("\nStudent Records: ");
    for (int i=0; i<students.size();i++){
    Student s= students.get(i);
    System.out.print("%d. %s - Grade: %s\n"+ (i+1) + s.name+ s.grade);
    }
    }
}