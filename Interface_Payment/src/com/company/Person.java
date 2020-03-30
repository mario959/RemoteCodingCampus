package com.company;

public class Person  {

    private String name ="";
    private int kontostand = 0;


    public Person(String name, int kontostand) {
        this.name = name;
        this.kontostand = kontostand;
    }



// methoden
    public void pay(IPayment pay){
        pay.pay();
    }




    // getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}


