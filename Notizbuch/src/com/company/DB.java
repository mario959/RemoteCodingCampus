package com.company;

import java.sql.*;

public class DB {



    public void conn( String query){

        String url = "jdbc:mysql://localhost:3306/notizbuch?user=root";

        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Do it");

            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String notes = rs.getString("notes");
                    System.out.println(id + " " + notes);
                }
            } catch (SQLException ex) {
                throw new Error("Problem", ex);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
