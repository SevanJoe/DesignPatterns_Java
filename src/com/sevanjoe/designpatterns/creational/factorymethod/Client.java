package com.sevanjoe.designpatterns.creational.factorymethod;

/**
 * Created by Sevan on 2017/4/9.
 */
public class Client {

    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
    }
}
