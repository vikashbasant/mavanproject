package org.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    private static Connection con;

    public static Connection getConnection(){

        try {
            if(con == null) {
                // load driver:
                Class.forName("com.mysql.jdbc.Driver");

                // Create Connection:
                String url = "jdbc:mysql://localhost:3306/sample";
                String user = "root";
                String password = "Vikky@333";
                con = DriverManager.getConnection(url, user, password);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}