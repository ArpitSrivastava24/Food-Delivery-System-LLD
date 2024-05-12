package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DeliveryMetaData {
    private  String userLoc;
    private  String restLoc;
    private String orderId;


}
