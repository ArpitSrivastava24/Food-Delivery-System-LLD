package com.food.delivery.entities;

import lombok.*;

import java.util.HashMap;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Restaurant{

    @NonNull
    private Menu menu;
    @NonNull
    private String name;
    @NonNull
    private boolean isAvailable;
    @NonNull
    private String address;

    private HashMap<String,HashMap<String, Integer>> orders;

    public void prepareFood(String orderId, HashMap<String, Integer> dishes) throws InterruptedException {
        orders=new HashMap<>();
        Thread.sleep(5000);
        System.out.println("Food is being prepared");
        Thread.sleep(5000);
        System.out.println("Order prepared");
        orders.put(orderId,dishes);
    }

}
