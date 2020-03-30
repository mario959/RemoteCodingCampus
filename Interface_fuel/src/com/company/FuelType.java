package com.company;

public enum FuelType {

    DIESEL("Diesel"),
    SUPER95("Super95"),
    ELEKTRO("Elektro");

    private String name;

    FuelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
