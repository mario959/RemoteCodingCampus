package com.company;

public class Fuelshop {

    public static double getMyFuelPrice(FuelType fuelType) {
        switch (fuelType) {
            case DIESEL:
                return 1.008;
            case SUPER95:
                return 1.025;
            case ELEKTRO:
                return 0.60;
            default: return 0;
        }
    }
}

