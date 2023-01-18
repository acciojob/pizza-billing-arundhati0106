package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        //calls parent class i.e. Pizza constructor
        super(isVeg);
        //extra cheese and toppings are added to deluxe pizza by default
        addExtraCheese();
        addExtraToppings();
    }
}
