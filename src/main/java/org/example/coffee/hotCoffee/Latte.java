package org.example.coffee.hotCoffee;

public class Latte implements HotCoffee{

    @Override
    public int getCost() {
        System.out.println("250 added");
        return 250;
    }
}
