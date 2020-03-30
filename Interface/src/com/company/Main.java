package com.company;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
	Messenger mymessenger = new Messenger();



	Slack slack = new Slack();
	Whatsapp whatsapp = new Whatsapp();
	Gmail gmail = new Gmail();
	Hotmail hotmail = new Hotmail();

	mymessenger.sendmessage(slack);
	mymessenger.sendmessage(whatsapp);

    }
}
