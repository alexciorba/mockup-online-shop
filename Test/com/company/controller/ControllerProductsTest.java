package com.company.controller;

import com.company.model.Products;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerProductsTest {

    @Test
    public void testUpdateNume(){
        ControllerProducts controllerProducts=new ControllerProducts();
        Products products=new Products(11,"camasa",123,"alba",2);
        controllerProducts.addProducts(products);
        controllerProducts.updateNume(11,"pantof");
        assertEquals("pantof",products.getName());

    }

    @Test
    public void testUpdatePret(){
        ControllerProducts controllerProducts=new ControllerProducts();
        Products products1=new Products(12,"camasa",123,"alba",2);
        controllerProducts.addProducts(products1);
        controllerProducts.updatePret(12,150);
        assertEquals(150,products1.getPrice());
    }
    @Test
    public void testUpdateDesc(){
        ControllerProducts controllerProducts=new ControllerProducts();
        Products products2=new Products(13,"camasa",123,"alba",2);
        controllerProducts.addProducts(products2);
        controllerProducts.updateDescription(13,"verde");
        assertEquals("verde",products2.getDescription());
    }
    @Test
    public void testUpdateStoc(){
        ControllerProducts controllerProducts=new ControllerProducts();
        Products products3=new Products(14,"camasa",123,"alba",2);
        controllerProducts.addProducts(products3);
        controllerProducts.updateStoc(14,21);
        assertEquals(21,products3.getStoc());
    }



}