package com.company.view;

import com.company.controller.ControllerOrderDetails;
import com.company.controller.ControllerOrders;
import com.company.controller.ControllerProducts;
import com.company.model.Customers;
import com.company.model.OrderDetails;
import com.company.model.Orders;
import com.company.model.Products;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewUser {

    // sa afiseze toate produsele
    // sa adauge in cos
    // sa editeze cosul
    //sa sterga din cos
    //sa trimita comanda
   private Scanner scanner;
   private ControllerProducts controllerProducts;
   private ControllerOrders controllerOrders;
   private Orders orders;
   private  Customers customers;
   private ControllerOrderDetails controllerOrderDetails;

    public ViewUser(){

         customers= new Customers("20,alex@,123,Alex,Str Retezat,Romania,073939");
         scanner=new Scanner(System.in);
         controllerProducts=new ControllerProducts();
         controllerOrders= new ControllerOrders();
         controllerOrderDetails= new ControllerOrderDetails();
         orders= new Orders(controllerOrders.nextIdVlblOrder(),customers.getId(),0,"alex@","20.12.2021","disponibl");
    }
    private void meniu(){
        System.out.println("Apasati tasta 1 pentru: afisarea tuturor produselor: ");
        System.out.println("Apasati tasta 2 pentru: a adauga in cos");
        System.out.println("Apasati tasta 3 pentru: a afisa cosul");
        System.out.println("Apasati tasta 4 pentru : a modifica cosul");
        System.out.println("Apasati tasta 5 pentru : a sterge produsul din cos");
    }

    public void play(){
        boolean running=true;

        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1: controllerProducts.afisareProduse();
                break;

                case 2: adaugareCos();
                break;

                case 3: afisareCos();
                break;
                case 4 : editareCos();
                break;
                case 5: stergereProdusCos();
                break;

            }
        }
    }


    public  void afisareCos(){

        int id=orders.getId();
        ArrayList<OrderDetails>list=controllerOrderDetails.returneazaNumeByOrderId(id);

        for (OrderDetails orderDetails :list){
              Products p=controllerProducts.returnareProdusbyId(orderDetails.getId());
               String text="Produsul "+p.getName()+"\n";
                 text+="Numar de bucati "+orderDetails.getQuantity()+"\n";
                 text+="Pretul este "+orderDetails.getPrice();

            System.out.println(text);
        }

    }

    private void adaugareCos(){
        System.out.println("Scrieti denumirea produsului pe care doriti sa-l adaugati in cos : ");
        String alegere=scanner.nextLine();
        Products p = controllerProducts.returnareProdusByName(alegere);
        if(p!= null && p.getStoc()>0){

            OrderDetails orderDetails=new OrderDetails(controllerOrderDetails.nextvlblIdOrderDetails(), orders.getId(), p.getId(),p.getPrice(),1);

            controllerOrderDetails.addOrderDetails(orderDetails);
            System.out.println("succes");


        }
        else if(p==null){
            System.out.println("Produsul nu este in stoc");
        }

    }







    private void editareCos(){
      //modiicare cantitate
       //stergere produs
        System.out.println("Selectati 1 pentru a modifica cantitatea produsului");
        System.out.println("Selectati 2 pentru a modifica pretul produsul din cos");
       int alegere=Integer.parseInt(scanner.nextLine());
        int id=orders.getId();
        ArrayList<OrderDetails>list=controllerOrderDetails.returneazaNumeByOrderId(id);
       if(alegere==1){

           System.out.println("introduceti cantitatea dorita :");
           int cantitate=Integer.parseInt(scanner.nextLine());
        for (OrderDetails orderDetails :list) {

            orderDetails.setQuantity(cantitate);
        }

   }else if(alegere==2){
           System.out.println("introduceti pretul dorit :");
           int pret=Integer.parseInt(scanner.nextLine());
           for (OrderDetails orderDetails :list) {


               orderDetails.setPrice(pret);

           }
    }


}
private void stergereProdusCos(){
    int id=orders.getId();
    ArrayList<OrderDetails>list=controllerOrderDetails.returneazaNumeByOrderId(id);

    for (int i=0;i<list.size();i++){
        list.remove(i);
    }

}
}
