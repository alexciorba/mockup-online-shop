package com.company.controller;

import com.company.model.Orders;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOrders {

    private ArrayList<Orders>listaOrders;

    public ControllerOrders(){
        listaOrders=new ArrayList<>();
        load();

    }

    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\model\\Orders.java");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                listaOrders.add(new Orders(scanner.nextLine()));

            }
        }catch (Exception e){

        }
    }

    public void addOrders(Orders orders){
        listaOrders.add(orders);

    }

    public void afisareOrders(){
        for(Orders orders:listaOrders){
            System.out.println(orders.descriereOrders());
        }
    }

    public void updateAmount(int id,int amount){
        for(Orders o : listaOrders){
            if(o.getId()==id){
                o.setAmount(amount);
            }
        }
    }

    public void updateOrderEmail(int id,String mail){
        for(Orders o : listaOrders) {
            if(o.getId()==id) {
                o.setOrderEmail(mail);
            }

        }
    }

    public void updateOrderDate(int id,String date)   {
        for(Orders o:listaOrders){
            if(o.getId()==id){
                o.setOrderDate(date);
            }
        }
    }
    public void updateOrderStatus(int id,String status){
        for(Orders o : listaOrders){
            if(o.getId()==id){
                o.setOrderStatus(status);
            }
        }
    }

    public void deleteOrders(int id){
        for(int i=0;i<listaOrders.size();i++){
            if(listaOrders.get(i).getId()==id){
                listaOrders.remove(i);
            }
        }
    }
    public String toSaveOrders(){
        String text="";
        for(Orders o : listaOrders){
            text+=o.toSaveOrder()+"\n";
        }
        return text;
    }
    public void saveProduct(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\OnlineShop\\src\\com\\company\\resources\\orders.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveOrders());
            printWriter.close();
        }catch (Exception e){

        }
    }

    public int nextIdVlblOrder(){
        if(listaOrders.size()!=0){
            return listaOrders.get(listaOrders.size()-1).getId()+1;
        }
        return 1;
    }

}
