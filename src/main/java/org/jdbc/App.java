package org.jdbc;

import org.jdbc.controller.StudentController;
import org.jdbc.domain.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Id: ");
        int id = scan.nextInt();
        System.out.println("Enter your first Name: ");
        String firstname = scan.next();
        System.out.println("Enter you last Name: ");
        String lastname = scan.next();
        System.out.println("Enter your gender Character: ");
        String gender = scan.next();
        System.out.println("Enter your grade between 1 to 10");
        int grade = scan.nextInt();
        System.out.println("Enter your dob in the format yyyy-mm-dd");
        String formate = scan.next();
        Date dob = new SimpleDateFormat("yyyy-mm-dd").parse(formate);

        Student student = new Student(id, firstname, lastname, gender, grade, dob);
        StudentController studentController = new StudentController();
        studentController.handler(student);
    }
}
