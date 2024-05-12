package com.food.delivery.managers;

import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class FoodManager {

    private static FoodManager foodManager;
    private  FoodManager(){

    }

    public static FoodManager getInstance(){
        if(foodManager==null){
            foodManager=new FoodManager();
        }
        return foodManager;
    }

    public void prepareFood(String orderId,String restrauntId,HashMap<String, Integer> dishes) throws InterruptedException {
        Restaurant restaurant=RestaurantManager.getInstance().getRestaurants(restrauntId);
        Thread.sleep(5000);
        System.out.println("Restaurant accepted the order");
        restaurant.prepareFood(orderId,dishes);
    }
}
