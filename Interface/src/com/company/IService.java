package com.company;

import java.util.Scanner;

public interface IService {
    Scanner scanner = new Scanner(System.in);
    String mysms = scanner.nextLine();



    public default void sendmessage() {

    }

    public void rceivemessage();

}
