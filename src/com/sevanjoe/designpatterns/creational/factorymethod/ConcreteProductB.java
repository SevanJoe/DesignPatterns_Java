package com.sevanjoe.designpatterns.creational.factorymethod;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductB implements Product {

    public ConcreteProductB() {
        this.initProduct();
    }

    @Override
    public void initProduct() {
        System.out.println("Create product B by factory method...");
    }
}
