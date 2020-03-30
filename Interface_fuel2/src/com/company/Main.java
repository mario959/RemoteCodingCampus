package com.company;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW","Benzin");

        OMV omv = new OMV();
        Shell shell = new Shell();
        Agip agip = new Agip();
        Vkw vkw = new Vkw();

        GasStation gasStation = new GasStation();
        gasStation.addgasstation(omv);
        gasStation.addgasstation(shell);
        gasStation.addgasstation(agip);
        gasStation.addgasstation(vkw);

        bmw.gasStation.getgastation();



    }
}
