package com.company.model;

public class Customers {
    private int id;
    private String email;
    private String password;
    private String name;
    private String billingAdress;
    private String country;
    private int phone;

    public Customers(int id,String email,String password,String name,String billingAdress,String country,int phone){
        this.id=id;
        this.email=email;
        this.password=password;
        this.name=name;
        this.billingAdress=billingAdress;
        this.country=country;
        this.phone=phone;

    }
    public Customers(String line){
        this(
                Integer.parseInt(line.split(",")[0]),
                 line.split(",")[1],
                 line.split(",")[2],
                line.split(",")[3],
                line.split(",")[4],
                line.split(",")[5],
                Integer.parseInt(line.split(",")[0])

        );
    }
    public void setId(int id){this.id=id;}
    public void setEmail(String email){this.email=email;}
    public void setPassword(String password){this.password=password;}
    public void setName(String name){this.name=name;}
    public void setBillingAdress(String billingAdress){this.billingAdress=billingAdress;}
    public void setCountry(String country){this.country=country;}
    public void setPhone(int phone){this.phone=phone;}

    public int getId(){return this.id;}
    public String getEmail(){return this.email;}
    public String getPassword(){return this.password;}
    public String getName(){return this.name;}
    public String getBillingAdress(){return this.billingAdress;}
    public String getCountry(){return this.country;}
    public int getPhone(){return this.phone;}


    public String descriereCustomer(){
        String text="";
        text+="id: " +id+"\n";
        text+="mail: "+email+"\n";
        text+="parola : " +password +"\n";
        text+="nume : "+ name+"\n";
        text+="adresa :" + billingAdress+"\n";
        text+="tara: " + country+"\n";
        text+="telefon: " + phone+"\n";

        return text;
    }

    public String toSaveCustomer(){
        String text="";
        text+=id+","+email+","+password+","+name+","+billingAdress+","+country+","+phone;
        return text;
    }
}
