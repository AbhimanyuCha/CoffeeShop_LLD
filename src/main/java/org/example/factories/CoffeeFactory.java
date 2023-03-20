package org.example.factories;

import org.example.coffee.Coffee;
import org.example.coffee.coldCoffee.ColdCoffee;
import org.example.coffee.decorators.commonDecorators.GiftWrap;
import org.example.coffee.hotCoffee.HotCoffee;
import org.example.enums.ADD_ON;
import org.example.enums.COFFEE_SUB_TYPES;
import org.example.enums.COFFEE_TYPE;

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
        Coffee coffee = null;
        if(coffeeType.equals(COFFEE_TYPE.HOT))
            coffee = makeHotCoffee(coffeeSubType, addOnList);
        else
            coffee = makeColdCoffee(coffeeSubType, addOnList);
        //apply the common addons like gift wrap and all
        for(ADD_ON addOn : addOnList){
            switch (addOn){
                case GIFT_WRAP :
                    coffee = new GiftWrap(coffee);
                    break;
            }
        }
        return coffee;
    }
}


