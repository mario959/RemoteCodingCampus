package com.company.model;

import com.company.model.DatabaseConnector;

import java.util.Scanner;

public class OwnerRepository  {

    DatabaseConnector connector = new DatabaseConnector();


    public void insertMenu() {
        System.out.println("Bitte geben Sie ein Menü ein oder (no) zum beenden.");
        Scanner my = new Scanner(System.in);
        String user = my.nextLine();
        if (user.equalsIgnoreCase("no")) {
            System.out.println("Danke für die eingabe");
        } else {
            String input = "INSERT INTO menü(name) VALUES ('" + user + "')";
            connector.insert(input);
            insertMenu();
        }
        connector.closeConnection();

    }

    public void insertIngredients() {
        System.out.println("Bitte geben Sie eine Zutat ein oder (no) zum beenden.");
        Scanner my = new Scanner(System.in);
        String user = my.nextLine();
        if (user.equalsIgnoreCase("no")) {
            System.out.println("Danke für die eingabe");
        } else {
            String input = "INSERT INTO ingredients(name) VALUES ('" + user + "')";
            connector.insert(input);
            insertIngredients();
        }
        connector.closeConnection();
    }

    public void insertCity() {

        System.out.println("Bitte geben Sie ein Lieferort ein oder (no) zum beenden.");
        Scanner my = new Scanner(System.in);
        String user = my.nextLine();
        if (user.equalsIgnoreCase("no")) {
            System.out.println("Danke für die eingabe");
        } else {
            String input = "INSERT INTO place_of_delivery(name) VALUES ('" + user + "')";
            connector.insert(input);
            insertCity();
        }
        connector.closeConnection();

    }

    public void insertPrice() {
        System.out.println("Bitte geben Sie ein Lieferpreis ein oder (0) zum beenden.");
        Scanner my = new Scanner(System.in);
        double user = my.nextDouble();
        if (user == 0) {
            System.out.println("Danke für die eingabe");
        } else {
            String input = "INSERT INTO delivery_preis(price) VALUES ('" + user + "')";
            connector.insert(input);
            insertPrice();
        }
        connector.closeConnection();
    }
}
