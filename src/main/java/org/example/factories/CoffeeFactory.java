package org.example.factories;

import org.example.enums.ADD_ON;
import org.example.enums.COFFEE_SUB_TYPES;
import org.example.enums.COFFEE_TYPE;
import org.example.coffee.*;
import org.example.coffee.coldCoffee.ColdCoffee;
import org.example.coffee.hotCoffee.HotCoffee;

import java.util.List;

public class CoffeeFactory {
    private Coffee makeHotCoffee(COFFEE_SUB_TYPES hotCoffeeType, List<ADD_ON> addOnsList){
        HotCoffee hotCoffee = new HotCoffeeFactory().getCoffee(hotCoffeeType, addOnsList);
        return hotCoffee;
    }

    private Coffee makeColdCoffee(COFFEE_SUB_TYPES coldCoffeeType, List<ADD_ON> addOnsList){
        ColdCoffee coldCoffee = new ColdCoffeeFactory().getCoffee(coldCoffeeType, addOnsList);
        return coldCoffee;
    }

    public Coffee makeCoffee(COFFEE_TYPE coffeeType, COFFEE_SUB_TYPES coffeeSubType, List<ADD_ON>addOnList){
        if(coffeeType.equals(COFFEE_TYPE.HOT))
            return makeHotCoffee(coffeeSubType, addOnList);
        return makeColdCoffee(coffeeSubType, addOnList);
    }
}


