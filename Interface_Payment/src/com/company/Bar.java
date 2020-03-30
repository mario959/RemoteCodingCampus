package com.company;

public class Bar implements IPayment {



    @Override
    public void pay() {

        System.out.println("Sie haben bar bezahlt. Danke!!!");

    }

}
