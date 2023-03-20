package org.example.coffee.decorators;

import org.example.coffee.Coffee;

public class GiftWrap extends CoffeeDecorator {


    public GiftWrap(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return wrappee.getCost() + 25;
    }
}
