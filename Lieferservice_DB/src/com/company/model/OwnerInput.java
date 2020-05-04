package com.company.model;

import java.util.Scanner;

public class OwnerInput {

    OwnerRepository ownerRepo = new OwnerRepository();


    public void inputChoose() {


        Scanner input1 = new Scanner(System.in);

        boolean start = true;

        while (start) {

            System.out.println("Wo möchten Sie Daten hinzufügen oder (5) Beenden ?\n");
            System.out.println("(1) Menu (2) Zutaten (3) Lieferort (4) Lieferpreis (5) Beenden");
            int eingabeUSER = input1.nextInt();
            switch (eingabeUSER) {
                case 1:
                    ownerRepo.insertMenu();
                    break;
                case 2:
                    ownerRepo.insertIngredients();
                    break;
                case 3:
                    ownerRepo.insertCity();
                   break;
                case 4:
                    ownerRepo.insertPrice();
                    break;
                case 5:
                    System.out.println("Danke für die eingabe");
                    start = false;
                default:
                    System.out.println("no more choice");break;

            }
        }
    }


}



