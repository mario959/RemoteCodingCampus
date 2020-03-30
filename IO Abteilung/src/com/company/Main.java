package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        File myfile = new File("C:\\Users\\DCV\\Desktop\\Abteilungen.txt");
        FileReader fileReader = new FileReader(myfile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null){
            String[] splittenValues = line.split(";");
            String name = splittenValues[0];
            String name1 = splittenValues[1];
            Person person = new Person(name);
            String boy = person.name;
            Department departments = new Department(name1);
            String dep = departments.name;
            ArrayList<String> department = new ArrayList<>();
            department.add(0,boy);
            department.add(1,dep);

            System.out.println(department);


        }

    }
}
