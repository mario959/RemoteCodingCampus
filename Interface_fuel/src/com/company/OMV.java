package com.company;

import java.util.Optional;

public class OMV extends GasStation {


    public OMV(String shopname) {
        super(shopname);
    }

    @Override
    public void goFillUp(Person customer) {
        super.goFillUp(customer);
        refuel(customer);

    }

    @Override
    public void addStore() {
        fueltype.add(FuelType.SUPER95.getName());
        prices.add(Fuelshop.getMyFuelPrice(FuelType.SUPER95));
        fueltype.add(FuelType.DIESEL.getName());
        prices.add(Fuelshop.getMyFuelPrice(FuelType.DIESEL));
        fueltype.add(FuelType.ELEKTRO.getName());
        prices.add(Fuelshop.getMyFuelPrice(FuelType.ELEKTRO));
    }

    @Override
    public void listFromArray() {
        super.listFromArray();
    }

    @Override
    public void searchFromArray(String choiceToBuy) {
        super.searchFromArray(choiceToBuy);
    }

    @Override
    public void refuel(Person cusomer) {
        System.out.println("Welche Art willst du tanken?");
         choiceToBuy = scanner.nextLine();
         searchFromArray(choiceToBuy);
         double bill =  cusomer.myCar.LiterINedded * prices.get(this.whichIndex);
        System.out.println(bill);
    }
}
