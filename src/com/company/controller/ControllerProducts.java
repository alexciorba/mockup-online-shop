package com.company.controller;

import com.company.model.Products;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProducts {
    private ArrayList<Products>listaProduse;
    public ControllerProducts(){
        listaProduse=new ArrayList<>();
        load();
    }

    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\products.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                listaProduse.add(new Products(scanner.nextLine()));
            }
        }catch (Exception e){

        }
    }
    public void addProducts(Products products){
        listaProduse.add(products);
    }
    public void afisareProduse(){
        for(Products products:listaProduse){
            System.out.println(products.descriereProdus());
        }
    }
    public void updateNume(int id,String nume){
        for(Products p :listaProduse){
            if(p.getId()==id){
                p.setName(nume);
            }
        }
    }

    public void updatePret(int id,int pret){
        for(Products p :listaProduse){
            if(p.getId()==id){
                p.setPrice(pret);
            }

        }
    }
    public void updateDescription(int id,String descriere){
        for(Products p :listaProduse){
            if(p.getId()==id){
                p.setDescription(descriere);
            }

        }
    }
    public void updateStoc(int id,int stoc){
        for(Products p :listaProduse){
            if(p.getId()==id){
                p.setStoc(stoc);
            }

        }
    }
    public void deleteProduct(int id){
        for(int i=0;i<listaProduse.size();i++){
            if(listaProduse.get(i).getId()==id){
                listaProduse.remove(i);
            }
        }
    }
    public String toSaveProduct(){
        String text="";
        for(Products p:listaProduse){
            text+=p.toSaveProduct()+"\n";
        }
        return text;
    }
    public void saveProduct(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\products.txt");

        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveProduct());
            printWriter.close();
        }catch (Exception e){

        }

    }

    // o functie care primeste numele unui produs si returneaza produsul

    public Products returnareProdusByName(String name){
        for(Products p : listaProduse){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null ;

    }
    public Products returnareProdusbyId(int id){
        for(Products p : listaProduse){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

}
