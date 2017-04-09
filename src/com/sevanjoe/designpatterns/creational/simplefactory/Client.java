package com.sevanjoe.designpatterns.creational.simplefactory;

/**
 * Created by Sevan on 2017/4/8.
 */
public class Client {

    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct(ProductEnum.CONCRETE_PRODUCT_A);

        Product productB = ProductFactory.createProduct(ProductEnum.CONCRETE_PRODUCT_B);
    }
}
