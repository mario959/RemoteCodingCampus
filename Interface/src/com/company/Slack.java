package com.company;

public class Slack implements IService {

    @Override
    public void sendmessage() {
        System.out.println("I have a new message: " + mysms);
    }

    @Override
    public void rceivemessage() {

    }
}
