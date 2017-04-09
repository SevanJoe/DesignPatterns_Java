package com.sevanjoe.designpatterns.creational.abstractfactory;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteProductA1 implements ProductA {

    public ConcreteProductA1() {
        this.initProductA();
    }

    @Override
    public void initProductA() {
        System.out.println("Create product A1 by abstract factory...");
    }
}
