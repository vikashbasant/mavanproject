package org.jdbc.service;

import org.jdbc.domain.Student;

import java.sql.SQLException;

public interface StudentService {
    void InsertStudent(Student student) throws SQLException;
}
