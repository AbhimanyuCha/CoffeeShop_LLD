package org.example.coffee.decorators.commonDecorators;

import org.example.coffee.Coffee;

public class ExtraSugar extends CoffeeDecorator{

    public ExtraSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return wrappee.getCost() + 20;
    }
}
