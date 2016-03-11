package com.designpatterns.decorator;

/**
 * Created by suadahaji.
 *
 * This class is a concrete implementation of the Icecream interface.
 */
public class SimpleIceCream  implements IceCream {
    @Override
    public String makeIcecream() {
        return "Base Icecream";
    }
}