package org.example.coffee.decorators;

import org.example.coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    public Coffee wrappee;
    public CoffeeDecorator(Coffee coffee){
        this.wrappee = coffee;
    }
}
