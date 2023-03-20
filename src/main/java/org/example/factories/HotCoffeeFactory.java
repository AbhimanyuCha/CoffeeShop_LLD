package org.example.factories;

import org.example.enums.ADD_ON;
import org.example.enums.COFFEE_SUB_TYPES;
import org.example.coffee.decorators.hotDecorators.Cinnamon;
import org.example.coffee.decorators.hotDecorators.HazelnutSyrup;
import org.example.coffee.hotCoffee.Cappuccino;
import org.example.coffee.hotCoffee.Espresso;
import org.example.coffee.hotCoffee.HotCoffee;
import org.example.coffee.hotCoffee.Latte;

import java.util.List;

public class HotCoffeeFactory {

    public HotCoffee getCoffee(COFFEE_SUB_TYPES hotCoffeeType, List<ADD_ON> addOnsList) {
        HotCoffee hotCoffee = null;
        switch(hotCoffeeType){
            case CAPPUCCINO:
                hotCoffee = new Cappuccino();
            case LATTE:
                hotCoffee = new Latte();
            case ESPRESSO:
                hotCoffee = new Espresso();
        }

        for(ADD_ON hotAddOns : addOnsList){
            switch(hotAddOns){
                case CINNAMON :
                    hotCoffee = new Cinnamon(hotCoffee);
                case HAZELNUT_SYRUP:
                    hotCoffee = new HazelnutSyrup(hotCoffee);
            }
        }

        return hotCoffee;
    }
}
