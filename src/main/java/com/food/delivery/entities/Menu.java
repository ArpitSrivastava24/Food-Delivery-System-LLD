package com.food.delivery.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Dishes> dishes;

    public void addDishes(Dishes dishes){
        this.dishes=new ArrayList<>();
        this.dishes.add(dishes);
    }
}
