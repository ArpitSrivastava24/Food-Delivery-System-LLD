package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.Order;
import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class OrderManager {
    private static OrderManager orderManager;

    private HashMap<Integer,Order> orders;

    private HashMap<String, Restaurant> map=new HashMap<>();

    private  OrderManager(){

    }

    public static OrderManager getInstance(){
        if(orderManager==null){
            orderManager=new OrderManager();
        }
        return orderManager;
    }

    public void createOrder(String orderId,Order order) throws InterruptedException {
        //Food Manager
        manageFood(orderId,order);

        //Delivery Manager
        manageDelivery(orderId);

    }

    public void manageFood(String orderId,Order order) throws InterruptedException {
        System.out.println("Asked restaurant to prepare Food");
        FoodManager.getInstance().prepareFood(orderId,"Baati Chokha",order.getFood());
    }

    public void manageDelivery(String orderId) throws InterruptedException {
        System.out.println("Matching Delivery Partner");
        DeliveryManager.getInstance().manageDelivery(new DeliveryMetaData("Vasavi","Varanasi",orderId));
    }
}
