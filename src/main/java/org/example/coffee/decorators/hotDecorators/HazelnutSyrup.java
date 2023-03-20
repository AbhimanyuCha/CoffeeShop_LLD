package org.example.coffee.decorators.hotDecorators;

import org.example.coffee.hotCoffee.HotCoffee;

public class HazelnutSyrup extends HotCoffeeDecorator{
    public HazelnutSyrup(HotCoffee wrappee) {
        super(wrappee);
    }

    @Override
    public int getCost() {
        return this.wrappee.getCost() + 100;
    }
}
