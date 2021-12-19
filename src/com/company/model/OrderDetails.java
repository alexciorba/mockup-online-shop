package com.company.model;

import java.util.ArrayList;

public class OrderDetails {

    private int id;
    private int orderId;
    private int productId;
    private int price;
    private int quantity;

    public OrderDetails(int id,int orderId,int productId,int price,int quantity){
        this.id=id;
        this.orderId=orderId;
        this.productId=productId;
        this.price=price;
        this.quantity=quantity;
    }

    public OrderDetails(String line){
        this(   Integer.parseInt(line.split(",")[0]),
                Integer.parseInt(line.split(",")[1]),
                Integer.parseInt(line.split(",")[2]),
                Integer.parseInt(line.split(",")[3]),
                Integer.parseInt(line.split(",")[4]));
    }
    public void setId(int id){this.id=id;}
    public void setPrice(int price){this.price=price;}
    public void setOrderId(int orderId){this.orderId=orderId;}
    public void setProductId(int productId){this.productId=productId;}
    public void setQuantity(int quantity){this.quantity=quantity;}

    public int getId(){return this.id;}
    public int getPrice(){return this.price;}
    public int getOrderId(){return this.orderId;}
    public int getProductId(){return this.productId;}
    public int getQuantity(){return this.quantity;}

    public String descriereOrderDetails(){
        String text="";
        text+="id: " + id + "\n";
        text+="orderId: " +orderId+"\n";
        text+="productId: " +productId+"\n";
        text+="price: "+price+"\n";
        text+="quantity: "+quantity+"\n";
        return text;
    }

    public String toSaveOrderDetails(){
        String text="";
        text+=id+","+orderId+","+productId+","+price+","+quantity;
        return text;
    }


}
