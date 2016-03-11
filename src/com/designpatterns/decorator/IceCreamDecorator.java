package com.designpatterns.decorator;

/**
 * Created by suadahaji.
 * It is the core of the decorator design pattern. It contains an attribute for the type of interface.
 * Instance is assigned dynamically at the creation of decorator using its constructor. Once assigned that instance method will be invoked.
 */
public abstract class IceCreamDecorator implements IceCream {
    protected IceCream specialIcecream;

    public IceCreamDecorator(IceCream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}
