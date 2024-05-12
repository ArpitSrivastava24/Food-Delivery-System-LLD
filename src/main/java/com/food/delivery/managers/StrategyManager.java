package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.DeliveryPartnerMatchingStrategy;
import com.food.delivery.entities.LocBasedPartnerStrategy;
import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class StrategyManager {

    private static StrategyManager strategyManager;

    private HashMap<Integer, Restaurant> map=new HashMap<>();

    private  StrategyManager(){

    }

    public static StrategyManager getInstance(){
        if(strategyManager==null){
            strategyManager=new StrategyManager();
        }
        return strategyManager;
    }

    public DeliveryPartnerMatchingStrategy determineDPMS(DeliveryMetaData deliveryMetaData){
        return new LocBasedPartnerStrategy();
    }
}
