package org.example.factories;

import org.example.enums.ADD_ON;
import org.example.enums.COFFEE_SUB_TYPES;
import org.example.coffee.coldCoffee.ColdCoffee;
import org.example.coffee.coldCoffee.DoubleMochaFrappe;
import org.example.coffee.coldCoffee.HazelnutFrappe;
import org.example.coffee.decorators.coldDecorators.ColdFoam;
import org.example.coffee.decorators.coldDecorators.ExtraIce;

import java.util.List;

public class ColdCoffeeFactory extends CoffeeFactory{
    public ColdCoffee getCoffee(COFFEE_SUB_TYPES coldCoffeeType, List<ADD_ON> addOnsList) {
        ColdCoffee coldCoffee = null;
        switch(coldCoffeeType){
            case HAZELNUT_FRAPPE:
                coldCoffee = new HazelnutFrappe();
            case DOUBLE_MOCHA_FRAPPE:
                coldCoffee = new DoubleMochaFrappe();
        }

        //decorating with the cold adds.
        for(ADD_ON coldAddOn : addOnsList){
            switch(coldAddOn){
                case COLD_FOAM :
                    coldCoffee = new ColdFoam(coldCoffee);
                case EXTRA_ICE:
                    coldCoffee = new ExtraIce(coldCoffee);
            }
        }

        return coldCoffee;
    }
}
