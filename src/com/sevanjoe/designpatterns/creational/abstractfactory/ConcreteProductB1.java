package com.sevanjoe.designpatterns.creational.abstractfactory;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductB1 implements ProductB {

    public ConcreteProductB1() {
        this.initProductB();
    }

    @Override
    public void initProductB() {
        System.out.println("Create product B1 by abstract factory...");
    }
}
