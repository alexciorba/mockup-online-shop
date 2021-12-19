package com.company.model;

public class Orders {

    private int id;
    private int customerId;
    private int amount;
    private String orderEmail;
    private String orderDate;
    private String orderStatus;

    public Orders(int id,int customerId,int amount,String orderEmail,String orderDate,String orderStatus){
        this.id=id;
        this.customerId=customerId;
        this.amount=amount;
        this.orderEmail=orderEmail;
        this.orderDate=orderDate;
        this.orderStatus=orderStatus;
    }

    public Orders(String line){
        this(Integer.parseInt(line.split(",")[0]),
                Integer.parseInt(line.split(",")[1]),
                Integer.parseInt(line.split(",")[3]),
                line.split(",")[4],
                line.split(",")[5],
                line.split(",")[6]
        );
    }
    public void setId(int id){this.id=id;}
    public void setCustomerId(int customerId){this.customerId=customerId;}
    public void setAmount(int amount){this.amount=amount;}
    public void setOrderEmail(String orderEmail){this.orderEmail=orderEmail;}
    public void setOrderDate(String orderDate){this.orderDate=orderDate;}
    public void setOrderStatus(String orderStatus){this.orderStatus=orderStatus;}

    public int getId(){return this.id;}
    public int getCustomerId(){return this.customerId;}
    public int getAmount(){return this.amount;}
    public String getOrderEmail(){return this.orderEmail;}
    public String getOrderDate(){return this.orderDate;}
    public String getOrderStatus(){return this.orderStatus;}

    public String descriereOrders(){
        String text="";
        text+="id: " + id +"\n";
        text+="id client: " + customerId +"\n";
        text+="cantitate: " + amount+"\n";
        text+="emailul comenzii: " + orderEmail +"\n";
        text+="data comenzii: " + orderDate+"\n";
        text+="statusul comenzii: " + orderStatus + "\n";
        return text;
     }
     public String toSaveOrder(){
        String text="";
        text+=id+","+customerId+","+amount+","+orderEmail+","+orderDate+","+orderStatus;
        return text;
     }





}
