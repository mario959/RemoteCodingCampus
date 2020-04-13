package com.company;

import java.sql.*;

public class Write{

    public void addNotes(String sql) {
        String url = "jdbc:mysql://localhost:3306/notizbuch?user=root";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            throw new Error("Problem", ex);
        }
    }

}

