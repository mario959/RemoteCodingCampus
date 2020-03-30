package com.company;

public class Car {

    String brand;
    int hp;
    double tankSize;
    double tankSizeMAX;
    double LiterINedded;
    FuelType fuelType;
    Person owner;

    public Car(String brand, int hp, double tankSize, FuelType fuelType) {
        this.brand = brand;
        this.hp = hp;
        this.tankSizeMAX = tankSize;
        this.fuelType = fuelType;
        this.tankSize = tankSize;
    }

    public double tankToDrive( ) {
        double one00km;
        if (this.fuelType.equals(FuelType.SUPER95)) {
            one00km = this.hp /15;
        } else if (this.fuelType.equals(FuelType.DIESEL)) {
            one00km = this.hp / 20;
        } else {
            one00km  = this.hp / 25;
        }

        return one00km;
    }


    public void drive (int kmAmount) {
        double howmuchFuelINeed = kmAmount/100 *tankToDrive();
        this.tankSize -= howmuchFuelINeed;
        LiterINedded = tankSizeMAX - tankSize;
        System.out.println(LiterINedded);
    }

    public void goFillUpTheFuel (GasStation gasStation) {
        gasStation.goFillUp(this.owner);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
