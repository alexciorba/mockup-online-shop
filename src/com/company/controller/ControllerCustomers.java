package com.company.controller;

import com.company.model.Customers;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomers {

    private ArrayList<Customers>listaClienti;
    public ControllerCustomers(){
        listaClienti=new ArrayList<>();
        load();

    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\model\\Customers.java");
            Scanner scanner= new Scanner(file);
            while (scanner.hasNextLine()){
                listaClienti.add(new Customers(scanner.nextLine()));
            }
        }catch (Exception e){

        }
    }
    public void addCustomers(Customers customers){
        listaClienti.add(customers);
    }
    public void afisareCustomers(){
        for(Customers c : listaClienti){
            System.out.println(c.descriereCustomer());
        }
    }
    public void updateEmail(int id,String  email){
        for(Customers c : listaClienti){
            if(c.getId()==id){
                c.setEmail(email);
            }
        }
    }
    public void updatePass(int id,String pass){
        for(Customers c :listaClienti){
            if(c.getId()==id){
                c.setPassword(pass);
            }
        }
    }
    public void updateName(int id,String name){
        for(Customers c : listaClienti){
            if(c.getId()==id){
                c.setName(name);
            }
        }
    }
    public void updateBillingAdress(int id,String adress){
        for(Customers c : listaClienti){
            if(c.getId()==id){
                c.setBillingAdress(adress);
            }
        }
    }
    public void updateCountry(int id,String country){
        for(Customers c : listaClienti){
            if(c.getId()==id){
                c.setCountry(country);
            }
        }
    }
    public void updatePhone(int id, int ph){
        for(Customers c : listaClienti){
            if(c.getId()==id){
                c.setPhone(ph);
            }
        }
    }
    public void deleteCustomer(int id){
        for(int i=0;i<listaClienti.size();i++){
            if(listaClienti.get(i).getId()==id){
                listaClienti.remove(i);
            }
        }
    }

    public String toSaveCustomer(){
        String text="";
        for(Customers c : listaClienti){
            text+=c.toSaveCustomer()+"\n";
        }
        return text;
    }

    public void saveCustomer(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\customers.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveCustomer());
            printWriter.close();
        }catch (Exception e){

        }
    }
    //fac o functie in controller client care verifica daca exista un client cu acel mail si parola
    public Customers verificareMail(String mail,String pass){
        for(Customers customers : listaClienti){
            if(customers.getEmail().equals(mail)&&customers.getPassword().equals(pass)){
                return customers;
            }
        }
        return null;
    }
    public int nextvlblIdCustomer(){
        if(listaClienti.size() !=0){
            return listaClienti.get(listaClienti.size()-1).getId()+1;
        }
        return 1;
    }
}
