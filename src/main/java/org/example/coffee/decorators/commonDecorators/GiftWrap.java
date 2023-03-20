package org.example.coffee.decorators.commonDecorators;

import org.example.coffee.Coffee;

public class GiftWrap extends CoffeeDecorator {


    public GiftWrap(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        System.out.println("25 added");
        return wrappee.getCost() + 25;
    }
}
