package com.company.controller;

import com.company.model.Orders;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrdersTest {

    @Test
    public void testUpdateAmount(){
        ControllerOrders controllerOrders=new ControllerOrders();
        Orders orders=new Orders(175,23,4,"alex@yahoo","20.06.2020","livrat");
        controllerOrders.addOrders(orders);
        controllerOrders.updateAmount(175,6);
        assertEquals(6,orders.getAmount());
    }

    @Test
    public void testUpdateEmail(){
        ControllerOrders controllerOrders1=new ControllerOrders();
        Orders orders1=new Orders(234,43,2,"dan@","23.07.2021","livrat");
        controllerOrders1.addOrders(orders1);
        controllerOrders1.updateOrderEmail(234,"dan@yahoo");
        assertEquals("dan@yahoo",orders1.getOrderEmail());

    }

    @Test
    public void testUpdateDate(){
        ControllerOrders controllerOrders=new ControllerOrders();
        Orders orders3=new Orders(44,23,2,"ff","22.02.2021","livrat");
        controllerOrders.addOrders(orders3);
        controllerOrders.updateOrderDate(44,"21.21.21");
        assertEquals("21.21.21",orders3.getOrderDate());
    }
    @Test
    public void updateStatus(){
        ControllerOrders controllerOrders=new ControllerOrders();
        Orders orders=new Orders(121,211,23,"wdd","23.03.2020","livrat");
        controllerOrders.addOrders(orders);
        controllerOrders.updateOrderStatus(121,"pe drum");
        assertEquals("pe drum",orders.getOrderStatus());
    }








































}