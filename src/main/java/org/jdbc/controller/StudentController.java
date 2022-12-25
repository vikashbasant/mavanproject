package org.jdbc.controller;

import org.jdbc.domain.Student;
import org.jdbc.service.StudentImp;
import org.jdbc.service.StudentService;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentController {
    public void handler(Student student) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice between 1 to 5");
        int point = scan.nextInt();
        StudentService studentService = new StudentImp();
        while(point<=5){
            switch (point){
                case 1:
                    studentService.InsertStudent(student);
            }
            point = scan.nextInt();
        }
    }
}
