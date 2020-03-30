package com.company;

public class Main {

    public static void main(String[] args) {

	Person ich = new Person ("Mario",5000);
	Bar bar = new Bar();
	AufRechnung aufRechnung = new AufRechnung();
	Kreditkarte kreditkarte = new Kreditkarte();
	Bankomatkarte bankomatkarte = new Bankomatkarte();




	ich.pay(bar);
	ich.pay(aufRechnung);
	ich.pay(kreditkarte);
	ich.pay(bankomatkarte);







    }
}
