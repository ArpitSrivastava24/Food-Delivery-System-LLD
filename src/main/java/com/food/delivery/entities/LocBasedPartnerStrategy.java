package com.food.delivery.entities;

public class LocBasedPartnerStrategy implements DeliveryPartnerMatchingStrategy{

    @Override
    public DeliveryPartner matchDeliveryPartners(DeliveryMetaData deliveryMetaData) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Shambhu is your delivery partner");
        Thread.sleep(5000);
        System.out.println("Shambhu got the Order on its way...");
        Thread.sleep(5000);
        System.out.println("Order delivered");
        return new DeliveryPartner("Shambhu","5");
    }

}
