package com.sevanjoe.designpatterns.creational.simplefactory;

/**
 * Created by Sevan on 2017/4/8.
 */
public class ConcreteProductA implements Product {

    public ConcreteProductA() {
        this.initProduct();
    }

    @Override
    public void initProduct() {
        System.out.println("Create product A...");
    }
}
