package com.company;

public class Playmovie {

    int id;
    String timeStart;
    int hallNumber;
    String movieName;

    public Playmovie(int id, String timeStart, int hallNumber, String movieName) {
        this.id = id;
        this.timeStart = timeStart;
        this.hallNumber = hallNumber;
        this.movieName = movieName;

    }

    public int getId() {
        return id;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public String getMovieName() {
        return movieName;
    }
}
