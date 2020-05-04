package com.company.model;

public class UserView {

    UserRepository userRepo = new UserRepository();


    public void userChoose(){
        userRepo.printMenu();

    }



}
