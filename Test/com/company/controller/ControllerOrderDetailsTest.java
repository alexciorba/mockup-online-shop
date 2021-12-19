package com.company.controller;

import com.company.model.OrderDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrderDetailsTest {
    @Test
    public void testUpdateOrderId(){
        ControllerOrderDetails controllerOrderDetails=new ControllerOrderDetails();
        OrderDetails orderDetails=new OrderDetails(123,333,1,10,3);
        controllerOrderDetails.addOrderDetails(orderDetails);
        controllerOrderDetails.updateOrderId(123,221);
        assertEquals(221,orderDetails.getOrderId());
    }
    @Test

    public void testUpdateProductId(){
        ControllerOrderDetails controllerOrderDetails=new ControllerOrderDetails();
        OrderDetails orderDetails=new OrderDetails(667,323,556,87,8);
        controllerOrderDetails.addOrderDetails(orderDetails);
        controllerOrderDetails.updateProductId(667,211);
        assertEquals(211,orderDetails.getProductId());
    }
    @Test
    public void testUpdatePrice(){
        ControllerOrderDetails controllerOrderDetails=new ControllerOrderDetails();
        OrderDetails orderDetails=new OrderDetails(3873,40958,383,393,2);
        controllerOrderDetails.addOrderDetails(orderDetails);
        controllerOrderDetails.updatePrice(3873,21);
        assertEquals(21,orderDetails.getPrice());
    }
    @Test
    public void testUpdateQuantity(){
        ControllerOrderDetails controllerOrderDetails=new ControllerOrderDetails();
        OrderDetails orderDetails=new OrderDetails(134,222,33,32,3);
    }

}