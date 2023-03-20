package org.example.coffee.decorators.hotDecorators;

import org.example.coffee.hotCoffee.HotCoffee;

public class Cinnamon extends HotCoffeeDecorator{
    public Cinnamon(HotCoffee wrappee) {
        super(wrappee);
    }

    @Override
    public int getCost() {
        System.out.println("75 added");

        return this.wrappee.getCost() + 75;
    }
}
