package com.sevanjoe.designpatterns.creational.abstractfactory;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
