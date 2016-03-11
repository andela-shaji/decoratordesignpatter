package com.designpatterns.decorator;

/**
 * Created by suadahaji on 3/11/16.
 */
public class HoneyDecorator extends IceCreamDecorator {

    public HoneyDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return " + sweet honey";
    }
}
