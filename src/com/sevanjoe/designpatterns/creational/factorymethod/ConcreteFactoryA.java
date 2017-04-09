package com.sevanjoe.designpatterns.creational.factorymethod;

/**
 * Created by Sevan on 2017/4/9.
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
