package org.example.coffee.decorators.coldDecorators;

import org.example.coffee.coldCoffee.ColdCoffee;

public class ColdFoam extends ColdCoffeeDecorator {
    public ColdFoam(ColdCoffee wrappee) {
        super(wrappee);
    }

    @Override
    public int getCost() {
        return 50 + this.wrappee.getCost();
    }
}
