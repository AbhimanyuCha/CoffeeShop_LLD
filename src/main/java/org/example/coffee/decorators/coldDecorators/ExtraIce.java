package org.example.coffee.decorators.coldDecorators;

import org.example.coffee.coldCoffee.ColdCoffee;

public class ExtraIce extends ColdCoffeeDecorator {
    public ExtraIce(ColdCoffee wrappee) {
        super(wrappee);
    }

    @Override
    public int getCost() {
        return this.wrappee.getCost() + 35;
    }
}
