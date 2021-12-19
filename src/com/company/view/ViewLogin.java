package com.company.view;

import com.company.controller.ControllerCustomers;
import com.company.model.Customers;

import java.util.Scanner;

public class ViewLogin {

    private ControllerCustomers controllerCustomers;
     Scanner scanner;

    public ViewLogin(){
        controllerCustomers =new ControllerCustomers();
        scanner=new Scanner(System.in);
    }
    private void meniu(){
        System.out.println("apasati tasta 1 pentru : log in");
        System.out.println("apasati tasta 2 pentru : sign up");
    }

    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1: login();
                break;
            }
        }
    }
    public void login(){
        System.out.println("Introduceti adresa de email");
        String mail=scanner.nextLine();
        System.out.println("Introduceti parola");
        String pass=scanner.nextLine();
        //TODO : facem o functie care primeste mail si returneza id ul

        Customers customers=controllerCustomers.verificareMail(mail,pass);
        if(customers !=null){
            ViewUser viewUser=new ViewUser(customers);
            viewUser.play();
        }
        else {
            System.out.println("Ati gresit mailul sau parola");
        }
    }
}

