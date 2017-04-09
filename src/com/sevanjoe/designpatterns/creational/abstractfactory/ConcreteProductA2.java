package com.sevanjoe.designpatterns.creational.abstractfactory;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductA2 implements ProductA {

    public ConcreteProductA2() {
        this.initProductA();
    }

    @Override
    public void initProductA() {
        System.out.println("Create product A2 by abstract factory...");
    }
}
