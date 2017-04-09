package com.sevanjoe.designpatterns.creational.simplefactory;

/**
 * Created by Sevan on 2017/4/8.
 */
public class ProductFactory {

    public static Product createProduct(ProductEnum productEnum) {
        switch (productEnum) {
            case CONCRETE_PRODUCT_A:
                return new ConcreteProductA();
            case CONCRETE_PRODUCT_B:
                return new ConcreteProductB();
            default:
                break;
        }

        return null;
    }
}
