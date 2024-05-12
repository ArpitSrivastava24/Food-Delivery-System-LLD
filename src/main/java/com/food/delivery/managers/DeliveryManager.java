package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.DeliveryPartnerMatchingStrategy;
import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class DeliveryManager {

    private static DeliveryManager deliveryManager;

    private  DeliveryPartnerMatchingStrategy deliveryPartnerMatchingStrategy;

    private  DeliveryManager(){

    }

    public static DeliveryManager getInstance(){
        if(deliveryManager==null){
            deliveryManager=new DeliveryManager();
        }
        return deliveryManager;
    }

    public void manageDelivery( DeliveryMetaData deliveryMetaData) throws InterruptedException {
        DeliveryPartnerMatchingStrategy deliveryPartnerMatchingStrategy1=StrategyManager.getInstance().determineDPMS(deliveryMetaData);
        deliveryPartnerMatchingStrategy1.matchDeliveryPartners(deliveryMetaData);
    }
}
