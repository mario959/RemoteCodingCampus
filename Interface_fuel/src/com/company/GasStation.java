package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public abstract class GasStation implements IFueltype {
    String shopname;
    ArrayList<String> fueltype = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    int whichIndex;
    String choiceToBuy;
    Scanner scanner = new Scanner(System.in);

    public GasStation(String shopname) {
        this.shopname = shopname;
    }

    public void goFillUp(Person customer) {

    }

    public abstract void addStore();

    public  void listFromArray() {
        for (int i = 0; i < fueltype.size(); i++) {
            System.out.println(fueltype.get(i) + " " + prices.get(i) + "€" + ",\n");

        }
    }

    public void searchFromArray(String choiceToBuy) {
            if (fueltype.stream().anyMatch((fuelName) -> fuelName.equalsIgnoreCase(choiceToBuy))) {
                Optional<String> myFuel = fueltype.stream().filter((fuelName) -> fuelName.equalsIgnoreCase(choiceToBuy)).findFirst();
                this.whichIndex = fueltype.indexOf(myFuel.get());
                System.out.println(fueltype.get(this.whichIndex) + " " + prices.get(this.whichIndex));

            }
        }



}






