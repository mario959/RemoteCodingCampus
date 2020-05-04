package com.company.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    DatabaseConnector connector = new DatabaseConnector();

    public void printMenu(){
        System.out.println("****  Marios Pizza ****");
        System.out.println("------------------------");
        System.out.println("Nr. | Menü:");
        String query = "SELECT * FROM menü";
        ResultSet resultSet = connector.fetchData(query);
        try {
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(" " + id + "\t| " + name);
            }
        }catch (SQLException e){
            System.out.println("No Data " + e);

        }
        System.out.println("------------------------");
    }
}
