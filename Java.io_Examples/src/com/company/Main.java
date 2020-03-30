package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File myTestFile = new File("C:\\Users\\DCV\\Desktop\\Test.txt");


        FileReader fileReader = new FileReader(myTestFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedValues = line.split(";");
                String name = splittedValues[0];
                int age = Integer.valueOf(splittedValues[1]);
                String street = splittedValues[2];
                Person mario = new Person(name, age, street);
                Person[] myperson = new Person[10];
                myperson[0] = mario;


            }


        } catch (Exception ex) {
            System.out.println(" hm ...");
        }
        FileWriter mywriter = new FileWriter(myTestFile, true); // neue Datei anhänge auf true
        mywriter.write("\nadded text."); // "\n......" neue zeile
        mywriter.close();// fertig immer machen.


    }
}
