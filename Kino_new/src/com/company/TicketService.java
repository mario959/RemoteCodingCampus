package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketService {

    private static final int MAX_SEAT = 40;

    DatabaseConnector connector = new DatabaseConnector();


    public void buyTicket() {

        Scanner myscanner = new Scanner(System.in);
        printIntro();
        printMovies();
        System.out.println("Please choose the ID Number.");
        Playmovie playmovies = chooseFilmID(myscanner.nextInt());
        System.out.println("How many tickets do you want??");
        int amountSet = amountSeat(myscanner.nextInt(), playmovies);
        insertBookingNumber(playmovies);
        getBookingNumber(playmovies);
        System.out.println("If you wont delete you booking, please enter your booking Number");
        int bookingNumber = myscanner.nextInt();
        deleteBookingNumber(bookingNumber);
        System.out.println("Thank you :) ");

    }


    private void printIntro() {
        System.out.println(" *** Hello to Cinema Meiningen ****");
        System.out.println();
        System.out.println("What do you want to show for a film ???");
        System.out.println();
    }

    private void printMovies() {
        System.out.println("ID: Beginn:\t\t Saalnummer:  Film:");
        System.out.println("--------------------------------------");
        try {

            String query = "SELECT playmovie.id ,start_time, halls.hall_number, movie.name " +
                    "FROM `playmovie` " +
                    "INNER JOIN halls " + "ON hall_id = halls.id " +
                    "INNER JOIN movie ON movie_id = movie.id";
            ResultSet rs = connector.fetchData(query);

            while (rs.next()) {
                int id = rs.getInt("playmovie.id");
                String startTime = rs.getNString("start_time");
                int hallNumber = rs.getInt("halls.hall_number");
                String movieId = rs.getNString("movie.name");
                System.out.println(id + "\t" + startTime + "\t\t " + hallNumber + "\t\t\t  " + movieId);


            }
            System.out.println("--------------------------------------");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            connector.closeConnection();
        }


    }

    private Playmovie chooseFilmID(int idNumber) {

        Playmovie playMovie = null;

        System.out.println("Your choise is Nr:  " + idNumber + " thank you.\n");


        try {
            String query = "SELECT  playmovie.id, start_time, halls.hall_number, movie.name" +
                    " FROM playmovie  " +
                    "INNER JOIN halls " + "ON hall_id = halls.id " +
                    "INNER JOIN movie ON movie_id = movie.id  WHERE playmovie.id = " + idNumber;


            ResultSet result = connector.fetchData(query);
            while (result.next()) {
                int id = result.getInt("id");
                String time = result.getString("start_time");
                int hallNumber = result.getInt("halls.hall_number");
                String name = result.getString("movie.name");
                System.out.println(id + ".\t" + time + "\t\t" + hallNumber + "\t\t" + name + "\n");
                playMovie = new Playmovie(id,time,hallNumber,name);
            }

        } catch (SQLException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }

        return playMovie;
    }

    private int amountSeat(int seatAmount, Playmovie playMovie) {


        int hallnumber = playMovie.getHallNumber();

        String update = "UPDATE halls SET seat_place = seat_place - "+ seatAmount + " WHERE hall_number = '" + hallnumber + "'";


        System.out.println("You have ordered: " + seatAmount + " Ticket/s");
        try {
            connector.update(update);

        } finally {
            connector.closeConnection();
        }
        return seatAmount;
    }

    private void insertBookingNumber(Playmovie playmovie) {

        int id = playmovie.getId();
        int hallNumber = playmovie.getHallNumber();



        String insert = "INSERT INTO ticket (playmovie_id,hall_id) VALUE('"+ id + "','" + hallNumber + "')";

        try {
            connector.insert(insert);

        }finally {
            connector.closeConnection();
        }

    }

    private void getBookingNumber(Playmovie playmovie){

        int id = playmovie.getId();

        try {
            String query = "SELECT order_number FROM ticket WHERE playmovie_id ='" + id + "'";
            ResultSet resultSet = connector.fetchData(query);
            while (resultSet.next()){
                int order = resultSet.getInt("order_number");
                System.out.println("Your Ordernumber is: " + order);
            }
        }catch (SQLException e){
            System.out.println("Could not find. error is: " + e);
        }



    }

    private void deleteBookingNumber(int bookingNumber){

        String delete = "DELETE FROM ticket WHERE order_number = '" + bookingNumber + "'";

        connector.delete(delete);
        connector.closeConnection();
    }

    private void deleteAmountSeat(int seatAmount){



        String update = "UPDATE halls SET seat_place = seat_place + " + seatAmount + " WHERE  hall = ...";

        connector.update(update);
        connector.closeConnection();

    }

}

