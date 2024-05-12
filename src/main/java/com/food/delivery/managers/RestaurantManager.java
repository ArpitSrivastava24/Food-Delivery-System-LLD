package com.food.delivery.managers;

import com.food.delivery.entities.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager restaurantManager;

    private HashMap<Integer,Restaurant> map=new HashMap<>();

    private  RestaurantManager(){

    }

    public static RestaurantManager getInstance(){
        if(restaurantManager==null){
            restaurantManager=new RestaurantManager();
        }
        return restaurantManager;
    }

    public Restaurant getRestaurants(String orderId){
     return map.get(2);
    }

    public void addRestaurant(Restaurant restaurant, int restId){
        map.put(restId,restaurant);
    }
}
