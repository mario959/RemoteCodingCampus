package com.company;

import java.util.Optional;

public class VKW extends GasStation{


    public VKW(String shopname) {
        super(shopname);
    }

    @Override
    public void addStore() {
        fueltype.add(FuelType.ELEKTRO.getName());
        prices.add(Fuelshop.getMyFuelPrice(FuelType.ELEKTRO));
    }


    @Override
    public void goFillUp(Person customer) {
        super.goFillUp(customer);
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

    }
}
