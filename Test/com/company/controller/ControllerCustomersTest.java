package com.company.controller;

import com.company.model.Customers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCustomersTest {

    @Test
    public void testUpdateEmail(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(829,"a@yahoo","123","alex","str retezat","ro",020210);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updateEmail(829,"b@");
        assertEquals("b@",customers.getEmail());
    }
    @Test

    public void testUpdatePass(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(919,"dd","kd","dan","str 1","ro",28292);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updatePass(919,"rr");
        assertEquals("rr",customers.getPassword());
    }


    @Test

    public void testUpdateName(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(76,"aa","kdk","Marius","str 2","ro",979879);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updateName(76,"ion");
        assertEquals("ion",customers.getName());
    }

    @Test

    public void testUpdateBillingAdress(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(90,"ss","dwdw","mario","str 5","ro",8979);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updateBillingAdress(90,"str 3");
        assertEquals("str 3",customers.getBillingAdress());
    }

    @Test

    public void testUpdateCountry(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(999,"asasa","sadksd","ana","str 4","ro",908576);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updateCountry(999,"franta");
        assertEquals("franta",customers.getCountry());
    }

    @Test
    public void testUpdatePhone(){
        ControllerCustomers controllerCustomers=new ControllerCustomers();
        Customers customers=new Customers(24,"fef","wfffqq","alina","str5","ro",3939);
        controllerCustomers.addCustomers(customers);
        controllerCustomers.updatePhone(24,221);
        assertEquals(221,customers.getPhone());
    }

}