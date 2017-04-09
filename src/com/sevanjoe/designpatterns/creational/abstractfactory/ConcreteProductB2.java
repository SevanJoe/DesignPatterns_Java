package com.sevanjoe.designpatterns.creational.abstractfactory;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductB2 implements ProductB {

    public ConcreteProductB2() {
        this.initProductB();
    }

    @Override
    public void initProductB() {
        System.out.println("Create product B2 by abstract factory...");
    }
}
