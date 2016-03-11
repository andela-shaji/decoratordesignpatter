package com.designpatterns.decorator;

/**
 * Created by suadahaji on 3/11/16.
 */
public class NutDecorator extends IceCreamDecorator {

    public NutDecorator(IceCream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }

}
