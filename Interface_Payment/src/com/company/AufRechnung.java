package com.company;

public class AufRechnung implements IPayment  {
    @Override
    public void pay() {
        System.out.println("Bitte zahlen Sie innerhalb 14 Tage.");

    }
}
