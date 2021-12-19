package com.company.model;

public class Products {

    private int id;
    private String name;
    private int price;
    private String description;
    private int stoc;

    public Products(int id, String name, int price, String description, int stoc){
        this.id = id;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stoc = stoc;
    }
    public Products(String line){
        this(   Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]),
                line.split(",")[3],
                Integer.parseInt(line.split(",")[4]));
    }

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name=name;}
    public void setPrice(int price){this.price=price;}
    public void setDescription(String description){this.description=description;}
    public void setStoc(int stoc){this.stoc = stoc;}

    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public int getStoc(){return this.stoc;}
    public String getDescription(){return this.description;}

    public String descriereProdus(){
        String text="";
        text+="id produs: "+ id + "\n";
        text+="nume: " + name+ "\n";
        text+="pret: " + price +"\n";
        text+="descriere: "+description+"\n";
        text+="stoc: "+ stoc +"\n";
        return  text;
    }
    public String toSaveProduct(){
        String text="";
        text+=id+","+name+","+price+","+description+","+stoc;
        return text;
    }
}
