package com.designpatterns.decorator;

/**
 * Created by suadahaji on 3/11/16.
 */
public class TestDecorator {
    public static void main(String args[]) {
        IceCream icecream = new HoneyDecorator(new NutDecorator(new SimpleIceCream()));
        System.out.println(icecream.makeIcecream());

        IceCream icecream2 = new HoneyDecorator(new CaramelDecorator(new SimpleIceCream()));
        System.out.println(icecream2.makeIcecream());
    }
}

