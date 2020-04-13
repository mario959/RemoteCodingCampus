package com.company;

public class Main {

    public static void main(String[] args) {
            DB db = new DB();
            Write hz = new Write();

            db.conn("select * from notes ");

            hz.addNotes("INSERT INTO notes (notes) VALUE('das ist eine nachricht')");





    }
}
