package org.example.coffee.decorators.hotDecorators;

import org.example.coffee.hotCoffee.HotCoffee;

public abstract class HotCoffeeDecorator implements HotCoffee {
    protected HotCoffee wrappee;
    public HotCoffeeDecorator(HotCoffee wrappee){
        this.wrappee = wrappee;
    }
}
