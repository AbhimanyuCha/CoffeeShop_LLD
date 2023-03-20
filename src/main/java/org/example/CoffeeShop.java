package org.example;

import org.example.enums.ADD_ON;
import org.example.enums.COFFEE_SUB_TYPES;
import org.example.enums.COFFEE_TYPE;
import org.example.factories.CoffeeFactory;

import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        int ans = coffeeFactory.makeCoffee(COFFEE_TYPE.HOT, COFFEE_SUB_TYPES.CAPPUCCINO,
                List.of(ADD_ON.CINNAMON, ADD_ON.CINNAMON, ADD_ON.HAZELNUT_SYRUP, ADD_ON.GIFT_WRAP)).getCost();
        System.out.println(ans);
    }
}