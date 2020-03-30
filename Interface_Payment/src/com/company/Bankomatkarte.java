package com.company;

public class Bankomatkarte implements IPayment {
    @Override
    public void pay() {
        System.out.println("Das Geld wird innerhalb von 1-2 Tagen von Ihrem Konto abgebucht.");

    }
}
