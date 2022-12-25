package org.jdbc.service;

import org.jdbc.domain.Student;
import org.jdbc.repository.ConnectionJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentImp implements StudentService {
    ConnectionJDBC connectionJDBC = new ConnectionJDBC();
    private static final String INSERT_USERS_SQL = "INSERT INTO Student" + "  (id, firstname, lastname, gender, grade, dob) VALUES " +
            " (?, ?, ?, ?, ?, ?);";
    @Override
    public void InsertStudent(Student student) throws SQLException {
        Connection con = connectionJDBC.getConnection();

        try{
            // get the PreparedStatement object:
            PreparedStatement pstmt = con.prepareStatement(INSERT_USERS_SQL);

            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getFirstname());
            pstmt.setString(3, student.getLastname());
            pstmt.setString(4, student.getGender());
            pstmt.setInt(5, student.getGrade());
            pstmt.setDate(6, student.getDob());
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
