package com.company;

public class GasStation {

    String benzin = "Super95";
    String diesel = "Diesel";
    Car car;

    GasStation[] gasStations;
    int countOfstations;


    public void addgasstation(GasStation gasStation) {
        gasStations[countOfstations] = gasStation;
        countOfstations++;

    }

    public void getgastation() {
        for (int i = 0; i < gasStations.length; i++) {
            if (car.fueltype.equalsIgnoreCase(benzin)) {
                System.out.println("Richtige Tankstelle" );

            } else if (car.fueltype.equalsIgnoreCase(diesel)) {
                System.out.println("Richtige Tankstelle");
            } else {
                System.out.println("Falsche eingabe.");
            }
        }
    }

}
