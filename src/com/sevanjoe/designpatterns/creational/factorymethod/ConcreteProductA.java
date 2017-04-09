package com.sevanjoe.designpatterns.creational.factorymethod;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductA implements Product {

    public ConcreteProductA() {
        this.initProduct();
    }

    @Override
    public void initProduct() {
        System.out.println("Create product A by factory method...");
    }
}
