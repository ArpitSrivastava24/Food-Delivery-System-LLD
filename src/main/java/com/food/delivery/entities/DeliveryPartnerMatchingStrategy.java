package com.food.delivery.entities;

import java.util.List;

public interface DeliveryPartnerMatchingStrategy {

    DeliveryPartner matchDeliveryPartners(DeliveryMetaData deliveryMetaData) throws InterruptedException;
}
