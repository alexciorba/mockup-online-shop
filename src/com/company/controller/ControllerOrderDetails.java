package com.company.controller;

import com.company.model.OrderDetails;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOrderDetails {
    private ArrayList<OrderDetails>listaOrderDetails;
    public ControllerOrderDetails(){
        listaOrderDetails=new ArrayList<>();
        load();

    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\orderDetails.txt");
            Scanner read=new Scanner(file);
            while (read.hasNextLine()){
                listaOrderDetails.add(new OrderDetails(read.nextLine()));
            }
        }catch (Exception e){

        }
    }

    public void addOrderDetails(OrderDetails orderDetails){
        listaOrderDetails.add(orderDetails);
    }
    public void afisareOrderDetails(){
        for (OrderDetails orderDetails:listaOrderDetails){
            System.out.println(orderDetails.descriereOrderDetails());
        }
    }

    public void updateOrderId(int id,int ord){
        for(OrderDetails orderDetails:listaOrderDetails){
            if(orderDetails.getId()==id){
                orderDetails.setOrderId(ord);
            }
        }
    }

    public void updateProductId(int id,int p){
        for(OrderDetails orderDetails:listaOrderDetails){
            if(orderDetails.getId()==id){
                orderDetails.setProductId(p);
            }
        }
    }

    public void updatePrice(int id,int price){
        for(OrderDetails orderDetails:listaOrderDetails){
            if(orderDetails.getId()==id){
                orderDetails.setPrice(price);
            }
        }
    }
    public void updateQuantity(int id,int q){
        for(OrderDetails orderDetails:listaOrderDetails){
            if(orderDetails.getId()==id){
                orderDetails.setQuantity(q);
            }
        }
    }
    public void deleteOrderDetails(int id){
        for(int i=0;i<listaOrderDetails.size();i++){
            if(listaOrderDetails.get(i).getId()==id){
                listaOrderDetails.remove(i);
            }
        }
    }
    public String toSaveOrderDetails(){
        String text="";
        for(OrderDetails orderDetails: listaOrderDetails){
            text+=orderDetails.toSaveOrderDetails()+"\n";
        }
        return text;
    }
    public void saveOrderDet(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\orderDetails.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveOrderDetails());
            printWriter.close();

        }catch (Exception e){

        }
    }

    public int nextvlblIdOrderDetails(){
        if(listaOrderDetails.size() !=0){
            return listaOrderDetails.get(listaOrderDetails.size()-1).getId()+1;
        }
        return 1;
    }
    //o functie care primeste id ul  si returneaza numele produselor

    public ArrayList<OrderDetails> returneazaNumeByOrderId(int orderId){

        ArrayList<OrderDetails> listaDetalii= new ArrayList<>();
        for(OrderDetails orderDetails : listaOrderDetails){
            if(orderDetails.getId()==orderId){
                listaDetalii.add(orderDetails);
            }
        }

        return  listaDetalii;
    }
}
