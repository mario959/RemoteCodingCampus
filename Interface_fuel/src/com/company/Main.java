package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GasStation> gasStations = new ArrayList<>();

        Person person1 = new Person("Mario", 35, "Elektro");
        Car audi = new Car("Audi", 80,45,FuelType.DIESEL);
        audi.setOwner(person1);
        person1.setMyCar(audi);


        OMV omv = new OMV("OMV");
        Agip agip = new Agip("Agip");
        Shell shell = new Shell("Shell");
        VKW vkw = new VKW("VKW");

        gasStations.add(omv);
        gasStations.add(agip);
        gasStations.add(shell);
        gasStations.add(vkw);

        audi.drive(200);

        System.out.println("In welche Tankstelle willst du gehn?");
        for (int i = 0; i < gasStations.size() ; i++) {
            System.out.println(gasStations.get(i).shopname +", ")  ;
            //liste der Tankstellen in der ArrayList
        }
        String tempString = scanner.nextLine();
        //Sucher der Tankstelle
        if (gasStations.stream().anyMatch((gasStationName) -> gasStationName.shopname.equalsIgnoreCase(tempString))) {
            Optional<GasStation> shopname = gasStations.stream().filter((gasSTaionName) -> gasSTaionName.shopname.equalsIgnoreCase(tempString)).findFirst();
            int whichIndex = gasStations.indexOf(shopname.get());

            gasStations.get(whichIndex).addStore(); // arrayList in der Klasse befüllen FuelType + preis
            gasStations.get(whichIndex).listFromArray(); // Waren aus
            gasStations.get(whichIndex).goFillUp(person1);
        }


       // omv.goFillUp(person1);


    }
}
