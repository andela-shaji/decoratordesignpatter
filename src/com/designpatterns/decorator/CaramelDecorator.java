package com.designpatterns.decorator;

/**
 * Created by suadahaji on 3/11/16.
 */
public class CaramelDecorator extends IceCreamDecorator {

    public CaramelDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addCaramel();
    }

    private String addCaramel() {
        return " + tasty caramel";
    }
}
