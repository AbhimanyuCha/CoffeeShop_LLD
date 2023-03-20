package org.example.coffee.decorators.coldDecorators;

import org.example.coffee.coldCoffee.ColdCoffee;

public abstract class ColdCoffeeDecorator implements ColdCoffee {
    protected ColdCoffee wrappee;
    public ColdCoffeeDecorator(ColdCoffee wrappee){
        this.wrappee = wrappee;
    }
}
