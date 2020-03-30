package com.company;

public class Kreditkarte implements IPayment {



    @Override
    public void pay() {
        System.out.println("Ich berechne ihnen ein Aufschlag von 3 %");


    }
}
